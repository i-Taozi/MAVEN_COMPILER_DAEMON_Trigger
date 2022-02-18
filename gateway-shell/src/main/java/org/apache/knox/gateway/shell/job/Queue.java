/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.knox.gateway.shell.job;

import org.apache.knox.gateway.shell.AbstractRequest;
import org.apache.knox.gateway.shell.BasicResponse;
import org.apache.knox.gateway.shell.KnoxSession;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;

import java.util.concurrent.Callable;

class Queue {

  public static class Request extends AbstractRequest<Response> {
    Request( KnoxSession session ) {
      super( session );
    }

    @Override
    protected Callable<Response> callable() {
      return new Callable<Response>() {
        @Override
        public Response call() throws Exception {
          URIBuilder uri = uri( Job.SERVICE_PATH, "/jobs" );
          HttpGet request = new HttpGet( uri.build() );
          return new Response( execute( request ) );
        }
      };
    }
  }

  public static class Response extends BasicResponse {
    protected Response( HttpResponse response ) {
      super( response );
    }
  }
}
