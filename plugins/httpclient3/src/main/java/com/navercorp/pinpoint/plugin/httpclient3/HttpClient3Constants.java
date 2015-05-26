/*
 * Copyright 2014 NAVER Corp.
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
package com.navercorp.pinpoint.plugin.httpclient3;

import static com.navercorp.pinpoint.common.trace.HistogramSchema.*;
import static com.navercorp.pinpoint.common.trace.ServiceTypeProperty.*;

import com.navercorp.pinpoint.common.trace.ServiceType;

/**
 * 
 * @author jaehong.kim
 *
 */
public interface HttpClient3Constants {
    public static final ServiceType HTTP_CLIENT3 = ServiceType.of(9054, "HTTP_CLIENT3", NORMAL_SCHEMA, RECORD_STATISTICS);
    public static final ServiceType HTTP_CLIENT3_INTERNAL = ServiceType.of(9055, "HTTP_CLIENT3_INTERNAL", "HTTP_CLIENT", NORMAL_SCHEMA);

    public static final String METADATA_END_POINT = "endPoint";
    public static final String METADATA_DESTINATION_ID = "destinationId";
    public static final String HTTP_CLIENT3_SCOPE = "HttpClient3Scope"; 
}
