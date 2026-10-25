

# WebhookResponse

A webhook endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | creation time |  [optional] |
|**disabledAt** | **OffsetDateTime** | removal time |  [optional] |
|**events** | **List&lt;String&gt;** | event types it receives; empty means all |  [optional] |
|**id** | **UUID** | identifier |  [optional] |
|**secret** | **String** | signing secret; only in the response that created the endpoint or rotated its secret |  [optional] |
|**url** | **String** | target URL |  [optional] |



