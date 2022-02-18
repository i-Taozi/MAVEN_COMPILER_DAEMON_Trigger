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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPropertyValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPropertyValueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the component whose property values the operation returns.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The ID of the component type whose property values the operation returns.
     * </p>
     */
    private String componentTypeId;
    /**
     * <p>
     * The ID of the entity whose property values the operation returns.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The properties whose values the operation returns.
     * </p>
     */
    private java.util.List<String> selectedProperties;
    /**
     * <p>
     * The ID of the workspace whose values the operation returns.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The name of the component whose property values the operation returns.
     * </p>
     * 
     * @param componentName
     *        The name of the component whose property values the operation returns.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component whose property values the operation returns.
     * </p>
     * 
     * @return The name of the component whose property values the operation returns.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component whose property values the operation returns.
     * </p>
     * 
     * @param componentName
     *        The name of the component whose property values the operation returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueRequest withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The ID of the component type whose property values the operation returns.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type whose property values the operation returns.
     */

    public void setComponentTypeId(String componentTypeId) {
        this.componentTypeId = componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type whose property values the operation returns.
     * </p>
     * 
     * @return The ID of the component type whose property values the operation returns.
     */

    public String getComponentTypeId() {
        return this.componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type whose property values the operation returns.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type whose property values the operation returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueRequest withComponentTypeId(String componentTypeId) {
        setComponentTypeId(componentTypeId);
        return this;
    }

    /**
     * <p>
     * The ID of the entity whose property values the operation returns.
     * </p>
     * 
     * @param entityId
     *        The ID of the entity whose property values the operation returns.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The ID of the entity whose property values the operation returns.
     * </p>
     * 
     * @return The ID of the entity whose property values the operation returns.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The ID of the entity whose property values the operation returns.
     * </p>
     * 
     * @param entityId
     *        The ID of the entity whose property values the operation returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The properties whose values the operation returns.
     * </p>
     * 
     * @return The properties whose values the operation returns.
     */

    public java.util.List<String> getSelectedProperties() {
        return selectedProperties;
    }

    /**
     * <p>
     * The properties whose values the operation returns.
     * </p>
     * 
     * @param selectedProperties
     *        The properties whose values the operation returns.
     */

    public void setSelectedProperties(java.util.Collection<String> selectedProperties) {
        if (selectedProperties == null) {
            this.selectedProperties = null;
            return;
        }

        this.selectedProperties = new java.util.ArrayList<String>(selectedProperties);
    }

    /**
     * <p>
     * The properties whose values the operation returns.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedProperties(java.util.Collection)} or {@link #withSelectedProperties(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param selectedProperties
     *        The properties whose values the operation returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueRequest withSelectedProperties(String... selectedProperties) {
        if (this.selectedProperties == null) {
            setSelectedProperties(new java.util.ArrayList<String>(selectedProperties.length));
        }
        for (String ele : selectedProperties) {
            this.selectedProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties whose values the operation returns.
     * </p>
     * 
     * @param selectedProperties
     *        The properties whose values the operation returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueRequest withSelectedProperties(java.util.Collection<String> selectedProperties) {
        setSelectedProperties(selectedProperties);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace whose values the operation returns.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace whose values the operation returns.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace whose values the operation returns.
     * </p>
     * 
     * @return The ID of the workspace whose values the operation returns.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace whose values the operation returns.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace whose values the operation returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getComponentTypeId() != null)
            sb.append("ComponentTypeId: ").append(getComponentTypeId()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getSelectedProperties() != null)
            sb.append("SelectedProperties: ").append(getSelectedProperties()).append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPropertyValueRequest == false)
            return false;
        GetPropertyValueRequest other = (GetPropertyValueRequest) obj;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getComponentTypeId() == null ^ this.getComponentTypeId() == null)
            return false;
        if (other.getComponentTypeId() != null && other.getComponentTypeId().equals(this.getComponentTypeId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getSelectedProperties() == null ^ this.getSelectedProperties() == null)
            return false;
        if (other.getSelectedProperties() != null && other.getSelectedProperties().equals(this.getSelectedProperties()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeId() == null) ? 0 : getComponentTypeId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getSelectedProperties() == null) ? 0 : getSelectedProperties().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public GetPropertyValueRequest clone() {
        return (GetPropertyValueRequest) super.clone();
    }

}
