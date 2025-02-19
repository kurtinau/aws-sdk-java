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
 * Represents the output of a list applications operation.
 * </p>
 */
public class ListApplicationsResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list of application names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> applications;
    /**
     * <p>
     * If the amount of information that is returned is significantly large, an
     * identifier will also be returned, which can be used in a subsequent list
     * applications call to return the next set of applications in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of application names.
     * </p>
     * 
     * @return A list of application names.
     */

    public java.util.List<String> getApplications() {
        if (applications == null) {
            applications = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return applications;
    }

    /**
     * <p>
     * A list of application names.
     * </p>
     * 
     * @param applications
     *        A list of application names.
     */

    public void setApplications(java.util.Collection<String> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new com.amazonaws.internal.SdkInternalList<String>(
                applications);
    }

    /**
     * <p>
     * A list of application names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setApplications(java.util.Collection)} or
     * {@link #withApplications(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param applications
     *        A list of application names.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListApplicationsResult withApplications(String... applications) {
        if (this.applications == null) {
            setApplications(new com.amazonaws.internal.SdkInternalList<String>(
                    applications.length));
        }
        for (String ele : applications) {
            this.applications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of application names.
     * </p>
     * 
     * @param applications
     *        A list of application names.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListApplicationsResult withApplications(
            java.util.Collection<String> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * If the amount of information that is returned is significantly large, an
     * identifier will also be returned, which can be used in a subsequent list
     * applications call to return the next set of applications in the list.
     * </p>
     * 
     * @param nextToken
     *        If the amount of information that is returned is significantly
     *        large, an identifier will also be returned, which can be used in a
     *        subsequent list applications call to return the next set of
     *        applications in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the amount of information that is returned is significantly large, an
     * identifier will also be returned, which can be used in a subsequent list
     * applications call to return the next set of applications in the list.
     * </p>
     * 
     * @return If the amount of information that is returned is significantly
     *         large, an identifier will also be returned, which can be used in
     *         a subsequent list applications call to return the next set of
     *         applications in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the amount of information that is returned is significantly large, an
     * identifier will also be returned, which can be used in a subsequent list
     * applications call to return the next set of applications in the list.
     * </p>
     * 
     * @param nextToken
     *        If the amount of information that is returned is significantly
     *        large, an identifier will also be returned, which can be used in a
     *        subsequent list applications call to return the next set of
     *        applications in the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListApplicationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getApplications() != null)
            sb.append("Applications: " + getApplications() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationsResult == false)
            return false;
        ListApplicationsResult other = (ListApplicationsResult) obj;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null
                && other.getApplications().equals(this.getApplications()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplications() == null) ? 0 : getApplications()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationsResult clone() {
        try {
            return (ListApplicationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
