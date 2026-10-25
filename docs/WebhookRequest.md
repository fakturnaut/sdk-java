

# WebhookRequest

Request to register a webhook endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | event types it receives: &lt;code&gt;invoice.issued&lt;/code&gt;, &lt;code&gt;delivery.updated&lt;/code&gt;,      &lt;code&gt;document.received&lt;/code&gt;, &lt;code&gt;seller.status_changed&lt;/code&gt;, &lt;code&gt;invoice.received&lt;/code&gt;; omitted or empty means      all |  [optional] |
|**url** | **String** | https URL |  |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| INVOICE_ISSUED | &quot;invoice.issued&quot; |
| DELIVERY_UPDATED | &quot;delivery.updated&quot; |
| DOCUMENT_RECEIVED | &quot;document.received&quot; |
| SELLER_STATUS_CHANGED | &quot;seller.status_changed&quot; |
| INVOICE_RECEIVED | &quot;invoice.received&quot; |



