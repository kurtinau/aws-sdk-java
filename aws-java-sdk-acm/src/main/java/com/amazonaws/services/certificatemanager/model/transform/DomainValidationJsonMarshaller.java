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

package com.amazonaws.services.certificatemanager.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.certificatemanager.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DomainValidationMarshaller
 */
public class DomainValidationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(DomainValidation domainValidation,
            JSONWriter jsonWriter) {
        if (domainValidation == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (domainValidation.getDomainName() != null) {
                jsonWriter.key("DomainName").value(
                        domainValidation.getDomainName());
            }

            java.util.List<String> validationEmailsList = domainValidation
                    .getValidationEmails();
            if (validationEmailsList != null) {
                jsonWriter.key("ValidationEmails");
                jsonWriter.array();
                for (String validationEmailsListValue : validationEmailsList) {
                    if (validationEmailsListValue != null) {
                        jsonWriter.value(validationEmailsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (domainValidation.getValidationDomain() != null) {
                jsonWriter.key("ValidationDomain").value(
                        domainValidation.getValidationDomain());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DomainValidationJsonMarshaller instance;

    public static DomainValidationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainValidationJsonMarshaller();
        return instance;
    }

}
