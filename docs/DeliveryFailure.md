

# DeliveryFailure

Why a Peppol delivery did not arrive.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | stable code: &lt;code&gt;not-on-peppol&lt;/code&gt;, &lt;code&gt;format-not-supported&lt;/code&gt;, &lt;code&gt;validation&lt;/code&gt;,      &lt;code&gt;transport&lt;/code&gt;, &lt;code&gt;recipient-rejected&lt;/code&gt;, &lt;code&gt;duplicate&lt;/code&gt;, &lt;code&gt;sender-not-registered&lt;/code&gt;,      &lt;code&gt;sender-not-verified&lt;/code&gt; or &lt;code&gt;other&lt;/code&gt; |  [optional] |
|**de** | **String** | German explanation |  [optional] |
|**en** | **String** | English explanation |  [optional] |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| NOT_ON_PEPPOL | &quot;not-on-peppol&quot; |
| FORMAT_NOT_SUPPORTED | &quot;format-not-supported&quot; |
| VALIDATION | &quot;validation&quot; |
| TRANSPORT | &quot;transport&quot; |
| RECIPIENT_REJECTED | &quot;recipient-rejected&quot; |
| DUPLICATE | &quot;duplicate&quot; |
| SENDER_NOT_REGISTERED | &quot;sender-not-registered&quot; |
| SENDER_NOT_VERIFIED | &quot;sender-not-verified&quot; |
| OTHER | &quot;other&quot; |



