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

package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DeleteNatGatewayRequest Marshaller
 */

public class DeleteNatGatewayRequestMarshaller implements
        Marshaller<Request<DeleteNatGatewayRequest>, DeleteNatGatewayRequest> {

    public Request<DeleteNatGatewayRequest> marshall(
            DeleteNatGatewayRequest deleteNatGatewayRequest) {

        if (deleteNatGatewayRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteNatGatewayRequest> request = new DefaultRequest<DeleteNatGatewayRequest>(
                deleteNatGatewayRequest, "AmazonEC2");
        request.addParameter("Action", "DeleteNatGateway");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteNatGatewayRequest.getNatGatewayId() != null) {
            request.addParameter("NatGatewayId", StringUtils
                    .fromString(deleteNatGatewayRequest.getNatGatewayId()));
        }

        return request;
    }

}
