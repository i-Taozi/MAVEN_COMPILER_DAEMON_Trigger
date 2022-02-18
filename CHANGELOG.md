# __1.12.141__ __2022-01-14__
## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for CodeDeploy, EC2 and Kinesis resources

## __AWS Resource Access Manager__
  - ### Features
    - This release adds the ListPermissionVersions API which lists the versions for a given permission.

## __Amazon CloudWatch Application Insights__
  - ### Features
    - Application Insights support for Active Directory and SharePoint

## __Amazon Honeycode__
  - ### Features
    - Added read and write api support for multi-select picklist. And added errorcode field to DescribeTableDataImportJob API output, when import job fails.

## __Amazon Lookout for Metrics__
  - ### Features
    - This release adds a new DeactivateAnomalyDetector API operation.

# __1.12.140__ __2022-01-13__
## __AWS Glue__
  - ### Features
    - This SDK release adds support to pass run properties when starting a workflow run

## __Amazon ElastiCache__
  - ### Features
    - AWS ElastiCache for Redis has added a new Engine Log LogType in LogDelivery feature. You can now publish the Engine Log from your Amazon ElastiCache for Redis clusters to Amazon CloudWatch Logs and Amazon Kinesis Data Firehose.

## __Amazon Lex Runtime V2__
  - ### Features
    - This release adds support for sending hints to Amazon Lex V2 runtime APIs. Bot developers can provide runtime hints to help improve the recognition of slot values.

## __Amazon Pinpoint__
  - ### Features
    - Adds JourneyChannelSettings to WriteJourneyRequest

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager adds category support for DescribeDocument API

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio now supports validation for Launch Profiles. Launch Profiles now report static validation results after create/update to detect errors in network or active directory configuration.

# __1.12.139__ __2022-01-12__
## __AWS Performance Insights__
  - ### Features
    - This release adds three Performance Insights APIs. Use ListAvailableResourceMetrics to get available metrics, GetResourceMetadata to get feature metadata, and ListAvailableResourceDimensions to list available dimensions. The AdditionalMetrics field in DescribeDimensionKeys retrieves per-SQL metrics.

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Hpc6a instances are powered by a third-generation AMD EPYC processors (Milan) delivering all-core turbo frequency of 3.4 GHz

## __Amazon Honeycode__
  - ### Features
    - Honeycode is releasing new APIs to allow user to create, delete and list tags on resources.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for Custom vocabulary in Amazon Lex V2 APIs for model building. Customers can give Amazon Lex V2 more information about how to process audio conversations with a bot by creating a custom vocabulary in a specific language.

## __Firewall Management Service__
  - ### Features
    - Shield Advanced policies for Amazon CloudFront resources now support automatic application layer DDoS mitigation. The max length for SecurityServicePolicyData ManagedServiceData is now 8192 characters, instead of 4096.

# __1.12.138__ __2022-01-11__
## __AWS Cost Explorer Service__
  - ### Features
    - Doc only update for Cost Explorer API that fixes missing clarifications for MatchOptions definitions

## __AWS IoT Events Data__
  - ### Features
    - This release provides documentation updates for Timer.timestamp in the IoT Events API Reference Guide.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports advanced query language and query-less search.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 Capacity Reservations now supports RHEL instance platforms (RHEL with SQL Server Standard, RHEL with SQL Server Enterprise, RHEL with SQL Server Web, RHEL with HA, RHEL with HA and SQL Server Standard, RHEL with HA and SQL Server Enterprise)

## __Amazon Relational Database Service__
  - ### Features
    - This release adds the db-proxy event type to support subscribing to RDS Proxy events.

## __Amazon WorkSpaces__
  - ### Features
    - Introducing new APIs for Workspaces audio optimization with Amazon Connect: CreateConnectClientAddIn, DescribeConnectClientAddIns, UpdateConnectClientAddIn and DeleteConnectClientAddIn.

## __FinSpace Public API__
  - ### Features
    - Documentation updates for FinSpace.

# __1.12.137__ __2022-01-10__
## __AWS Compute Optimizer__
  - ### Features
    - Adds support for new Compute Optimizer capability that makes it easier for customers to optimize their EC2 instances by leveraging multiple CPU architectures.

## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds support for specifying a Bucket Owner for an S3 location.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New feature: Updated EC2 API to support faster launching for Windows images. Optimized images are pre-provisioned, using snapshots to launch instances up to 65% faster.

## __Amazon Lookout for Metrics__
  - ### Features
    - This release adds FailureType in the response of DescribeAnomalyDetector.

## __Amazon Transcribe Service__
  - ### Features
    - Documentation updates for Amazon Transcribe.

# __1.12.136__ __2022-01-07__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for selecting the Program Date Time (PDT) Clock source algorithm for HLS outputs.

# __1.12.135__ __2022-01-06__
## __AWS AppSync__
  - ### Features
    - AppSync: AWS AppSync now supports configurable batching sizes for AWS Lambda resolvers, Direct AWS Lambda resolvers and pipeline functions

## __AWS IoT Wireless__
  - ### Features
    - Downlink Queue Management feature provides APIs for customers to manage the queued messages destined to device inside AWS IoT Core for LoRaWAN. Customer can view, delete or purge the queued message(s). It allows customer to preempt the queued messages and let more urgent messages go through.

## __AWS MediaTailor__
  - ### Features
    - This release adds support for filler slate when updating MediaTailor channels that use the linear playback mode.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces On-Demand Capacity Reservation support for Cluster Placement Groups, adds Tags on instance Metadata, and includes documentation updates for Amazon EC2.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon OpenSearch Service adds support for Fine Grained Access Control for existing domains running Elasticsearch version 6.7 and above

## __Amazon OpenSearch Service__
  - ### Features
    - Amazon OpenSearch Service adds support for Fine Grained Access Control for existing domains running Elasticsearch version 6.7 and above

## __AmazonMWAA__
  - ### Features
    - This release adds a "Source" field that provides the initiator of an update, such as due to an automated patch from AWS or due to modification via Console or API.

# __1.12.134__ __2022-01-05__
## __AWS CloudTrail__
  - ### Features
    - This release adds support for CloudTrail Lake, a new feature that lets you run SQL-based queries on events that you have aggregated into event data stores. New APIs have been added for creating and managing event data stores, and creating, running, and managing queries in CloudTrail Lake.

## __AWS Glue__
  - ### Features
    - Add Delta Lake target support for Glue Crawler and 3rd Party Support for Lake Formation

## __AWS IoT__
  - ### Features
    - This release adds an automatic retry mechanism for AWS IoT Jobs. You can now define a maximum number of retries for each Job rollout, along with the criteria to trigger the retry for FAILED/TIMED_OUT/ALL(both FAILED an TIMED_OUT) job.

## __AWS Lake Formation__
  - ### Features
    - Add new APIs for 3rd Party Support for Lake Formation

## __Amazon AppStream__
  - ### Features
    - Includes APIs for App Entitlement management regarding entitlement and entitled application association.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation update for ticket fixes.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new API called ModifyVpcEndpointServicePayerResponsibility which allows VPC endpoint service owners to take payer responsibility of their VPC Endpoint connections.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now supports running applications using IPv6 address space

## __Amazon Import/Export Snowball__
  - ### Features
    - Updating validation rules for interfaces used in the Snowball API to tighten security of service.

## __Amazon QuickSight__
  - ### Features
    - Multiple Doc-only updates for Amazon QuickSight.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports running training jobs on ml.g5 instance types.

# __1.12.133__ __2022-01-04__
## __AWS S3 Control__
  - ### Features
    - Documentation updates for the renaming of Glacier to Glacier Flexible Retrieval.

## __Amazon Rekognition__
  - ### Features
    - This release introduces a new field IndexFacesModelVersion, which is the version of the face detect and storage model that was used when indexing the face vector.

## __Amazon Simple Storage Service__
  - ### Features
    - Minor doc-based updates based on feedback bugs received.

# __1.12.132__ __2022-01-03__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added strength levels to the Sharpness Filter and now permits OGG files to be specified as sidecar audio inputs.

## __AWS IoT Greengrass V2__
  - ### Features
    - This release adds the API operations to manage the Greengrass role associated with your account and to manage the core device connectivity information. Greengrass V2 customers can now depend solely on Greengrass V2 SDK for all the API operations needed to manage their fleets.

## __Amazon Detective__
  - ### Features
    - Added and updated API operations to support the Detective integration with AWS Organizations. New actions are used to manage the delegated administrator account and the integration configuration.

## __Amazon Relational Database Service__
  - ### Features
    - Multiple doc-only updates for Relational Database Service (RDS)

## __Amazon SageMaker Service__
  - ### Features
    - The release allows users to pass pipeline definitions as Amazon S3 locations and control the pipeline execution concurrency using ParallelismConfiguration. It also adds support of EMR jobs as pipeline steps.

# __1.12.131__ __2021-12-21__
## __AWS MediaConnect__
  - ### Features
    - You can now use the Fujitsu-QoS protocol for your MediaConnect sources and outputs to transport content to and from Fujitsu devices.

## __AWS Transfer Family__
  - ### Features
    - Property for Transfer Family used with the FTPS protocol. TLS Session Resumption provides a mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS session.

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK now supports updating message attributes via channel flows

## __Amazon Lookout for Metrics__
  - ### Features
    - This release adds support for Causal Relationships. Added new ListAnomalyGroupRelatedMetrics API operation and InterMetricImpactDetails API data type

## __Amazon QLDB__
  - ### Features
    - Amazon QLDB now supports journal exports in JSON and Ion Binary formats. This release adds an optional OutputFormat parameter to the ExportJournalToS3 API.

## __Amazon WorkMail__
  - ### Features
    - This release allows customers to change their email monitoring configuration in Amazon WorkMail.

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio adds support for users to upload files during a streaming session using NICE DCV native client or browser.

## __EC2 Image Builder__
  - ### Features
    - Added a note to infrastructure configuration actions and data types concerning delivery of Image Builder event messages to encrypted SNS topics. The key that's used to encrypt the SNS topic must reside in the account that Image Builder runs under.

# __1.12.130__ __2021-12-20__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports FSx Lustre Locations.

## __AWS SecurityHub__
  - ### Features
    - Added new resource details objects to ASFF, including resources for Firewall, and RuleGroup, FirewallPolicy Added additional details for AutoScalingGroup, LaunchConfiguration, and S3 buckets.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release adds an optional parameter, ObjectTypeNames to the PutIntegration API to support multiple object types per integration option. Besides, this release introduces Standard Order Objects which contain data from third party systems and each order object belongs to a specific profile.

## __Amazon DevOps Guru__
  - ### Features
    - Adds Tags support to DescribeOrganizationResourceCollectionHealth

## __Amazon Forecast Service__
  - ### Features
    - Adds ForecastDimensions field to the DescribeAutoPredictorResponse

## __Amazon Location Service__
  - ### Features
    - Making PricingPlan optional as part of create resource API.

## __Amazon Redshift__
  - ### Features
    - This release adds API support for managed Redshift datashares. Customers can now interact with a Redshift datashare that is managed by a different service, such as AWS Data Exchange.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds a new ContentType field in AutoMLChannel for SageMaker CreateAutoMLJob InputDataConfig.

## __EC2 Image Builder__
  - ### Features
    - This release adds support for importing and exporting VM Images as part of the Image Creation workflow via EC2 VM Import/Export.

## __FinSpace Public API__
  - ### Features
    - Make dataset description optional and allow s3 export for dataviews

# __1.12.129__ __2021-12-13__
## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

# __1.12.128__ __2021-12-09__
## __AWS Network Firewall__
  - ### Features
    - This release adds support for managed rule groups.

## __AWS Route53 Recovery Control Config__
  - ### Features
    - This release adds tagging supports to Route53 Recovery Control Configuration. New APIs: TagResource, UntagResource and ListTagsForResource. Updates: add optional field `tags` to support tagging while calling CreateCluster, CreateControlPanel and CreateSafetyRule.

## __AWS Savings Plans__
  - ### Features
    - Adds the ability to specify Savings Plans hourly commitments using five digits after the decimal point.

## __AWS Server Migration Service__
  - ### Features
    - This release adds SMS discontinuation information to the API and CLI references.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds waiters support for internet gateways.

## __Amazon Lex Model Building V2__
  - ### Features
    - Added support for grammar slot type in Amazon Lex. You can author your own grammar in the XML format per the SRGS specification to collect information in a conversation.

## __Amazon Route 53 Domains__
  - ### Features
    - Amazon Route 53 domain registration APIs now support filtering and sorting in the ListDomains API, deleting a domain by using the DeleteDomain API and getting domain pricing information by using the ListPrices API.

# __1.12.127__ __2021-12-08__
## __AWS Comprehend Medical__
  - ### Features
    - This release adds a new set of APIs (synchronous and batch) to support the SNOMED-CT ontology.

## __AWS Health APIs and Notifications__
  - ### Features
    - Documentation updates for AWS Health

## __AWS IoT__
  - ### Features
    - This release allows customer to enable caching of custom authorizer on HTTP protocol for clients that use persistent or Keep-Alive connection in order to reduce the number of Lambda invocations.

## __AWS Outposts__
  - ### Features
    - This release adds the UpdateOutpost API.

## __AWS Support__
  - ### Features
    - Documentation updates for AWS Support.

## __Amazon CloudWatch Logs__
  - ### Features
    - This release adds AWS Organizations support as condition key in destination policy for cross account Subscriptions in CloudWatch Logs.

## __Amazon Lookout for Vision__
  - ### Features
    - This release adds new APIs for packaging an Amazon Lookout for Vision model as an AWS IoT Greengrass component.

## __Amazon SageMaker Service__
  - ### Features
    - This release added a new Ambarella device(amba_cv2) compilation support for Sagemaker Neo.

# __1.12.126__ __2021-12-06__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports custom domain names, allowing you to associate a domain name that you own with an AppSync API in your account.

## __Amazon Location Service__
  - ### Features
    - This release adds support for Accuracy position filtering, position metadata and autocomplete for addresses and points of interest based on partial or misspelled free-form text.

## __Amazon Route 53__
  - ### Features
    - Add PriorRequestNotComplete exception to UpdateHostedZoneComment API

# __1.12.125__ __2021-12-03__
## __Amazon Rekognition__
  - ### Features
    - This release added new KnownGender types for Celebrity Recognition.

# __1.12.124__ __2021-12-02__
## __AWS Amplify UI Builder__
  - ### Features
    - This release introduces the actions and data types for the new Amplify UI Builder API. The Amplify UI Builder API provides a programmatic interface for creating and configuring user interface (UI) component libraries and themes for use in Amplify applications.

## __AWS Network Manager__
  - ### Features
    - This release adds API support for AWS Cloud WAN.

## __AWS Resource Access Manager__
  - ### Features
    - This release adds the ability to use the new ResourceRegionScope parameter on List operations that return lists of resources or resource types. This new parameter filters the results by letting you differentiate between global or regional resource types.

# __1.12.123__ __2021-12-01__
## __AWS Direct Connect__
  - ### Features
    - Adds SiteLink support to private and transit virtual interfaces. SiteLink is a new Direct Connect feature that allows routing between Direct Connect points of presence.

## __AWS Shield__
  - ### Features
    - This release adds API support for Automatic Application Layer DDoS Mitigation for AWS Shield Advanced. Customers can now enable automatic DDoS mitigation in count or block mode for layer 7 protected resources.

## __AWSKendraFrontendService__
  - ### Features
    - Experience Builder allows customers to build search applications without writing code. Analytics Dashboard provides quality and usability metrics for Kendra indexes. Custom Document Enrichment allows customers to build a custom ingestion pipeline to pre-process documents and generate metadata.

## __Amazon DevOps Guru__
  - ### Features
    - DevOps Guru now provides detailed, database-specific analyses of performance issues and recommends corrective actions for Amazon Aurora database instances with Performance Insights turned on. You can also use AWS tags to choose which resources to analyze and define your applications.

## __Amazon DynamoDB__
  - ### Features
    - Add support for Table Classes and introduce the Standard Infrequent Access table class.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Amazon VPC IP Address Manager (IPAM), which enables you to plan, track, and monitor IP addresses for your workloads. This release also adds support for VPC Network Access Analyzer, which enables you to analyze network access to resources in your Virtual Private Clouds.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release introduces a new feature, Automated Chatbot Designer, that helps customers automatically create a bot design from existing conversation transcripts. The feature uses machine learning to discover most common intents and the information needed to fulfill them.

## __Amazon SageMaker Runtime__
  - ### Features
    - Adding new exception types for InvokeEndpoint

## __Amazon SageMaker Service__
  - ### Features
    - This release enables - 1/ Inference endpoint configuration recommendations and ability to run custom load tests to meet performance needs. 2/ Deploy serverless inference endpoints. 3/ Query, filter and retrieve end-to-end ML lineage graph, and incorporate model quality/bias detection in ML workflow.

# __1.12.122__ __2021-11-30__
## __AWS Backup Gateway__
  - ### Features
    - Initial release of AWS Backup gateway which enables you to centralize and automate protection of on-premises VMware and VMware Cloud on AWS workloads using AWS Backup.

## __AWS Glue__
  - ### Features
    - Support for DataLake transactions

## __AWS IoT__
  - ### Features
    - Added the ability to enable/disable IoT Fleet Indexing for Device Defender and Named Shadow information, and search them through IoT Fleet Indexing APIs.

## __AWS IoT TwinMaker__
  - ### Features
    - AWS IoT TwinMaker makes it faster and easier to create, visualize and monitor digital twins of real-world systems like buildings, factories and industrial equipment to optimize operations. Learn more: https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/Welcome.html (New Service) (Preview)

## __AWS Lake Formation__
  - ### Features
    - This release adds support for row and cell-based access control in Lake Formation. It also adds support for Lake Formation Governed Tables, which support ACID transactions and automatic storage optimizations.

## __AWS Outposts__
  - ### Features
    - This release adds the SupportedHardwareType parameter to CreateOutpost.

## __AWS Storage Gateway__
  - ### Features
    - Added gateway type VTL_SNOW. Added new SNOWBALL HostEnvironment for gateways running on a Snowball device. Added new field HostEnvironmentId to serve as an identifier for the HostEnvironment on which the gateway is running.

## __Access Analyzer__
  - ### Features
    - AWS IAM Access Analyzer now supports policy validation for resource policies attached to S3 buckets and access points. You can run additional policy checks by specifying the S3 resource type you want to attach to your resource policy.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Is4gen and Im4gn instances. This release also adds a new subnet attribute, enableLniAtDeviceIndex, to support local network interfaces, which are logical networking components that connect an EC2 instance to your on-premises network.

## __Amazon FSx__
  - ### Features
    - This release adds support for the FSx for OpenZFS file system type, FSx for Lustre file systems with the Persistent_2 deployment type, and FSx for Lustre file systems with Amazon S3 data repository associations and automatic export policies.

## __Amazon Import/Export Snowball__
  - ### Features
    - Tapeball is to integrate tape gateway onto snowball, it enables customer to transfer local data on the tape to snowball,and then ingest the data into tape gateway on the cloud.

## __Amazon Kinesis__
  - ### Features
    - Amazon Kinesis Data Streams now supports on demand streams.

## __Amazon Simple Storage Service__
  - ### Features
    - Introduce Amazon S3 Glacier Instant Retrieval storage class and a new setting in S3 Object Ownership to disable ACLs for bucket and the objects in it.

## __Amazon WorkSpaces Web__
  - ### Features
    - This is the initial SDK release for Amazon WorkSpaces Web. Amazon WorkSpaces Web is a low-cost, fully managed WorkSpace built to deliver secure web-based workloads and software-as-a-service (SaaS) application access to users within existing web browsers.

## __Managed Streaming for Kafka__
  - ### Features
    - This release adds three new V2 APIs. CreateClusterV2 for creating both provisioned and serverless clusters. DescribeClusterV2 for getting information about provisioned and serverless clusters and ListClustersV2 for listing all clusters (both provisioned and serverless) in your account.

## __Redshift Data API Service__
  - ### Features
    - Data API now supports serverless queries.

# __1.12.121__ __2021-11-29__
## __AWS Compute Optimizer__
  - ### Features
    - Adds support for the enhanced infrastructure metrics paid feature. Also adds support for two new sets of resource efficiency metrics, including savings opportunity metrics and performance improvement opportunity metrics.

## __AWS Data Exchange__
  - ### Features
    - This release enables providers and subscribers to use Data Set, Job, and Asset operations to work with API assets from Amazon API Gateway. In addition, this release enables subscribers to use the SendApiAsset operation to invoke a provider's Amazon API Gateway API that they are entitled to.

## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise now supports retention configuration for the hot tier storage.

## __AWS Well-Architected Tool__
  - ### Features
    - This update provides support for Well-Architected API users to use custom lens features.

## __Amazon CloudWatch Evidently__
  - ### Features
    - Introducing Amazon CloudWatch Evidently. This is the first public release of Amazon CloudWatch Evidently.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds supports for pull through cache rules and enhanced scanning.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for G5g and M6a instances. This release also adds support for Amazon EBS Snapshots Archive, a feature that enables you to archive your EBS snapshots; and Recycle Bin, a feature that enables you to protect your EBS snapshots against accidental deletion.

## __Amazon Recycle Bin__
  - ### Features
    - This release adds support for Recycle Bin.

## __Amazon Simple Storage Service__
  - ### Features
    - Amazon S3 Event Notifications adds Amazon EventBridge as a destination and supports additional event types. The PutBucketNotificationConfiguration API can now skip validation of Amazon SQS, Amazon SNS and AWS Lambda destinations.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added two new attributes to DescribeInstanceInformation called SourceId and SourceType along with new string filters SourceIds and SourceTypes to filter instance records.

## __CloudWatch RUM__
  - ### Features
    - This is the first public release of CloudWatch RUM

## __Inspector2__
  - ### Features
    - This release adds support for the new Amazon Inspector API. The new Amazon Inspector can automatically discover and scan Amazon EC2 instances and Amazon ECR container images for software vulnerabilities and unintended network exposure, and report centralized findings across multiple AWS accounts.

# __1.12.120__ __2021-11-29__
## __AWS Migration Hub Refactor Spaces__
  - ### Features
    - This is the initial SDK release for AWS Migration Hub Refactor Spaces

## __Amazon Personalize__
  - ### Features
    - This release adds API support for Recommenders and BatchSegmentJobs.

## __Amazon Personalize Runtime__
  - ### Features
    - This release adds inference support for Recommenders.

## __Amazon Textract__
  - ### Features
    - This release adds support for synchronously analyzing identity documents through a new API: AnalyzeID

# __1.12.119__ __2021-11-26__
## __AWS IoT Core Device Advisor__
  - ### Features
    - Documentation update for Device Advisor GetEndpoint API

## __AWS Outposts__
  - ### Features
    - This release adds new APIs for working with Outpost sites and orders.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2.

## __Amazon Pinpoint__
  - ### Features
    - Added a One-Time Password (OTP) management feature. You can use the Amazon Pinpoint API to generate OTP codes and send them to your users as SMS messages. Your apps can then call the API to verify the OTP codes that your users input

## __Application Migration Service__
  - ### Features
    - Application Migration Service now supports an additional replication method that does not require agent installation on each source server. This option is available for source servers running on VMware vCenter versions 6.7 and 7.0.

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling.

# __1.12.118__ __2021-11-24__
## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise now accepts data streams that aren't associated with any asset properties. You can organize data by updating data stream associations.

## __AWS Lambda__
  - ### Features
    - Remove Lambda function url apis

## __AWS Proton__
  - ### Features
    - This release adds APIs for getting the outputs and provisioned stacks for Environments, Pipelines, and ServiceInstances.  You can now add tags to EnvironmentAccountConnections.  It also adds APIs for working with PR-based provisioning.  Also, it adds APIs for syncing templates with a git repository.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces a new auto-merging feature for profile matching. The auto-merging configurations can be set via CreateDomain API or UpdateDomain API. You can use GetIdentityResolutionJob API and ListIdentityResolutionJobs API to fetch job status.

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

## __Amazon Timestream Query__
  - ### Features
    - Releasing Amazon Timestream Scheduled Queries. It makes real-time analytics more performant and cost-effective for customers by calculating and storing frequently accessed aggregates, and other computations, typically used in operational dashboards, business reports, and other analytics applications

## __Amazon Timestream Write__
  - ### Features
    - This release adds support for multi-measure records and magnetic store writes. Multi-measure records allow customers to store multiple measures in a single table row. Magnetic store writes enable customers to write late arrival data (data with timestamp in the past) directly into the magnetic store.

## __Amazon Translate__
  - ### Features
    - This release enables customers to use translation settings to mask profane words and phrases in their translation output.

## __Auto Scaling__
  - ### Features
    - Customers can now configure predictive scaling policies to proactively scale EC2 Auto Scaling groups based on any CloudWatch metrics that more accurately represent the load on the group than the four predefined metrics. They can also use math expressions to further customize the metrics.

## __EC2 Image Builder__
  - ### Features
    - This release adds support for sharing AMIs with Organizations within an EC2 Image Builder Distribution Configuration.

# __1.12.117__ __2021-11-23__
## __AWS Backup__
  - ### Features
    - This release adds new opt-in settings for advanced features for DynamoDB backups

## __AWS IoT__
  - ### Features
    - This release introduces a new feature, Managed Job Template, for AWS IoT Jobs Service. Customers can now use service provided managed job templates to easily create jobs for supported standard job actions.

## __AWS IoT Core Device Advisor__
  - ### Features
    - This release introduces a new feature for Device Advisor: ability to execute multiple test suites in parallel for given customer account. You can use GetEndpoint API to get the device-level test endpoint and call StartSuiteRun with "parallelRun=true" to run suites in parallel.

## __AWS IoT Wireless__
  - ### Features
    - Two new APIs, GetNetworkAnalyzerConfiguration and UpdateNetworkAnalyzerConfiguration, are added for the newly released Network Analyzer feature which enables customers to view real-time frame information and logs from LoRaWAN devices and gateways.

## __AWS Lambda__
  - ### Features
    - Release Lambda event source filtering for SQS, Kinesis Streams, and DynamoDB Streams.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for AWS Security Token Service.

## __Amazon DynamoDB__
  - ### Features
    - DynamoDB PartiQL now supports ReturnConsumedCapacity, which returns capacity units consumed by PartiQL APIs if the request specified returnConsumedCapacity parameter. PartiQL APIs include ExecuteStatement, BatchExecuteStatement, and ExecuteTransaction.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation update for ARM support on Amazon ECS.

## __Amazon ElastiCache__
  - ### Features
    - Adding support for r6gd instances for Redis with data tiering. In a cluster with data tiering enabled, when available memory capacity is exhausted, the least recently used data is automatically tiered to solid state drives for cost-effective capacity scaling with minimal performance impact.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new parameter ipv6Native to the allow creation of IPv6-only subnets using the CreateSubnet operation, and the operation ModifySubnetAttribute includes new parameters to modify subnet attributes to use resource-based naming and enable DNS resolutions for Private DNS name.

## __Amazon Macie 2__
  - ### Features
    - Documentation updates for Amazon Macie

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds an optional parameter dry-run for the UpdateDomainConfig API to perform basic validation checks, and detect the deployment type that will be required for the configuration change, without actually applying the change.

## __Amazon Redshift__
  - ### Features
    - This release adds support for reserved node exchange with restore/resize

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for Multi-AZ DB clusters for RDS for MySQL and RDS for PostgreSQL.

## __Amazon Simple Queue Service__
  - ### Features
    - Amazon SQS adds a new queue attribute, SqsManagedSseEnabled, which enables server-side queue encryption using SQS owned encryption keys.

## __Amazon Simple Storage Service__
  - ### Features
    - Introduce two new Filters to S3 Lifecycle configurations - ObjectSizeGreaterThan and ObjectSizeLessThan. Introduce a new way to trigger actions on noncurrent versions by providing the number of newer noncurrent versions along with noncurrent days.

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for Amazon WorkSpaces

## __Elastic Load Balancing__
  - ### Features
    - This release allows you to create internal Application and Network Load Balancers in dualstack mode. This release also adds an attribute to block internet gateway (IGW) access to the load balancer, preventing unintended access to your internal load balancers through an internet gateway.

## __FinSpace Public API__
  - ### Features
    - Update documentation for createChangeset API.

# __1.12.116__ __2021-11-22__
## __AWS CloudFormation__
  - ### Features
    - This release include SDK changes for the feature launch of Stack Import to Service Managed StackSet.

## __AWS Database Migration Service__
  - ### Features
    - Added new S3 endpoint settings to allow to convert the current UTC time into a specified time zone when a date partition folder is created. Using with 'DatePartitionedEnabled'.

## __AWS S3 Control__
  - ### Features
    - Added Amazon CloudWatch publishing option for S3 Storage Lens metrics.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Added new APIs for enabling Echo Reduction with Voice Focus.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for UpdateContactFlowMetadata, DeleteContactFlow and module APIs. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding missing exceptions to RegisterCluster operation

## __Amazon Elasticsearch Service__
  - ### Features
    - This release adds an optional parameter dry-run for the UpdateElasticsearchDomainConfig API to perform basic validation checks, and detect the deployment type that will be required for the configuration change, without actually applying the change.

## __Amazon QuickSight__
  - ### Features
    - Add support for Exasol data source, 1 click enterprise embedding and email customization.

## __Amazon Relational Database Service__
  - ### Features
    - Adds local backup support to Amazon RDS on AWS Outposts.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds new parameter to CreateActivation API . This parameter is for "internal use only".

## __Amazon Transcribe Streaming Service__
  - ### Features
    - This release adds language identification support for streaming transcription.

## __Braket__
  - ### Features
    - This release adds support for Amazon Braket Hybrid Jobs.

## __FinSpace Public API__
  - ### Features
    - Add new APIs for managing Datasets, Changesets, and Dataviews.

# __1.12.115__ __2021-11-19__
## __AWS Batch__
  - ### Features
    - Documentation updates for AWS Batch.

## __AWS CloudFormation__
  - ### Features
    - The StackSets ManagedExecution feature will allow concurrency for non-conflicting StackSet operations and queuing the StackSet operations that conflict at a given time for later execution.

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for specifying a SCTE-35 PID on input. MediaLive now supports SCTE-35 PID selection on inputs containing one or more active SCTE-35 PIDs.

## __AWS Lambda__
  - ### Features
    - Add support for Lambda Function URLs. Customers can use Function URLs to create built-in HTTPS endpoints on their functions.

## __Amazon AppStream__
  - ### Features
    - Includes APIs for managing resources for Elastic fleets: applications, app blocks, and application-fleet associations.

## __Amazon CloudWatch Application Insights__
  - ### Features
    - Application Insights now supports monitoring for HANA

## __Amazon Lex Runtime V2__
  - ### Features
    - Now supports styled slots in Lex V2 runtime. Customers can provide inputs like "a as in apple b for beta" which will be resolved to "ab" as slot value.

## __Amazon Redshift__
  - ### Features
    - Added support of default IAM role for CreateCluster, RestoreFromClusterSnapshot and ModifyClusterIamRoles APIs

# __1.12.114__ __2021-11-18__
## __AWS Audit Manager__
  - ### Features
    - This release introduces a new feature for Audit Manager: Dashboard views. You can now view insights data for your active assessments, and quickly identify non-compliant evidence that needs to be remediated.

## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds the following new features: 1) PII detection in profile jobs, 2) Data quality rules, enabling validation of data quality in profile jobs, 3) SQL query-based datasets for Amazon Redshift and Snowflake data sources, and 4) Connecting DataBrew datasets with Amazon AppFlow flows.

## __AWS Lambda__
  - ### Features
    - Added support for CLIENT_CERTIFICATE_TLS_AUTH and SERVER_ROOT_CA_CERTIFICATE as SourceAccessType for MSK and Kafka event source mappings.

## __Amazon AppConfig__
  - ### Features
    - Add Type to support feature flag configuration profiles

## __Amazon Chime__
  - ### Features
    - Adds new Transcribe API parameters to StartMeetingTranscription, including support for content identification and redaction (PII & PHI), partial results stabilization, and custom language models.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Adds new Transcribe API parameters to StartMeetingTranscription, including support for content identification and redaction (PII & PHI), partial results stabilization, and custom language models.

## __Amazon CloudWatch__
  - ### Features
    - CloudWatch Anomaly Detection now supports anomaly detectors that use metric math as input.

## __Amazon Forecast Service__
  - ### Features
    - NEW CreateExplanability API that helps you understand how attributes such as price, promotion, etc. contributes to your forecasted values; NEW CreateAutoPredictor API that trains up to 40% more accurate forecasting model, saves up to 50% of retraining time, and provides model level explainability.

## __Amazon Interactive Video Service__
  - ### Features
    - Add APIs for retrieving stream session information and support for filtering live streams by health.  For more information, see https://docs.aws.amazon.com/ivs/latest/userguide/stream-health.html

## __Amazon Lex Model Building V2__
  - ### Features
    - Added support for Polly Neural TTS (NTTS) voices. Customers can choose between 'standard' and 'neural' for Polly Engine configuration per locale when creating or updating an Amazon Lex bot.

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added a new API that allows you to update the connectivity settings for an existing cluster to enable public accessibility.

## __Redshift Data API Service__
  - ### Features
    - Rolling back Data API serverless features until dependencies are live.

# __1.12.113__ __2021-11-17__
## __AWS AppConfig Data__
  - ### Features
    - AWS AppConfig Data is a new service that allows you to retrieve configuration deployed by AWS AppConfig. See the AppConfig user guide for more details on getting started. https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway.

## __Amazon DevOps Guru__
  - ### Features
    - Add paginator for DescribeResourceCollectionHealth

## __Amazon Simple Notification Service__
  - ### Features
    - Amazon SNS introduces the PublishBatch API, which enables customers to publish up to 10 messages per API request. The new API is valid for Standard and FIFO topics.

## __AmplifyBackend__
  - ### Features
    - New APIs to support the Amplify Storage category. Add and manage file storage in your Amplify app backend.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Introducing AWS Elastic Disaster Recovery (AWS DRS), a new service that minimizes downtime and data loss with fast, reliable recovery of on-premises and cloud-based applications using affordable storage, minimal compute, and point-in-time recovery.

## __Redshift Data API Service__
  - ### Features
    - Data API now supports serverless requests.

# __1.12.112__ __2021-11-16__
## __AWS CloudTrail__
  - ### Features
    - CloudTrail Insights now supports ApiErrorRateInsight, which enables customers to identify unusual activity in their AWS account based on API error codes and their rate.

## __Amazon Location Service__
  - ### Features
    - This release adds the support for Relevance, Distance, Time Zone, Language and Interpolated Address for Geocoding and Reverse Geocoding.

# __1.12.111__ __2021-11-15__
## __AWS Database Migration Service__
  - ### Features
    - Add Settings in JSON format for the source GCP MySQL endpoint

## __AWS SDK for Java__
  - ### Bugfixes
    - "Update the REST-JSON marshalling logic to conform to the standard expected behavior with respect to the `Content-Type` of the request."

## __AWS Transfer Family__
  - ### Features
    - AWS Transfer Family now supports integrating a custom identity provider using AWS Lambda

## __AWS WAFV2__
  - ### Features
    - Your options for logging web ACL traffic now include Amazon CloudWatch Logs log groups and Amazon S3 buckets.

## __Amazon AppStream__
  - ### Features
    - This release includes support for images of AmazonLinux2 platform type.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds a new VPC Subnet attribute "EnableDns64." When enabled on IPv6 Subnets, the Amazon-Provided DNS Resolver returns synthetic IPv6 addresses for IPv4-only destinations.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding Tags support to Cluster Registrations.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds support for Session Reason and Max Session Duration for Systems Manager Session Manager.

## __Migration Hub Strategy Recommendations__
  - ### Features
    - AWS SDK for Migration Hub Strategy Recommendations. It includes APIs to start the portfolio assessment, import portfolio data for assessment, and to retrieve recommendations. For more information, see the AWS Migration Hub documentation at https://docs.aws.amazon.com/migrationhub/index.html

# __1.12.110__ __2021-11-12__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added automatic modes for GOP configuration and added the ability to ingest screen recordings generated by Safari on MacOS 12 Monterey.

## __Amazon Connect Service__
  - ### Features
    - This release adds APIs for creating and managing scheduled tasks. Additionally, adds APIs to describe and update a contact and list associated references.

## __Amazon DevOps Guru__
  - ### Features
    - Add support for cross account APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - C6i instances are powered by a third-generation Intel Xeon Scalable processor (Ice Lake) delivering all-core turbo frequency of 3.5 GHz. G5 instances feature up to 8 NVIDIA A10G Tensor Core GPUs and second generation AMD EPYC processors.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release supports creating Patch Baselines for RaspberryPi OS (formerly Raspbian)

# __1.12.109__ __2021-11-11__
## __Amazon DynamoDB__
  - ### Features
    - Updated Help section for "dynamodb update-contributor-insights" API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release provides an additional route target for the VPC route table.

## __Amazon Translate__
  - ### Features
    - This release enables customers to import Multi-Directional Custom Terminology and use Multi-Directional Custom Terminology in both real-time translation and asynchronous batch translation.

# __1.12.108__ __2021-11-10__
## __AWS Backup__
  - ### Features
    - AWS Backup SDK provides new options when scheduling backups: select supported services and resources that are assigned to a particular tag, linked to a combination of tags, or can be identified by a partial tag value, and exclude resources from their assignments.

## __AWS Resilience Hub__
  - ### Features
    - Initial release of AWS Resilience Hub, a managed service that enables you to define, validate, and track the resilience of your applications on AWS

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for container instance health.

# __1.12.107__ __2021-11-09__
## __AWS Batch__
  - ### Features
    - Adds support for scheduling policy APIs.

## __AWS Health APIs and Notifications__
  - ### Features
    - Documentation updates for AWS Health.

## __AWS IoT Greengrass V2__
  - ### Features
    - This release adds support for Greengrass core devices running Windows. You can now specify name of a Windows user to run a component.

# __1.12.106__ __2021-11-08__
## __AWS WAFV2__
  - ### Features
    - You can now configure rules to run a CAPTCHA check against web requests and, as needed, send a CAPTCHA challenge to the client.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Updated format validation for ids and regions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds internal validation on the GatewayAssociationState field

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker CreateEndpoint and UpdateEndpoint APIs now support additional deployment configuration to manage traffic shifting options and automatic rollback monitoring. DescribeEndpoint now shows new in-progress deployment details with stage status.

# __1.12.105__ __2021-11-05__
## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates and improvements.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - DescribeInstances now returns customer-owned IP addresses for instances running on an AWS Outpost.

## __Amazon Translate__
  - ### Features
    - This release enable customers to use their own KMS keys to encrypt output files when they submit a batch transform job.

# __1.12.104__ __2021-11-04__
## __AWS IoT Wireless__
  - ### Features
    - Adding APIs for the FUOTA (firmware update over the air) and multicast for LoRaWAN devices and APIs to support event notification opt-in feature for Sidewalk related events. A few existing APIs need to be modified for this new feature.

## __Amazon Chime SDK Meetings__
  - ### Features
    - The Amazon Chime SDK Meetings APIs allow software developers to create meetings and attendees for interactive audio, video, screen and content sharing in custom meeting applications which use the Amazon Chime SDK.

## __Amazon Connect Service__
  - ### Features
    - This release adds CRUD operation support for Security profile resource in Amazon Connect

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new instance replacement strategy for EC2 Fleet, Spot Fleet. Now you can select an action to perform when your instance gets a rebalance notification. EC2 Fleet, Spot Fleet can launch a replacement then terminate the instance that received notification after a termination delay

## __Amazon SageMaker Service__
  - ### Features
    - ListDevices and DescribeDevice now show Edge Manager agent version.

# __1.12.103__ __2021-11-04__
## __AWS IoT Wireless__
  - ### Features
    - Adding APIs for the FUOTA (firmware update over the air) and multicast for LoRaWAN devices and APIs to support event notification opt-in feature for Sidewalk related events. A few existing APIs need to be modified for this new feature.

## __Amazon Chime SDK Meetings__
  - ### Features
    - The Amazon Chime SDK Meetings APIs allow software developers to create meetings and attendees for interactive audio, video, screen and content sharing in custom meeting applications which use the Amazon Chime SDK.

## __Amazon Connect Service__
  - ### Features
    - This release adds CRUD operation support for Security profile resource in Amazon Connect

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new instance replacement strategy for EC2 Fleet, Spot Fleet. Now you can select an action to perform when your instance gets a rebalance notification. EC2 Fleet, Spot Fleet can launch a replacement then terminate the instance that received notification after a termination delay

## __Amazon SageMaker Service__
  - ### Features
    - ListDevices and DescribeDevice now show Edge Manager agent version.

# __1.12.102__ __2021-11-03__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports Hadoop Distributed File System (HDFS) Locations

## __Amazon Connect Participant Service__
  - ### Features
    - This release adds a new boolean attribute - Connect Participant - to the CreateParticipantConnection API, which can be used to mark the participant as connected.

## __Amazon Macie 2__
  - ### Features
    - This release adds support for specifying the severity of findings that a custom data identifier produces, based on the number of occurrences of text that matches the detection criteria.

## __FinSpace User Environment Management service__
  - ### Features
    - Adds superuser and data-bundle parameters to CreateEnvironment API

# __1.12.101__ __2021-11-02__
## __Amazon CloudFront__
  - ### Features
    - CloudFront now supports response headers policies to add HTTP headers to the responses that CloudFront sends to viewers. You can use these policies to add CORS headers, control browser caching, and more, without modifying your origin or writing any code.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Chat now supports real-time message streaming.

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio adds support for users to stop and start streaming sessions.

# __1.12.100__ __2021-11-01__
## __AWS Network Manager__
  - ### Features
    - This release adds API support to aggregate resources, routes, and telemetry data across a Global Network.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to enable access logging for buckets in the Lightsail object storage service.

## __Amazon Neptune__
  - ### Features
    - Adds support for major version upgrades to ModifyDbCluster API

## __Amazon Rekognition__
  - ### Features
    - This Amazon Rekognition Custom Labels release introduces the management of datasets with  projects

# __1.12.99__ __2021-10-29__
## __Amazon CloudWatch Application Insights__
  - ### Features
    - Added Monitoring support for SQL Server Failover Cluster Instance. Additionally, added a new API to allow one-click monitoring of containers resources.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Chat now supports real-time message streaming.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support added for AMI sharing with organizations and organizational units in ModifyImageAttribute API

## __Amazon Rekognition__
  - ### Features
    - This release added new attributes to Rekognition Video GetCelebrityRecognition API operations.

## __Amazon Transcribe Service__
  - ### Features
    - Transcribe and Transcribe Call Analytics now support automatic language identification along with custom vocabulary, vocabulary filter, custom language model and PII redaction.

# __1.12.98__ __2021-10-28__
## __AWS Systems Manager Incident Manager__
  - ### Features
    - Updating documentation, adding new field to ConflictException to indicate earliest retry timestamp for some operations, increase maximum length of nextToken fields

## __Amazon Connect Participant Service__
  - ### Features
    - This release adds a new boolean attribute - Connect Participant - to the CreateParticipantConnection API, which can be used to mark the participant as connected.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS now supports running Fargate tasks on Windows Operating Systems Families which includes Windows Server 2019 Core and Windows Server 2019 Full.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added new read-only DenyAllIGWTraffic network interface attribute. Added support for DL1 24xlarge instances powered by Habana Gaudi Accelerators for deep learning model training workloads

## __Amazon GameLift__
  - ### Features
    - Added support for Arm-based AWS Graviton2 instances, such as M6g, C6g, and R6g.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for RStudio on SageMaker.

# __1.12.97__ __2021-10-27__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds: attribute-based instance type selection for EC2 Fleet, Spot Fleet, a feature that lets customers express instance requirements as attributes like vCPU, memory, and storage; and Spot placement score, a feature that helps customers identify an optimal location to run Spot workloads.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - EKS managed node groups now support BOTTLEROCKET_x86_64 and BOTTLEROCKET_ARM_64 AMI types.

## __Amazon SageMaker Service__
  - ### Features
    - This release allows customers to describe one or more versioned model packages through BatchDescribeModelPackage, update project via UpdateProject, modify and read customer metadata properties using Create, Update and Describe ModelPackage and enables cross account registration of model packages.

## __Amazon Textract__
  - ### Features
    - This release adds support for asynchronously analyzing invoice and receipt documents through two new APIs: StartExpenseAnalysis and GetExpenseAnalysis

## __Auto Scaling__
  - ### Features
    - This release adds support for attribute-based instance type selection, a new EC2 Auto Scaling feature that lets customers express their instance requirements as a set of attributes, such as vCPU, memory, and storage.

# __1.12.96__ __2021-10-26__
## __Amazon Chime SDK Identity__
  - ### Features
    - The Amazon Chime SDK now supports push notifications through Amazon Pinpoint

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK now supports push notifications through Amazon Pinpoint

## __Amazon EMR Containers__
  - ### Features
    - This feature enables auto-generation of certificate  to secure the managed-endpoint and removes the need for customer provided certificate-arn during managed-endpoint setup.

# __1.12.95__ __2021-10-25__
## __AWS Audit Manager__
  - ### Features
    - This release introduces a new feature for Audit Manager: Custom framework sharing. You can now share your custom frameworks with another AWS account, or replicate them into another AWS Region under your own account.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support to create a VPN Connection that is not attached to a Gateway at the time of creation. Use this to create VPNs associated with Core Networks, or modify your VPN and attach a gateway using the modify API after creation.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Amazon RDS Custom, which is a new RDS management type that gives you full access to your database and operating system. For more information, see https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-custom.html

## __Amazon Route 53 Resolver__
  - ### Features
    - New API for ResolverConfig, which allows autodefined rules for reverse DNS resolution to be disabled for a VPC

# __1.12.94__ __2021-10-22__
## __AWS Audit Manager__
  - ### Features
    - This release introduces character restrictions for ControlSet names. We updated regex patterns for the following attributes: ControlSet, CreateAssessmentFrameworkControlSet, and UpdateAssessmentFrameworkControlSet.

## __Amazon Chime__
  - ### Features
    - Chime VoiceConnector and VoiceConnectorGroup APIs will now return an ARN.

## __Amazon QuickSight__
  - ### Features
    - Added QSearchBar option for GenerateEmbedUrlForRegisteredUser ExperienceConfiguration to support Q search bar embedding

# __1.12.93__ __2021-10-21__
## __Amazon Connect Service__
  - ### Features
    - Released Amazon Connect hours of operation API for general availability (GA). This API also supports AWS CloudFormation. For more information, see Amazon Connect Resource Type Reference in the AWS CloudFormation User Guide.

# __1.12.92__ __2021-10-20__
## __AWS Direct Connect__
  - ### Features
    - This release adds 4 new APIS, which needs to be public able

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for specifying caption time delta in milliseconds and the ability to apply color range legalization to source content other than AVC video.

## __AWS Elemental MediaPackage__
  - ### Features
    - When enabled, MediaPackage passes through digital video broadcasting (DVB) subtitles into the output.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - MediaPackage passes through digital video broadcasting (DVB) subtitles into the output.

## __AWS Panorama__
  - ### Features
    - General availability for AWS Panorama. AWS SDK for Panorama includes APIs to manage your devices and nodes, and deploy computer vision applications to the edge. For more information, see the AWS Panorama documentation at http://docs.aws.amazon.com/panorama

## __AWS SecurityHub__
  - ### Features
    - Added support for cross-Region finding aggregation, which replicates findings from linked Regions to a single aggregation Region. Added operations to view, enable, update, and delete the finding aggregation.

## __Amazon Appflow__
  - ### Features
    - Feature to add support for  JSON-L format for S3 as a source.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - This release adds custom language support for streaming transcription.

# __1.12.91__ __2021-10-19__
## __AWS Data Exchange__
  - ### Features
    - This release adds support for our public preview of AWS Data Exchange for Amazon Redshift. This enables data providers to list products including AWS Data Exchange datashares for Amazon Redshift, giving subscribers read-only access to provider data in Amazon Redshift.

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK now allows developers to execute business logic on in-flight messages before they are delivered to members of a messaging channel with channel flows.

# __1.12.90__ __2021-10-18__
## __Amazon Interactive Video Service__
  - ### Features
    - Bug fix: remove unsupported maxResults and nextToken pagination parameters from ListTagsForResource

## __Amazon QuickSight__
  - ### Features
    - AWS QuickSight Service  Features    - Add IP Restriction UI and public APIs support.

# __1.12.89__ __2021-10-15__
## __AWS Glue__
  - ### Features
    - Enable S3 event base crawler API.

## __Amazon Elastic File System__
  - ### Features
    - EFS adds documentation for a new exception for short identifiers to be thrown after its migration to long resource identifiers.

## __Amazon Simple Notification Service__
  - ### Bugfixes
    - Add additional validation to the SNS SigningCert

# __1.12.88__ __2021-10-14__
## __AWS RoboMaker__
  - ### Features
    - Adding support to GPU simulation jobs as well as non-ROS simulation jobs.

## __Amazon SageMaker Service__
  - ### Features
    - This release updates the provisioning artifact ID to an optional parameter in CreateProject API. The provisioning artifact ID defaults to the latest provisioning artifact ID of the product if you don't provide one.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling now supports filtering describe Auto Scaling groups API using tags

## __Elastic Load Balancing__
  - ### Features
    - Adds new option to filter by availability on each type of load balancer when describing ssl policies.

# __1.12.87__ __2021-10-13__
## __AWS Config__
  - ### Features
    - Adding Config support for AWS::OpenSearch::Domain

## __AWS Storage Gateway__
  - ### Features
    - Adding support for Audit Logs on NFS shares and Force Closing Files on SMB shares.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for additional VPC Flow Logs delivery options to S3, such as Apache Parquet formatted files, Hourly partitions and Hive-compatible S3 prefixes

## __Amazon Kinesis Analytics__
  - ### Features
    - Support for Apache Flink 1.13 in Kinesis Data Analytics. Changed the required status of some Update properties to better fit the corresponding Create properties.

## __Amazon WorkMail__
  - ### Features
    - This release adds APIs for adding, removing and retrieving details of mail domains

# __1.12.86__ __2021-10-12__
## __AWS MediaTailor__
  - ### Features
    - MediaTailor now supports ad prefetching.

## __Amazon CloudSearch__
  - ### Features
    - Adds an additional validation exception for Amazon CloudSearch configuration APIs for better error handling.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only update to address tickets.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EncryptionSupport for InstanceStorageInfo added to DescribeInstanceTypes API

# __1.12.85__ __2021-10-11__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for Transport Stream files as an input type to MediaLive encoders.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation update for Amazon EC2.

## __Amazon Fraud Detector__
  - ### Features
    - New model type: Transaction Fraud Insights, which is optimized for online transaction fraud. Stored Events, which allows customers to send and store data directly within Amazon Fraud Detector. Batch Import, which allows customers to upload a CSV file of historic event data for processing and storage

## __Elastic Load Balancing__
  - ### Features
    - Enable support for ALB IPv6 Target Groups (IP Address Type)

# __1.12.84__ __2021-10-08__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert has added the ability to set account policies which control access restrictions for HTTP, HTTPS, and S3 content sources.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __AWS SecurityHub__
  - ### Features
    - Added new resource details objects to ASFF, including resources for WAF rate-based rules, EC2 VPC endpoints, ECR repositories, EKS clusters, X-Ray encryption, and OpenSearch domains. Added additional details for CloudFront distributions, CodeBuild projects, ELB V2 load balancers, and S3 buckets.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release removes a requirement for filters on SearchLocalGatewayRoutes operations.

## __Amazon Lex Model Building V2__
  - ### Features
    - Added configuration support for an Amazon Lex bot to provide fulfillment progress updates to users while their requests are being processed. See documentation for more details: https://docs.aws.amazon.com/lexv2/latest/dg/streaming-progress.html

## __Amazon Lex Runtime V2__
  - ### Features
    - Added configuration support for an Amazon Lex bot to provide fulfillment progress updates to users while their requests are being processed. See documentation for more details: https://docs.aws.amazon.com/lexv2/latest/dg/streaming-progress.html

# __1.12.83__ __2021-10-07__
## __AWS Backup__
  - ### Features
    - Launch of AWS Backup Vault Lock, which protects your backups from malicious and accidental actions, works with existing backup policies, and helps you meet compliance requirements.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports indexing and querying documents in different languages.

## __Amazon Chime__
  - ### Features
    - This release enables customers to configure Chime MediaCapturePipeline via API.

## __Amazon Kinesis Firehose__
  - ### Features
    - Allow support for Amazon Opensearch Service(successor to Amazon Elasticsearch Service) as a Kinesis Data Firehose delivery destination.

## __Amazon Managed Grafana__
  - ### Features
    - Initial release of the SDK for Amazon Managed Grafana API.

## __Schemas__
  - ### Features
    - Removing unused request/response objects.

# __1.12.82__ __2021-10-06__
## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports integration with AWS SSO

## __Amazon FSx__
  - ### Features
    - This release adds support for Lustre 2.12 to FSx for Lustre.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds a new TrainingInputMode FastFile for SageMaker Training APIs.

## __AmplifyBackend__
  - ### Features
    - Adding a new field 'AmplifyFeatureFlags' to the response of the GetBackend operation. It will return a stringified version of the cli.json file for the given Amplify project.

# __1.12.81__ __2021-10-05__
## __AWS Backup__
  - ### Features
    - AWS Backup Audit Manager framework report.

## __AWS Glue__
  - ### Features
    - This release adds tag as an input of CreateConnection

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Released Capacity Reservation Fleet, a feature of Amazon EC2 Capacity Reservations, which provides a way to manage reserved capacity across instance types. For more information: https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-fleets.html

## __Amazon Location Service__
  - ### Features
    - Add support for PositionFiltering.

## __Amazon WorkMail__
  - ### Features
    - This release allows customers to change their inbound DMARC settings in Amazon WorkMail.

## __Application Auto Scaling__
  - ### Features
    - With this release, Application Auto Scaling adds support for Amazon Neptune. Customers can now automatically add or remove Read Replicas of their Neptune clusters to keep the average CPU Utilization at the target value specified by the customers.

# __1.12.80__ __2021-10-04__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to select how batch build statuses are sent to the source provider for a project.

## __AWS Key Management Service__
  - ### Features
    - Added SDK examples for ConnectCustomKeyStore, CreateCustomKeyStore, CreateKey, DeleteCustomKeyStore, DescribeCustomKeyStores, DisconnectCustomKeyStore, GenerateDataKeyPair, GenerateDataKeyPairWithoutPlaintext, GetPublicKey, ReplicateKey, Sign, UpdateCustomKeyStore and Verify APIs

## __Amazon Elastic File System__
  - ### Features
    - EFS adds a new exception for short identifiers to be thrown after its migration to long resource identifiers.

# __1.12.79__ __2021-10-01__
## __AWS App Runner__
  - ### Features
    - This release contains several minor bug fixes.

## __AWS SDK for Java__
  - ### Features
    - Fall back to 'profile X' if the SDK is configured with profile 'X' and 'X' does not exist in the SDK configuration files. No longer log when a configuration file includes 'profile X'.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - When "AutoApprovable" is true for a Change Template, then specifying --auto-approve (boolean) in Start-Change-Request-Execution will create a change request that bypasses approver review. (except for change calendar restrictions)

## __Synthetics__
  - ### Features
    - CloudWatch Synthetics now enables customers to choose a customer managed AWS KMS key or an Amazon S3-managed key instead of an AWS managed key (default) for the encryption of artifacts that the canary stores in Amazon S3. CloudWatch Synthetics also supports artifact S3 location updation now.

# __1.12.78__ __2021-09-30__
## __AWS Account__
  - ### Features
    - This release of the Account Management API enables customers to manage the alternate contacts for their AWS accounts. For more information, see https://docs.aws.amazon.com/accounts/latest/reference/accounts-welcome.html

## __AWS Cloud Control API__
  - ### Features
    - Initial release of the SDK for AWS Cloud Control API

## __AWS Data Exchange__
  - ### Features
    - This release enables subscribers to set up automatic exports of newly published revisions using the new EventAction API.

## __AWS Network Firewall__
  - ### Features
    - This release adds support for strict ordering for stateful rule groups. Using strict ordering, stateful rules are evaluated in the exact order in which you provide them.

## __Amazon Macie 2__
  - ### Features
    - Amazon S3 bucket metadata now indicates whether an error or a bucket's permissions settings prevented Amazon Macie from retrieving data about the bucket or the bucket's objects.

## __Amazon WorkMail__
  - ### Features
    - This release adds support for mobile device access overrides management in Amazon WorkMail.

## __Amazon WorkSpaces__
  - ### Features
    - Added CreateUpdatedWorkspaceImage API to update WorkSpace images with latest software and drivers. Updated DescribeWorkspaceImages API to display if there are updates available for WorkSpace images.

# __1.12.77__ __2021-09-29__
## __AWS Lambda__
  - ### Features
    - Adds support for Lambda functions powered by AWS Graviton2 processors. Customers can now select the CPU architecture for their functions.

## __Amazon Prometheus Service__
  - ### Features
    - This release adds alert manager and rule group namespace APIs

## __Amazon Simple Email Service__
  - ### Features
    - This release includes the ability to use 2048 bits RSA key pairs for DKIM in SES, either with Easy DKIM or Bring Your Own DKIM.

# __1.12.76__ __2021-09-28__
## __AWS Transfer Family__
  - ### Features
    - Added changes for managed workflows feature APIs.

## __EC2 Image Builder__
  - ### Features
    - Fix description for AmiDistributionConfiguration Name property, which actually refers to the output AMI name. Also updated for consistent terminology to use "base" image, and another update to fix description text.

# __1.12.75__ __2021-09-27__
## __Amazon AppIntegrations Service__
  - ### Features
    - The Amazon AppIntegrations service enables you to configure and reuse connections to external applications.

## __Amazon Connect Service__
  - ### Features
    - This release updates a set of APIs: CreateIntegrationAssociation, ListIntegrationAssociations, CreateUseCase, and StartOutboundVoiceContact. You can use it to create integrations with Amazon Pinpoint for the Amazon Connect Campaigns use case, Amazon Connect Voice ID, and Amazon Connect Wisdom.

## __Amazon Connect Wisdom Service__
  - ### Features
    - Released Amazon Connect Wisdom, a feature of Amazon Connect, which provides real-time recommendations and search functionality in general availability (GA).  For more information, see https://docs.aws.amazon.com/wisdom/latest/APIReference/Welcome.html.

## __Amazon Pinpoint__
  - ### Features
    - Added support for journey with contact center activity

## __Amazon Voice ID__
  - ### Features
    - Released the Amazon Voice ID SDK, for usage with the Amazon Connect Voice ID feature released for Amazon Connect.

## __Elastic Load Balancing__
  - ### Features
    - Adds new ALB-type target group to facilitate forwarding traffic from NLB to ALB

# __1.12.74__ __2021-09-24__
## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows customers to get the LicenseArn in the Checkout API Response.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - DescribeInstances now returns Platform Details, Usage Operation, and Usage Operation Update Time.

# __1.12.73__ __2021-09-23__
## __AWS AppSync__
  - ### Features
    - Documented the new OpenSearchServiceDataSourceConfig data type. Added deprecation notes to the ElasticsearchDataSourceConfig data type.

## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds style and positioning support for caption or subtitle burn-in from rich text sources such as TTML. This release also introduces configurable image-based trick play track generation.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added cutoff behavior support for preventing new task invocations from starting when the maintenance window cutoff time is reached.

# __1.12.72__ __2021-09-22__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - MediaPackage VOD will now return the current processing statuses of an asset's endpoints. The status can be QUEUED, PROCESSING, PLAYABLE, or FAILED.

## __AWS Identity and Access Management__
  - ### Features
    - Added changes to OIDC API about not using port numbers in the URL.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows customers to change their Windows Server or SQL license types from Bring-Your-Own-License (BYOL) to License Included or vice-versa (using the customer's media).

## __AWS MediaTailor__
  - ### Features
    - This release adds support to configure logs for playback configuration.

## __AWS WAFV2__
  - ### Features
    - Added the regex match rule statement, for matching web requests against a single regular expression.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for utterances statistics for bots built using Lex V2 console and APIs. For details, see: https://docs.aws.amazon.com/lexv2/latest/dg/monitoring-utterances.html

## __EC2 Image Builder__
  - ### Features
    - This feature adds support for specifying GP3 volume throughput and configuring instance metadata options for instances launched by EC2 Image Builder.

# __1.12.71__ __2021-09-21__
## __AWS IoT__
  - ### Features
    - This release adds support for verifying, viewing and filtering AWS IoT Device Defender detect violations with four verification states.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports versioning of custom models, improved training with ONE_DOC_PER_FILE text documents for custom entity recognition, ability to provide specific test sets during training, and live migration to new model endpoints.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds additional support for repository replication

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This update adds support for downloading configuration templates using new APIs (GetVpnConnectionDeviceTypes and GetVpnConnectionDeviceSampleConfiguration) and Internet Key Exchange version 2 (IKEv2) parameters for many popular CGW devices.

## __Managed Streaming for Kafka__
  - ### Features
    - Added StateInfo to ClusterInfo

# __1.12.70__ __2021-09-17__
## __AWS Database Migration Service__
  - ### Features
    - Optional flag force-planned-failover added to reboot-replication-instance API call. This flag can be used to test a planned failover scenario used during some maintenance operations.

## __Amazon Elasticsearch Service__
  - ### Features
    - This release adds an optional parameter in the ListDomainNames API to filter domains based on the engine type (OpenSearch/Elasticsearch).

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds an optional parameter in the ListDomainNames API to filter domains based on the engine type (OpenSearch/Elasticsearch).

# __1.12.69__ __2021-09-16__
## __AWS RoboMaker__
  - ### Features
    - Adding support to create container based Robot and Simulation applications by introducing an environment field

## __Amazon Macie 2__
  - ### Features
    - This release adds support for specifying which managed data identifiers are used by a classification job, and retrieving a list of managed data identifiers that are available.

## __Amazon Pinpoint__
  - ### Features
    - This SDK release adds a new feature for Pinpoint campaigns, in-app messaging.

## __Amazon SageMaker Service__
  - ### Features
    - Add API for users to retry a failed pipeline execution or resume a stopped one.

## __Amazon Simple Storage Service__
  - ### Features
    - Add support for access point arn filtering in S3 CW Request Metrics

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for subtitling with Amazon Transcribe batch jobs.

## __Managed Streaming for Kafka Connect__
  - ### Features
    - This is the initial SDK release for Amazon Managed Streaming for Apache Kafka Connect (MSK Connect).

# __1.12.68__ __2021-09-14__
## __AWS WAFV2__
  - ### Features
    - This release adds support for including rate based rules in a rule group.

## __Amazon Chime__
  - ### Features
    - Adds support for SipHeaders parameter for CreateSipMediaApplicationCall.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now allows you to train and run PDF and Word documents for custom entity recognition. With PDF and Word formats, you can extract information from documents containing headers, lists and tables.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for vt1 3xlarge, 6xlarge and 24xlarge instances powered by Xilinx Alveo U30 Media Accelerators for video transcoding workloads

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for "Project Search"

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe now supports PII Identification and Redaction for streaming transcription.

# __1.12.67__ __2021-09-13__
## __AWS IoT__
  - ### Features
    - AWS IoT Rules Engine adds OpenSearch action. The OpenSearch rule action lets you stream data from IoT sensors and applications to Amazon OpenSearch Service which is a successor to Amazon Elasticsearch Service.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for T3 instances on Amazon EC2 Dedicated Hosts.

# __1.12.66__ __2021-09-10__
## __AWS CloudFormation__
  - ### Features
    - Doc only update for CloudFormation that fixes several customer-reported issues.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release updates terminology around KMS keys.

## __Amazon QuickSight__
  - ### Features
    - Add new data source type for Amazon OpenSearch (successor to Amazon ElasticSearch).

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for providing a custom timeout value for finding a scaling point during autoscaling in Aurora Serverless v1.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for "Lifecycle Configurations" to SageMaker Studio

## __Amazon Transcribe Service__
  - ### Features
    - This release adds an API option for startTranscriptionJob and startMedicalTranscriptionJob that allows the user to specify encryption context key value pairs for batch jobs.

# __1.12.65__ __2021-09-09__
## __Amazon CodeGuru Reviewer__
  - ### Features
    - The Amazon CodeGuru Reviewer API now includes the RuleMetadata data object and a Severity attribute on a RecommendationSummary object. A RuleMetadata object contains information about a rule that generates a recommendation. Severity indicates how severe the issue associated with a recommendation is.

## __Amazon EMR__
  - ### Features
    - This release enables customers to login to EMR Studio using AWS Identity and Access Management (IAM) identities or identities in their Identity Provider (IdP) via IAM.

## __Amazon Lookout for Equipment__
  - ### Features
    - Added OffCondition parameter to CreateModel API

# __1.12.64__ __2021-09-08__
## __AWS Resource Access Manager__
  - ### Features
    - A minor text-only update that fixes several customer issues.

## __Amazon OpenSearch Service__
  - ### Features
    - Updated Configuration APIs for Amazon OpenSearch Service (successor to Amazon Elasticsearch Service)

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added a new API that allows you to update the encrypting and authentication settings for an existing cluster.

# __1.12.63__ __2021-09-07__
## __AWS Elemental MediaPackage__
  - ### Features
    - SPEKE v2 support for live CMAF packaging type. SPEKE v2 is an upgrade to the existing SPEKE API to support multiple encryption keys, it supports live DASH currently.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Added SDK examples for SSM-Contacts.

## __AWS X-Ray__
  - ### Features
    - Updated references to AWS KMS keys and customer managed keys to reflect current terminology.

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding RegisterCluster and DeregisterCluster operations, to support connecting external clusters to EKS.

## __Amazon Forecast Service__
  - ### Features
    - Predictor creation now supports selecting an accuracy metric to optimize in AutoML and hyperparameter optimization. This release adds additional accuracy metrics for predictors - AverageWeightedQuantileLoss, MAPE and MASE.

## __Amazon Prometheus Service__
  - ### Features
    - This release adds tagging support for Amazon Managed Service for Prometheus workspace.

# __1.12.62__ __2021-09-03__
## __AWS Outposts__
  - ### Features
    - This release adds a new API CreateOrder.

## __Amazon Chime SDK Identity__
  - ### Features
    - Documentation updates for Chime

## __Amazon Chime SDK Messaging__
  - ### Features
    - Documentation updates for Chime

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Added support for CodeInconsistencies detectors

## __Amazon Fraud Detector__
  - ### Features
    - Enhanced GetEventPrediction API response to include risk scores from imported SageMaker models

# __1.12.61__ __2021-09-02__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Private Certificate Authority Service now allows customers to enable an online certificate status protocol (OCSP) responder service on their private certificate authorities. Customers can also optionally configure a custom CNAME for their OCSP responder.

## __AWS S3 Control__
  - ### Features
    - S3 Multi-Region Access Points provide a single global endpoint to access a data set that spans multiple S3 buckets in different AWS Regions.

## __AWS SecurityHub__
  - ### Features
    - New ASFF Resources: AwsAutoScalingLaunchConfiguration, AwsEc2VpnConnection, AwsEcrContainerImage. Added KeyRotationStatus to AwsKmsKey. Added AccessControlList, BucketLoggingConfiguration,BucketNotificationConfiguration and BucketNotificationConfiguration to AwsS3Bucket.

## __AWS Transfer Family__
  - ### Features
    - AWS Transfer Family introduces Managed Workflows for creating, executing, monitoring, and standardizing post file transfer processing

## __Access Analyzer__
  - ### Features
    - Updates service API, documentation, and paginators to support multi-region access points from Amazon S3.

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for Amazon EBS direct APIs.

## __Amazon Elastic File System__
  - ### Features
    - Adds support for EFS Intelligent-Tiering, which uses EFS Lifecycle Management to monitor file access patterns and is designed to automatically transition files to and from your corresponding Infrequent Access (IA) storage classes.

## __Amazon FSx__
  - ### Features
    - Announcing Amazon FSx for NetApp ONTAP, a new service that provides fully managed shared storage in the AWS Cloud with the data access and management capabilities of ONTAP.

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports Korean (ko-KR) locale.

## __Amazon QuickSight__
  - ### Features
    - This release adds support for referencing parent datasets as sources in a child dataset.

## __Amazon S3__
  - ### Features
    - Adds a warning message that multi-region access point ARNs are not supported for AWS Java SDK v1

## __Schemas__
  - ### Features
    - This update include the support for Schema Discoverer to discover the events sent to the bus from another account. The feature will be enabled by default when discoverer is created or updated but can also be opt-in or opt-out  by specifying the value for crossAccount.

# __1.12.60__ __2021-09-01__
## __AWS CloudTrail__
  - ### Features
    - Documentation updates for CloudTrail

## __AWS Config__
  - ### Features
    - Documentation updates for config

## __AWS MediaTailor__
  - ### Features
    - This release adds support for wall clock programs in LINEAR channels.

## __AWS Service Catalog App Registry__
  - ### Features
    - Introduction of GetAssociatedResource API and GetApplication response extension for Resource Groups support.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added LaunchTemplate support for the IMDS IPv6 endpoint

# __1.12.59__ __2021-08-31__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __AWS DynamoDB Document__
  - ### Bugfixes
    - Switches filterexpression and projectionexpression arguments in two Index query() methods so that underlying implementation gets expected arguments

## __AWS IoT__
  - ### Features
    - Added Create/Update/Delete/Describe/List APIs for a new IoT resource named FleetMetric. Added a new Fleet Indexing query API named GetBucketsAggregation. Added a new field named DisconnectedReason in Fleet Indexing query response. Updated their related documentations.

## __Amazon MemoryDB__
  - ### Features
    - Documentation updates for MemoryDB

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new South African English voice - Ayanda. Ayanda is available as Neural voice only.

## __Amazon Simple Queue Service__
  - ### Features
    - Amazon SQS adds a new queue attribute, RedriveAllowPolicy, which includes the dead-letter queue redrive permission parameters. It defines which source queues can specify dead-letter queues as a JSON object.

# __1.12.58__ __2021-08-30__
## __AWS CloudFormation__
  - ### Features
    - AWS CloudFormation allows you to iteratively develop your applications when failures are encountered without rolling back successfully provisioned resources. By specifying stack failure options, you can troubleshoot resources in a CREATE_FAILED or UPDATE_FAILED status.

## __AWS CodeBuild__
  - ### Features
    - Documentation updates for CodeBuild

## __AWS Key Management Service__
  - ### Features
    - This release has changes to KMS nomenclature to remove the word master from both the "Customer master key" and "CMK" abbreviation and replace those naming conventions with "KMS key".

## __Amazon Kinesis Firehose__
  - ### Features
    - This release adds the Dynamic Partitioning feature to Kinesis Data Firehose service for S3 destinations.

# __1.12.57__ __2021-08-27__
## __Amazon EMR__
  - ### Features
    - Amazon EMR now supports auto-terminating idle EMR clusters. You can specify the idle timeout value when enabling auto-termination for both running and new clusters and Amazon EMR automatically terminates the cluster when idle timeout kicks in.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds the BootMode flag to the ImportImage API and showing the detected BootMode of an ImportImage task.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3.

# __1.12.56__ __2021-08-26__
## __AWS Compute Optimizer__
  - ### Features
    - Adds support for 1) the AWS Graviton (AWS_ARM64) recommendation preference for Amazon EC2 instance and Auto Scaling group recommendations, and 2) the ability to get the enrollment statuses for all member accounts of an organization.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support added for resizing VPC prefix lists

## __Amazon Rekognition__
  - ### Features
    - This release added new attributes to Rekognition RecognizeCelebities and GetCelebrityInfo API operations.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for batch transcription in six new languages - Afrikaans, Danish, Mandarin Chinese (Taiwan), New Zealand English, South African English, and Thai.

# __1.12.55__ __2021-08-25__
## __AWS DataSync__
  - ### Features
    - Added include filters to CreateTask and UpdateTask, and added exclude filters to StartTaskExecution, giving customers more granular control over how DataSync transfers files, folders, and objects.

## __Amazon CloudWatch Events__
  - ### Features
    - AWS CWEvents adds an enum of EXTERNAL for EcsParameters LaunchType for PutTargets API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support added for IMDS IPv6 endpoint

## __Amazon EventBridge__
  - ### Features
    - AWS EventBridge adds an enum of EXTERNAL for EcsParameters LaunchType for PutTargets API

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports triggering resource cleanup workflow when account or resource goes out of policy scope for AWS WAF, Security group, AWS Network Firewall, and Amazon Route 53 Resolver DNS Firewall policies.

# __1.12.54__ __2021-08-24__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added MBAFF encoding support for AVC video and the ability to pass encryption context from the job settings to S3.

## __AWS IoT Data Plane__
  - ### Features
    - Updated Publish with support for new Retain flag and added two new API operations: GetRetainedMessage, ListRetainedMessages.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new New Zealand English voice - Aria. Aria is available as Neural voice only.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Updated Parameter Store property for logging improvements.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for feature tagging with Amazon Transcribe batch jobs.

# __1.12.53__ __2021-08-23__
## __AWS Backup__
  - ### Features
    - AWS Backup - Features: Evaluate your backup activity and generate audit reports.

## __AWS Database Migration Service__
  - ### Features
    - Amazon AWS DMS service now support Redis target endpoint migration. Now S3 endpoint setting is capable to setup features which are used to be configurable only in extract connection attributes.

## __AWS Glue__
  - ### Features
    - Add support for Custom Blueprints

## __AWS IoT SiteWise__
  - ### Features
    - Documentation updates for AWS IoT SiteWise

## __Amazon API Gateway__
  - ### Features
    - Adding some of the pending releases (1) Adding WAF Filter to GatewayResponseType enum (2) Ensuring consistent error model for all operations (3) Add missing BRE to GetVpcLink operation

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Added AMI deprecation support for Amazon Data Lifecycle Manager EBS-backed AMI policies.

## __Amazon Fraud Detector__
  - ### Features
    - Updated an element of the DescribeModelVersion API response (LogitMetrics -> logOddsMetrics) for clarity. Added new exceptions to several APIs to protect against unlikely scenarios.

# __1.12.52__ __2021-08-20__
## __AWS RoboMaker__
  - ### Features
    - Documentation updates for RoboMaker

## __Amazon Comprehend__
  - ### Features
    - Add tagging support for Comprehend async inference job.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - encryptionInTransitSupported added to DescribeInstanceTypes API

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adds support for EKS add-ons "preserve" flag, which allows customers to maintain software on their EKS clusters after removing it from EKS add-ons management.

# __1.12.51__ __2021-08-19__
## __Amazon Appflow__
  - ### Features
    - This release adds support for SAPOData connector and extends Veeva connector for document extraction.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - The ImportImage API now supports the ability to create AMIs with AWS-managed licenses for Microsoft SQL Server for both Windows and Linux.

## __Amazon MemoryDB__
  - ### Features
    - AWS MemoryDB  SDK now supports all APIs for newly launched MemoryDB service.

## __Application Auto Scaling__
  - ### Features
    - This release extends Application Auto Scaling support for replication group of Amazon ElastiCache Redis clusters. Auto Scaling monitors and automatically expands node group count and number of replicas per node group when a critical usage threshold is met or according to customer-defined schedule.

# __1.12.50__ __2021-08-18__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to make the build results for your build projects available to the public without requiring access to an AWS account.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for route53

## __Amazon Route 53 Resolver__
  - ### Features
    - Documentation updates for Route 53 Resolver

## __Amazon SageMaker Runtime__
  - ### Features
    - Amazon SageMaker Runtime now supports InvokeEndpointAsync to asynchronously invoke endpoints that were created with the AsyncInferenceConfig object in the EndpointConfig. Asynchronous invocations support larger payload sizes in Amazon S3 and longer processing times.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports Asynchronous Inference endpoints. Adds PlatformIdentifier field that allows Notebook Instance creation with different platform selections. Increases the maximum number of containers in multi-container endpoints to 15. Adds more instance types to InstanceType field.

# __1.12.49__ __2021-08-17__
## __AWS Cloud9__
  - ### Features
    - Added DryRun parameter to CreateEnvironmentEC2 API. Added ManagedCredentialsActions parameter to UpdateEnvironment API

## __AWS Cost Explorer Service__
  - ### Features
    - This release is a new feature for Cost Categories: Split charge rules. Split charge rules enable you to allocate shared costs between your cost category values.

## __Amazon CloudDirectory__
  - ### Features
    - Documentation updates for clouddirectory

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation-only update for CloudWatch Logs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for EC2 ED25519 key pairs for authentication

# __1.12.48__ __2021-08-16__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to select how batch build statuses are sent to the source provider for a project.

## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for Backup Plan, Selection, Vault, RecoveryPoint; ECS Cluster, Service, TaskDefinition; EFS AccessPoint, FileSystem; EKS Cluster; ECR Repository resources

## __AWS Directory Service__
  - ### Features
    - This release adds support for describing client authentication settings.

## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise added query window for the interpolation interval. AWS IoT SiteWise computes each interpolated value by using data points from the timestamp of each interval minus the window to the timestamp of each interval plus the window.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows end users to call CheckoutLicense API using new CheckoutType PERPETUAL. Perpetual checkouts allow sellers to check out a quantity of entitlements to be drawn down for consumption.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3

# __1.12.47__ __2021-08-13__
## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces Standard Profile Objects, namely Asset and Case which contain values populated by data from third party systems and belong to a specific profile. This release adds an optional parameter, ObjectFilter to the ListProfileObjects API in order to search for these Standard Objects.

## __Amazon EMR__
  - ### Features
    - Amazon EMR customers can now specify custom AMIs at the instance level in their clusters. This allows using custom AMIs in clusters that have instances with different instruction set architectures, e.g. m5.xlarge (x86) and m6g.xlarge (ARM).

## __Amazon ElastiCache__
  - ### Features
    - This release adds ReplicationGroupCreateTime field to ReplicationGroup which indicates the UTC time when ElastiCache ReplicationGroup is created

## __Amazon QuickSight__
  - ### Features
    - Documentation updates for QuickSight.

# __1.12.46__ __2021-08-12__
## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds support for the output of a recipe job results to Tableau Hyper format.

## __AWS Lambda__
  - ### Features
    - Lambda Python 3.9 runtime launch

## __Amazon API Gateway__
  - ### Features
    - Adding support for ACM imported or private CA certificates for mTLS enabled domain names

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Autopilot adds new metrics for all candidate models generated by Autopilot experiments.

## __AmazonApiGatewayV2__
  - ### Features
    - Adding support for ACM imported or private CA certificates for mTLS enabled domain names

# __1.12.45__ __2021-08-11__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to make the build results for your build projects available to the public without requiring access to an AWS account.

## __AWS SDK for Java__
  - ### Bugfixes
    - Use full jitter and update base delay for STANDARD retry mode defaults

## __AWS Snow Device Management__
  - ### Features
    - AWS Snow Family customers can remotely monitor and operate their connected AWS Snowcone devices.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for ECS.

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for Amazon EBS direct APIs.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for route53

## __AmazonNimbleStudio__
  - ### Features
    - Add new attribute 'ownedBy' in Streaming Session APIs. 'ownedBy' represents the AWS SSO Identity Store User ID of the owner of the Streaming Session resource.

# __1.12.44__ __2021-08-10__
## __Amazon Chime__
  - ### Features
    - Add support for "auto" in Region field of StartMeetingTranscription API request.

# __1.12.43__ __2021-08-09__
## __AWS WAFV2__
  - ### Features
    - This release adds APIs to support versioning feature of AWS WAF Managed rule groups

## __Amazon Rekognition__
  - ### Features
    - This release adds support for four new types of segments (opening credits, content segments, slates, and studio logos), improved accuracy for credits and shot detection and new filters to control black frame detection.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for AWS Systems Manager.

# __1.12.42__ __2021-08-06__
## __Amazon Athena__
  - ### Features
    - Documentation updates for Athena.

## __Amazon Chime SDK Identity__
  - ### Features
    - The Amazon Chime SDK Identity APIs allow software developers to create and manage unique instances of their messaging applications.

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK Messaging APIs allow software developers to send and receive messages in custom messaging applications.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for agent status and hours of operation. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to track when a bucket access key was last used.

## __Synthetics__
  - ### Features
    - Documentation updates for Visual Monitoring feature and other doc ticket fixes.

# __1.12.41__ __2021-08-05__
## __Amazon Lex Model Building V2__
  - ### Features
    - Customers can now toggle the active field on prompts and responses.

## __Auto Scaling__
  - ### Features
    - EC2 Auto Scaling adds configuration checks and Launch Template validation to Instance Refresh.

# __1.12.40__ __2021-08-04__
## __AWS SDK for Java__
  - ### Features
    - Moving 1.11.x changes to a separate changelog file.

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Documentation updates for Incident Manager.

## __Amazon EventBridge__
  - ### Features
    - Documentation updates to add EC2 Image Builder as a target on PutTargets.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds AutomaticRestartTime to the DescribeDBInstances and DescribeDBClusters operations. AutomaticRestartTime indicates the time when a stopped DB instance or DB cluster is restarted automatically.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for call analytics (batch) within Amazon Transcribe.

## __EC2 Image Builder__
  - ### Features
    - Updated list actions to include a list of valid filters that can be used in the request.

# __1.12.39__ __2021-08-03__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added control over the passthrough of XDS captions metadata to outputs.

## __AWS Glue__
  - ### Features
    - Add ConcurrentModificationException to create-table, delete-table, create-database, update-database, delete-database

## __AWS IoT SiteWise__
  - ### Features
    - My AWS Service (placeholder) - This release introduces custom Intervals and offset for tumbling window in metric for AWS IoT SiteWise.

## __AWS Proton__
  - ### Features
    - Docs only add idempotent create apis

## __AWS SDK for Java__
  - ### Features
    - Allow configuring the EC2 metadata connect/read timeout via the AWS_METADATA_SERVICE_TIMEOUT environment variable

  - ### Bugfixes
    - Prevent deadlock in Jackson-databind's PropertyNamingStrategy (only when Jackson-databind 2.12.x is on the classpath): https://github.com/FasterXML/jackson-databind/issues/2715

## __Amazon Redshift__
  - ### Features
    - API support for Redshift Data Sharing feature.

# __1.12.38__ __2021-08-02__
## __AWS IoT Greengrass V2__
  - ### Features
    - This release adds support for component system resource limits and idempotent Create operations. You can now specify the maximum amount of CPU and memory resources that each component can use.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Added new attribute in AcceptCode API. AcceptCodeValidation takes in two values - ENFORCE, IGNORE. ENFORCE forces validation of accept code and IGNORE ignores it which is also the default behavior; Corrected TagKeyList length from 200 to 50

# __1.12.37__ __2021-07-30__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports a new authorization mode allowing you to define your own authorization logic using an AWS Lambda function.

## __AWS Secrets Manager__
  - ### Features
    - Add support for KmsKeyIds in the ListSecretVersionIds API response

## __Amazon SageMaker Service__
  - ### Features
    - API changes with respect to Lambda steps in model building pipelines. Adds several waiters to async Sagemaker Image APIs. Add more instance types to AppInstanceType field

## __Elastic Load Balancing__
  - ### Features
    - Client Port Preservation ALB Attribute Launch

# __1.12.36__ __2021-07-29__
## __AWS IoT__
  - ### Features
    - Increase maximum credential duration of role alias to 12 hours.

## __AWS IoT SiteWise__
  - ### Features
    - Added support for AWS IoT SiteWise Edge. You can now create an AWS IoT SiteWise gateway that runs on AWS IoT Greengrass V2. With the gateway,  you can collect local server and equipment data, process the data, and export the selected data from the edge to the AWS Cloud.

## __AWS Savings Plans__
  - ### Features
    - Documentation update for valid Savings Plans offering ID pattern

## __Amazon Chime__
  - ### Features
    - Adds support for live transcription of meetings with Amazon Transcribe and Amazon Transcribe Medical.  The new APIs, StartMeetingTranscription and StopMeetingTranscription, control the generation of user-attributed transcriptions sent to meeting clients via Amazon Chime SDK data messages.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for G4ad xlarge and 2xlarge instances powered by AMD Radeon Pro V520 GPUs and AMD 2nd Generation EPYC processors

# __1.12.35__ __2021-07-28__
## __AWS CloudFormation__
  - ### Features
    - SDK update to support Importing existing Stacks to new/existing Self Managed StackSet - Stack Import feature.

## __AWS Single Sign-On Admin__
  - ### Features
    - Documentation updates for arn:aws:trebuchet:::service:v1:03a2216d-1cda-4696-9ece-1387cb6f6952

# __1.12.34__ __2021-07-28__
## __AWS Batch__
  - ### Features
    - Add support for ListJob filters

## __AWS IoT Analytics__
  - ### Features
    - IoT Analytics now supports creating a dataset resource with IoT SiteWise MultiLayerStorage data stores, enabling customers to query industrial data within the service. This release includes adding JOIN functionality for customers to query multiple data sources in a dataset.

## __AWS IoT Wireless__
  - ### Features
    - Add SidewalkManufacturingSn as an identifier to allow Customer to query WirelessDevice, in the response, AmazonId is added in the case that Sidewalk device is return.

## __AWS Route53 Recovery Control Config__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Configuration APIs help you create and delete clusters, control panels, routing controls and safety rules. State changes (On/Off) of routing controls are not part of configuration APIs.

## __AWS Route53 Recovery Readiness__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's readiness check capability continually monitors resource quotas, capacity, and network routing policies to ensure that the recovery environment is scaled and configured to take over when needed.

## __AWS Shield__
  - ### Features
    - Change name of DDoS Response Team (DRT) to Shield Response Team (SRT)

## __Amazon Lex Model Building V2__
  - ### Features
    - Add waiters that automatically poll for resource status for asynchronous operations, such as building a bot

## __Amazon QuickSight__
  - ### Features
    - Add support to use row-level security with tags when embedding dashboards for users not provisioned in QuickSight

## __Amazon Route 53__
  - ### Features
    - This release adds support for the RECOVERY_CONTROL health check type to be used in conjunction with Route53 Application Recovery Controller.

## __Redshift Data API Service__
  - ### Features
    - Added structures to support new Data API operation BatchExecuteStatement, used to execute multiple SQL statements within a single transaction.

## __Route53 Recovery Cluster__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Data Plane APIs help you update the state (On/Off) of the routing controls to reroute traffic across application replicas in a 100% available manner.

# __1.12.33__ __2021-07-27__
## __AWS Batch__
  - ### Features
    - Add support for ListJob filters

## __AWS IoT Analytics__
  - ### Features
    - IoT Analytics now supports creating a dataset resource with IoT SiteWise MultiLayerStorage data stores, enabling customers to query industrial data within the service. This release includes adding JOIN functionality for customers to query multiple data sources in a dataset.

## __AWS IoT Wireless__
  - ### Features
    - Add SidewalkManufacturingSn as an identifier to allow Customer to query WirelessDevice, in the response, AmazonId is added in the case that Sidewalk device is return.

## __AWS Route53 Recovery Control Config__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Configuration APIs help you create and delete clusters, control panels, routing controls and safety rules. State changes (On/Off) of routing controls are not part of configuration APIs.

## __AWS Route53 Recovery Readiness__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's readiness check capability continually monitors resource quotas, capacity, and network routing policies to ensure that the recovery environment is scaled and configured to take over when needed.

## __AWS Shield__
  - ### Features
    - Change name of DDoS Response Team (DRT) to Shield Response Team (SRT)

## __Amazon Lex Model Building V2__
  - ### Features
    - Add waiters that automatically poll for resource status for asynchronous operations, such as building a bot

## __Amazon QuickSight__
  - ### Features
    - Add support to use row-level security with tags when embedding dashboards for users not provisioned in QuickSight

## __Amazon Route 53__
  - ### Features
    - This release adds support for the RECOVERY_CONTROL health check type to be used in conjunction with Route53 Application Recovery Controller.

## __Redshift Data API Service__
  - ### Features
    - Added structures to support new Data API operation BatchExecuteStatement, used to execute multiple SQL statements within a single transaction.

## __Route53 Recovery Cluster__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Data Plane APIs help you update the state (On/Off) of the routing controls to reroute traffic across application replicas in a 100% available manner.

# __1.12.32__ __2021-07-26__
## __AWS Proton__
  - ### Features
    - Documentation-only update links

## __AWS S3 Control__
  - ### Features
    - S3 Access Point aliases can be used anywhere you use S3 bucket names to access data in S3

## __AWS SSO Identity Store__
  - ### Features
    - Documentation updates for SSO API Ref.

## __Amazon CloudWatch__
  - ### Features
    - SDK update to support creation of Cross-Account Metric Alarms and update API documentation.

## __Amazon Textract__
  - ### Features
    - Adds support for AnalyzeExpense, a new API to extract relevant data such as contact information, items purchased, and vendor name, from almost any invoice or receipt without the need for any templates or configuration.

## __Synthetics__
  - ### Features
    - CloudWatch Synthetics now supports visual testing in its canaries.

# __1.12.31__ __2021-07-23__
## __AWS SecurityHub__
  - ### Features
    - Added product name, company name, and Region fields for security findings. Added details objects for RDS event subscriptions and AWS ECS services. Added fields to the details for AWS Elasticsearch domains.

## __Amazon S3 on Outposts__
  - ### Features
    - Add on-premise access type support for endpoints

## __EC2 Image Builder__
  - ### Features
    - Update to documentation to reapply missing change to SSM uninstall switch default value and improve description.

# __1.12.30__ __2021-07-22__
## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive now supports passing through style data on WebVTT caption outputs.

## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds two new features: 1) Output to Native JDBC destinations and 2) Adding configurations to profile jobs

## __AWS S3 Control__
  - ### Features
    - Documentation updates for Amazon S3-control

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release allows customers to assign prefixes to their elastic network interface and to reserve IP blocks in their subnet CIDRs. These reserved blocks can be used to assign prefixes to elastic network interfaces or be excluded from auto-assignment.

## __Amazon QLDB__
  - ### Features
    - Amazon QLDB now supports ledgers encrypted with customer managed KMS keys. Changes in CreateLedger, UpdateLedger and DescribeLedger APIs to support the changes.

## __Elastic Load Balancing__
  - ### Features
    - Adds support for enabling TLS protocol version and cipher suite headers to be sent to backend targets for Application Load Balancers.

# __1.12.29__ __2021-07-21__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now allows you to set the access permissions for build artifacts, project artifacts, and log files that are uploaded to an Amazon S3 bucket that is owned by another account.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS Lambda__
  - ### Features
    - New ResourceConflictException error code for PutFunctionEventInvokeConfig, UpdateFunctionEventInvokeConfig, and DeleteFunctionEventInvokeConfig operations.

## __AWS Proton__
  - ### Features
    - Documentation updates for AWS Proton

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now provides a data source connector for Amazon WorkDocs. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/data-source-workdocs.html

## __Amazon Elastic MapReduce__
  - ### Features
    - EMR now supports new DescribeReleaseLabel and ListReleaseLabel APIs. They can provide Amazon EMR release label details. You can programmatically list available releases and applications for a specific Amazon EMR release label.

## __Amazon Personalize__
  - ### Features
    - My AWS Service (placeholder) - Making minProvisionedTPS an optional parameter when creating a campaign. If not provided, it defaults to 1.

## __Amazon Relational Database Service__
  - ### Features
    - Adds the OriginalSnapshotCreateTime field to the DBSnapshot response object. This field timestamps the underlying data of a snapshot and doesn't change when the snapshot is copied.

## __Elastic Load Balancing__
  - ### Features
    - Adds support for enabling TLS protocol version and cipher suite headers to be sent to backend targets for Application Load Balancers.

# __1.12.28__ __2021-07-20__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added idempotency to the CreateVolume API using the ClientToken request parameter

# __1.12.27__ __2021-07-19__
## __AWS Direct Connect__
  - ### Features
    - Documentation updates for directconnect

## __AWS Health APIs and Notifications__
  - ### Features
    - In the Health API, the maximum number of entities for the EventFilter and EntityFilter data types has changed from 100 to 99. This change is related to an internal optimization of the AWS Health service.

## __AWS RoboMaker__
  - ### Features
    - This release allows customers to create a new version of WorldTemplates with support for Doors.

## __Amazon EMR Containers__
  - ### Features
    - Updated DescribeManagedEndpoint and ListManagedEndpoints to return failureReason and stateDetails in API response.

## __Amazon Location Service__
  - ### Features
    - Add five new API operations: UpdateGeofenceCollection, UpdateMap, UpdatePlaceIndex, UpdateRouteCalculator, UpdateTracker.

## __EC2 Image Builder__
  - ### Features
    - Documentation updates for reversal of default value for additional instance configuration SSM switch, plus improved descriptions for semantic versioning.

# __1.12.26__ __2021-07-16__
## __AWS Audit Manager__
  - ### Features
    - This release relaxes the S3 URL character restrictions in AWS Audit Manager. Regex patterns have been updated for the following attributes: s3RelativePath, destination, and s3ResourcePath. 'AWS' terms have also been replaced with entities to align with China Rebrand documentation efforts.

## __Amazon AppIntegrations Service__
  - ### Features
    - Documentation update for AppIntegrations Service

## __Amazon Chime__
  - ### Features
    - This SDK release adds Account Status as one of the attributes in Account API response

# __1.12.25__ __2021-07-15__
## __AWS IoT SiteWise__
  - ### Features
    - Update the default endpoint for the APIs used to manage asset models, assets, gateways, tags, and account configurations. If you have firewalls with strict egress rules, configure the rules to grant you access to api.iotsitewise.[region].amazonaws.com or api.iotsitewise.[cn-region].amazonaws.com.cn.

## __AWS SDK for Java__
  - ### Features
    - Adaptive retry mode dynamically limits the rate of AWS requests to maximize success rate. This may be at the expense of
      request latency. Adaptive retry mode is not recommended when predictable latency is important. 

      Warning: Adaptive retry mode assumes that the client is working against a single resource (e.g. one DynamoDB Table or
      one S3 Bucket). If you use a single client for multiple resources, throttling or outages associated with one resource
      will result in increased latency and failures when accessing all other resources via the same client. When using
      adaptive retry mode, we recommend using a single client per resource.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Documentation updates for cognito-idp

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for support of awsvpc mode on Windows.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This feature enables customers  to specify weekly recurring time window(s) for scheduled events that reboot, stop or terminate EC2 instances.

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports the en-IN locale

# __1.12.24__ __2021-07-14__
## __AWS Certificate Manager__
  - ### Features
    - Added support for RSA 3072 SSL certificate import

## __AWS Database Migration Service__
  - ### Features
    - Release of feature needed for ECA-Endpoint settings. This allows customer to delete a field in endpoint settings by using --exact-settings flag in modify-endpoint api. This also displays default values for certain required fields of endpoint settings in describe-endpoint-settings api.

## __AWS Glue__
  - ### Features
    - Add support for Event Driven Workflows

## __AWS Well-Architected Tool__
  - ### Features
    - This update provides support for Well-Architected API users to mark answer choices as not applicable.

## __Amazon HealthLake__
  - ### Features
    - General availability for Amazon HealthLake. StartFHIRImportJob and StartFHIRExportJob APIs now require AWS KMS parameter. For more information, see the Amazon HealthLake Documentation https://docs.aws.amazon.com/healthlake/index.html.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for the Amazon Lightsail object storage service, which allows you to create buckets and store objects.

# __1.12.23__ __2021-07-13__
## __AWS Direct Connect__
  - ### Features
    - This release adds a new filed named awsLogicalDeviceId that it displays the AWS Direct Connect endpoint which terminates a physical connection's BGP Sessions.

## __AWS Price List Service__
  - ### Features
    - Documentation updates for api.pricing

## __Amazon DevOps Guru__
  - ### Features
    - Add paginator for GetCostEstimation

## __Amazon Lex Model Building Service__
  - ### Features
    - Customers can now migrate bots built with Lex V1 APIs to V2 APIs. This release adds APIs to initiate and manage the migration of a bot.

## __Amazon Redshift__
  - ### Features
    - Release new APIs to support new Redshift feature - Authentication Profile

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Changes to OpsCenter APIs to support a new feature, operational insights.

## __AmplifyBackend__
  - ### Features
    - Added Sign in with Apple OAuth provider.

# __1.12.22__ __2021-07-12__
## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports Principal Store

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Documentation updates for Wesley to support the parallel node upgrade feature.

# __1.12.21__ __2021-07-09__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert now supports color, style and position information passthrough from 608 and Teletext to SRT and WebVTT subtitles. MediaConvert now also supports Automatic QVBR quality levels for QVBR RateControlMode.

## __Amazon Fraud Detector__
  - ### Features
    - This release adds support for ML Explainability to display model variable importance value in Amazon Fraud Detector.

## __Amazon SageMaker Service__
  - ### Features
    - Releasing new APIs related to Tuning steps in model building pipelines.

# __1.12.20__ __2021-07-08__
## __AWS MediaTailor__
  - ### Features
    - Add ListAlerts for Channel, Program, Source Location, and VOD Source to return alerts for resources.

## __AWS Outposts__
  - ### Features
    - Added property filters for listOutposts

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Updated description for CreateContactChannel contactId.

## __Amazon DevOps Guru__
  - ### Features
    - Add AnomalyReportedTimeRange field to include open and close time of anomalies.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Added waiters for EKS FargateProfiles.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports route table monitoring, and provides remediation action recommendations to security administrators for AWS Network Firewall policies with misconfigured routes.

# __1.12.19__ __2021-07-07__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS IoT SiteWise__
  - ### Features
    - This release add storage configuration APIs for AWS IoT SiteWise.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for AWS Security Token Service.

## __AWS Storage Gateway__
  - ### Features
    - Adding support for oplocks for SMB file shares,  S3 Access Point and S3 Private Link for all file shares and IP address support for file system associations

## __Amazon Chime__
  - ### Features
    - Releasing new APIs for AWS Chime MediaCapturePipeline

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront now provides two new APIs, ListConflictingAliases and AssociateAlias, that help locate and move Alternate Domain Names (CNAMEs) if you encounter the CNAMEAlreadyExists error code.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds resource ids and tagging support for VPC security group rules.

## __AmazonMQ__
  - ### Features
    - adds support for modifying the maintenance window for brokers.

# __1.12.18__ __2021-07-06__
## __AWS Lambda__
  - ### Features
    - Added support for AmazonMQRabbitMQ as an event source. Added support for VIRTUAL_HOST as SourceAccessType for streams event source mappings.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding new error code UnsupportedAddonModification for Addons in EKS

## __Amazon Macie 2__
  - ### Features
    - Sensitive data findings in Amazon Macie now include enhanced location data for JSON and JSON Lines files

## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for Amazon SNS.

## __Application Migration Service__
  - ### Features
    - Bug fix: Remove not supported EBS encryption type "NONE"

## __EC2 Image Builder__
  - ### Features
    - Adds support for specifying parameters to customize components for recipes. Expands configuration of the Amazon EC2 instances that are used for building and testing images, including the ability to specify commands to run on launch, and more control over installation and removal of the SSM agent.

# __1.12.17__ __2021-07-02__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release removes network-insights-boundary

## __Elastic Load Balancing__
  - ### Features
    - Documentation updates for elasticloadbalancingv2

# __1.12.16__ __2021-07-01__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding a new reserved field to support future infrastructure improvements for Amazon EC2 Fleet.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker model registry now supports up to 5 containers and associated environment variables.

## __Amazon Simple Queue Service__
  - ### Features
    - Documentation updates for Amazon SQS.

# __1.12.15__ __2021-06-30__
## __AWS Cloud Map__
  - ### Features
    - AWS Cloud Map now allows configuring the TTL of the SOA record for a hosted zone to control the negative caching for new services.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Add support for Widevine DRM on CMAF packaging configurations. Both Widevine and FairPlay DRMs can now be used simultaneously, with CBCS encryption.

## __AWS Glue DataBrew__
  - ### Features
    - Adds support for the output of job results to the AWS Glue Data Catalog.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Fixes the tag key length range to 128 chars,  tag value length to 256 chars; Adds support for UTF-8 chars for contact and channel names, Allows users to unset name in UpdateContact API; Adds throttling exception to StopEngagement API, validation exception to APIs UntagResource, ListTagsForResource

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra Enterprise Edition now offered in smaller more granular units to enable customers with smaller workloads. Virtual Storage Capacity units now offer scaling in increments of 100,000 documents (up to 30GB) per unit and Virtual Query Units offer scaling increments of 8,000 queries per day.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling infrastructure improvements and optimizations.

# __1.12.14__ __2021-06-28__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert adds support for HDR10+, ProRes 4444,  and XAVC outputs, ADM/DAMF support for Dolby Atmos ingest, and alternative audio and WebVTT caption ingest via HLS inputs. MediaConvert also now supports creating trickplay outputs for Roku devices for HLS, CMAF, and DASH output groups.

## __AWS Glue__
  - ### Features
    - Add JSON Support for Glue Schema Registry

## __Amazon Redshift__
  - ### Features
    - Added InvalidClusterStateFault to the DisableLogging API, thrown when calling the API on a non available cluster.

## __Amazon SageMaker Service__
  - ### Features
    - Sagemaker Neo now supports running compilation jobs using customer's Amazon VPC

# __1.12.13__ __2021-06-25__
## __AWS Proton__
  - ### Features
    - Added waiters for template registration, service operations, and environment deployments.

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS Snow Family customers can remotely monitor and operate their connected AWS Snowcone devices. AWS Snowball Edge Storage Optimized customers can now import and export their data using NFS.

## __AmplifyBackend__
  - ### Features
    - Imports an existing backend authentication resource.

# __1.12.12__ __2021-06-24__
## __AWS Cloud9__
  - ### Features
    - Minor update to AWS Cloud9 documentation to allow correct parsing of outputted text

## __AWS CodeBuild__
  - ### Features
    - BucketOwnerAccess is currently not supported

## __AWS SecurityHub__
  - ### Features
    - Added new resource details for ECS clusters and ECS task definitions. Added additional information for S3 buckets, Elasticsearch domains, and API Gateway V2 stages.

## __AWS Transfer Family__
  - ### Features
    - Customers can successfully use legacy clients with Transfer Family endpoints enabled for FTPS and FTP behind routers, firewalls, and load balancers by providing a Custom IP address used for data channel communication.

## __AWS WAFV2__
  - ### Features
    - Added support for 15 new text transformation.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports SharePoint 2013 and SharePoint 2016 when using a SharePoint data source.

## __Amazon Chime__
  - ### Features
    - Adds EventIngestionUrl field to MediaPlacement

## __Amazon Connect Service__
  - ### Features
    - Released Amazon Connect quick connects management API for general availability (GA). For more information, see https://docs.aws.amazon.com/connect/latest/APIReference/Welcome.html

## __Amazon DynamoDB Accelerator (DAX)__
  - ### Features
    - Add support for encryption in transit to DAX clusters.

# __1.12.11__ __2021-06-23__
## __AWS Cloud9__
  - ### Features
    - Updated documentation for CreateEnvironmentEC2 to explain that because Amazon Linux AMI has ended standard support as of December 31, 2020, we recommend you choose Amazon Linux 2--which includes long term support through 2023--for new AWS Cloud9 environments.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows license administrators and end users to communicate to each other by setting custom status reasons when updating the status on a granted license.

## __AWS MediaTailor__
  - ### Features
    - Update GetChannelSchedule to return information on ad breaks.

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront adds support for a new security policy, TLSv1.2_2021.

## __Amazon CloudSearch__
  - ### Features
    - This release replaces previous generation CloudSearch instances with equivalent new instances that provide better stability at the same price.

## __Amazon CloudWatch Events__
  - ### Features
    - Added the following parameters to ECS targets: CapacityProviderStrategy, EnableECSManagedTags, EnableExecuteCommand, PlacementConstraints, PlacementStrategy, PropagateTags, ReferenceId, and Tags

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Adds support for S3 based full repository analysis and changed lines scan.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - DocumentDB documentation-only edits

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for provisioning your own IP (BYOIP) range in multiple regions. This feature is in limited Preview for this release. Contact your account manager if you are interested in this feature.

## __Amazon EventBridge__
  - ### Features
    - Added the following parameters to ECS targets: CapacityProviderStrategy, EnableECSManagedTags, EnableExecuteCommand, PlacementConstraints, PlacementStrategy, PropagateTags, ReferenceId, and Tags

## __Amazon QuickSight__
  - ### Features
    - Releasing new APIs for AWS QuickSight Folders

# __1.12.10__ __2021-06-21__
## __AWS CloudFormation__
  - ### Features
    - CloudFormation registry service now supports 3rd party public type sharing

# __1.12.9__ __2021-06-17__
## __AWS SDK for Java__
  - ### Bugfixes
    - Removed 'in-amazon-1' region.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports the indexing of web documents for search through the web crawler.

## __Amazon Chime__
  - ### Features
    - This release adds a new API UpdateSipMediaApplicationCall, to update an in-progress call for SipMediaApplication.

## __Amazon Relational Database Service__
  - ### Features
    - This release enables Database Activity Streams for RDS Oracle

## __Amazon SageMaker Service__
  - ### Features
    - Enable ml.g4dn instance types for SageMaker Batch Transform and SageMaker Processing

# __1.12.8__ __2021-06-16__
## __AWS Key Management Service__
  - ### Features
    - Adds support for multi-Region keys

## __AWS MediaTailor__
  - ### Features
    - Adds AWS Secrets Manager Access Token Authentication for Source Locations

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for VLAN-tagged network traffic over an Elastic Network Interface (ENI). This feature is in limited Preview for this release. Contact your account manager if you are interested in this feature.

## __Amazon Relational Database Service__
  - ### Features
    - This release enables fast cloning in Aurora Serverless. You can now clone between Aurora Serverless clusters and Aurora Provisioned clusters.

# __1.12.7__ __2021-06-15__
## __AWS SDK for Java__
  - ### Features
    - Launch new region in-amazon-1 in India (Begumpet)

## __Amazon Connect Service__
  - ### Features
    - This release adds new sets of APIs: AssociateBot, DisassociateBot, and ListBots. You can use it to programmatically add an Amazon Lex bot or Amazon Lex V2 bot on the specified Amazon Connect instance

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 M5n, M5dn, R5n, R5dn metal instances with 100 Gbps network performance and Elastic Fabric Adapter (EFA) for ultra low latency

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for Multi Valued slots in Amazon Lex V2 APIs for model building

## __Amazon Lex Runtime V2__
  - ### Features
    - This release adds support for Multi Valued slots in Amazon Lex V2 APIs for runtime

## __Redshift Data API Service__
  - ### Features
    - Redshift Data API service now supports SQL parameterization.

# __1.12.6__ __2021-06-14__
## __AWS IoT Analytics__
  - ### Features
    - Adds support for data store partitions.

## __AWS IoT Greengrass V2__
  - ### Features
    - We have verified the APIs being released here and are ready to release

## __AWS SDK for Java__
  - ### Bugfixes
    - Added path normalization when creating a canonical request for signers. Supports pathnames with dots.

## __Amazon Lookout for Metrics__
  - ### Features
    - Added "LEARNING" status for anomaly detector and updated description for "Offset" parameter in MetricSet APIs.

# __1.12.5__ __2021-06-11__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS MediaLive now supports OCR-based conversion of DVB-Sub and SCTE-27 image-based source captions to WebVTT, and supports ingest of ad avail decorations in HLS input manifests.

## __AWS MediaConnect__
  - ### Features
    - When you enable source failover, you can now designate one of two sources as the primary source. You can choose between two failover modes to prevent any disruption to the video stream. Merge combines the sources into a single stream. Failover allows switching between a primary and a backup stream.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 adds new AMI property to flag outdated AMIs

# __1.12.4__ __2021-06-10__
## __AWS App Mesh__
  - ### Features
    - AppMesh now supports additional routing capabilities in match and rewrites for Gateway Routes and Routes. Additionally, App Mesh also supports specifying DNS Response Types in Virtual Nodes.

## __AWS Resource Access Manager__
  - ### Features
    - AWS Resource Access Manager (RAM) is releasing new field isResourceTypeDefault in ListPermissions and GetPermission response, and adding permissionArn parameter to GetResourceShare request to filter by permission attached

## __Amazon Appflow__
  - ### Features
    - Adding MAP_ALL task type support.

## __Amazon Chime__
  - ### Features
    - This SDK release adds support for UpdateAccount API to allow users to update their default license on Chime account.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito now supports targeted sign out through refresh token revocation

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new optional parameter connectivityType (public, private) for the CreateNatGateway API. Private NatGateway does not require customers to attach an InternetGateway to the VPC and can be used for communication with other VPCs and on-premise networks.

## __Amazon Managed Blockchain__
  - ### Features
    - This release supports KMS customer-managed Customer Master Keys (CMKs) on member-specific Hyperledger Fabric resources.

## __Amazon Redshift__
  - ### Features
    - Added InvalidClusterStateFault to the ModifyAquaConfiguration API, thrown when calling the API on a non available cluster.

## __Amazon SageMaker Feature Store Runtime__
  - ### Features
    - Release BatchGetRecord API for AWS SageMaker Feature Store Runtime.

## __Amazon SageMaker Service__
  - ### Features
    - Using SageMaker Edge Manager with AWS IoT Greengrass v2 simplifies accessing, maintaining, and deploying models to your devices. You can now create deployable IoT Greengrass components during edge packaging jobs. You can choose to create a device fleet with or without creating an AWS IoT role alias.

# __1.12.3__ __2021-06-09__
## __AWS Proton__
  - ### Features
    - This is the initial SDK release for AWS Proton

## __AWS Transfer Family__
  - ### Features
    - Documentation updates for the AWS Transfer Family service.

## __AWSKendraFrontendService__
  - ### Features
    - AWS Kendra now supports checking document status.

## __Amazon Personalize Events__
  - ### Features
    - Support for unstructured text inputs in the items dataset to to automatically extract key information from product/content description as an input when creating solution versions.

# __1.12.2__ __2021-06-08__
## __AWS Service Catalog__
  - ### Features
    - increase max pagesize for List/Search apis

## __Amazon Cognito Identity Provider__
  - ### Features
    - Documentation updates for cognito-idp

## __Amazon FSx__
  - ### Features
    - This release adds support for auditing end-user access to files, folders, and file shares using Windows event logs, enabling customers to meet their security and compliance needs.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API introduces stricter validation of S3 object criteria for classification jobs.

# __1.12.1__ __2021-06-07__
## __AWS Glue__
  - ### Features
    - Add SampleSize variable to S3Target to enable s3-sampling feature through API.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Added updateConfig option that allows customers to control upgrade velocity in Managed Node Group.

## __Amazon Personalize__
  - ### Features
    - Update regex validation in kmsKeyArn and s3 path API parameters for AWS Personalize APIs

## __Amazon SageMaker Service__
  - ### Features
    - AWS SageMaker - Releasing new APIs related to Callback steps in model building pipelines. Adds experiment integration to model building pipelines.

