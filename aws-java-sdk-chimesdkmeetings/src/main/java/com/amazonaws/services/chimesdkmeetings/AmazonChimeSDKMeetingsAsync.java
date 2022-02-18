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
package com.amazonaws.services.chimesdkmeetings;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmeetings.model.*;

/**
 * Interface for accessing Amazon Chime SDK Meetings asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkmeetings.AbstractAmazonChimeSDKMeetingsAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Chime SDK meetings APIs in this section allow software developers to create Amazon Chime SDK meetings, set
 * the AWS Regions for meetings, create and manage users, and send and receive meeting notifications. For more
 * information about the meeting APIs, see <a
 * href="http://amazonaws.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_meetings">Amazon Chime SDK
 * meetings</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonChimeSDKMeetingsAsync extends AmazonChimeSDKMeetings {

    /**
     * <p>
     * Creates up to 100 attendees for an active Amazon Chime SDK meeting. For more information about the Amazon Chime
     * SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a>
     * in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param batchCreateAttendeeRequest
     * @return A Java Future containing the result of the BatchCreateAttendee operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsync.BatchCreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/BatchCreateAttendee"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateAttendeeResult> batchCreateAttendeeAsync(BatchCreateAttendeeRequest batchCreateAttendeeRequest);

    /**
     * <p>
     * Creates up to 100 attendees for an active Amazon Chime SDK meeting. For more information about the Amazon Chime
     * SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a>
     * in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param batchCreateAttendeeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCreateAttendee operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsyncHandler.BatchCreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/BatchCreateAttendee"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateAttendeeResult> batchCreateAttendeeAsync(BatchCreateAttendeeRequest batchCreateAttendeeRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCreateAttendeeRequest, BatchCreateAttendeeResult> asyncHandler);

    /**
     * <p>
     * Creates a new attendee for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createAttendeeRequest
     * @return A Java Future containing the result of the CreateAttendee operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsync.CreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateAttendee"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAttendeeResult> createAttendeeAsync(CreateAttendeeRequest createAttendeeRequest);

    /**
     * <p>
     * Creates a new attendee for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createAttendeeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAttendee operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsyncHandler.CreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateAttendee"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAttendeeResult> createAttendeeAsync(CreateAttendeeRequest createAttendeeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAttendeeRequest, CreateAttendeeResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region with no initial attendees. For more
     * information about specifying media Regions, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html">Amazon Chime SDK Media
     * Regions</a> in the <i>Amazon Chime Developer Guide</i>. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createMeetingRequest
     * @return A Java Future containing the result of the CreateMeeting operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsync.CreateMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateMeeting"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMeetingResult> createMeetingAsync(CreateMeetingRequest createMeetingRequest);

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region with no initial attendees. For more
     * information about specifying media Regions, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html">Amazon Chime SDK Media
     * Regions</a> in the <i>Amazon Chime Developer Guide</i>. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createMeetingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMeeting operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsyncHandler.CreateMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateMeeting"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMeetingResult> createMeetingAsync(CreateMeetingRequest createMeetingRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMeetingRequest, CreateMeetingResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region, with attendees. For more information about
     * specifying media Regions, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html">Amazon Chime SDK Media
     * Regions</a> in the <i>Amazon Chime Developer Guide</i>. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createMeetingWithAttendeesRequest
     * @return A Java Future containing the result of the CreateMeetingWithAttendees operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsync.CreateMeetingWithAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateMeetingWithAttendees"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMeetingWithAttendeesResult> createMeetingWithAttendeesAsync(
            CreateMeetingWithAttendeesRequest createMeetingWithAttendeesRequest);

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region, with attendees. For more information about
     * specifying media Regions, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html">Amazon Chime SDK Media
     * Regions</a> in the <i>Amazon Chime Developer Guide</i>. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createMeetingWithAttendeesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMeetingWithAttendees operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsyncHandler.CreateMeetingWithAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateMeetingWithAttendees"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMeetingWithAttendeesResult> createMeetingWithAttendeesAsync(
            CreateMeetingWithAttendeesRequest createMeetingWithAttendeesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMeetingWithAttendeesRequest, CreateMeetingWithAttendeesResult> asyncHandler);

    /**
     * <p>
     * Deletes an attendee from the specified Amazon Chime SDK meeting and deletes their <code>JoinToken</code>.
     * Attendees are automatically deleted when a Amazon Chime SDK meeting is deleted. For more information about the
     * Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon
     * Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteAttendeeRequest
     * @return A Java Future containing the result of the DeleteAttendee operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsync.DeleteAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/DeleteAttendee"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAttendeeResult> deleteAttendeeAsync(DeleteAttendeeRequest deleteAttendeeRequest);

    /**
     * <p>
     * Deletes an attendee from the specified Amazon Chime SDK meeting and deletes their <code>JoinToken</code>.
     * Attendees are automatically deleted when a Amazon Chime SDK meeting is deleted. For more information about the
     * Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon
     * Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteAttendeeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAttendee operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsyncHandler.DeleteAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/DeleteAttendee"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAttendeeResult> deleteAttendeeAsync(DeleteAttendeeRequest deleteAttendeeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAttendeeRequest, DeleteAttendeeResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Amazon Chime SDK meeting. The operation deletes all attendees, disconnects all clients, and
     * prevents new clients from joining the meeting. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteMeetingRequest
     * @return A Java Future containing the result of the DeleteMeeting operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsync.DeleteMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/DeleteMeeting"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMeetingResult> deleteMeetingAsync(DeleteMeetingRequest deleteMeetingRequest);

    /**
     * <p>
     * Deletes the specified Amazon Chime SDK meeting. The operation deletes all attendees, disconnects all clients, and
     * prevents new clients from joining the meeting. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteMeetingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMeeting operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsyncHandler.DeleteMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/DeleteMeeting"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMeetingResult> deleteMeetingAsync(DeleteMeetingRequest deleteMeetingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMeetingRequest, DeleteMeetingResult> asyncHandler);

    /**
     * <p>
     * Gets the Amazon Chime SDK attendee details for a specified meeting ID and attendee ID. For more information about
     * the Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the
     * Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param getAttendeeRequest
     * @return A Java Future containing the result of the GetAttendee operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsync.GetAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/GetAttendee" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAttendeeResult> getAttendeeAsync(GetAttendeeRequest getAttendeeRequest);

    /**
     * <p>
     * Gets the Amazon Chime SDK attendee details for a specified meeting ID and attendee ID. For more information about
     * the Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the
     * Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param getAttendeeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAttendee operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsyncHandler.GetAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/GetAttendee" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAttendeeResult> getAttendeeAsync(GetAttendeeRequest getAttendeeRequest,
            com.amazonaws.handlers.AsyncHandler<GetAttendeeRequest, GetAttendeeResult> asyncHandler);

    /**
     * <p>
     * Gets the Amazon Chime SDK meeting details for the specified meeting ID. For more information about the Amazon
     * Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime
     * SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param getMeetingRequest
     * @return A Java Future containing the result of the GetMeeting operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsync.GetMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/GetMeeting" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMeetingResult> getMeetingAsync(GetMeetingRequest getMeetingRequest);

    /**
     * <p>
     * Gets the Amazon Chime SDK meeting details for the specified meeting ID. For more information about the Amazon
     * Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime
     * SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param getMeetingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMeeting operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsyncHandler.GetMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/GetMeeting" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMeetingResult> getMeetingAsync(GetMeetingRequest getMeetingRequest,
            com.amazonaws.handlers.AsyncHandler<GetMeetingRequest, GetMeetingResult> asyncHandler);

    /**
     * <p>
     * Lists the attendees for the specified Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param listAttendeesRequest
     * @return A Java Future containing the result of the ListAttendees operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsync.ListAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/ListAttendees"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAttendeesResult> listAttendeesAsync(ListAttendeesRequest listAttendeesRequest);

    /**
     * <p>
     * Lists the attendees for the specified Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param listAttendeesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAttendees operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsyncHandler.ListAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/ListAttendees"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAttendeesResult> listAttendeesAsync(ListAttendeesRequest listAttendeesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttendeesRequest, ListAttendeesResult> asyncHandler);

    /**
     * <p>
     * Starts transcription for the specified <code>meetingId</code>.
     * </p>
     * 
     * @param startMeetingTranscriptionRequest
     * @return A Java Future containing the result of the StartMeetingTranscription operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsync.StartMeetingTranscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/StartMeetingTranscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMeetingTranscriptionResult> startMeetingTranscriptionAsync(
            StartMeetingTranscriptionRequest startMeetingTranscriptionRequest);

    /**
     * <p>
     * Starts transcription for the specified <code>meetingId</code>.
     * </p>
     * 
     * @param startMeetingTranscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMeetingTranscription operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsyncHandler.StartMeetingTranscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/StartMeetingTranscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMeetingTranscriptionResult> startMeetingTranscriptionAsync(
            StartMeetingTranscriptionRequest startMeetingTranscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<StartMeetingTranscriptionRequest, StartMeetingTranscriptionResult> asyncHandler);

    /**
     * <p>
     * Stops transcription for the specified <code>meetingId</code>.
     * </p>
     * 
     * @param stopMeetingTranscriptionRequest
     * @return A Java Future containing the result of the StopMeetingTranscription operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsync.StopMeetingTranscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/StopMeetingTranscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopMeetingTranscriptionResult> stopMeetingTranscriptionAsync(StopMeetingTranscriptionRequest stopMeetingTranscriptionRequest);

    /**
     * <p>
     * Stops transcription for the specified <code>meetingId</code>.
     * </p>
     * 
     * @param stopMeetingTranscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopMeetingTranscription operation returned by the service.
     * @sample AmazonChimeSDKMeetingsAsyncHandler.StopMeetingTranscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/StopMeetingTranscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopMeetingTranscriptionResult> stopMeetingTranscriptionAsync(StopMeetingTranscriptionRequest stopMeetingTranscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<StopMeetingTranscriptionRequest, StopMeetingTranscriptionResult> asyncHandler);

}
