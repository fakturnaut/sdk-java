

# ApiKeyResponse

An API key.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | creation time |  [optional] |
|**id** | **UUID** | identifier |  [optional] |
|**key** | **String** | the full key; only present in the response that created it |  [optional] |
|**lastUsedAt** | **OffsetDateTime** | last use (minute precision) |  [optional] |
|**mode** | **String** | &lt;code&gt;live&lt;/code&gt; or &lt;code&gt;test&lt;/code&gt; (sandbox only, ADR 0038) |  [optional] |
|**name** | **String** | name |  [optional] |
|**prefix** | **String** | public prefix, e.g. &lt;code&gt;fkn_ab12cd34ef56&lt;/code&gt; |  [optional] |
|**revokedAt** | **OffsetDateTime** | revocation time |  [optional] |
|**scopes** | **List&lt;String&gt;** | what the key may do: &lt;code&gt;invoices&lt;/code&gt; and/or &lt;code&gt;admin&lt;/code&gt; |  [optional] |



