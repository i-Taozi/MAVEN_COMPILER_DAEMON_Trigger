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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration object for the OpenZFS file system used in the <code>DeleteFileSystem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileSystemOpenZFSConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFileSystemOpenZFSConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final
     * backup. If you want to skip this backup, use this value to do so.
     * </p>
     */
    private Boolean skipFinalBackup;

    private java.util.List<Tag> finalBackupTags;

    /**
     * <p>
     * By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final
     * backup. If you want to skip this backup, use this value to do so.
     * </p>
     * 
     * @param skipFinalBackup
     *        By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the
     *        <code>DeleteFileSystem</code> operation is invoked. Doing this helps protect you from data loss, and we
     *        highly recommend taking the final backup. If you want to skip this backup, use this value to do so.
     */

    public void setSkipFinalBackup(Boolean skipFinalBackup) {
        this.skipFinalBackup = skipFinalBackup;
    }

    /**
     * <p>
     * By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final
     * backup. If you want to skip this backup, use this value to do so.
     * </p>
     * 
     * @return By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the
     *         <code>DeleteFileSystem</code> operation is invoked. Doing this helps protect you from data loss, and we
     *         highly recommend taking the final backup. If you want to skip this backup, use this value to do so.
     */

    public Boolean getSkipFinalBackup() {
        return this.skipFinalBackup;
    }

    /**
     * <p>
     * By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final
     * backup. If you want to skip this backup, use this value to do so.
     * </p>
     * 
     * @param skipFinalBackup
     *        By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the
     *        <code>DeleteFileSystem</code> operation is invoked. Doing this helps protect you from data loss, and we
     *        highly recommend taking the final backup. If you want to skip this backup, use this value to do so.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileSystemOpenZFSConfiguration withSkipFinalBackup(Boolean skipFinalBackup) {
        setSkipFinalBackup(skipFinalBackup);
        return this;
    }

    /**
     * <p>
     * By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the <code>DeleteFileSystem</code>
     * operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final
     * backup. If you want to skip this backup, use this value to do so.
     * </p>
     * 
     * @return By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the
     *         <code>DeleteFileSystem</code> operation is invoked. Doing this helps protect you from data loss, and we
     *         highly recommend taking the final backup. If you want to skip this backup, use this value to do so.
     */

    public Boolean isSkipFinalBackup() {
        return this.skipFinalBackup;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getFinalBackupTags() {
        return finalBackupTags;
    }

    /**
     * @param finalBackupTags
     */

    public void setFinalBackupTags(java.util.Collection<Tag> finalBackupTags) {
        if (finalBackupTags == null) {
            this.finalBackupTags = null;
            return;
        }

        this.finalBackupTags = new java.util.ArrayList<Tag>(finalBackupTags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFinalBackupTags(java.util.Collection)} or {@link #withFinalBackupTags(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param finalBackupTags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileSystemOpenZFSConfiguration withFinalBackupTags(Tag... finalBackupTags) {
        if (this.finalBackupTags == null) {
            setFinalBackupTags(new java.util.ArrayList<Tag>(finalBackupTags.length));
        }
        for (Tag ele : finalBackupTags) {
            this.finalBackupTags.add(ele);
        }
        return this;
    }

    /**
     * @param finalBackupTags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileSystemOpenZFSConfiguration withFinalBackupTags(java.util.Collection<Tag> finalBackupTags) {
        setFinalBackupTags(finalBackupTags);
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
        if (getSkipFinalBackup() != null)
            sb.append("SkipFinalBackup: ").append(getSkipFinalBackup()).append(",");
        if (getFinalBackupTags() != null)
            sb.append("FinalBackupTags: ").append(getFinalBackupTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileSystemOpenZFSConfiguration == false)
            return false;
        DeleteFileSystemOpenZFSConfiguration other = (DeleteFileSystemOpenZFSConfiguration) obj;
        if (other.getSkipFinalBackup() == null ^ this.getSkipFinalBackup() == null)
            return false;
        if (other.getSkipFinalBackup() != null && other.getSkipFinalBackup().equals(this.getSkipFinalBackup()) == false)
            return false;
        if (other.getFinalBackupTags() == null ^ this.getFinalBackupTags() == null)
            return false;
        if (other.getFinalBackupTags() != null && other.getFinalBackupTags().equals(this.getFinalBackupTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkipFinalBackup() == null) ? 0 : getSkipFinalBackup().hashCode());
        hashCode = prime * hashCode + ((getFinalBackupTags() == null) ? 0 : getFinalBackupTags().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFileSystemOpenZFSConfiguration clone() {
        try {
            return (DeleteFileSystemOpenZFSConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.DeleteFileSystemOpenZFSConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
