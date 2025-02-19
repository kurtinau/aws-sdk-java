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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an attribute for describing the key schema for the table and
 * indexes.
 * </p>
 */
public class AttributeDefinition implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the attribute.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The data type for the attribute, where:
     * </p>
     * <ul>
     * <li><code>S</code> - the attribute is of type String</li>
     * <li><code>N</code> - the attribute is of type Number</li>
     * <li><code>B</code> - the attribute is of type Binary</li>
     * </ul>
     */
    private String attributeType;

    /**
     * Default constructor for AttributeDefinition object. Callers should use
     * the setter or fluent setter (with...) methods to initialize the object
     * after creating it.
     */
    public AttributeDefinition() {
    }

    /**
     * Constructs a new AttributeDefinition object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param attributeName
     *        A name for the attribute.
     * @param attributeType
     *        The data type for the attribute, where:</p>
     *        <ul>
     *        <li><code>S</code> - the attribute is of type String</li>
     *        <li><code>N</code> - the attribute is of type Number</li>
     *        <li><code>B</code> - the attribute is of type Binary</li>
     */
    public AttributeDefinition(String attributeName, String attributeType) {
        setAttributeName(attributeName);
        setAttributeType(attributeType);
    }

    /**
     * Constructs a new AttributeDefinition object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param attributeName
     *        A name for the attribute.
     * @param attributeType
     *        The data type for the attribute, where:</p>
     *        <ul>
     *        <li><code>S</code> - the attribute is of type String</li>
     *        <li><code>N</code> - the attribute is of type Number</li>
     *        <li><code>B</code> - the attribute is of type Binary</li>
     */
    public AttributeDefinition(String attributeName,
            ScalarAttributeType attributeType) {
        setAttributeName(attributeName);
        setAttributeType(attributeType.toString());
    }

    /**
     * <p>
     * A name for the attribute.
     * </p>
     * 
     * @param attributeName
     *        A name for the attribute.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * A name for the attribute.
     * </p>
     * 
     * @return A name for the attribute.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * A name for the attribute.
     * </p>
     * 
     * @param attributeName
     *        A name for the attribute.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AttributeDefinition withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The data type for the attribute, where:
     * </p>
     * <ul>
     * <li><code>S</code> - the attribute is of type String</li>
     * <li><code>N</code> - the attribute is of type Number</li>
     * <li><code>B</code> - the attribute is of type Binary</li>
     * </ul>
     * 
     * @param attributeType
     *        The data type for the attribute, where:</p>
     *        <ul>
     *        <li><code>S</code> - the attribute is of type String</li>
     *        <li><code>N</code> - the attribute is of type Number</li>
     *        <li><code>B</code> - the attribute is of type Binary</li>
     * @see ScalarAttributeType
     */

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * <p>
     * The data type for the attribute, where:
     * </p>
     * <ul>
     * <li><code>S</code> - the attribute is of type String</li>
     * <li><code>N</code> - the attribute is of type Number</li>
     * <li><code>B</code> - the attribute is of type Binary</li>
     * </ul>
     * 
     * @return The data type for the attribute, where:</p>
     *         <ul>
     *         <li><code>S</code> - the attribute is of type String</li>
     *         <li><code>N</code> - the attribute is of type Number</li>
     *         <li><code>B</code> - the attribute is of type Binary</li>
     * @see ScalarAttributeType
     */

    public String getAttributeType() {
        return this.attributeType;
    }

    /**
     * <p>
     * The data type for the attribute, where:
     * </p>
     * <ul>
     * <li><code>S</code> - the attribute is of type String</li>
     * <li><code>N</code> - the attribute is of type Number</li>
     * <li><code>B</code> - the attribute is of type Binary</li>
     * </ul>
     * 
     * @param attributeType
     *        The data type for the attribute, where:</p>
     *        <ul>
     *        <li><code>S</code> - the attribute is of type String</li>
     *        <li><code>N</code> - the attribute is of type Number</li>
     *        <li><code>B</code> - the attribute is of type Binary</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ScalarAttributeType
     */

    public AttributeDefinition withAttributeType(String attributeType) {
        setAttributeType(attributeType);
        return this;
    }

    /**
     * <p>
     * The data type for the attribute, where:
     * </p>
     * <ul>
     * <li><code>S</code> - the attribute is of type String</li>
     * <li><code>N</code> - the attribute is of type Number</li>
     * <li><code>B</code> - the attribute is of type Binary</li>
     * </ul>
     * 
     * @param attributeType
     *        The data type for the attribute, where:</p>
     *        <ul>
     *        <li><code>S</code> - the attribute is of type String</li>
     *        <li><code>N</code> - the attribute is of type Number</li>
     *        <li><code>B</code> - the attribute is of type Binary</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ScalarAttributeType
     */

    public void setAttributeType(ScalarAttributeType attributeType) {
        this.attributeType = attributeType.toString();
    }

    /**
     * <p>
     * The data type for the attribute, where:
     * </p>
     * <ul>
     * <li><code>S</code> - the attribute is of type String</li>
     * <li><code>N</code> - the attribute is of type Number</li>
     * <li><code>B</code> - the attribute is of type Binary</li>
     * </ul>
     * 
     * @param attributeType
     *        The data type for the attribute, where:</p>
     *        <ul>
     *        <li><code>S</code> - the attribute is of type String</li>
     *        <li><code>N</code> - the attribute is of type Number</li>
     *        <li><code>B</code> - the attribute is of type Binary</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ScalarAttributeType
     */

    public AttributeDefinition withAttributeType(
            ScalarAttributeType attributeType) {
        setAttributeType(attributeType);
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
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeType() != null)
            sb.append("AttributeType: " + getAttributeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeDefinition == false)
            return false;
        AttributeDefinition other = (AttributeDefinition) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeType() == null ^ this.getAttributeType() == null)
            return false;
        if (other.getAttributeType() != null
                && other.getAttributeType().equals(this.getAttributeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAttributeType() == null) ? 0 : getAttributeType()
                        .hashCode());
        return hashCode;
    }

    @Override
    public AttributeDefinition clone() {
        try {
            return (AttributeDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
