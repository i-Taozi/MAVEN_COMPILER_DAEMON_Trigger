/*
 * Copyright 2017-present Open Networking Foundation
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
package io.atomix.core.log;

import io.atomix.primitive.PrimitiveBuilder;
import io.atomix.primitive.PrimitiveManagementService;
import io.atomix.primitive.protocol.LogCompatibleBuilder;
import io.atomix.primitive.protocol.LogProtocol;
import io.atomix.primitive.protocol.PrimitiveProtocol;

/**
 * Builder for DistributedLog.
 */
public abstract class DistributedLogBuilder<E>
    extends PrimitiveBuilder<DistributedLogBuilder<E>, DistributedLogConfig, DistributedLog<E>>
    implements LogCompatibleBuilder<DistributedLogBuilder<E>> {

  protected DistributedLogBuilder(String name, DistributedLogConfig config, PrimitiveManagementService managementService) {
    super(DistributedLogType.instance(), name, config, managementService);
  }

  @Override
  public DistributedLogBuilder<E> withProtocol(LogProtocol protocol) {
    return withProtocol((PrimitiveProtocol) protocol);
  }
}
