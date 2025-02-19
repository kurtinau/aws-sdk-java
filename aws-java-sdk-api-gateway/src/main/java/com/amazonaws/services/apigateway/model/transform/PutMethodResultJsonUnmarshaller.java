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

package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PutMethodResult JSON Unmarshaller
 */
public class PutMethodResultJsonUnmarshaller implements
        Unmarshaller<PutMethodResult, JsonUnmarshallerContext> {

    public PutMethodResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        PutMethodResult putMethodResult = new PutMethodResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("httpMethod", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setHttpMethod(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("authorizationType", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setAuthorizationType(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("authorizerId", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setAuthorizerId(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("apiKeyRequired", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setApiKeyRequired(BooleanJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("requestParameters", targetDepth)) {
                    context.nextToken();
                    putMethodResult
                            .setRequestParameters(new MapUnmarshaller<String, Boolean>(
                                    StringJsonUnmarshaller.getInstance(),
                                    BooleanJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("requestModels", targetDepth)) {
                    context.nextToken();
                    putMethodResult
                            .setRequestModels(new MapUnmarshaller<String, String>(
                                    StringJsonUnmarshaller.getInstance(),
                                    StringJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("methodResponses", targetDepth)) {
                    context.nextToken();
                    putMethodResult
                            .setMethodResponses(new MapUnmarshaller<String, MethodResponse>(
                                    StringJsonUnmarshaller.getInstance(),
                                    MethodResponseJsonUnmarshaller
                                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("methodIntegration", targetDepth)) {
                    context.nextToken();
                    putMethodResult
                            .setMethodIntegration(IntegrationJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return putMethodResult;
    }

    private static PutMethodResultJsonUnmarshaller instance;

    public static PutMethodResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutMethodResultJsonUnmarshaller();
        return instance;
    }
}
