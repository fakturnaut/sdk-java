

# ApiKeyRequest

Request to create an API key.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | **String** | &lt;code&gt;live&lt;/code&gt; (default) or &lt;code&gt;test&lt;/code&gt;: a test key (&lt;code&gt;fkn_test_...&lt;/code&gt;) reaches only the sandbox      (ADR 0038) and has scope &lt;code&gt;invoices&lt;/code&gt; |  [optional] |
|**name** | **String** | human-readable name, e.g. \&quot;production\&quot; |  |
|**scopes** | **List&lt;String&gt;** | &lt;code&gt;invoices&lt;/code&gt; and/or &lt;code&gt;admin&lt;/code&gt;; omitted or empty means &lt;code&gt;invoices&lt;/code&gt; |  [optional] |



