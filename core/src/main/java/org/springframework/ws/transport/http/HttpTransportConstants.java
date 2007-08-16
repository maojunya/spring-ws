/*
 * Copyright 2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ws.transport.http;

import org.springframework.ws.transport.TransportConstants;

/**
 * Declares HTTP-specific transport constants.
 *
 * @author Arjen Poutsma
 * @since 1.0
 */
public interface HttpTransportConstants extends TransportConstants {

    /** The "Content-Encoding" header. */
    String HEADER_CONTENT_ENCODING = "Content-Encoding";

    /** Header value that indicates a compressed "Content-Encoding". */
    String CONTENT_ENCODING_GZIP = "gzip";

    /** The "200 OK" status code. */
    int STATUS_OK = 200;

    /** The "202 Accepted" status code. */
    int STATUS_ACCEPTED = 202;

    /** The "404 Not Found" status code. */
    int STATUS_NOT_FOUND = 404;

    /** The "500 Server Error" status code. */
    int STATUS_INTERNAL_SERVER_ERROR = 500;
}
