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
package com.amazonaws.services.appconfigdata;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.appconfigdata.model.*;

/**
 * Interface for accessing AWS AppConfig Data.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appconfigdata.AbstractAWSAppConfigData} instead.
 * </p>
 * <p>
 * <p>
 * Use the AppConfigData API, a capability of AWS AppConfig, to retrieve deployed configuration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppConfigData {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "appconfigdata";

    /**
     * <p>
     * Retrieves the latest deployed configuration. This API may return empty Configuration data if the client already
     * has the latest version. See StartConfigurationSession to obtain an InitialConfigurationToken to call this API.
     * </p>
     * <important>
     * <p>
     * Each call to GetLatestConfiguration returns a new ConfigurationToken (NextPollConfigurationToken in the
     * response). This new token MUST be provided to the next call to GetLatestConfiguration when polling for
     * configuration updates.
     * </p>
     * <p>
     * To avoid excess charges, we recommend that you include the <code>ClientConfigurationVersion</code> value with
     * every call to <code>GetConfiguration</code>. This value must be saved on your client. Subsequent calls to
     * <code>GetConfiguration</code> must pass this value by using the <code>ClientConfigurationVersion</code>
     * parameter.
     * </p>
     * </important>
     * 
     * @param getLatestConfigurationRequest
     *        Request parameters for the GetLatestConfiguration API
     * @return Result of the GetLatestConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         There was an internal failure in the service.
     * @sample AWSAppConfigData.GetLatestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/GetLatestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetLatestConfigurationResult getLatestConfiguration(GetLatestConfigurationRequest getLatestConfigurationRequest);

    /**
     * <p>
     * Starts a configuration session used to retrieve a deployed configuration. See the GetLatestConfiguration API for
     * more details.
     * </p>
     * 
     * @param startConfigurationSessionRequest
     *        Request parameters for the StartConfigurationSession API.
     * @return Result of the StartConfigurationSession operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         There was an internal failure in the service.
     * @sample AWSAppConfigData.StartConfigurationSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/StartConfigurationSession"
     *      target="_top">AWS API Documentation</a>
     */
    StartConfigurationSessionResult startConfigurationSession(StartConfigurationSessionRequest startConfigurationSessionRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
