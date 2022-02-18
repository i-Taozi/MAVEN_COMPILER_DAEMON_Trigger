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
package com.amazonaws.services.appconfigdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about an invalid parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/InvalidParameterDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidParameterDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Detail describing why an individual parameter did not satisfy the constraints specified by the service
     * </p>
     */
    private String problem;

    /**
     * <p>
     * Detail describing why an individual parameter did not satisfy the constraints specified by the service
     * </p>
     * 
     * @param problem
     *        Detail describing why an individual parameter did not satisfy the constraints specified by the service
     * @see InvalidParameterProblem
     */

    public void setProblem(String problem) {
        this.problem = problem;
    }

    /**
     * <p>
     * Detail describing why an individual parameter did not satisfy the constraints specified by the service
     * </p>
     * 
     * @return Detail describing why an individual parameter did not satisfy the constraints specified by the service
     * @see InvalidParameterProblem
     */

    public String getProblem() {
        return this.problem;
    }

    /**
     * <p>
     * Detail describing why an individual parameter did not satisfy the constraints specified by the service
     * </p>
     * 
     * @param problem
     *        Detail describing why an individual parameter did not satisfy the constraints specified by the service
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvalidParameterProblem
     */

    public InvalidParameterDetail withProblem(String problem) {
        setProblem(problem);
        return this;
    }

    /**
     * <p>
     * Detail describing why an individual parameter did not satisfy the constraints specified by the service
     * </p>
     * 
     * @param problem
     *        Detail describing why an individual parameter did not satisfy the constraints specified by the service
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvalidParameterProblem
     */

    public InvalidParameterDetail withProblem(InvalidParameterProblem problem) {
        this.problem = problem.toString();
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
        if (getProblem() != null)
            sb.append("Problem: ").append(getProblem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvalidParameterDetail == false)
            return false;
        InvalidParameterDetail other = (InvalidParameterDetail) obj;
        if (other.getProblem() == null ^ this.getProblem() == null)
            return false;
        if (other.getProblem() != null && other.getProblem().equals(this.getProblem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProblem() == null) ? 0 : getProblem().hashCode());
        return hashCode;
    }

    @Override
    public InvalidParameterDetail clone() {
        try {
            return (InvalidParameterDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appconfigdata.model.transform.InvalidParameterDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
