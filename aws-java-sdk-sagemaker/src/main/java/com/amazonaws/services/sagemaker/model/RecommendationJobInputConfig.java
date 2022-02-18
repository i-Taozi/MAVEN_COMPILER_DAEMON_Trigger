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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The input configuration of the recommendation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RecommendationJobInputConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationJobInputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a versioned model package.
     * </p>
     */
    private String modelPackageVersionArn;
    /**
     * <p>
     * Specifies the maximum duration of the job, in seconds.&gt;
     * </p>
     */
    private Integer jobDurationInSeconds;
    /**
     * <p>
     * Specifies the traffic pattern of the job.
     * </p>
     */
    private TrafficPattern trafficPattern;
    /**
     * <p>
     * Defines the resource limit of the job.
     * </p>
     */
    private RecommendationJobResourceLimit resourceLimit;
    /**
     * <p>
     * Specifies the endpoint configuration to use for a job.
     * </p>
     */
    private java.util.List<EndpointInputConfiguration> endpointConfigurations;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a versioned model package.
     * </p>
     * 
     * @param modelPackageVersionArn
     *        The Amazon Resource Name (ARN) of a versioned model package.
     */

    public void setModelPackageVersionArn(String modelPackageVersionArn) {
        this.modelPackageVersionArn = modelPackageVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a versioned model package.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a versioned model package.
     */

    public String getModelPackageVersionArn() {
        return this.modelPackageVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a versioned model package.
     * </p>
     * 
     * @param modelPackageVersionArn
     *        The Amazon Resource Name (ARN) of a versioned model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withModelPackageVersionArn(String modelPackageVersionArn) {
        setModelPackageVersionArn(modelPackageVersionArn);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum duration of the job, in seconds.&gt;
     * </p>
     * 
     * @param jobDurationInSeconds
     *        Specifies the maximum duration of the job, in seconds.&gt;
     */

    public void setJobDurationInSeconds(Integer jobDurationInSeconds) {
        this.jobDurationInSeconds = jobDurationInSeconds;
    }

    /**
     * <p>
     * Specifies the maximum duration of the job, in seconds.&gt;
     * </p>
     * 
     * @return Specifies the maximum duration of the job, in seconds.&gt;
     */

    public Integer getJobDurationInSeconds() {
        return this.jobDurationInSeconds;
    }

    /**
     * <p>
     * Specifies the maximum duration of the job, in seconds.&gt;
     * </p>
     * 
     * @param jobDurationInSeconds
     *        Specifies the maximum duration of the job, in seconds.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withJobDurationInSeconds(Integer jobDurationInSeconds) {
        setJobDurationInSeconds(jobDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * Specifies the traffic pattern of the job.
     * </p>
     * 
     * @param trafficPattern
     *        Specifies the traffic pattern of the job.
     */

    public void setTrafficPattern(TrafficPattern trafficPattern) {
        this.trafficPattern = trafficPattern;
    }

    /**
     * <p>
     * Specifies the traffic pattern of the job.
     * </p>
     * 
     * @return Specifies the traffic pattern of the job.
     */

    public TrafficPattern getTrafficPattern() {
        return this.trafficPattern;
    }

    /**
     * <p>
     * Specifies the traffic pattern of the job.
     * </p>
     * 
     * @param trafficPattern
     *        Specifies the traffic pattern of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withTrafficPattern(TrafficPattern trafficPattern) {
        setTrafficPattern(trafficPattern);
        return this;
    }

    /**
     * <p>
     * Defines the resource limit of the job.
     * </p>
     * 
     * @param resourceLimit
     *        Defines the resource limit of the job.
     */

    public void setResourceLimit(RecommendationJobResourceLimit resourceLimit) {
        this.resourceLimit = resourceLimit;
    }

    /**
     * <p>
     * Defines the resource limit of the job.
     * </p>
     * 
     * @return Defines the resource limit of the job.
     */

    public RecommendationJobResourceLimit getResourceLimit() {
        return this.resourceLimit;
    }

    /**
     * <p>
     * Defines the resource limit of the job.
     * </p>
     * 
     * @param resourceLimit
     *        Defines the resource limit of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withResourceLimit(RecommendationJobResourceLimit resourceLimit) {
        setResourceLimit(resourceLimit);
        return this;
    }

    /**
     * <p>
     * Specifies the endpoint configuration to use for a job.
     * </p>
     * 
     * @return Specifies the endpoint configuration to use for a job.
     */

    public java.util.List<EndpointInputConfiguration> getEndpointConfigurations() {
        return endpointConfigurations;
    }

    /**
     * <p>
     * Specifies the endpoint configuration to use for a job.
     * </p>
     * 
     * @param endpointConfigurations
     *        Specifies the endpoint configuration to use for a job.
     */

    public void setEndpointConfigurations(java.util.Collection<EndpointInputConfiguration> endpointConfigurations) {
        if (endpointConfigurations == null) {
            this.endpointConfigurations = null;
            return;
        }

        this.endpointConfigurations = new java.util.ArrayList<EndpointInputConfiguration>(endpointConfigurations);
    }

    /**
     * <p>
     * Specifies the endpoint configuration to use for a job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointConfigurations(java.util.Collection)} or
     * {@link #withEndpointConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param endpointConfigurations
     *        Specifies the endpoint configuration to use for a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withEndpointConfigurations(EndpointInputConfiguration... endpointConfigurations) {
        if (this.endpointConfigurations == null) {
            setEndpointConfigurations(new java.util.ArrayList<EndpointInputConfiguration>(endpointConfigurations.length));
        }
        for (EndpointInputConfiguration ele : endpointConfigurations) {
            this.endpointConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the endpoint configuration to use for a job.
     * </p>
     * 
     * @param endpointConfigurations
     *        Specifies the endpoint configuration to use for a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withEndpointConfigurations(java.util.Collection<EndpointInputConfiguration> endpointConfigurations) {
        setEndpointConfigurations(endpointConfigurations);
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
        if (getModelPackageVersionArn() != null)
            sb.append("ModelPackageVersionArn: ").append(getModelPackageVersionArn()).append(",");
        if (getJobDurationInSeconds() != null)
            sb.append("JobDurationInSeconds: ").append(getJobDurationInSeconds()).append(",");
        if (getTrafficPattern() != null)
            sb.append("TrafficPattern: ").append(getTrafficPattern()).append(",");
        if (getResourceLimit() != null)
            sb.append("ResourceLimit: ").append(getResourceLimit()).append(",");
        if (getEndpointConfigurations() != null)
            sb.append("EndpointConfigurations: ").append(getEndpointConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationJobInputConfig == false)
            return false;
        RecommendationJobInputConfig other = (RecommendationJobInputConfig) obj;
        if (other.getModelPackageVersionArn() == null ^ this.getModelPackageVersionArn() == null)
            return false;
        if (other.getModelPackageVersionArn() != null && other.getModelPackageVersionArn().equals(this.getModelPackageVersionArn()) == false)
            return false;
        if (other.getJobDurationInSeconds() == null ^ this.getJobDurationInSeconds() == null)
            return false;
        if (other.getJobDurationInSeconds() != null && other.getJobDurationInSeconds().equals(this.getJobDurationInSeconds()) == false)
            return false;
        if (other.getTrafficPattern() == null ^ this.getTrafficPattern() == null)
            return false;
        if (other.getTrafficPattern() != null && other.getTrafficPattern().equals(this.getTrafficPattern()) == false)
            return false;
        if (other.getResourceLimit() == null ^ this.getResourceLimit() == null)
            return false;
        if (other.getResourceLimit() != null && other.getResourceLimit().equals(this.getResourceLimit()) == false)
            return false;
        if (other.getEndpointConfigurations() == null ^ this.getEndpointConfigurations() == null)
            return false;
        if (other.getEndpointConfigurations() != null && other.getEndpointConfigurations().equals(this.getEndpointConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageVersionArn() == null) ? 0 : getModelPackageVersionArn().hashCode());
        hashCode = prime * hashCode + ((getJobDurationInSeconds() == null) ? 0 : getJobDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getTrafficPattern() == null) ? 0 : getTrafficPattern().hashCode());
        hashCode = prime * hashCode + ((getResourceLimit() == null) ? 0 : getResourceLimit().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfigurations() == null) ? 0 : getEndpointConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationJobInputConfig clone() {
        try {
            return (RecommendationJobInputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RecommendationJobInputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
