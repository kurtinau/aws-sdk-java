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

package com.amazonaws.services.gamelift.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * IpPermissionMarshaller
 */
public class IpPermissionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(IpPermission ipPermission, JSONWriter jsonWriter) {
        if (ipPermission == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (ipPermission.getFromPort() != null) {
                jsonWriter.key("FromPort").value(ipPermission.getFromPort());
            }

            if (ipPermission.getToPort() != null) {
                jsonWriter.key("ToPort").value(ipPermission.getToPort());
            }

            if (ipPermission.getIpRange() != null) {
                jsonWriter.key("IpRange").value(ipPermission.getIpRange());
            }

            if (ipPermission.getProtocol() != null) {
                jsonWriter.key("Protocol").value(ipPermission.getProtocol());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static IpPermissionJsonMarshaller instance;

    public static IpPermissionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IpPermissionJsonMarshaller();
        return instance;
    }

}
