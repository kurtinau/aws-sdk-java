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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains identifying information about the health check.
 * </p>
 */
public class HealthCheck implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the specified health check.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A unique string that identifies the request to create the health check.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * A complex type that contains the health check configuration.
     * </p>
     */
    private HealthCheckConfig healthCheckConfig;
    /**
     * <p>
     * The version of the health check. You can optionally pass this value in a
     * call to <code>UpdateHealthCheck</code> to prevent overwriting another
     * change to the health check.
     * </p>
     */
    private Long healthCheckVersion;

    /**
     * <p>
     * The ID of the specified health check.
     * </p>
     * 
     * @param id
     *        The ID of the specified health check.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the specified health check.
     * </p>
     * 
     * @return The ID of the specified health check.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the specified health check.
     * </p>
     * 
     * @param id
     *        The ID of the specified health check.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheck withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request to create the health check.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request to create the health
     *        check.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request to create the health check.
     * </p>
     * 
     * @return A unique string that identifies the request to create the health
     *         check.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request to create the health check.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request to create the health
     *        check.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheck withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the health check configuration.
     * </p>
     * 
     * @param healthCheckConfig
     *        A complex type that contains the health check configuration.
     */

    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * <p>
     * A complex type that contains the health check configuration.
     * </p>
     * 
     * @return A complex type that contains the health check configuration.
     */

    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * <p>
     * A complex type that contains the health check configuration.
     * </p>
     * 
     * @param healthCheckConfig
     *        A complex type that contains the health check configuration.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheck withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        setHealthCheckConfig(healthCheckConfig);
        return this;
    }

    /**
     * <p>
     * The version of the health check. You can optionally pass this value in a
     * call to <code>UpdateHealthCheck</code> to prevent overwriting another
     * change to the health check.
     * </p>
     * 
     * @param healthCheckVersion
     *        The version of the health check. You can optionally pass this
     *        value in a call to <code>UpdateHealthCheck</code> to prevent
     *        overwriting another change to the health check.
     */

    public void setHealthCheckVersion(Long healthCheckVersion) {
        this.healthCheckVersion = healthCheckVersion;
    }

    /**
     * <p>
     * The version of the health check. You can optionally pass this value in a
     * call to <code>UpdateHealthCheck</code> to prevent overwriting another
     * change to the health check.
     * </p>
     * 
     * @return The version of the health check. You can optionally pass this
     *         value in a call to <code>UpdateHealthCheck</code> to prevent
     *         overwriting another change to the health check.
     */

    public Long getHealthCheckVersion() {
        return this.healthCheckVersion;
    }

    /**
     * <p>
     * The version of the health check. You can optionally pass this value in a
     * call to <code>UpdateHealthCheck</code> to prevent overwriting another
     * change to the health check.
     * </p>
     * 
     * @param healthCheckVersion
     *        The version of the health check. You can optionally pass this
     *        value in a call to <code>UpdateHealthCheck</code> to prevent
     *        overwriting another change to the health check.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public HealthCheck withHealthCheckVersion(Long healthCheckVersion) {
        setHealthCheckVersion(healthCheckVersion);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: " + getHealthCheckConfig() + ",");
        if (getHealthCheckVersion() != null)
            sb.append("HealthCheckVersion: " + getHealthCheckVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheck == false)
            return false;
        HealthCheck other = (HealthCheck) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCallerReference() == null
                ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getHealthCheckConfig() == null
                ^ this.getHealthCheckConfig() == null)
            return false;
        if (other.getHealthCheckConfig() != null
                && other.getHealthCheckConfig().equals(
                        this.getHealthCheckConfig()) == false)
            return false;
        if (other.getHealthCheckVersion() == null
                ^ this.getHealthCheckVersion() == null)
            return false;
        if (other.getHealthCheckVersion() != null
                && other.getHealthCheckVersion().equals(
                        this.getHealthCheckVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckConfig() == null) ? 0
                        : getHealthCheckConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckVersion() == null) ? 0
                        : getHealthCheckVersion().hashCode());
        return hashCode;
    }

    @Override
    public HealthCheck clone() {
        try {
            return (HealthCheck) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
