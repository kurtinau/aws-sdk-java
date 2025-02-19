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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class CancelImportTaskResult implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the task being canceled.
     * </p>
     */
    private String importTaskId;
    /**
     * <p>
     * The current state of the task being canceled.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The current state of the task being canceled.
     * </p>
     */
    private String previousState;

    /**
     * <p>
     * The ID of the task being canceled.
     * </p>
     * 
     * @param importTaskId
     *        The ID of the task being canceled.
     */

    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }

    /**
     * <p>
     * The ID of the task being canceled.
     * </p>
     * 
     * @return The ID of the task being canceled.
     */

    public String getImportTaskId() {
        return this.importTaskId;
    }

    /**
     * <p>
     * The ID of the task being canceled.
     * </p>
     * 
     * @param importTaskId
     *        The ID of the task being canceled.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CancelImportTaskResult withImportTaskId(String importTaskId) {
        setImportTaskId(importTaskId);
        return this;
    }

    /**
     * <p>
     * The current state of the task being canceled.
     * </p>
     * 
     * @param state
     *        The current state of the task being canceled.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the task being canceled.
     * </p>
     * 
     * @return The current state of the task being canceled.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the task being canceled.
     * </p>
     * 
     * @param state
     *        The current state of the task being canceled.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CancelImportTaskResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the task being canceled.
     * </p>
     * 
     * @param previousState
     *        The current state of the task being canceled.
     */

    public void setPreviousState(String previousState) {
        this.previousState = previousState;
    }

    /**
     * <p>
     * The current state of the task being canceled.
     * </p>
     * 
     * @return The current state of the task being canceled.
     */

    public String getPreviousState() {
        return this.previousState;
    }

    /**
     * <p>
     * The current state of the task being canceled.
     * </p>
     * 
     * @param previousState
     *        The current state of the task being canceled.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CancelImportTaskResult withPreviousState(String previousState) {
        setPreviousState(previousState);
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
        if (getImportTaskId() != null)
            sb.append("ImportTaskId: " + getImportTaskId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getPreviousState() != null)
            sb.append("PreviousState: " + getPreviousState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelImportTaskResult == false)
            return false;
        CancelImportTaskResult other = (CancelImportTaskResult) obj;
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null)
            return false;
        if (other.getImportTaskId() != null
                && other.getImportTaskId().equals(this.getImportTaskId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null
                && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPreviousState() == null ^ this.getPreviousState() == null)
            return false;
        if (other.getPreviousState() != null
                && other.getPreviousState().equals(this.getPreviousState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getImportTaskId() == null) ? 0 : getImportTaskId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreviousState() == null) ? 0 : getPreviousState()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CancelImportTaskResult clone() {
        try {
            return (CancelImportTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}