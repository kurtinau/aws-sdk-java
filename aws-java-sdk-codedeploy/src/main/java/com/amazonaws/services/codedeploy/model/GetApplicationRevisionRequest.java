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
 * Represents the input of a get application revision operation.
 * </p>
 */
public class GetApplicationRevisionRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application that corresponds to the revision.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Information about the application revision to get, including the
     * revision's type and its location.
     * </p>
     */
    private RevisionLocation revision;

    /**
     * <p>
     * The name of the application that corresponds to the revision.
     * </p>
     * 
     * @param applicationName
     *        The name of the application that corresponds to the revision.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application that corresponds to the revision.
     * </p>
     * 
     * @return The name of the application that corresponds to the revision.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application that corresponds to the revision.
     * </p>
     * 
     * @param applicationName
     *        The name of the application that corresponds to the revision.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetApplicationRevisionRequest withApplicationName(
            String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Information about the application revision to get, including the
     * revision's type and its location.
     * </p>
     * 
     * @param revision
     *        Information about the application revision to get, including the
     *        revision's type and its location.
     */

    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * Information about the application revision to get, including the
     * revision's type and its location.
     * </p>
     * 
     * @return Information about the application revision to get, including the
     *         revision's type and its location.
     */

    public RevisionLocation getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * Information about the application revision to get, including the
     * revision's type and its location.
     * </p>
     * 
     * @param revision
     *        Information about the application revision to get, including the
     *        revision's type and its location.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetApplicationRevisionRequest withRevision(RevisionLocation revision) {
        setRevision(revision);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getRevision() != null)
            sb.append("Revision: " + getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationRevisionRequest == false)
            return false;
        GetApplicationRevisionRequest other = (GetApplicationRevisionRequest) obj;
        if (other.getApplicationName() == null
                ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null
                && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationRevisionRequest clone() {
        return (GetApplicationRevisionRequest) super.clone();
    }
}