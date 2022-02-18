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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing FinSpace Data asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The FinSpace APIs let you take actions inside the FinSpace.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSFinSpaceDataAsyncClient extends AWSFinSpaceDataClient implements AWSFinSpaceDataAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSFinSpaceDataAsyncClientBuilder asyncBuilder() {
        return AWSFinSpaceDataAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on FinSpace Data using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSFinSpaceDataAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on FinSpace Data using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSFinSpaceDataAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateChangesetResult> createChangesetAsync(CreateChangesetRequest request) {

        return createChangesetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChangesetResult> createChangesetAsync(final CreateChangesetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChangesetRequest, CreateChangesetResult> asyncHandler) {
        final CreateChangesetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChangesetResult>() {
            @Override
            public CreateChangesetResult call() throws Exception {
                CreateChangesetResult result = null;

                try {
                    result = executeCreateChangeset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDataViewResult> createDataViewAsync(CreateDataViewRequest request) {

        return createDataViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataViewResult> createDataViewAsync(final CreateDataViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataViewRequest, CreateDataViewResult> asyncHandler) {
        final CreateDataViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataViewResult>() {
            @Override
            public CreateDataViewResult call() throws Exception {
                CreateDataViewResult result = null;

                try {
                    result = executeCreateDataView(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest request) {

        return createDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(final CreateDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler) {
        final CreateDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatasetResult>() {
            @Override
            public CreateDatasetResult call() throws Exception {
                CreateDatasetResult result = null;

                try {
                    result = executeCreateDataset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest request) {

        return deleteDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(final DeleteDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler) {
        final DeleteDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatasetResult>() {
            @Override
            public DeleteDatasetResult call() throws Exception {
                DeleteDatasetResult result = null;

                try {
                    result = executeDeleteDataset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetChangesetResult> getChangesetAsync(GetChangesetRequest request) {

        return getChangesetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChangesetResult> getChangesetAsync(final GetChangesetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChangesetRequest, GetChangesetResult> asyncHandler) {
        final GetChangesetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChangesetResult>() {
            @Override
            public GetChangesetResult call() throws Exception {
                GetChangesetResult result = null;

                try {
                    result = executeGetChangeset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDataViewResult> getDataViewAsync(GetDataViewRequest request) {

        return getDataViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataViewResult> getDataViewAsync(final GetDataViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataViewRequest, GetDataViewResult> asyncHandler) {
        final GetDataViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataViewResult>() {
            @Override
            public GetDataViewResult call() throws Exception {
                GetDataViewResult result = null;

                try {
                    result = executeGetDataView(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDatasetResult> getDatasetAsync(GetDatasetRequest request) {

        return getDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatasetResult> getDatasetAsync(final GetDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDatasetRequest, GetDatasetResult> asyncHandler) {
        final GetDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDatasetResult>() {
            @Override
            public GetDatasetResult call() throws Exception {
                GetDatasetResult result = null;

                try {
                    result = executeGetDataset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProgrammaticAccessCredentialsResult> getProgrammaticAccessCredentialsAsync(
            GetProgrammaticAccessCredentialsRequest request) {

        return getProgrammaticAccessCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProgrammaticAccessCredentialsResult> getProgrammaticAccessCredentialsAsync(
            final GetProgrammaticAccessCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProgrammaticAccessCredentialsRequest, GetProgrammaticAccessCredentialsResult> asyncHandler) {
        final GetProgrammaticAccessCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProgrammaticAccessCredentialsResult>() {
            @Override
            public GetProgrammaticAccessCredentialsResult call() throws Exception {
                GetProgrammaticAccessCredentialsResult result = null;

                try {
                    result = executeGetProgrammaticAccessCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetWorkingLocationResult> getWorkingLocationAsync(GetWorkingLocationRequest request) {

        return getWorkingLocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkingLocationResult> getWorkingLocationAsync(final GetWorkingLocationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkingLocationRequest, GetWorkingLocationResult> asyncHandler) {
        final GetWorkingLocationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkingLocationResult>() {
            @Override
            public GetWorkingLocationResult call() throws Exception {
                GetWorkingLocationResult result = null;

                try {
                    result = executeGetWorkingLocation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListChangesetsResult> listChangesetsAsync(ListChangesetsRequest request) {

        return listChangesetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChangesetsResult> listChangesetsAsync(final ListChangesetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChangesetsRequest, ListChangesetsResult> asyncHandler) {
        final ListChangesetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChangesetsResult>() {
            @Override
            public ListChangesetsResult call() throws Exception {
                ListChangesetsResult result = null;

                try {
                    result = executeListChangesets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataViewsResult> listDataViewsAsync(ListDataViewsRequest request) {

        return listDataViewsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataViewsResult> listDataViewsAsync(final ListDataViewsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataViewsRequest, ListDataViewsResult> asyncHandler) {
        final ListDataViewsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataViewsResult>() {
            @Override
            public ListDataViewsResult call() throws Exception {
                ListDataViewsResult result = null;

                try {
                    result = executeListDataViews(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest request) {

        return listDatasetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(final ListDatasetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler) {
        final ListDatasetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatasetsResult>() {
            @Override
            public ListDatasetsResult call() throws Exception {
                ListDatasetsResult result = null;

                try {
                    result = executeListDatasets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateChangesetResult> updateChangesetAsync(UpdateChangesetRequest request) {

        return updateChangesetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChangesetResult> updateChangesetAsync(final UpdateChangesetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChangesetRequest, UpdateChangesetResult> asyncHandler) {
        final UpdateChangesetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChangesetResult>() {
            @Override
            public UpdateChangesetResult call() throws Exception {
                UpdateChangesetResult result = null;

                try {
                    result = executeUpdateChangeset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest request) {

        return updateDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(final UpdateDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDatasetRequest, UpdateDatasetResult> asyncHandler) {
        final UpdateDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDatasetResult>() {
            @Override
            public UpdateDatasetResult call() throws Exception {
                UpdateDatasetResult result = null;

                try {
                    result = executeUpdateDataset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
