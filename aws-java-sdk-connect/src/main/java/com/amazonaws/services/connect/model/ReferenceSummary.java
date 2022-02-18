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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains summary information about a reference. <code>ReferenceSummary</code> contains only one non null field
 * between the URL and attachment based on the reference type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ReferenceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the URL reference if the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * </p>
     */
    private UrlReference url;
    /**
     * <p>
     * Information about the attachment reference if the <code>referenceType</code> is <code>ATTACHMENT</code>.
     * Otherwise, null.
     * </p>
     */
    private AttachmentReference attachment;

    /**
     * <p>
     * Information about the URL reference if the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * </p>
     * 
     * @param url
     *        Information about the URL reference if the <code>referenceType</code> is <code>URL</code>. Otherwise,
     *        null.
     */

    public void setUrl(UrlReference url) {
        this.url = url;
    }

    /**
     * <p>
     * Information about the URL reference if the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * </p>
     * 
     * @return Information about the URL reference if the <code>referenceType</code> is <code>URL</code>. Otherwise,
     *         null.
     */

    public UrlReference getUrl() {
        return this.url;
    }

    /**
     * <p>
     * Information about the URL reference if the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * </p>
     * 
     * @param url
     *        Information about the URL reference if the <code>referenceType</code> is <code>URL</code>. Otherwise,
     *        null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceSummary withUrl(UrlReference url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * Information about the attachment reference if the <code>referenceType</code> is <code>ATTACHMENT</code>.
     * Otherwise, null.
     * </p>
     * 
     * @param attachment
     *        Information about the attachment reference if the <code>referenceType</code> is <code>ATTACHMENT</code>.
     *        Otherwise, null.
     */

    public void setAttachment(AttachmentReference attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * Information about the attachment reference if the <code>referenceType</code> is <code>ATTACHMENT</code>.
     * Otherwise, null.
     * </p>
     * 
     * @return Information about the attachment reference if the <code>referenceType</code> is <code>ATTACHMENT</code>.
     *         Otherwise, null.
     */

    public AttachmentReference getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * Information about the attachment reference if the <code>referenceType</code> is <code>ATTACHMENT</code>.
     * Otherwise, null.
     * </p>
     * 
     * @param attachment
     *        Information about the attachment reference if the <code>referenceType</code> is <code>ATTACHMENT</code>.
     *        Otherwise, null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceSummary withAttachment(AttachmentReference attachment) {
        setAttachment(attachment);
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
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getAttachment() != null)
            sb.append("Attachment: ").append(getAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceSummary == false)
            return false;
        ReferenceSummary other = (ReferenceSummary) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceSummary clone() {
        try {
            return (ReferenceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ReferenceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
