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
package com.amazonaws.services.amplifyuibuilder;

import javax.annotation.Generated;

import com.amazonaws.services.amplifyuibuilder.model.*;

/**
 * Interface for accessing AWS Amplify UI Builder asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.amplifyuibuilder.AbstractAWSAmplifyUIBuilderAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amplify UI Builder API provides a programmatic interface for creating and configuring user interface (UI)
 * component libraries and themes for use in your Amplify applications. You can then connect these UI components to an
 * application's backend Amazon Web Services resources.
 * </p>
 * <p>
 * You can also use the Amplify Studio visual designer to create UI components and model data for an app. For more
 * information, see <a href="https://docs.amplify.aws/console/adminui/intro">Introduction</a> in the <i>Amplify
 * Docs</i>.
 * </p>
 * <p>
 * The Amplify Framework is a comprehensive set of SDKs, libraries, tools, and documentation for client app development.
 * For more information, see the <a href="https://docs.amplify.aws/">Amplify Framework</a>. For more information about
 * deploying an Amplify application to Amazon Web Services, see the <a
 * href="https://docs.aws.amazon.com/amplify/latest/userguide/welcome.html">Amplify Console User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAmplifyUIBuilderAsync extends AWSAmplifyUIBuilder {

    /**
     * <p>
     * Creates a new component for an Amplify app.
     * </p>
     * 
     * @param createComponentRequest
     * @return A Java Future containing the result of the CreateComponent operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CreateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest createComponentRequest);

    /**
     * <p>
     * Creates a new component for an Amplify app.
     * </p>
     * 
     * @param createComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateComponent operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CreateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest createComponentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateComponentRequest, CreateComponentResult> asyncHandler);

    /**
     * <p>
     * Creates a theme to apply to the components in an Amplify app.
     * </p>
     * 
     * @param createThemeRequest
     * @return A Java Future containing the result of the CreateTheme operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.CreateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CreateTheme" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateThemeResult> createThemeAsync(CreateThemeRequest createThemeRequest);

    /**
     * <p>
     * Creates a theme to apply to the components in an Amplify app.
     * </p>
     * 
     * @param createThemeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTheme operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.CreateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CreateTheme" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateThemeResult> createThemeAsync(CreateThemeRequest createThemeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateThemeRequest, CreateThemeResult> asyncHandler);

    /**
     * <p>
     * Deletes a component from an Amplify app.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return A Java Future containing the result of the DeleteComponent operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/DeleteComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest deleteComponentRequest);

    /**
     * <p>
     * Deletes a component from an Amplify app.
     * </p>
     * 
     * @param deleteComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteComponent operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/DeleteComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest deleteComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteComponentRequest, DeleteComponentResult> asyncHandler);

    /**
     * <p>
     * Deletes a theme from an Amplify app.
     * </p>
     * 
     * @param deleteThemeRequest
     * @return A Java Future containing the result of the DeleteTheme operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.DeleteTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/DeleteTheme" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteThemeResult> deleteThemeAsync(DeleteThemeRequest deleteThemeRequest);

    /**
     * <p>
     * Deletes a theme from an Amplify app.
     * </p>
     * 
     * @param deleteThemeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTheme operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.DeleteTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/DeleteTheme" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteThemeResult> deleteThemeAsync(DeleteThemeRequest deleteThemeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThemeRequest, DeleteThemeResult> asyncHandler);

    /**
     * <p>
     * Exchanges an access code for a token.
     * </p>
     * 
     * @param exchangeCodeForTokenRequest
     * @return A Java Future containing the result of the ExchangeCodeForToken operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.ExchangeCodeForToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExchangeCodeForToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExchangeCodeForTokenResult> exchangeCodeForTokenAsync(ExchangeCodeForTokenRequest exchangeCodeForTokenRequest);

    /**
     * <p>
     * Exchanges an access code for a token.
     * </p>
     * 
     * @param exchangeCodeForTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExchangeCodeForToken operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.ExchangeCodeForToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExchangeCodeForToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExchangeCodeForTokenResult> exchangeCodeForTokenAsync(ExchangeCodeForTokenRequest exchangeCodeForTokenRequest,
            com.amazonaws.handlers.AsyncHandler<ExchangeCodeForTokenRequest, ExchangeCodeForTokenResult> asyncHandler);

    /**
     * <p>
     * Exports component configurations to code that is ready to integrate into an Amplify app.
     * </p>
     * 
     * @param exportComponentsRequest
     * @return A Java Future containing the result of the ExportComponents operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.ExportComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExportComponents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportComponentsResult> exportComponentsAsync(ExportComponentsRequest exportComponentsRequest);

    /**
     * <p>
     * Exports component configurations to code that is ready to integrate into an Amplify app.
     * </p>
     * 
     * @param exportComponentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportComponents operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.ExportComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExportComponents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportComponentsResult> exportComponentsAsync(ExportComponentsRequest exportComponentsRequest,
            com.amazonaws.handlers.AsyncHandler<ExportComponentsRequest, ExportComponentsResult> asyncHandler);

    /**
     * <p>
     * Exports theme configurations to code that is ready to integrate into an Amplify app.
     * </p>
     * 
     * @param exportThemesRequest
     * @return A Java Future containing the result of the ExportThemes operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.ExportThemes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExportThemes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ExportThemesResult> exportThemesAsync(ExportThemesRequest exportThemesRequest);

    /**
     * <p>
     * Exports theme configurations to code that is ready to integrate into an Amplify app.
     * </p>
     * 
     * @param exportThemesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportThemes operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.ExportThemes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExportThemes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ExportThemesResult> exportThemesAsync(ExportThemesRequest exportThemesRequest,
            com.amazonaws.handlers.AsyncHandler<ExportThemesRequest, ExportThemesResult> asyncHandler);

    /**
     * <p>
     * Returns an existing component for an Amplify app.
     * </p>
     * 
     * @param getComponentRequest
     * @return A Java Future containing the result of the GetComponent operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest getComponentRequest);

    /**
     * <p>
     * Returns an existing component for an Amplify app.
     * </p>
     * 
     * @param getComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComponent operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest getComponentRequest,
            com.amazonaws.handlers.AsyncHandler<GetComponentRequest, GetComponentResult> asyncHandler);

    /**
     * <p>
     * Returns an existing theme for an Amplify app.
     * </p>
     * 
     * @param getThemeRequest
     * @return A Java Future containing the result of the GetTheme operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.GetTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetTheme" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetThemeResult> getThemeAsync(GetThemeRequest getThemeRequest);

    /**
     * <p>
     * Returns an existing theme for an Amplify app.
     * </p>
     * 
     * @param getThemeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTheme operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.GetTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetTheme" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetThemeResult> getThemeAsync(GetThemeRequest getThemeRequest,
            com.amazonaws.handlers.AsyncHandler<GetThemeRequest, GetThemeResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of components for a specified Amplify app and backend environment.
     * </p>
     * 
     * @param listComponentsRequest
     * @return A Java Future containing the result of the ListComponents operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ListComponents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest listComponentsRequest);

    /**
     * <p>
     * Retrieves a list of components for a specified Amplify app and backend environment.
     * </p>
     * 
     * @param listComponentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComponents operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ListComponents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest listComponentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of themes for a specified Amplify app and backend environment.
     * </p>
     * 
     * @param listThemesRequest
     * @return A Java Future containing the result of the ListThemes operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.ListThemes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ListThemes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListThemesResult> listThemesAsync(ListThemesRequest listThemesRequest);

    /**
     * <p>
     * Retrieves a list of themes for a specified Amplify app and backend environment.
     * </p>
     * 
     * @param listThemesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThemes operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.ListThemes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ListThemes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListThemesResult> listThemesAsync(ListThemesRequest listThemesRequest,
            com.amazonaws.handlers.AsyncHandler<ListThemesRequest, ListThemesResult> asyncHandler);

    /**
     * <p>
     * Refreshes a previously issued access token that might have expired.
     * </p>
     * 
     * @param refreshTokenRequest
     * @return A Java Future containing the result of the RefreshToken operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.RefreshToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/RefreshToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RefreshTokenResult> refreshTokenAsync(RefreshTokenRequest refreshTokenRequest);

    /**
     * <p>
     * Refreshes a previously issued access token that might have expired.
     * </p>
     * 
     * @param refreshTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RefreshToken operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.RefreshToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/RefreshToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RefreshTokenResult> refreshTokenAsync(RefreshTokenRequest refreshTokenRequest,
            com.amazonaws.handlers.AsyncHandler<RefreshTokenRequest, RefreshTokenResult> asyncHandler);

    /**
     * <p>
     * Updates an existing component.
     * </p>
     * 
     * @param updateComponentRequest
     * @return A Java Future containing the result of the UpdateComponent operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.UpdateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateComponentResult> updateComponentAsync(UpdateComponentRequest updateComponentRequest);

    /**
     * <p>
     * Updates an existing component.
     * </p>
     * 
     * @param updateComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateComponent operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.UpdateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateComponentResult> updateComponentAsync(UpdateComponentRequest updateComponentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateComponentRequest, UpdateComponentResult> asyncHandler);

    /**
     * <p>
     * Updates an existing theme.
     * </p>
     * 
     * @param updateThemeRequest
     * @return A Java Future containing the result of the UpdateTheme operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsync.UpdateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateTheme" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateThemeResult> updateThemeAsync(UpdateThemeRequest updateThemeRequest);

    /**
     * <p>
     * Updates an existing theme.
     * </p>
     * 
     * @param updateThemeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTheme operation returned by the service.
     * @sample AWSAmplifyUIBuilderAsyncHandler.UpdateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateTheme" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateThemeResult> updateThemeAsync(UpdateThemeRequest updateThemeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThemeRequest, UpdateThemeResult> asyncHandler);

}
