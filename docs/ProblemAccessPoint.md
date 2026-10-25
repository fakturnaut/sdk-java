

# ProblemAccessPoint

Optional, only on Peppol refusals (codes peppol.*) and only for API keys with scope admin: what the Peppol access point answered. For diagnosis by a person; the text is not stable and may change at any time, so never parse it: use code.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | The access point&#39;s own text in English, at most 300 characters; references to its support and its own e-mail addresses and URLs are removed as far as recognised; may be empty |  [optional] |
|**status** | **Integer** | HTTP status the Peppol access point answered with |  [optional] |



