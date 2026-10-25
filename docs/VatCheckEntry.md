

# VatCheckEntry

One VAT ID check.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cached** | **Boolean** | whether an answer from the last 24 hours was reused |  [optional] |
|**checkedAt** | **OffsetDateTime** | when it was checked |  [optional] |
|**errorCode** | **String** | the registry&#39;s error code when unavailable |  [optional] |
|**id** | **UUID** | identifier |  [optional] |
|**nameScore** | **Integer** | similarity 0–100 with the seller&#39;s name, if a name came back |  [optional] |
|**outcome** | **String** | &lt;code&gt;valid&lt;/code&gt;, &lt;code&gt;invalid&lt;/code&gt;, &lt;code&gt;malformed&lt;/code&gt; or &lt;code&gt;unavailable&lt;/code&gt; |  [optional] |
|**registeredName** | **String** | name the registry returned, if any |  [optional] |
|**requestIdentifier** | **String** | the registry&#39;s consultation reference, if any |  [optional] |
|**vatId** | **String** | checked VAT ID |  [optional] |



