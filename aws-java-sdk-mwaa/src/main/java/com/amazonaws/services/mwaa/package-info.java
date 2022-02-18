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
 * <fullname>Amazon Managed Workflows for Apache Airflow</fullname>
 * <p>
 * This section contains the Amazon Managed Workflows for Apache Airflow (MWAA) API reference documentation. For more
 * information, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/what-is-mwaa.html">What Is Amazon
 * MWAA?</a>.
 * </p>
 * </p>
 * 
 * <pre>
 * <code> &lt;p&gt; &lt;b&gt;Endpoints&lt;/b&gt; &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;api.airflow.{region}.amazonaws.com&lt;/code&gt; - This endpoint is used for environment management.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a href=&quot;https://docs.aws.amazon.com/mwaa/latest/API/API_CreateEnvironment.html&quot;&gt;CreateEnvironment&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href=&quot;https://docs.aws.amazon.com/mwaa/latest/API/API_DeleteEnvironment.html&quot;&gt;DeleteEnvironment&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href=&quot;https://docs.aws.amazon.com/mwaa/latest/API/API_GetEnvironment.html&quot;&gt;GetEnvironment&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href=&quot;https://docs.aws.amazon.com/mwaa/latest/API/API_ListEnvironments.html&quot;&gt;ListEnvironments&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href=&quot;https://docs.aws.amazon.com/mwaa/latest/API/API_ListTagsForResource.html&quot;&gt;ListTagsForResource&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href=&quot;https://docs.aws.amazon.com/mwaa/latest/API/API_TagResource.html&quot;&gt;TagResource&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href=&quot;https://docs.aws.amazon.com/mwaa/latest/API/API_UntagResource.html&quot;&gt;UntagResource&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href=&quot;https://docs.aws.amazon.com/mwaa/latest/API/API_UpdateEnvironment.html&quot;&gt;UpdateEnvironment&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;env.airflow.{region}.amazonaws.com&lt;/code&gt; - This endpoint is used to operate the Airflow environment.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a href=&quot;https://docs.aws.amazon.com/mwaa/latest/API/API_CreateCliToken.html &quot;&gt;CreateCliToken&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href=&quot;https://docs.aws.amazon.com/mwaa/latest/API/API_CreateWebLoginToken.html&quot;&gt;CreateWebLoginToken&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;ops.airflow.{region}.amazonaws.com&lt;/code&gt; - This endpoint is used to push environment metrics that track environment health.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a href=&quot;https://docs.aws.amazon.com/mwaa/latest/API/API_PublishMetrics.html &quot;&gt;PublishMetrics&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt; &lt;b&gt;Regions&lt;/b&gt; &lt;/p&gt; &lt;p&gt;For a list of regions that Amazon MWAA supports, see &lt;a href=&quot;https://docs.aws.amazon.com/mwaa/latest/userguide/what-is-mwaa.html#regions-mwaa&quot;&gt;Region availability&lt;/a&gt; in the &lt;i&gt;Amazon MWAA User Guide&lt;/i&gt;.&lt;/p&gt; </code>
 * </pre>
 */
package com.amazonaws.services.mwaa;

