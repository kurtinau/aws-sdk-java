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

package com.amazonaws.services.waf.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ByteMatchTuple JSON Unmarshaller
 */
public class ByteMatchTupleJsonUnmarshaller implements
        Unmarshaller<ByteMatchTuple, JsonUnmarshallerContext> {

    public ByteMatchTuple unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ByteMatchTuple byteMatchTuple = new ByteMatchTuple();

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
                if (context.testExpression("FieldToMatch", targetDepth)) {
                    context.nextToken();
                    byteMatchTuple.setFieldToMatch(FieldToMatchJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("TargetString", targetDepth)) {
                    context.nextToken();
                    byteMatchTuple.setTargetString(ByteBufferJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("TextTransformation", targetDepth)) {
                    context.nextToken();
                    byteMatchTuple.setTextTransformation(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("PositionalConstraint", targetDepth)) {
                    context.nextToken();
                    byteMatchTuple
                            .setPositionalConstraint(StringJsonUnmarshaller
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

        return byteMatchTuple;
    }

    private static ByteMatchTupleJsonUnmarshaller instance;

    public static ByteMatchTupleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ByteMatchTupleJsonUnmarshaller();
        return instance;
    }
}
