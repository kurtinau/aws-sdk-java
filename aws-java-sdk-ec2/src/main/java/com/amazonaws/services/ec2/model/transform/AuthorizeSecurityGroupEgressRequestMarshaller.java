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
 * AuthorizeSecurityGroupEgressRequest Marshaller
 */

public class AuthorizeSecurityGroupEgressRequestMarshaller
        implements
        Marshaller<Request<AuthorizeSecurityGroupEgressRequest>, AuthorizeSecurityGroupEgressRequest> {

    public Request<AuthorizeSecurityGroupEgressRequest> marshall(
            AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest) {

        if (authorizeSecurityGroupEgressRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AuthorizeSecurityGroupEgressRequest> request = new DefaultRequest<AuthorizeSecurityGroupEgressRequest>(
                authorizeSecurityGroupEgressRequest, "AmazonEC2");
        request.addParameter("Action", "AuthorizeSecurityGroupEgress");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (authorizeSecurityGroupEgressRequest.getGroupId() != null) {
            request.addParameter("GroupId", StringUtils
                    .fromString(authorizeSecurityGroupEgressRequest
                            .getGroupId()));
        }

        if (authorizeSecurityGroupEgressRequest.getSourceSecurityGroupName() != null) {
            request.addParameter("SourceSecurityGroupName", StringUtils
                    .fromString(authorizeSecurityGroupEgressRequest
                            .getSourceSecurityGroupName()));
        }

        if (authorizeSecurityGroupEgressRequest.getSourceSecurityGroupOwnerId() != null) {
            request.addParameter("SourceSecurityGroupOwnerId", StringUtils
                    .fromString(authorizeSecurityGroupEgressRequest
                            .getSourceSecurityGroupOwnerId()));
        }

        if (authorizeSecurityGroupEgressRequest.getIpProtocol() != null) {
            request.addParameter("IpProtocol", StringUtils
                    .fromString(authorizeSecurityGroupEgressRequest
                            .getIpProtocol()));
        }

        if (authorizeSecurityGroupEgressRequest.getFromPort() != null) {
            request.addParameter("FromPort", StringUtils
                    .fromInteger(authorizeSecurityGroupEgressRequest
                            .getFromPort()));
        }

        if (authorizeSecurityGroupEgressRequest.getToPort() != null) {
            request.addParameter("ToPort", StringUtils
                    .fromInteger(authorizeSecurityGroupEgressRequest
                            .getToPort()));
        }

        if (authorizeSecurityGroupEgressRequest.getCidrIp() != null) {
            request.addParameter("CidrIp",
                    StringUtils.fromString(authorizeSecurityGroupEgressRequest
                            .getCidrIp()));
        }

        com.amazonaws.internal.SdkInternalList<IpPermission> ipPermissionsList = (com.amazonaws.internal.SdkInternalList<IpPermission>) authorizeSecurityGroupEgressRequest
                .getIpPermissions();
        if (!ipPermissionsList.isEmpty()
                || !ipPermissionsList.isAutoConstruct()) {
            int ipPermissionsListIndex = 1;

            for (IpPermission ipPermissionsListValue : ipPermissionsList) {

                if (ipPermissionsListValue.getIpProtocol() != null) {
                    request.addParameter("IpPermissions."
                            + ipPermissionsListIndex + ".IpProtocol",
                            StringUtils.fromString(ipPermissionsListValue
                                    .getIpProtocol()));
                }

                if (ipPermissionsListValue.getFromPort() != null) {
                    request.addParameter("IpPermissions."
                            + ipPermissionsListIndex + ".FromPort", StringUtils
                            .fromInteger(ipPermissionsListValue.getFromPort()));
                }

                if (ipPermissionsListValue.getToPort() != null) {
                    request.addParameter("IpPermissions."
                            + ipPermissionsListIndex + ".ToPort", StringUtils
                            .fromInteger(ipPermissionsListValue.getToPort()));
                }

                com.amazonaws.internal.SdkInternalList<UserIdGroupPair> userIdGroupPairsList = (com.amazonaws.internal.SdkInternalList<UserIdGroupPair>) ipPermissionsListValue
                        .getUserIdGroupPairs();
                if (!userIdGroupPairsList.isEmpty()
                        || !userIdGroupPairsList.isAutoConstruct()) {
                    int userIdGroupPairsListIndex = 1;

                    for (UserIdGroupPair userIdGroupPairsListValue : userIdGroupPairsList) {

                        if (userIdGroupPairsListValue.getUserId() != null) {
                            request.addParameter(
                                    "IpPermissions." + ipPermissionsListIndex
                                            + ".Groups."
                                            + userIdGroupPairsListIndex
                                            + ".UserId",
                                    StringUtils
                                            .fromString(userIdGroupPairsListValue
                                                    .getUserId()));
                        }

                        if (userIdGroupPairsListValue.getGroupName() != null) {
                            request.addParameter(
                                    "IpPermissions." + ipPermissionsListIndex
                                            + ".Groups."
                                            + userIdGroupPairsListIndex
                                            + ".GroupName",
                                    StringUtils
                                            .fromString(userIdGroupPairsListValue
                                                    .getGroupName()));
                        }

                        if (userIdGroupPairsListValue.getGroupId() != null) {
                            request.addParameter(
                                    "IpPermissions." + ipPermissionsListIndex
                                            + ".Groups."
                                            + userIdGroupPairsListIndex
                                            + ".GroupId",
                                    StringUtils
                                            .fromString(userIdGroupPairsListValue
                                                    .getGroupId()));
                        }

                        if (userIdGroupPairsListValue.getVpcId() != null) {
                            request.addParameter(
                                    "IpPermissions." + ipPermissionsListIndex
                                            + ".Groups."
                                            + userIdGroupPairsListIndex
                                            + ".VpcId",
                                    StringUtils
                                            .fromString(userIdGroupPairsListValue
                                                    .getVpcId()));
                        }

                        if (userIdGroupPairsListValue
                                .getVpcPeeringConnectionId() != null) {
                            request.addParameter("IpPermissions."
                                    + ipPermissionsListIndex + ".Groups."
                                    + userIdGroupPairsListIndex
                                    + ".VpcPeeringConnectionId", StringUtils
                                    .fromString(userIdGroupPairsListValue
                                            .getVpcPeeringConnectionId()));
                        }

                        if (userIdGroupPairsListValue.getPeeringStatus() != null) {
                            request.addParameter("IpPermissions."
                                    + ipPermissionsListIndex + ".Groups."
                                    + userIdGroupPairsListIndex
                                    + ".PeeringStatus", StringUtils
                                    .fromString(userIdGroupPairsListValue
                                            .getPeeringStatus()));
                        }
                        userIdGroupPairsListIndex++;
                    }
                }

                com.amazonaws.internal.SdkInternalList<String> ipRangesList = (com.amazonaws.internal.SdkInternalList<String>) ipPermissionsListValue
                        .getIpRanges();
                if (!ipRangesList.isEmpty() || !ipRangesList.isAutoConstruct()) {
                    int ipRangesListIndex = 1;

                    for (String ipRangesListValue : ipRangesList) {
                        if (ipRangesListValue != null) {
                            request.addParameter("IpPermissions."
                                    + ipPermissionsListIndex + ".IpRanges."
                                    + ipRangesListIndex + ".CidrIp",
                                    StringUtils.fromString(ipRangesListValue));
                        }
                        ipRangesListIndex++;
                    }
                }

                com.amazonaws.internal.SdkInternalList<PrefixListId> prefixListIdsList = (com.amazonaws.internal.SdkInternalList<PrefixListId>) ipPermissionsListValue
                        .getPrefixListIds();
                if (!prefixListIdsList.isEmpty()
                        || !prefixListIdsList.isAutoConstruct()) {
                    int prefixListIdsListIndex = 1;

                    for (PrefixListId prefixListIdsListValue : prefixListIdsList) {

                        if (prefixListIdsListValue.getPrefixListId() != null) {
                            request.addParameter("IpPermissions."
                                    + ipPermissionsListIndex
                                    + ".PrefixListIds."
                                    + prefixListIdsListIndex + ".PrefixListId",
                                    StringUtils
                                            .fromString(prefixListIdsListValue
                                                    .getPrefixListId()));
                        }
                        prefixListIdsListIndex++;
                    }
                }
                ipPermissionsListIndex++;
            }
        }

        return request;
    }

}
