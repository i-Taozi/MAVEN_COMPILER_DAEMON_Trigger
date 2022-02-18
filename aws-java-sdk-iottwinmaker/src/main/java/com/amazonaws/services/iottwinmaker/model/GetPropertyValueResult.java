/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPropertyValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPropertyValueResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that maps strings to the properties and latest property values in the response. Each string in the
     * mapping must be unique to this object.
     * </p>
     */
    private java.util.Map<String, PropertyLatestValue> propertyValues;

    /**
     * <p>
     * An object that maps strings to the properties and latest property values in the response. Each string in the
     * mapping must be unique to this object.
     * </p>
     * 
     * @return An object that maps strings to the properties and latest property values in the response. Each string in
     *         the mapping must be unique to this object.
     */

    public java.util.Map<String, PropertyLatestValue> getPropertyValues() {
        return propertyValues;
    }

    /**
     * <p>
     * An object that maps strings to the properties and latest property values in the response. Each string in the
     * mapping must be unique to this object.
     * </p>
     * 
     * @param propertyValues
     *        An object that maps strings to the properties and latest property values in the response. Each string in
     *        the mapping must be unique to this object.
     */

    public void setPropertyValues(java.util.Map<String, PropertyLatestValue> propertyValues) {
        this.propertyValues = propertyValues;
    }

    /**
     * <p>
     * An object that maps strings to the properties and latest property values in the response. Each string in the
     * mapping must be unique to this object.
     * </p>
     * 
     * @param propertyValues
     *        An object that maps strings to the properties and latest property values in the response. Each string in
     *        the mapping must be unique to this object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueResult withPropertyValues(java.util.Map<String, PropertyLatestValue> propertyValues) {
        setPropertyValues(propertyValues);
        return this;
    }

    /**
     * Add a single PropertyValues entry
     *
     * @see GetPropertyValueResult#withPropertyValues
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueResult addPropertyValuesEntry(String key, PropertyLatestValue value) {
        if (null == this.propertyValues) {
            this.propertyValues = new java.util.HashMap<String, PropertyLatestValue>();
        }
        if (this.propertyValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.propertyValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PropertyValues.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueResult clearPropertyValuesEntries() {
        this.propertyValues = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPropertyValues() != null)
            sb.append("PropertyValues: ").append(getPropertyValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPropertyValueResult == false)
            return false;
        GetPropertyValueResult other = (GetPropertyValueResult) obj;
        if (other.getPropertyValues() == null ^ this.getPropertyValues() == null)
            return false;
        if (other.getPropertyValues() != null && other.getPropertyValues().equals(this.getPropertyValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyValues() == null) ? 0 : getPropertyValues().hashCode());
        return hashCode;
    }

    @Override
    public GetPropertyValueResult clone() {
        try {
            return (GetPropertyValueResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
