

# PeppolStatusResponse

A seller's Peppol registration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | when Peppol was activated |  [optional] |
|**explanation** | [**PeppolTexts**](PeppolTexts.md) | who must open the link, and why |  [optional] |
|**receiveRequested** | **Boolean** | whether the seller asked to receive through us |  [optional] |
|**receiving** | **Boolean** | whether the seller is registered to receive Peppol invoices through us |  [optional] |
|**receivingBlocked** | [**PeppolReceivingBlocked**](PeppolReceivingBlocked.md) | why receiving is off although requested |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | the access point&#39;s identity check: &lt;code&gt;pending&lt;/code&gt;, &lt;code&gt;verified&lt;/code&gt;, &lt;code&gt;rejected&lt;/code&gt; or      &lt;code&gt;error&lt;/code&gt; |  [optional] |
|**statusChangedAt** | **OffsetDateTime** | when the identity check last changed |  [optional] |
|**statusMessage** | **String** | the message behind &lt;code&gt;statusReason&lt;/code&gt;, in English |  [optional] |
|**statusReason** | [**StatusReasonEnum**](#StatusReasonEnum) | why the status is &lt;code&gt;error&lt;/code&gt;: &lt;code&gt;identifiers-pending&lt;/code&gt; (a new VAT ID or register      number has not reached the access point yet; retried), &lt;code&gt;identifiers-invalid&lt;/code&gt; (the new identifiers      cannot be used for Peppol), &lt;code&gt;identifiers-refused&lt;/code&gt; (the access point refused them; correct the seller),      or &lt;code&gt;access-point&lt;/code&gt; (the access point&#39;s own message) |  [optional] |
|**updatedAt** | **OffsetDateTime** | last change |  [optional] |
|**verificationUrl** | **String** | the link an authorised representative opens for the identity check; only for keys with      scope &lt;code&gt;admin&lt;/code&gt; and while the check is not verified |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| VERIFIED | &quot;verified&quot; |
| REJECTED | &quot;rejected&quot; |
| ERROR | &quot;error&quot; |



## Enum: StatusReasonEnum

| Name | Value |
|---- | -----|
| IDENTIFIERS_PENDING | &quot;identifiers-pending&quot; |
| IDENTIFIERS_INVALID | &quot;identifiers-invalid&quot; |
| IDENTIFIERS_REFUSED | &quot;identifiers-refused&quot; |
| ACCESS_POINT | &quot;access-point&quot; |



