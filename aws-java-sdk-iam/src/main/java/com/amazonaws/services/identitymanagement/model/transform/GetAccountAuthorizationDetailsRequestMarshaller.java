/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * GetAccountAuthorizationDetailsRequest Marshaller
 */

public class GetAccountAuthorizationDetailsRequestMarshaller
        implements
        Marshaller<Request<GetAccountAuthorizationDetailsRequest>, GetAccountAuthorizationDetailsRequest> {

    public Request<GetAccountAuthorizationDetailsRequest> marshall(
            GetAccountAuthorizationDetailsRequest getAccountAuthorizationDetailsRequest) {

        if (getAccountAuthorizationDetailsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<GetAccountAuthorizationDetailsRequest> request = new DefaultRequest<GetAccountAuthorizationDetailsRequest>(
                getAccountAuthorizationDetailsRequest,
                "AmazonIdentityManagement");
        request.addParameter("Action", "GetAccountAuthorizationDetails");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> filterList = (com.amazonaws.internal.SdkInternalList<String>) getAccountAuthorizationDetailsRequest
                .getFilter();
        if (!filterList.isEmpty() || !filterList.isAutoConstruct()) {
            int filterListIndex = 1;

            for (String filterListValue : filterList) {
                if (filterListValue != null) {
                    request.addParameter("Filter.member." + filterListIndex,
                            StringUtils.fromString(filterListValue));
                }
                filterListIndex++;
            }
        }

        if (getAccountAuthorizationDetailsRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils
                    .fromInteger(getAccountAuthorizationDetailsRequest
                            .getMaxItems()));
        }

        if (getAccountAuthorizationDetailsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils
                    .fromString(getAccountAuthorizationDetailsRequest
                            .getMarker()));
        }

        return request;
    }

}
