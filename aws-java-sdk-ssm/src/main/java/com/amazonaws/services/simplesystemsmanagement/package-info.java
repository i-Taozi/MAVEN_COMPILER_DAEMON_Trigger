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

/**
 * <p>
 * Amazon Web Services Systems Manager is a collection of capabilities that helps you automate management tasks such as
 * collecting system inventory, applying operating system (OS) patches, automating the creation of Amazon Machine Images
 * (AMIs), and configuring operating systems (OSs) and applications at scale. Systems Manager lets you remotely and
 * securely manage the configuration of your managed nodes. A <i>managed node</i> is any Amazon Elastic Compute Cloud
 * (Amazon EC2) instance, edge device, or on-premises server or virtual machine (VM) that has been configured for
 * Systems Manager.
 * </p>
 * <note>
 * <p>
 * With support for IoT Greengrass core devices, the phrase <i>managed instance</i> has been changed to <i>managed
 * node</i> in most of the Systems Manager documentation. The Systems Manager console, API calls, error messages, and
 * SSM documents still use the term <i>instance</i>.
 * </p>
 * </note>
 * <p>
 * This reference is intended to be used with the <a
 * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/">Amazon Web Services Systems Manager User
 * Guide</a>.
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed nodes. For more information, see <a
 * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-setting-up.html">Setting up Amazon
 * Web Services Systems Manager</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
 * </p>
 * <p class="title">
 * <b>Related resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For information about how to use a Query API, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/making-api-requests.html">Making API requests</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For information about other API operations you can perform on EC2 instances, see the <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/">Amazon EC2 API Reference</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For information about AppConfig, a capability of Systems Manager, see the <a
 * href="https://docs.aws.amazon.com/appconfig/latest/userguide/">AppConfig User Guide</a> and the <a
 * href="https://docs.aws.amazon.com/appconfig/2019-10-09/APIReference/">AppConfig API Reference</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For information about Incident Manager, a capability of Systems Manager, see the <a
 * href="https://docs.aws.amazon.com/incident-manager/latest/userguide/">Incident Manager User Guide</a> and the <a
 * href="https://docs.aws.amazon.com/incident-manager/latest/APIReference/">Incident Manager API Reference</a>.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.simplesystemsmanagement;

