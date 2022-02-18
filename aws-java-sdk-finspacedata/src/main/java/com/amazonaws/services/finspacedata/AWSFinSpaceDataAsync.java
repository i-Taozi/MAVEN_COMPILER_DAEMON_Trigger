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
package com.amazonaws.services.finspacedata;

import javax.annotation.Generated;

import com.amazonaws.services.finspacedata.model.*;

/**
 * Interface for accessing FinSpace Data asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.finspacedata.AbstractAWSFinSpaceDataAsync} instead.
 * </p>
 * <p>
 * <p>
 * The FinSpace APIs let you take actions inside the FinSpace.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSFinSpaceDataAsync extends AWSFinSpaceData {

    /**
     * <p>
     * Creates a new Changeset in a FinSpace Dataset.
     * </p>
     * 
     * @param createChangesetRequest
     *        The request for a CreateChangeset operation.
     * @return A Java Future containing the result of the CreateChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.CreateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChangesetResult> createChangesetAsync(CreateChangesetRequest createChangesetRequest);

    /**
     * <p>
     * Creates a new Changeset in a FinSpace Dataset.
     * </p>
     * 
     * @param createChangesetRequest
     *        The request for a CreateChangeset operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.CreateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChangesetResult> createChangesetAsync(CreateChangesetRequest createChangesetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChangesetRequest, CreateChangesetResult> asyncHandler);

    /**
     * <p>
     * Creates a Dataview for a Dataset.
     * </p>
     * 
     * @param createDataViewRequest
     *        Request for creating a data view.
     * @return A Java Future containing the result of the CreateDataView operation returned by the service.
     * @sample AWSFinSpaceDataAsync.CreateDataView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataView" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataViewResult> createDataViewAsync(CreateDataViewRequest createDataViewRequest);

    /**
     * <p>
     * Creates a Dataview for a Dataset.
     * </p>
     * 
     * @param createDataViewRequest
     *        Request for creating a data view.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataView operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.CreateDataView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataView" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataViewResult> createDataViewAsync(CreateDataViewRequest createDataViewRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataViewRequest, CreateDataViewResult> asyncHandler);

    /**
     * <p>
     * Creates a new FinSpace Dataset.
     * </p>
     * 
     * @param createDatasetRequest
     *        The request for a CreateDataset operation
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates a new FinSpace Dataset.
     * </p>
     * 
     * @param createDatasetRequest
     *        The request for a CreateDataset operation
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler);

    /**
     * <p>
     * Deletes a FinSpace Dataset.
     * </p>
     * 
     * @param deleteDatasetRequest
     *        The request for a DeleteDataset operation.
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes a FinSpace Dataset.
     * </p>
     * 
     * @param deleteDatasetRequest
     *        The request for a DeleteDataset operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler);

    /**
     * <p>
     * Get information about a Changeset.
     * </p>
     * 
     * @param getChangesetRequest
     *        Request to describe a changeset.
     * @return A Java Future containing the result of the GetChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.GetChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChangesetResult> getChangesetAsync(GetChangesetRequest getChangesetRequest);

    /**
     * <p>
     * Get information about a Changeset.
     * </p>
     * 
     * @param getChangesetRequest
     *        Request to describe a changeset.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.GetChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChangesetResult> getChangesetAsync(GetChangesetRequest getChangesetRequest,
            com.amazonaws.handlers.AsyncHandler<GetChangesetRequest, GetChangesetResult> asyncHandler);

    /**
     * <p>
     * Gets information about a Dataview.
     * </p>
     * 
     * @param getDataViewRequest
     *        Request for retrieving a data view detail. Grouped / accessible within a dataset by its dataset id.
     * @return A Java Future containing the result of the GetDataView operation returned by the service.
     * @sample AWSFinSpaceDataAsync.GetDataView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataView" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataViewResult> getDataViewAsync(GetDataViewRequest getDataViewRequest);

    /**
     * <p>
     * Gets information about a Dataview.
     * </p>
     * 
     * @param getDataViewRequest
     *        Request for retrieving a data view detail. Grouped / accessible within a dataset by its dataset id.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataView operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.GetDataView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataView" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataViewResult> getDataViewAsync(GetDataViewRequest getDataViewRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataViewRequest, GetDataViewResult> asyncHandler);

    /**
     * <p>
     * Returns information about a Dataset.
     * </p>
     * 
     * @param getDatasetRequest
     *        Request for the GetDataset operation.
     * @return A Java Future containing the result of the GetDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.GetDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatasetResult> getDatasetAsync(GetDatasetRequest getDatasetRequest);

    /**
     * <p>
     * Returns information about a Dataset.
     * </p>
     * 
     * @param getDatasetRequest
     *        Request for the GetDataset operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.GetDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatasetResult> getDatasetAsync(GetDatasetRequest getDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatasetRequest, GetDatasetResult> asyncHandler);

    /**
     * <p>
     * Request programmatic credentials to use with FinSpace SDK.
     * </p>
     * 
     * @param getProgrammaticAccessCredentialsRequest
     *        Request for GetProgrammaticAccessCredentials operation
     * @return A Java Future containing the result of the GetProgrammaticAccessCredentials operation returned by the
     *         service.
     * @sample AWSFinSpaceDataAsync.GetProgrammaticAccessCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetProgrammaticAccessCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProgrammaticAccessCredentialsResult> getProgrammaticAccessCredentialsAsync(
            GetProgrammaticAccessCredentialsRequest getProgrammaticAccessCredentialsRequest);

    /**
     * <p>
     * Request programmatic credentials to use with FinSpace SDK.
     * </p>
     * 
     * @param getProgrammaticAccessCredentialsRequest
     *        Request for GetProgrammaticAccessCredentials operation
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProgrammaticAccessCredentials operation returned by the
     *         service.
     * @sample AWSFinSpaceDataAsyncHandler.GetProgrammaticAccessCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetProgrammaticAccessCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProgrammaticAccessCredentialsResult> getProgrammaticAccessCredentialsAsync(
            GetProgrammaticAccessCredentialsRequest getProgrammaticAccessCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<GetProgrammaticAccessCredentialsRequest, GetProgrammaticAccessCredentialsResult> asyncHandler);

    /**
     * <p>
     * A temporary Amazon S3 location, where you can copy your files from a source location to stage or use as a scratch
     * space in FinSpace notebook.
     * </p>
     * 
     * @param getWorkingLocationRequest
     * @return A Java Future containing the result of the GetWorkingLocation operation returned by the service.
     * @sample AWSFinSpaceDataAsync.GetWorkingLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetWorkingLocation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkingLocationResult> getWorkingLocationAsync(GetWorkingLocationRequest getWorkingLocationRequest);

    /**
     * <p>
     * A temporary Amazon S3 location, where you can copy your files from a source location to stage or use as a scratch
     * space in FinSpace notebook.
     * </p>
     * 
     * @param getWorkingLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkingLocation operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.GetWorkingLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetWorkingLocation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkingLocationResult> getWorkingLocationAsync(GetWorkingLocationRequest getWorkingLocationRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkingLocationRequest, GetWorkingLocationResult> asyncHandler);

    /**
     * <p>
     * Lists the FinSpace Changesets for a Dataset.
     * </p>
     * 
     * @param listChangesetsRequest
     *        Request to ListChangesetsRequest. It exposes minimal query filters.
     * @return A Java Future containing the result of the ListChangesets operation returned by the service.
     * @sample AWSFinSpaceDataAsync.ListChangesets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListChangesets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChangesetsResult> listChangesetsAsync(ListChangesetsRequest listChangesetsRequest);

    /**
     * <p>
     * Lists the FinSpace Changesets for a Dataset.
     * </p>
     * 
     * @param listChangesetsRequest
     *        Request to ListChangesetsRequest. It exposes minimal query filters.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChangesets operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.ListChangesets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListChangesets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChangesetsResult> listChangesetsAsync(ListChangesetsRequest listChangesetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChangesetsRequest, ListChangesetsResult> asyncHandler);

    /**
     * <p>
     * Lists all available Dataviews for a Dataset.
     * </p>
     * 
     * @param listDataViewsRequest
     *        Request for a list data views.
     * @return A Java Future containing the result of the ListDataViews operation returned by the service.
     * @sample AWSFinSpaceDataAsync.ListDataViews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDataViews" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataViewsResult> listDataViewsAsync(ListDataViewsRequest listDataViewsRequest);

    /**
     * <p>
     * Lists all available Dataviews for a Dataset.
     * </p>
     * 
     * @param listDataViewsRequest
     *        Request for a list data views.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataViews operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.ListDataViews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDataViews" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataViewsResult> listDataViewsAsync(ListDataViewsRequest listDataViewsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataViewsRequest, ListDataViewsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the active Datasets that a user has access to.
     * </p>
     * 
     * @param listDatasetsRequest
     *        Request for the ListDatasets operation.
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AWSFinSpaceDataAsync.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Lists all of the active Datasets that a user has access to.
     * </p>
     * 
     * @param listDatasetsRequest
     *        Request for the ListDatasets operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler);

    /**
     * <p>
     * Updates a FinSpace Changeset.
     * </p>
     * 
     * @param updateChangesetRequest
     *        Request to update an existing changeset.
     * @return A Java Future containing the result of the UpdateChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.UpdateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChangesetResult> updateChangesetAsync(UpdateChangesetRequest updateChangesetRequest);

    /**
     * <p>
     * Updates a FinSpace Changeset.
     * </p>
     * 
     * @param updateChangesetRequest
     *        Request to update an existing changeset.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.UpdateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChangesetResult> updateChangesetAsync(UpdateChangesetRequest updateChangesetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChangesetRequest, UpdateChangesetResult> asyncHandler);

    /**
     * <p>
     * Updates a FinSpace Dataset.
     * </p>
     * 
     * @param updateDatasetRequest
     *        The request for an UpdateDataset operation
     * @return A Java Future containing the result of the UpdateDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest updateDatasetRequest);

    /**
     * <p>
     * Updates a FinSpace Dataset.
     * </p>
     * 
     * @param updateDatasetRequest
     *        The request for an UpdateDataset operation
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest updateDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasetRequest, UpdateDatasetResult> asyncHandler);

}
