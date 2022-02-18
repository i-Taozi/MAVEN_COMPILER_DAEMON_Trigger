/*
 * Copyright 2016-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atomix.core.set.impl;

import io.atomix.core.set.AsyncDistributedNavigableSet;
import io.atomix.core.set.DistributedNavigableSet;
import io.atomix.core.set.DistributedNavigableSetBuilder;
import io.atomix.core.set.DistributedNavigableSetConfig;
import io.atomix.primitive.PrimitiveManagementService;
import io.atomix.primitive.protocol.GossipProtocol;
import io.atomix.primitive.protocol.PrimitiveProtocol;
import io.atomix.primitive.protocol.set.NavigableSetProtocol;
import io.atomix.primitive.proxy.ProxyClient;
import io.atomix.primitive.service.ServiceConfig;
import io.atomix.utils.concurrent.Futures;

import java.util.concurrent.CompletableFuture;

/**
 * Default distributed tree set builder.
 *
 * @param <E> type for set elements
 */
public class DefaultDistributedNavigableSetBuilder<E extends Comparable<E>> extends DistributedNavigableSetBuilder<E> {
  public DefaultDistributedNavigableSetBuilder(String name, DistributedNavigableSetConfig config, PrimitiveManagementService managementService) {
    super(name, config, managementService);
  }

  @Override
  @SuppressWarnings("unchecked")
  public CompletableFuture<DistributedNavigableSet<E>> buildAsync() {
    PrimitiveProtocol protocol = protocol();
    if (protocol instanceof GossipProtocol) {
      if (protocol instanceof NavigableSetProtocol) {
        return managementService.getPrimitiveCache().getPrimitive(name, () ->
            CompletableFuture.completedFuture(((NavigableSetProtocol) protocol).<E>newNavigableSetDelegate(name, serializer(), managementService))
                .thenApply(set -> new GossipDistributedNavigableSet<>(name, protocol, set)))
            .thenApply(AsyncDistributedNavigableSet::sync);
      } else {
        return Futures.exceptionalFuture(new UnsupportedOperationException("Sets are not supported by the provided gossip protocol"));
      }
    } else {
      return newProxy(DistributedTreeSetService.class, new ServiceConfig())
          .thenCompose(proxy -> new DistributedNavigableSetProxy<E>((ProxyClient) proxy, managementService.getPrimitiveRegistry()).connect())
          .thenApply(set -> {
            if (config.getCacheConfig().isEnabled()) {
              set = new CachingAsyncDistributedNavigableSet<>(set, config.getCacheConfig());
            }

            if (config.isReadOnly()) {
              set = new UnmodifiableAsyncDistributedNavigableSet<>(set);
            }
            return set.sync();
          });
    }
  }
}
