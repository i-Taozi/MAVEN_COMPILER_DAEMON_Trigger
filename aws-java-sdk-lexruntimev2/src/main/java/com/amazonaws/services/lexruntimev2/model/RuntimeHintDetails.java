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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides an array of phrases that should be given preference when resolving values for a slot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RuntimeHintDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuntimeHintDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more strings that Amazon Lex V2 should look for in the input to the bot. Each phrase is given preference
     * when deciding on slot values.
     * </p>
     */
    private java.util.List<RuntimeHintValue> runtimeHintValues;

    /**
     * <p>
     * One or more strings that Amazon Lex V2 should look for in the input to the bot. Each phrase is given preference
     * when deciding on slot values.
     * </p>
     * 
     * @return One or more strings that Amazon Lex V2 should look for in the input to the bot. Each phrase is given
     *         preference when deciding on slot values.
     */

    public java.util.List<RuntimeHintValue> getRuntimeHintValues() {
        return runtimeHintValues;
    }

    /**
     * <p>
     * One or more strings that Amazon Lex V2 should look for in the input to the bot. Each phrase is given preference
     * when deciding on slot values.
     * </p>
     * 
     * @param runtimeHintValues
     *        One or more strings that Amazon Lex V2 should look for in the input to the bot. Each phrase is given
     *        preference when deciding on slot values.
     */

    public void setRuntimeHintValues(java.util.Collection<RuntimeHintValue> runtimeHintValues) {
        if (runtimeHintValues == null) {
            this.runtimeHintValues = null;
            return;
        }

        this.runtimeHintValues = new java.util.ArrayList<RuntimeHintValue>(runtimeHintValues);
    }

    /**
     * <p>
     * One or more strings that Amazon Lex V2 should look for in the input to the bot. Each phrase is given preference
     * when deciding on slot values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuntimeHintValues(java.util.Collection)} or {@link #withRuntimeHintValues(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param runtimeHintValues
     *        One or more strings that Amazon Lex V2 should look for in the input to the bot. Each phrase is given
     *        preference when deciding on slot values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeHintDetails withRuntimeHintValues(RuntimeHintValue... runtimeHintValues) {
        if (this.runtimeHintValues == null) {
            setRuntimeHintValues(new java.util.ArrayList<RuntimeHintValue>(runtimeHintValues.length));
        }
        for (RuntimeHintValue ele : runtimeHintValues) {
            this.runtimeHintValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more strings that Amazon Lex V2 should look for in the input to the bot. Each phrase is given preference
     * when deciding on slot values.
     * </p>
     * 
     * @param runtimeHintValues
     *        One or more strings that Amazon Lex V2 should look for in the input to the bot. Each phrase is given
     *        preference when deciding on slot values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeHintDetails withRuntimeHintValues(java.util.Collection<RuntimeHintValue> runtimeHintValues) {
        setRuntimeHintValues(runtimeHintValues);
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
        if (getRuntimeHintValues() != null)
            sb.append("RuntimeHintValues: ").append(getRuntimeHintValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuntimeHintDetails == false)
            return false;
        RuntimeHintDetails other = (RuntimeHintDetails) obj;
        if (other.getRuntimeHintValues() == null ^ this.getRuntimeHintValues() == null)
            return false;
        if (other.getRuntimeHintValues() != null && other.getRuntimeHintValues().equals(this.getRuntimeHintValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuntimeHintValues() == null) ? 0 : getRuntimeHintValues().hashCode());
        return hashCode;
    }

    @Override
    public RuntimeHintDetails clone() {
        try {
            return (RuntimeHintDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.RuntimeHintDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
