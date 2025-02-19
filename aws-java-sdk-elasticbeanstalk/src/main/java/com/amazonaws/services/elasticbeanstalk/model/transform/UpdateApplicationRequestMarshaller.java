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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * UpdateApplicationRequest Marshaller
 */

public class UpdateApplicationRequestMarshaller implements
        Marshaller<Request<UpdateApplicationRequest>, UpdateApplicationRequest> {

    public Request<UpdateApplicationRequest> marshall(
            UpdateApplicationRequest updateApplicationRequest) {

        if (updateApplicationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateApplicationRequest> request = new DefaultRequest<UpdateApplicationRequest>(
                updateApplicationRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "UpdateApplication");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateApplicationRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils
                    .fromString(updateApplicationRequest.getApplicationName()));
        }

        if (updateApplicationRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils
                    .fromString(updateApplicationRequest.getDescription()));
        }

        return request;
    }

}
