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
 * DeleteAccountAliasRequest Marshaller
 */

public class DeleteAccountAliasRequestMarshaller
        implements
        Marshaller<Request<DeleteAccountAliasRequest>, DeleteAccountAliasRequest> {

    public Request<DeleteAccountAliasRequest> marshall(
            DeleteAccountAliasRequest deleteAccountAliasRequest) {

        if (deleteAccountAliasRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteAccountAliasRequest> request = new DefaultRequest<DeleteAccountAliasRequest>(
                deleteAccountAliasRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "DeleteAccountAlias");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteAccountAliasRequest.getAccountAlias() != null) {
            request.addParameter("AccountAlias", StringUtils
                    .fromString(deleteAccountAliasRequest.getAccountAlias()));
        }

        return request;
    }

}
