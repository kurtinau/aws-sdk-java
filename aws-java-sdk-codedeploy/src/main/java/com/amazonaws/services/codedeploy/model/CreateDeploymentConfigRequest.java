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
 * Represents the input of a create deployment configuration operation.
 * </p>
 */
public class CreateDeploymentConfigRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the deployment configuration to create.
     * </p>
     */
    private String deploymentConfigName;
    /**
     * <p>
     * The minimum number of healthy instances that should be available at any
     * time during the deployment. There are two parameters expected in the
     * input: type and value.
     * </p>
     * <p>
     * The type parameter takes either of the following values:
     * </p>
     * <ul>
     * <li>HOST_COUNT: The value parameter represents the minimum number of
     * healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The value parameter represents the minimum number of
     * healthy instances, as a percentage of the total number of instances in
     * the deployment. If you specify FLEET_PERCENT, then at the start of the
     * deployment AWS CodeDeploy converts the percentage to the equivalent
     * number of instances and rounds fractional instances up.</li>
     * </ul>
     * <p>
     * The value parameter takes an integer.
     * </p>
     * <p>
     * For example, to set a minimum of 95% healthy instances, specify a type of
     * FLEET_PERCENT and a value of 95.
     * </p>
     */
    private MinimumHealthyHosts minimumHealthyHosts;

    /**
     * <p>
     * The name of the deployment configuration to create.
     * </p>
     * 
     * @param deploymentConfigName
     *        The name of the deployment configuration to create.
     */

    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * The name of the deployment configuration to create.
     * </p>
     * 
     * @return The name of the deployment configuration to create.
     */

    public String getDeploymentConfigName() {
        return this.deploymentConfigName;
    }

    /**
     * <p>
     * The name of the deployment configuration to create.
     * </p>
     * 
     * @param deploymentConfigName
     *        The name of the deployment configuration to create.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDeploymentConfigRequest withDeploymentConfigName(
            String deploymentConfigName) {
        setDeploymentConfigName(deploymentConfigName);
        return this;
    }

    /**
     * <p>
     * The minimum number of healthy instances that should be available at any
     * time during the deployment. There are two parameters expected in the
     * input: type and value.
     * </p>
     * <p>
     * The type parameter takes either of the following values:
     * </p>
     * <ul>
     * <li>HOST_COUNT: The value parameter represents the minimum number of
     * healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The value parameter represents the minimum number of
     * healthy instances, as a percentage of the total number of instances in
     * the deployment. If you specify FLEET_PERCENT, then at the start of the
     * deployment AWS CodeDeploy converts the percentage to the equivalent
     * number of instances and rounds fractional instances up.</li>
     * </ul>
     * <p>
     * The value parameter takes an integer.
     * </p>
     * <p>
     * For example, to set a minimum of 95% healthy instances, specify a type of
     * FLEET_PERCENT and a value of 95.
     * </p>
     * 
     * @param minimumHealthyHosts
     *        The minimum number of healthy instances that should be available
     *        at any time during the deployment. There are two parameters
     *        expected in the input: type and value.</p>
     *        <p>
     *        The type parameter takes either of the following values:
     *        </p>
     *        <ul>
     *        <li>HOST_COUNT: The value parameter represents the minimum number
     *        of healthy instances, as an absolute value.</li>
     *        <li>FLEET_PERCENT: The value parameter represents the minimum
     *        number of healthy instances, as a percentage of the total number
     *        of instances in the deployment. If you specify FLEET_PERCENT, then
     *        at the start of the deployment AWS CodeDeploy converts the
     *        percentage to the equivalent number of instances and rounds
     *        fractional instances up.</li>
     *        </ul>
     *        <p>
     *        The value parameter takes an integer.
     *        </p>
     *        <p>
     *        For example, to set a minimum of 95% healthy instances, specify a
     *        type of FLEET_PERCENT and a value of 95.
     */

    public void setMinimumHealthyHosts(MinimumHealthyHosts minimumHealthyHosts) {
        this.minimumHealthyHosts = minimumHealthyHosts;
    }

    /**
     * <p>
     * The minimum number of healthy instances that should be available at any
     * time during the deployment. There are two parameters expected in the
     * input: type and value.
     * </p>
     * <p>
     * The type parameter takes either of the following values:
     * </p>
     * <ul>
     * <li>HOST_COUNT: The value parameter represents the minimum number of
     * healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The value parameter represents the minimum number of
     * healthy instances, as a percentage of the total number of instances in
     * the deployment. If you specify FLEET_PERCENT, then at the start of the
     * deployment AWS CodeDeploy converts the percentage to the equivalent
     * number of instances and rounds fractional instances up.</li>
     * </ul>
     * <p>
     * The value parameter takes an integer.
     * </p>
     * <p>
     * For example, to set a minimum of 95% healthy instances, specify a type of
     * FLEET_PERCENT and a value of 95.
     * </p>
     * 
     * @return The minimum number of healthy instances that should be available
     *         at any time during the deployment. There are two parameters
     *         expected in the input: type and value.</p>
     *         <p>
     *         The type parameter takes either of the following values:
     *         </p>
     *         <ul>
     *         <li>HOST_COUNT: The value parameter represents the minimum number
     *         of healthy instances, as an absolute value.</li>
     *         <li>FLEET_PERCENT: The value parameter represents the minimum
     *         number of healthy instances, as a percentage of the total number
     *         of instances in the deployment. If you specify FLEET_PERCENT,
     *         then at the start of the deployment AWS CodeDeploy converts the
     *         percentage to the equivalent number of instances and rounds
     *         fractional instances up.</li>
     *         </ul>
     *         <p>
     *         The value parameter takes an integer.
     *         </p>
     *         <p>
     *         For example, to set a minimum of 95% healthy instances, specify a
     *         type of FLEET_PERCENT and a value of 95.
     */

    public MinimumHealthyHosts getMinimumHealthyHosts() {
        return this.minimumHealthyHosts;
    }

    /**
     * <p>
     * The minimum number of healthy instances that should be available at any
     * time during the deployment. There are two parameters expected in the
     * input: type and value.
     * </p>
     * <p>
     * The type parameter takes either of the following values:
     * </p>
     * <ul>
     * <li>HOST_COUNT: The value parameter represents the minimum number of
     * healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The value parameter represents the minimum number of
     * healthy instances, as a percentage of the total number of instances in
     * the deployment. If you specify FLEET_PERCENT, then at the start of the
     * deployment AWS CodeDeploy converts the percentage to the equivalent
     * number of instances and rounds fractional instances up.</li>
     * </ul>
     * <p>
     * The value parameter takes an integer.
     * </p>
     * <p>
     * For example, to set a minimum of 95% healthy instances, specify a type of
     * FLEET_PERCENT and a value of 95.
     * </p>
     * 
     * @param minimumHealthyHosts
     *        The minimum number of healthy instances that should be available
     *        at any time during the deployment. There are two parameters
     *        expected in the input: type and value.</p>
     *        <p>
     *        The type parameter takes either of the following values:
     *        </p>
     *        <ul>
     *        <li>HOST_COUNT: The value parameter represents the minimum number
     *        of healthy instances, as an absolute value.</li>
     *        <li>FLEET_PERCENT: The value parameter represents the minimum
     *        number of healthy instances, as a percentage of the total number
     *        of instances in the deployment. If you specify FLEET_PERCENT, then
     *        at the start of the deployment AWS CodeDeploy converts the
     *        percentage to the equivalent number of instances and rounds
     *        fractional instances up.</li>
     *        </ul>
     *        <p>
     *        The value parameter takes an integer.
     *        </p>
     *        <p>
     *        For example, to set a minimum of 95% healthy instances, specify a
     *        type of FLEET_PERCENT and a value of 95.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDeploymentConfigRequest withMinimumHealthyHosts(
            MinimumHealthyHosts minimumHealthyHosts) {
        setMinimumHealthyHosts(minimumHealthyHosts);
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
            sb.append("DeploymentConfigName: " + getDeploymentConfigName()
                    + ",");
        if (getMinimumHealthyHosts() != null)
            sb.append("MinimumHealthyHosts: " + getMinimumHealthyHosts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentConfigRequest == false)
            return false;
        CreateDeploymentConfigRequest other = (CreateDeploymentConfigRequest) obj;
        if (other.getDeploymentConfigName() == null
                ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null
                && other.getDeploymentConfigName().equals(
                        this.getDeploymentConfigName()) == false)
            return false;
        if (other.getMinimumHealthyHosts() == null
                ^ this.getMinimumHealthyHosts() == null)
            return false;
        if (other.getMinimumHealthyHosts() != null
                && other.getMinimumHealthyHosts().equals(
                        this.getMinimumHealthyHosts()) == false)
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
        hashCode = prime
                * hashCode
                + ((getMinimumHealthyHosts() == null) ? 0
                        : getMinimumHealthyHosts().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentConfigRequest clone() {
        return (CreateDeploymentConfigRequest) super.clone();
    }
}