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
 * Abstract implementation of {@code AWSFinSpaceDataAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSFinSpaceDataAsync extends AbstractAWSFinSpaceData implements AWSFinSpaceDataAsync {

    protected AbstractAWSFinSpaceDataAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateChangesetResult> createChangesetAsync(CreateChangesetRequest request) {

        return createChangesetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChangesetResult> createChangesetAsync(CreateChangesetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateChangesetRequest, CreateChangesetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataViewResult> createDataViewAsync(CreateDataViewRequest request) {

        return createDataViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataViewResult> createDataViewAsync(CreateDataViewRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataViewRequest, CreateDataViewResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest request) {

        return createDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest request) {

        return deleteDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetChangesetResult> getChangesetAsync(GetChangesetRequest request) {

        return getChangesetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChangesetResult> getChangesetAsync(GetChangesetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetChangesetRequest, GetChangesetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDataViewResult> getDataViewAsync(GetDataViewRequest request) {

        return getDataViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataViewResult> getDataViewAsync(GetDataViewRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataViewRequest, GetDataViewResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDatasetResult> getDatasetAsync(GetDatasetRequest request) {

        return getDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatasetResult> getDatasetAsync(GetDatasetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDatasetRequest, GetDatasetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProgrammaticAccessCredentialsResult> getProgrammaticAccessCredentialsAsync(
            GetProgrammaticAccessCredentialsRequest request) {

        return getProgrammaticAccessCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProgrammaticAccessCredentialsResult> getProgrammaticAccessCredentialsAsync(
            GetProgrammaticAccessCredentialsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProgrammaticAccessCredentialsRequest, GetProgrammaticAccessCredentialsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetWorkingLocationResult> getWorkingLocationAsync(GetWorkingLocationRequest request) {

        return getWorkingLocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkingLocationResult> getWorkingLocationAsync(GetWorkingLocationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWorkingLocationRequest, GetWorkingLocationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListChangesetsResult> listChangesetsAsync(ListChangesetsRequest request) {

        return listChangesetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChangesetsResult> listChangesetsAsync(ListChangesetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListChangesetsRequest, ListChangesetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDataViewsResult> listDataViewsAsync(ListDataViewsRequest request) {

        return listDataViewsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataViewsResult> listDataViewsAsync(ListDataViewsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataViewsRequest, ListDataViewsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest request) {

        return listDatasetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateChangesetResult> updateChangesetAsync(UpdateChangesetRequest request) {

        return updateChangesetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChangesetResult> updateChangesetAsync(UpdateChangesetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateChangesetRequest, UpdateChangesetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest request) {

        return updateDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasetRequest, UpdateDatasetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
