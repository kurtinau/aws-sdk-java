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

package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeAutoScalingInstancesRequest Marshaller
 */

public class DescribeAutoScalingInstancesRequestMarshaller
        implements
        Marshaller<Request<DescribeAutoScalingInstancesRequest>, DescribeAutoScalingInstancesRequest> {

    public Request<DescribeAutoScalingInstancesRequest> marshall(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest) {

        if (describeAutoScalingInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeAutoScalingInstancesRequest> request = new DefaultRequest<DescribeAutoScalingInstancesRequest>(
                describeAutoScalingInstancesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeAutoScalingInstances");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> instanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeAutoScalingInstancesRequest
                .getInstanceIds();
        if (!instanceIdsList.isEmpty() || !instanceIdsList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;

            for (String instanceIdsListValue : instanceIdsList) {
                if (instanceIdsListValue != null) {
                    request.addParameter("InstanceIds.member."
                            + instanceIdsListIndex,
                            StringUtils.fromString(instanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }

        if (describeAutoScalingInstancesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils
                    .fromInteger(describeAutoScalingInstancesRequest
                            .getMaxRecords()));
        }

        if (describeAutoScalingInstancesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeAutoScalingInstancesRequest
                            .getNextToken()));
        }

        return request;
    }

}
