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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a get deployment configuration operation.
 * </p>
 */
public class GetDeploymentConfigRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an existing deployment configuration associated with the
     * applicable IAM user or AWS account.
     * </p>
     */
    private String deploymentConfigName;

    /**
     * <p>
     * The name of an existing deployment configuration associated with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @param deploymentConfigName
     *        The name of an existing deployment configuration associated with
     *        the applicable IAM user or AWS account.
     */

    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * The name of an existing deployment configuration associated with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @return The name of an existing deployment configuration associated with
     *         the applicable IAM user or AWS account.
     */

    public String getDeploymentConfigName() {
        return this.deploymentConfigName;
    }

    /**
     * <p>
     * The name of an existing deployment configuration associated with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @param deploymentConfigName
     *        The name of an existing deployment configuration associated with
     *        the applicable IAM user or AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetDeploymentConfigRequest withDeploymentConfigName(
            String deploymentConfigName) {
        setDeploymentConfigName(deploymentConfigName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeploymentConfigName() != null)
            sb.append("DeploymentConfigName: " + getDeploymentConfigName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentConfigRequest == false)
            return false;
        GetDeploymentConfigRequest other = (GetDeploymentConfigRequest) obj;
        if (other.getDeploymentConfigName() == null
                ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null
                && other.getDeploymentConfigName().equals(
                        this.getDeploymentConfigName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDeploymentConfigName() == null) ? 0
                        : getDeploymentConfigName().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentConfigRequest clone() {
        return (GetDeploymentConfigRequest) super.clone();
    }
}