

# WebhookDeliveryResponse

One entry of a webhook endpoint's delivery log.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attempts** | **Integer** | attempts so far |  [optional] |
|**createdAt** | **OffsetDateTime** | creation time |  [optional] |
|**eventId** | **UUID** | event identifier |  [optional] |
|**eventType** | **String** | event type |  [optional] |
|**id** | **UUID** | identifier |  [optional] |
|**lastError** | **String** | error of the last attempt |  [optional] |
|**lastStatusCode** | **Integer** | HTTP status of the last attempt |  [optional] |
|**nextAttemptAt** | **OffsetDateTime** | next attempt (pending only) |  [optional] |
|**status** | **String** | &lt;code&gt;PENDING&lt;/code&gt;, &lt;code&gt;DELIVERED&lt;/code&gt; or &lt;code&gt;FAILED&lt;/code&gt; |  [optional] |



