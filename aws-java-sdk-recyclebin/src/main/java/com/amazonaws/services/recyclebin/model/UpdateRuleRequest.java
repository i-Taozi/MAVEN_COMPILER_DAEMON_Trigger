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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UpdateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the retention rule to update.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Information about the retention period for which the retention rule is to retain resources.
     * </p>
     */
    private RetentionPeriod retentionPeriod;
    /**
     * <p>
     * The retention rule description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Information about the resource tags to use to identify resources that are to be retained by the retention rule.
     * The retention rule retains only deleted snapshots that have one or more of the specified tag key and value pairs.
     * If a snapshot is deleted, but it does not have any of the specified tag key and value pairs, it is immediately
     * deleted without being retained by the retention rule.
     * </p>
     * <p>
     * You can add the same tag key and value pair to a maximum or five retention rules.
     * </p>
     */
    private java.util.List<ResourceTag> resourceTags;

    /**
     * <p>
     * The unique ID of the retention rule to update.
     * </p>
     * 
     * @param identifier
     *        The unique ID of the retention rule to update.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique ID of the retention rule to update.
     * </p>
     * 
     * @return The unique ID of the retention rule to update.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique ID of the retention rule to update.
     * </p>
     * 
     * @param identifier
     *        The unique ID of the retention rule to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Information about the retention period for which the retention rule is to retain resources.
     * </p>
     * 
     * @param retentionPeriod
     *        Information about the retention period for which the retention rule is to retain resources.
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * Information about the retention period for which the retention rule is to retain resources.
     * </p>
     * 
     * @return Information about the retention period for which the retention rule is to retain resources.
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * Information about the retention period for which the retention rule is to retain resources.
     * </p>
     * 
     * @param retentionPeriod
     *        Information about the retention period for which the retention rule is to retain resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * The retention rule description.
     * </p>
     * 
     * @param description
     *        The retention rule description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The retention rule description.
     * </p>
     * 
     * @return The retention rule description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The retention rule description.
     * </p>
     * 
     * @param description
     *        The retention rule description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * </p>
     * 
     * @param resourceType
     *        The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots are
     *        supported.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * </p>
     * 
     * @return The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots are
     *         supported.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * </p>
     * 
     * @param resourceType
     *        The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots are
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public UpdateRuleRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots are supported.
     * </p>
     * 
     * @param resourceType
     *        The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots are
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public UpdateRuleRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the resource tags to use to identify resources that are to be retained by the retention rule.
     * The retention rule retains only deleted snapshots that have one or more of the specified tag key and value pairs.
     * If a snapshot is deleted, but it does not have any of the specified tag key and value pairs, it is immediately
     * deleted without being retained by the retention rule.
     * </p>
     * <p>
     * You can add the same tag key and value pair to a maximum or five retention rules.
     * </p>
     * 
     * @return Information about the resource tags to use to identify resources that are to be retained by the retention
     *         rule. The retention rule retains only deleted snapshots that have one or more of the specified tag key
     *         and value pairs. If a snapshot is deleted, but it does not have any of the specified tag key and value
     *         pairs, it is immediately deleted without being retained by the retention rule. </p>
     *         <p>
     *         You can add the same tag key and value pair to a maximum or five retention rules.
     */

    public java.util.List<ResourceTag> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * Information about the resource tags to use to identify resources that are to be retained by the retention rule.
     * The retention rule retains only deleted snapshots that have one or more of the specified tag key and value pairs.
     * If a snapshot is deleted, but it does not have any of the specified tag key and value pairs, it is immediately
     * deleted without being retained by the retention rule.
     * </p>
     * <p>
     * You can add the same tag key and value pair to a maximum or five retention rules.
     * </p>
     * 
     * @param resourceTags
     *        Information about the resource tags to use to identify resources that are to be retained by the retention
     *        rule. The retention rule retains only deleted snapshots that have one or more of the specified tag key and
     *        value pairs. If a snapshot is deleted, but it does not have any of the specified tag key and value pairs,
     *        it is immediately deleted without being retained by the retention rule. </p>
     *        <p>
     *        You can add the same tag key and value pair to a maximum or five retention rules.
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
     * Information about the resource tags to use to identify resources that are to be retained by the retention rule.
     * The retention rule retains only deleted snapshots that have one or more of the specified tag key and value pairs.
     * If a snapshot is deleted, but it does not have any of the specified tag key and value pairs, it is immediately
     * deleted without being retained by the retention rule.
     * </p>
     * <p>
     * You can add the same tag key and value pair to a maximum or five retention rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        Information about the resource tags to use to identify resources that are to be retained by the retention
     *        rule. The retention rule retains only deleted snapshots that have one or more of the specified tag key and
     *        value pairs. If a snapshot is deleted, but it does not have any of the specified tag key and value pairs,
     *        it is immediately deleted without being retained by the retention rule. </p>
     *        <p>
     *        You can add the same tag key and value pair to a maximum or five retention rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withResourceTags(ResourceTag... resourceTags) {
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
     * Information about the resource tags to use to identify resources that are to be retained by the retention rule.
     * The retention rule retains only deleted snapshots that have one or more of the specified tag key and value pairs.
     * If a snapshot is deleted, but it does not have any of the specified tag key and value pairs, it is immediately
     * deleted without being retained by the retention rule.
     * </p>
     * <p>
     * You can add the same tag key and value pair to a maximum or five retention rules.
     * </p>
     * 
     * @param resourceTags
     *        Information about the resource tags to use to identify resources that are to be retained by the retention
     *        rule. The retention rule retains only deleted snapshots that have one or more of the specified tag key and
     *        value pairs. If a snapshot is deleted, but it does not have any of the specified tag key and value pairs,
     *        it is immediately deleted without being retained by the retention rule. </p>
     *        <p>
     *        You can add the same tag key and value pair to a maximum or five retention rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        setResourceTags(resourceTags);
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
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRuleRequest == false)
            return false;
        UpdateRuleRequest other = (UpdateRuleRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRuleRequest clone() {
        return (UpdateRuleRequest) super.clone();
    }

}
