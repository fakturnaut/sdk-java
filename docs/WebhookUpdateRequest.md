

# WebhookUpdateRequest

Request to change a webhook endpoint; omitted fields stay as they are.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | new event types; an empty list means all |  [optional] |
|**url** | **String** | new https URL |  [optional] |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| INVOICE_ISSUED | &quot;invoice.issued&quot; |
| DELIVERY_UPDATED | &quot;delivery.updated&quot; |
| DOCUMENT_RECEIVED | &quot;document.received&quot; |
| SELLER_STATUS_CHANGED | &quot;seller.status_changed&quot; |
| INVOICE_RECEIVED | &quot;invoice.received&quot; |



