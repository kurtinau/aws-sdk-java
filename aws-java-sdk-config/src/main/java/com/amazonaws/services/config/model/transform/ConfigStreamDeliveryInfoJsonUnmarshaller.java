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

package com.amazonaws.services.config.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConfigStreamDeliveryInfo JSON Unmarshaller
 */
public class ConfigStreamDeliveryInfoJsonUnmarshaller implements
        Unmarshaller<ConfigStreamDeliveryInfo, JsonUnmarshallerContext> {

    public ConfigStreamDeliveryInfo unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ConfigStreamDeliveryInfo configStreamDeliveryInfo = new ConfigStreamDeliveryInfo();

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
                if (context.testExpression("lastStatus", targetDepth)) {
                    context.nextToken();
                    configStreamDeliveryInfo
                            .setLastStatus(StringJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("lastErrorCode", targetDepth)) {
                    context.nextToken();
                    configStreamDeliveryInfo
                            .setLastErrorCode(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("lastErrorMessage", targetDepth)) {
                    context.nextToken();
                    configStreamDeliveryInfo
                            .setLastErrorMessage(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("lastStatusChangeTime", targetDepth)) {
                    context.nextToken();
                    configStreamDeliveryInfo
                            .setLastStatusChangeTime(DateJsonUnmarshaller
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

        return configStreamDeliveryInfo;
    }

    private static ConfigStreamDeliveryInfoJsonUnmarshaller instance;

    public static ConfigStreamDeliveryInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfigStreamDeliveryInfoJsonUnmarshaller();
        return instance;
    }
}
