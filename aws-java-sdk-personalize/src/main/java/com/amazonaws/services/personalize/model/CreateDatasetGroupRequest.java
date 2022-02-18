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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the new dataset group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the Identity and Access Management (IAM) role that has permissions to access the Key Management
     * Service (KMS) key. Supplying an IAM role is only valid when also specifying a KMS key.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Key Management Service (KMS) key used to encrypt the datasets.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The domain of the dataset group. Specify a domain to create a Domain dataset group. The domain you specify
     * determines the default schemas for datasets and the use cases available for recommenders. If you don't specify a
     * domain, you create a Custom dataset group with solution versions that you deploy with a campaign.
     * </p>
     */
    private String domain;

    /**
     * <p>
     * The name for the new dataset group.
     * </p>
     * 
     * @param name
     *        The name for the new dataset group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new dataset group.
     * </p>
     * 
     * @return The name for the new dataset group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the new dataset group.
     * </p>
     * 
     * @param name
     *        The name for the new dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the Identity and Access Management (IAM) role that has permissions to access the Key Management
     * Service (KMS) key. Supplying an IAM role is only valid when also specifying a KMS key.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the Identity and Access Management (IAM) role that has permissions to access the Key Management
     *        Service (KMS) key. Supplying an IAM role is only valid when also specifying a KMS key.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the Identity and Access Management (IAM) role that has permissions to access the Key Management
     * Service (KMS) key. Supplying an IAM role is only valid when also specifying a KMS key.
     * </p>
     * 
     * @return The ARN of the Identity and Access Management (IAM) role that has permissions to access the Key
     *         Management Service (KMS) key. Supplying an IAM role is only valid when also specifying a KMS key.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the Identity and Access Management (IAM) role that has permissions to access the Key Management
     * Service (KMS) key. Supplying an IAM role is only valid when also specifying a KMS key.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the Identity and Access Management (IAM) role that has permissions to access the Key Management
     *        Service (KMS) key. Supplying an IAM role is only valid when also specifying a KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetGroupRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Key Management Service (KMS) key used to encrypt the datasets.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of a Key Management Service (KMS) key used to encrypt the datasets.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Key Management Service (KMS) key used to encrypt the datasets.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a Key Management Service (KMS) key used to encrypt the datasets.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Key Management Service (KMS) key used to encrypt the datasets.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of a Key Management Service (KMS) key used to encrypt the datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetGroupRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The domain of the dataset group. Specify a domain to create a Domain dataset group. The domain you specify
     * determines the default schemas for datasets and the use cases available for recommenders. If you don't specify a
     * domain, you create a Custom dataset group with solution versions that you deploy with a campaign.
     * </p>
     * 
     * @param domain
     *        The domain of the dataset group. Specify a domain to create a Domain dataset group. The domain you specify
     *        determines the default schemas for datasets and the use cases available for recommenders. If you don't
     *        specify a domain, you create a Custom dataset group with solution versions that you deploy with a
     *        campaign.
     * @see Domain
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain of the dataset group. Specify a domain to create a Domain dataset group. The domain you specify
     * determines the default schemas for datasets and the use cases available for recommenders. If you don't specify a
     * domain, you create a Custom dataset group with solution versions that you deploy with a campaign.
     * </p>
     * 
     * @return The domain of the dataset group. Specify a domain to create a Domain dataset group. The domain you
     *         specify determines the default schemas for datasets and the use cases available for recommenders. If you
     *         don't specify a domain, you create a Custom dataset group with solution versions that you deploy with a
     *         campaign.
     * @see Domain
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain of the dataset group. Specify a domain to create a Domain dataset group. The domain you specify
     * determines the default schemas for datasets and the use cases available for recommenders. If you don't specify a
     * domain, you create a Custom dataset group with solution versions that you deploy with a campaign.
     * </p>
     * 
     * @param domain
     *        The domain of the dataset group. Specify a domain to create a Domain dataset group. The domain you specify
     *        determines the default schemas for datasets and the use cases available for recommenders. If you don't
     *        specify a domain, you create a Custom dataset group with solution versions that you deploy with a
     *        campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public CreateDatasetGroupRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The domain of the dataset group. Specify a domain to create a Domain dataset group. The domain you specify
     * determines the default schemas for datasets and the use cases available for recommenders. If you don't specify a
     * domain, you create a Custom dataset group with solution versions that you deploy with a campaign.
     * </p>
     * 
     * @param domain
     *        The domain of the dataset group. Specify a domain to create a Domain dataset group. The domain you specify
     *        determines the default schemas for datasets and the use cases available for recommenders. If you don't
     *        specify a domain, you create a Custom dataset group with solution versions that you deploy with a
     *        campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public CreateDatasetGroupRequest withDomain(Domain domain) {
        this.domain = domain.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetGroupRequest == false)
            return false;
        CreateDatasetGroupRequest other = (CreateDatasetGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetGroupRequest clone() {
        return (CreateDatasetGroupRequest) super.clone();
    }

}
