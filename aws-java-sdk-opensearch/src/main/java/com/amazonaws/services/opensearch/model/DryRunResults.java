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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DryRunResults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the way in which Amazon OpenSearch Service applies the update. Possible responses are
     * <code>Blue/Green</code> (the update requires a blue/green deployment), <code>DynamicUpdate</code> (no blue/green
     * required), <code>Undetermined</code> (the domain is undergoing an update and can't predict the deployment type;
     * try again after the update is complete), and <code>None</code> (the request doesn't include any configuration
     * changes).
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * Contains an optional message associated with the DryRunResults.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Specifies the way in which Amazon OpenSearch Service applies the update. Possible responses are
     * <code>Blue/Green</code> (the update requires a blue/green deployment), <code>DynamicUpdate</code> (no blue/green
     * required), <code>Undetermined</code> (the domain is undergoing an update and can't predict the deployment type;
     * try again after the update is complete), and <code>None</code> (the request doesn't include any configuration
     * changes).
     * </p>
     * 
     * @param deploymentType
     *        Specifies the way in which Amazon OpenSearch Service applies the update. Possible responses are
     *        <code>Blue/Green</code> (the update requires a blue/green deployment), <code>DynamicUpdate</code> (no
     *        blue/green required), <code>Undetermined</code> (the domain is undergoing an update and can't predict the
     *        deployment type; try again after the update is complete), and <code>None</code> (the request doesn't
     *        include any configuration changes).
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies the way in which Amazon OpenSearch Service applies the update. Possible responses are
     * <code>Blue/Green</code> (the update requires a blue/green deployment), <code>DynamicUpdate</code> (no blue/green
     * required), <code>Undetermined</code> (the domain is undergoing an update and can't predict the deployment type;
     * try again after the update is complete), and <code>None</code> (the request doesn't include any configuration
     * changes).
     * </p>
     * 
     * @return Specifies the way in which Amazon OpenSearch Service applies the update. Possible responses are
     *         <code>Blue/Green</code> (the update requires a blue/green deployment), <code>DynamicUpdate</code> (no
     *         blue/green required), <code>Undetermined</code> (the domain is undergoing an update and can't predict the
     *         deployment type; try again after the update is complete), and <code>None</code> (the request doesn't
     *         include any configuration changes).
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Specifies the way in which Amazon OpenSearch Service applies the update. Possible responses are
     * <code>Blue/Green</code> (the update requires a blue/green deployment), <code>DynamicUpdate</code> (no blue/green
     * required), <code>Undetermined</code> (the domain is undergoing an update and can't predict the deployment type;
     * try again after the update is complete), and <code>None</code> (the request doesn't include any configuration
     * changes).
     * </p>
     * 
     * @param deploymentType
     *        Specifies the way in which Amazon OpenSearch Service applies the update. Possible responses are
     *        <code>Blue/Green</code> (the update requires a blue/green deployment), <code>DynamicUpdate</code> (no
     *        blue/green required), <code>Undetermined</code> (the domain is undergoing an update and can't predict the
     *        deployment type; try again after the update is complete), and <code>None</code> (the request doesn't
     *        include any configuration changes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DryRunResults withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Contains an optional message associated with the DryRunResults.
     * </p>
     * 
     * @param message
     *        Contains an optional message associated with the DryRunResults.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Contains an optional message associated with the DryRunResults.
     * </p>
     * 
     * @return Contains an optional message associated with the DryRunResults.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Contains an optional message associated with the DryRunResults.
     * </p>
     * 
     * @param message
     *        Contains an optional message associated with the DryRunResults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DryRunResults withMessage(String message) {
        setMessage(message);
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
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DryRunResults == false)
            return false;
        DryRunResults other = (DryRunResults) obj;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public DryRunResults clone() {
        try {
            return (DryRunResults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.DryRunResultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
