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
package com.amazonaws.services.recyclebin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/GetRule" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the retention rule.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The description assigned to the retention rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The resource type retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Information about the period for which the retention rule retains resources.
     * </p>
     */
    private RetentionPeriod retentionPeriod;
    /**
     * <p>
     * The resource tags used to identify resources that are to be retained by the retention rule.
     * </p>
     */
    private java.util.List<ResourceTag> resourceTags;
    /**
     * <p>
     * The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     * snapshots.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique ID of the retention rule.
     * </p>
     * 
     * @param identifier
     *        The unique ID of the retention rule.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique ID of the retention rule.
     * </p>
     * 
     * @return The unique ID of the retention rule.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique ID of the retention rule.
     * </p>
     * 
     * @param identifier
     *        The unique ID of the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleResult withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The description assigned to the retention rule.
     * </p>
     * 
     * @param description
     *        The description assigned to the retention rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description assigned to the retention rule.
     * </p>
     * 
     * @return The description assigned to the retention rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description assigned to the retention rule.
     * </p>
     * 
     * @param description
     *        The description assigned to the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The resource type retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * </p>
     * 
     * @param resourceType
     *        The resource type retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * </p>
     * 
     * @return The resource type retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * </p>
     * 
     * @param resourceType
     *        The resource type retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetRuleResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * </p>
     * 
     * @param resourceType
     *        The resource type retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetRuleResult withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the period for which the retention rule retains resources.
     * </p>
     * 
     * @param retentionPeriod
     *        Information about the period for which the retention rule retains resources.
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * Information about the period for which the retention rule retains resources.
     * </p>
     * 
     * @return Information about the period for which the retention rule retains resources.
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * Information about the period for which the retention rule retains resources.
     * </p>
     * 
     * @param retentionPeriod
     *        Information about the period for which the retention rule retains resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleResult withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * The resource tags used to identify resources that are to be retained by the retention rule.
     * </p>
     * 
     * @return The resource tags used to identify resources that are to be retained by the retention rule.
     */

    public java.util.List<ResourceTag> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * The resource tags used to identify resources that are to be retained by the retention rule.
     * </p>
     * 
     * @param resourceTags
     *        The resource tags used to identify resources that are to be retained by the retention rule.
     */

    public void setResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new java.util.ArrayList<ResourceTag>(resourceTags);
    }

    /**
     * <p>
     * The resource tags used to identify resources that are to be retained by the retention rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        The resource tags used to identify resources that are to be retained by the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleResult withResourceTags(ResourceTag... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new java.util.ArrayList<ResourceTag>(resourceTags.length));
        }
        for (ResourceTag ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource tags used to identify resources that are to be retained by the retention rule.
     * </p>
     * 
     * @param resourceTags
     *        The resource tags used to identify resources that are to be retained by the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleResult withResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * <p>
     * The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     * snapshots.
     * </p>
     * 
     * @param status
     *        The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     *        snapshots.
     * @see RuleStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     * snapshots.
     * </p>
     * 
     * @return The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     *         snapshots.
     * @see RuleStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     * snapshots.
     * </p>
     * 
     * @param status
     *        The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     *        snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleStatus
     */

    public GetRuleResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     * snapshots.
     * </p>
     * 
     * @param status
     *        The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     *        snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleStatus
     */

    public GetRuleResult withStatus(RuleStatus status) {
        this.status = status.toString();
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRuleResult == false)
            return false;
        GetRuleResult other = (GetRuleResult) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetRuleResult clone() {
        try {
            return (GetRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
