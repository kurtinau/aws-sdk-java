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

/**
 * <p>
 * Represents the output of a delete deployment group operation.
 * </p>
 */
public class DeleteDeploymentGroupResult implements Serializable, Cloneable {

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group
     * contained at least one Auto Scaling group, AWS CodeDeploy successfully
     * removed all corresponding Auto Scaling lifecycle event hooks from the
     * Amazon EC2 instances in the Auto Scaling. If the output does contain
     * data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event
     * hooks from the Amazon EC2 instances in the Auto Scaling group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AutoScalingGroup> hooksNotCleanedUp;

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group
     * contained at least one Auto Scaling group, AWS CodeDeploy successfully
     * removed all corresponding Auto Scaling lifecycle event hooks from the
     * Amazon EC2 instances in the Auto Scaling. If the output does contain
     * data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event
     * hooks from the Amazon EC2 instances in the Auto Scaling group.
     * </p>
     * 
     * @return If the output contains no data, and the corresponding deployment
     *         group contained at least one Auto Scaling group, AWS CodeDeploy
     *         successfully removed all corresponding Auto Scaling lifecycle
     *         event hooks from the Amazon EC2 instances in the Auto Scaling. If
     *         the output does contain data, AWS CodeDeploy could not remove
     *         some Auto Scaling lifecycle event hooks from the Amazon EC2
     *         instances in the Auto Scaling group.
     */

    public java.util.List<AutoScalingGroup> getHooksNotCleanedUp() {
        if (hooksNotCleanedUp == null) {
            hooksNotCleanedUp = new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>();
        }
        return hooksNotCleanedUp;
    }

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group
     * contained at least one Auto Scaling group, AWS CodeDeploy successfully
     * removed all corresponding Auto Scaling lifecycle event hooks from the
     * Amazon EC2 instances in the Auto Scaling. If the output does contain
     * data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event
     * hooks from the Amazon EC2 instances in the Auto Scaling group.
     * </p>
     * 
     * @param hooksNotCleanedUp
     *        If the output contains no data, and the corresponding deployment
     *        group contained at least one Auto Scaling group, AWS CodeDeploy
     *        successfully removed all corresponding Auto Scaling lifecycle
     *        event hooks from the Amazon EC2 instances in the Auto Scaling. If
     *        the output does contain data, AWS CodeDeploy could not remove some
     *        Auto Scaling lifecycle event hooks from the Amazon EC2 instances
     *        in the Auto Scaling group.
     */

    public void setHooksNotCleanedUp(
            java.util.Collection<AutoScalingGroup> hooksNotCleanedUp) {
        if (hooksNotCleanedUp == null) {
            this.hooksNotCleanedUp = null;
            return;
        }

        this.hooksNotCleanedUp = new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>(
                hooksNotCleanedUp);
    }

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group
     * contained at least one Auto Scaling group, AWS CodeDeploy successfully
     * removed all corresponding Auto Scaling lifecycle event hooks from the
     * Amazon EC2 instances in the Auto Scaling. If the output does contain
     * data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event
     * hooks from the Amazon EC2 instances in the Auto Scaling group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setHooksNotCleanedUp(java.util.Collection)} or
     * {@link #withHooksNotCleanedUp(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hooksNotCleanedUp
     *        If the output contains no data, and the corresponding deployment
     *        group contained at least one Auto Scaling group, AWS CodeDeploy
     *        successfully removed all corresponding Auto Scaling lifecycle
     *        event hooks from the Amazon EC2 instances in the Auto Scaling. If
     *        the output does contain data, AWS CodeDeploy could not remove some
     *        Auto Scaling lifecycle event hooks from the Amazon EC2 instances
     *        in the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteDeploymentGroupResult withHooksNotCleanedUp(
            AutoScalingGroup... hooksNotCleanedUp) {
        if (this.hooksNotCleanedUp == null) {
            setHooksNotCleanedUp(new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>(
                    hooksNotCleanedUp.length));
        }
        for (AutoScalingGroup ele : hooksNotCleanedUp) {
            this.hooksNotCleanedUp.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group
     * contained at least one Auto Scaling group, AWS CodeDeploy successfully
     * removed all corresponding Auto Scaling lifecycle event hooks from the
     * Amazon EC2 instances in the Auto Scaling. If the output does contain
     * data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event
     * hooks from the Amazon EC2 instances in the Auto Scaling group.
     * </p>
     * 
     * @param hooksNotCleanedUp
     *        If the output contains no data, and the corresponding deployment
     *        group contained at least one Auto Scaling group, AWS CodeDeploy
     *        successfully removed all corresponding Auto Scaling lifecycle
     *        event hooks from the Amazon EC2 instances in the Auto Scaling. If
     *        the output does contain data, AWS CodeDeploy could not remove some
     *        Auto Scaling lifecycle event hooks from the Amazon EC2 instances
     *        in the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteDeploymentGroupResult withHooksNotCleanedUp(
            java.util.Collection<AutoScalingGroup> hooksNotCleanedUp) {
        setHooksNotCleanedUp(hooksNotCleanedUp);
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
        if (getHooksNotCleanedUp() != null)
            sb.append("HooksNotCleanedUp: " + getHooksNotCleanedUp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDeploymentGroupResult == false)
            return false;
        DeleteDeploymentGroupResult other = (DeleteDeploymentGroupResult) obj;
        if (other.getHooksNotCleanedUp() == null
                ^ this.getHooksNotCleanedUp() == null)
            return false;
        if (other.getHooksNotCleanedUp() != null
                && other.getHooksNotCleanedUp().equals(
                        this.getHooksNotCleanedUp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHooksNotCleanedUp() == null) ? 0
                        : getHooksNotCleanedUp().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDeploymentGroupResult clone() {
        try {
            return (DeleteDeploymentGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
