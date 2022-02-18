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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/LakeFormationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LakeFormationConfiguration implements Serializable, Cloneable, StructuredPojo {

    private Boolean useLakeFormationCredentials;

    private String accountId;

    /**
     * @param useLakeFormationCredentials
     */

    public void setUseLakeFormationCredentials(Boolean useLakeFormationCredentials) {
        this.useLakeFormationCredentials = useLakeFormationCredentials;
    }

    /**
     * @return
     */

    public Boolean getUseLakeFormationCredentials() {
        return this.useLakeFormationCredentials;
    }

    /**
     * @param useLakeFormationCredentials
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationConfiguration withUseLakeFormationCredentials(Boolean useLakeFormationCredentials) {
        setUseLakeFormationCredentials(useLakeFormationCredentials);
        return this;
    }

    /**
     * @return
     */

    public Boolean isUseLakeFormationCredentials() {
        return this.useLakeFormationCredentials;
    }

    /**
     * @param accountId
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * @return
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @param accountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationConfiguration withAccountId(String accountId) {
        setAccountId(accountId);
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
        if (getUseLakeFormationCredentials() != null)
            sb.append("UseLakeFormationCredentials: ").append(getUseLakeFormationCredentials()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LakeFormationConfiguration == false)
            return false;
        LakeFormationConfiguration other = (LakeFormationConfiguration) obj;
        if (other.getUseLakeFormationCredentials() == null ^ this.getUseLakeFormationCredentials() == null)
            return false;
        if (other.getUseLakeFormationCredentials() != null && other.getUseLakeFormationCredentials().equals(this.getUseLakeFormationCredentials()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUseLakeFormationCredentials() == null) ? 0 : getUseLakeFormationCredentials().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public LakeFormationConfiguration clone() {
        try {
            return (LakeFormationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.LakeFormationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
