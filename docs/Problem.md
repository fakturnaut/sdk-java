

# Problem

Error response (RFC 9457, application/problem+json)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessPoint** | [**ProblemAccessPoint**](ProblemAccessPoint.md) |  |  [optional] |
|**code** | **String** | Stable error code, e.g. invoice.invalid or sandbox.live-only |  [optional] |
|**detail** | **String** | Explanation in English |  [optional] |
|**errors** | [**List&lt;ProblemErrorsInner&gt;**](ProblemErrorsInner.md) | Invalid fields, for request.invalid |  [optional] |
|**findings** | [**List&lt;FindingDto&gt;**](FindingDto.md) | Rule violations, for invoice.invalid |  [optional] |
|**instance** | **String** | Request path |  [optional] |
|**message** | [**LocalizedText**](LocalizedText.md) | Plain-language explanation in German and English, for document.unreadable |  [optional] |
|**status** | **Integer** | HTTP status code |  |
|**title** | **String** | Short summary of the HTTP status |  [optional] |
|**type** | **String** | Problem type URI; about:blank for most errors |  [optional] |



