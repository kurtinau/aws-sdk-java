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

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteLoginProfileRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the user whose password you want to delete.
     * </p>
     */
    private String userName;

    /**
     * Default constructor for DeleteLoginProfileRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize the
     * object after creating it.
     */
    public DeleteLoginProfileRequest() {
    }

    /**
     * Constructs a new DeleteLoginProfileRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param userName
     *        The name of the user whose password you want to delete.
     */
    public DeleteLoginProfileRequest(String userName) {
        setUserName(userName);
    }

    /**
     * <p>
     * The name of the user whose password you want to delete.
     * </p>
     * 
     * @param userName
     *        The name of the user whose password you want to delete.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user whose password you want to delete.
     * </p>
     * 
     * @return The name of the user whose password you want to delete.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user whose password you want to delete.
     * </p>
     * 
     * @param userName
     *        The name of the user whose password you want to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteLoginProfileRequest withUserName(String userName) {
        setUserName(userName);
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLoginProfileRequest == false)
            return false;
        DeleteLoginProfileRequest other = (DeleteLoginProfileRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null
                && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLoginProfileRequest clone() {
        return (DeleteLoginProfileRequest) super.clone();
    }
}