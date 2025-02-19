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
 * Information about notification triggers for the deployment group.
 * </p>
 */
public class TriggerConfig implements Serializable, Cloneable {

    /** <para>The name of the notification trigger.</para> */
    private String triggerName;
    /**
     * <p>
     * The arn of the Amazon Simple Notification Service topic through which
     * notifications about deployment or instance events are sent.
     * </p>
     */
    private String triggerTargetArn;
    /**
     * <p>
     * The event type or types for which notifications are triggered.
     * </p>
     * <p>
     * The following event type values are supported:
     * </p>
     * <ul>
     * <li>DEPLOYMENT_START</li>
     * <li>DEPLOYMENT_SUCCESS</li>
     * <li>DEPLOYMENT_FAILURE</li>
     * <li>DEPLOYMENT_STOP</li>
     * <li>INSTANCE_START</li>
     * <li>INSTANCE_SUCCESS</li>
     * <li>INSTANCE_FAILURE</li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> triggerEvents;

    /**
     * <para>The name of the notification trigger.</para>
     * 
     * @param triggerName
     *        The name of the notification trigger.
     */

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * <para>The name of the notification trigger.</para>
     * 
     * @return The name of the notification trigger.
     */

    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * <para>The name of the notification trigger.</para>
     * 
     * @param triggerName
     *        The name of the notification trigger.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TriggerConfig withTriggerName(String triggerName) {
        setTriggerName(triggerName);
        return this;
    }

    /**
     * <p>
     * The arn of the Amazon Simple Notification Service topic through which
     * notifications about deployment or instance events are sent.
     * </p>
     * 
     * @param triggerTargetArn
     *        The arn of the Amazon Simple Notification Service topic through
     *        which notifications about deployment or instance events are sent.
     */

    public void setTriggerTargetArn(String triggerTargetArn) {
        this.triggerTargetArn = triggerTargetArn;
    }

    /**
     * <p>
     * The arn of the Amazon Simple Notification Service topic through which
     * notifications about deployment or instance events are sent.
     * </p>
     * 
     * @return The arn of the Amazon Simple Notification Service topic through
     *         which notifications about deployment or instance events are sent.
     */

    public String getTriggerTargetArn() {
        return this.triggerTargetArn;
    }

    /**
     * <p>
     * The arn of the Amazon Simple Notification Service topic through which
     * notifications about deployment or instance events are sent.
     * </p>
     * 
     * @param triggerTargetArn
     *        The arn of the Amazon Simple Notification Service topic through
     *        which notifications about deployment or instance events are sent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TriggerConfig withTriggerTargetArn(String triggerTargetArn) {
        setTriggerTargetArn(triggerTargetArn);
        return this;
    }

    /**
     * <p>
     * The event type or types for which notifications are triggered.
     * </p>
     * <p>
     * The following event type values are supported:
     * </p>
     * <ul>
     * <li>DEPLOYMENT_START</li>
     * <li>DEPLOYMENT_SUCCESS</li>
     * <li>DEPLOYMENT_FAILURE</li>
     * <li>DEPLOYMENT_STOP</li>
     * <li>INSTANCE_START</li>
     * <li>INSTANCE_SUCCESS</li>
     * <li>INSTANCE_FAILURE</li>
     * </ul>
     * 
     * @return The event type or types for which notifications are
     *         triggered.</p>
     *         <p>
     *         The following event type values are supported:
     *         </p>
     *         <ul>
     *         <li>DEPLOYMENT_START</li>
     *         <li>DEPLOYMENT_SUCCESS</li>
     *         <li>DEPLOYMENT_FAILURE</li>
     *         <li>DEPLOYMENT_STOP</li>
     *         <li>INSTANCE_START</li>
     *         <li>INSTANCE_SUCCESS</li>
     *         <li>INSTANCE_FAILURE</li>
     * @see TriggerEventType
     */

    public java.util.List<String> getTriggerEvents() {
        if (triggerEvents == null) {
            triggerEvents = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return triggerEvents;
    }

    /**
     * <p>
     * The event type or types for which notifications are triggered.
     * </p>
     * <p>
     * The following event type values are supported:
     * </p>
     * <ul>
     * <li>DEPLOYMENT_START</li>
     * <li>DEPLOYMENT_SUCCESS</li>
     * <li>DEPLOYMENT_FAILURE</li>
     * <li>DEPLOYMENT_STOP</li>
     * <li>INSTANCE_START</li>
     * <li>INSTANCE_SUCCESS</li>
     * <li>INSTANCE_FAILURE</li>
     * </ul>
     * 
     * @param triggerEvents
     *        The event type or types for which notifications are triggered.</p>
     *        <p>
     *        The following event type values are supported:
     *        </p>
     *        <ul>
     *        <li>DEPLOYMENT_START</li>
     *        <li>DEPLOYMENT_SUCCESS</li>
     *        <li>DEPLOYMENT_FAILURE</li>
     *        <li>DEPLOYMENT_STOP</li>
     *        <li>INSTANCE_START</li>
     *        <li>INSTANCE_SUCCESS</li>
     *        <li>INSTANCE_FAILURE</li>
     * @see TriggerEventType
     */

    public void setTriggerEvents(java.util.Collection<String> triggerEvents) {
        if (triggerEvents == null) {
            this.triggerEvents = null;
            return;
        }

        this.triggerEvents = new com.amazonaws.internal.SdkInternalList<String>(
                triggerEvents);
    }

    /**
     * <p>
     * The event type or types for which notifications are triggered.
     * </p>
     * <p>
     * The following event type values are supported:
     * </p>
     * <ul>
     * <li>DEPLOYMENT_START</li>
     * <li>DEPLOYMENT_SUCCESS</li>
     * <li>DEPLOYMENT_FAILURE</li>
     * <li>DEPLOYMENT_STOP</li>
     * <li>INSTANCE_START</li>
     * <li>INSTANCE_SUCCESS</li>
     * <li>INSTANCE_FAILURE</li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTriggerEvents(java.util.Collection)} or
     * {@link #withTriggerEvents(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param triggerEvents
     *        The event type or types for which notifications are triggered.</p>
     *        <p>
     *        The following event type values are supported:
     *        </p>
     *        <ul>
     *        <li>DEPLOYMENT_START</li>
     *        <li>DEPLOYMENT_SUCCESS</li>
     *        <li>DEPLOYMENT_FAILURE</li>
     *        <li>DEPLOYMENT_STOP</li>
     *        <li>INSTANCE_START</li>
     *        <li>INSTANCE_SUCCESS</li>
     *        <li>INSTANCE_FAILURE</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TriggerEventType
     */

    public TriggerConfig withTriggerEvents(String... triggerEvents) {
        if (this.triggerEvents == null) {
            setTriggerEvents(new com.amazonaws.internal.SdkInternalList<String>(
                    triggerEvents.length));
        }
        for (String ele : triggerEvents) {
            this.triggerEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event type or types for which notifications are triggered.
     * </p>
     * <p>
     * The following event type values are supported:
     * </p>
     * <ul>
     * <li>DEPLOYMENT_START</li>
     * <li>DEPLOYMENT_SUCCESS</li>
     * <li>DEPLOYMENT_FAILURE</li>
     * <li>DEPLOYMENT_STOP</li>
     * <li>INSTANCE_START</li>
     * <li>INSTANCE_SUCCESS</li>
     * <li>INSTANCE_FAILURE</li>
     * </ul>
     * 
     * @param triggerEvents
     *        The event type or types for which notifications are triggered.</p>
     *        <p>
     *        The following event type values are supported:
     *        </p>
     *        <ul>
     *        <li>DEPLOYMENT_START</li>
     *        <li>DEPLOYMENT_SUCCESS</li>
     *        <li>DEPLOYMENT_FAILURE</li>
     *        <li>DEPLOYMENT_STOP</li>
     *        <li>INSTANCE_START</li>
     *        <li>INSTANCE_SUCCESS</li>
     *        <li>INSTANCE_FAILURE</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TriggerEventType
     */

    public TriggerConfig withTriggerEvents(
            java.util.Collection<String> triggerEvents) {
        setTriggerEvents(triggerEvents);
        return this;
    }

    /**
     * <p>
     * The event type or types for which notifications are triggered.
     * </p>
     * <p>
     * The following event type values are supported:
     * </p>
     * <ul>
     * <li>DEPLOYMENT_START</li>
     * <li>DEPLOYMENT_SUCCESS</li>
     * <li>DEPLOYMENT_FAILURE</li>
     * <li>DEPLOYMENT_STOP</li>
     * <li>INSTANCE_START</li>
     * <li>INSTANCE_SUCCESS</li>
     * <li>INSTANCE_FAILURE</li>
     * </ul>
     * 
     * @param triggerEvents
     *        The event type or types for which notifications are triggered.</p>
     *        <p>
     *        The following event type values are supported:
     *        </p>
     *        <ul>
     *        <li>DEPLOYMENT_START</li>
     *        <li>DEPLOYMENT_SUCCESS</li>
     *        <li>DEPLOYMENT_FAILURE</li>
     *        <li>DEPLOYMENT_STOP</li>
     *        <li>INSTANCE_START</li>
     *        <li>INSTANCE_SUCCESS</li>
     *        <li>INSTANCE_FAILURE</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TriggerEventType
     */

    public TriggerConfig withTriggerEvents(TriggerEventType... triggerEvents) {
        com.amazonaws.internal.SdkInternalList<String> triggerEventsCopy = new com.amazonaws.internal.SdkInternalList<String>(
                triggerEvents.length);
        for (TriggerEventType value : triggerEvents) {
            triggerEventsCopy.add(value.toString());
        }
        if (getTriggerEvents() == null) {
            setTriggerEvents(triggerEventsCopy);
        } else {
            getTriggerEvents().addAll(triggerEventsCopy);
        }
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
        if (getTriggerName() != null)
            sb.append("TriggerName: " + getTriggerName() + ",");
        if (getTriggerTargetArn() != null)
            sb.append("TriggerTargetArn: " + getTriggerTargetArn() + ",");
        if (getTriggerEvents() != null)
            sb.append("TriggerEvents: " + getTriggerEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TriggerConfig == false)
            return false;
        TriggerConfig other = (TriggerConfig) obj;
        if (other.getTriggerName() == null ^ this.getTriggerName() == null)
            return false;
        if (other.getTriggerName() != null
                && other.getTriggerName().equals(this.getTriggerName()) == false)
            return false;
        if (other.getTriggerTargetArn() == null
                ^ this.getTriggerTargetArn() == null)
            return false;
        if (other.getTriggerTargetArn() != null
                && other.getTriggerTargetArn().equals(
                        this.getTriggerTargetArn()) == false)
            return false;
        if (other.getTriggerEvents() == null ^ this.getTriggerEvents() == null)
            return false;
        if (other.getTriggerEvents() != null
                && other.getTriggerEvents().equals(this.getTriggerEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTriggerName() == null) ? 0 : getTriggerName().hashCode());
        hashCode = prime
                * hashCode
                + ((getTriggerTargetArn() == null) ? 0 : getTriggerTargetArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTriggerEvents() == null) ? 0 : getTriggerEvents()
                        .hashCode());
        return hashCode;
    }

    @Override
    public TriggerConfig clone() {
        try {
            return (TriggerConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
