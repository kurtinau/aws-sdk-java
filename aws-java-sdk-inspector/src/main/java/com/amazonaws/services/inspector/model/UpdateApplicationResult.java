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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * 
 */
public class UpdateApplicationResult implements Serializable, Cloneable {

    /**
     * <p>
     * Confirmation details of the action performed.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Confirmation details of the action performed.
     * </p>
     * 
     * @param message
     *        Confirmation details of the action performed.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Confirmation details of the action performed.
     * </p>
     * 
     * @return Confirmation details of the action performed.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Confirmation details of the action performed.
     * </p>
     * 
     * @param message
     *        Confirmation details of the action performed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateApplicationResult withMessage(String message) {
        setMessage(message);
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
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationResult == false)
            return false;
        UpdateApplicationResult other = (UpdateApplicationResult) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null
                && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationResult clone() {
        try {
            return (UpdateApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
