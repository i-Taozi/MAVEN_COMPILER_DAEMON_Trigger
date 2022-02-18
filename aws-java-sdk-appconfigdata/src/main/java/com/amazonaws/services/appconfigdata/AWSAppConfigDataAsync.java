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

import com.amazonaws.services.appconfigdata.model.*;

/**
 * Interface for accessing AWS AppConfig Data asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appconfigdata.AbstractAWSAppConfigDataAsync} instead.
 * </p>
 * <p>
 * <p>
 * Use the AppConfigData API, a capability of AWS AppConfig, to retrieve deployed configuration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppConfigDataAsync extends AWSAppConfigData {

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
     * @return A Java Future containing the result of the GetLatestConfiguration operation returned by the service.
     * @sample AWSAppConfigDataAsync.GetLatestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/GetLatestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLatestConfigurationResult> getLatestConfigurationAsync(GetLatestConfigurationRequest getLatestConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLatestConfiguration operation returned by the service.
     * @sample AWSAppConfigDataAsyncHandler.GetLatestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/GetLatestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLatestConfigurationResult> getLatestConfigurationAsync(GetLatestConfigurationRequest getLatestConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetLatestConfigurationRequest, GetLatestConfigurationResult> asyncHandler);

    /**
     * <p>
     * Starts a configuration session used to retrieve a deployed configuration. See the GetLatestConfiguration API for
     * more details.
     * </p>
     * 
     * @param startConfigurationSessionRequest
     *        Request parameters for the StartConfigurationSession API.
     * @return A Java Future containing the result of the StartConfigurationSession operation returned by the service.
     * @sample AWSAppConfigDataAsync.StartConfigurationSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/StartConfigurationSession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartConfigurationSessionResult> startConfigurationSessionAsync(
            StartConfigurationSessionRequest startConfigurationSessionRequest);

    /**
     * <p>
     * Starts a configuration session used to retrieve a deployed configuration. See the GetLatestConfiguration API for
     * more details.
     * </p>
     * 
     * @param startConfigurationSessionRequest
     *        Request parameters for the StartConfigurationSession API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartConfigurationSession operation returned by the service.
     * @sample AWSAppConfigDataAsyncHandler.StartConfigurationSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/StartConfigurationSession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartConfigurationSessionResult> startConfigurationSessionAsync(
            StartConfigurationSessionRequest startConfigurationSessionRequest,
            com.amazonaws.handlers.AsyncHandler<StartConfigurationSessionRequest, StartConfigurationSessionResult> asyncHandler);

}
