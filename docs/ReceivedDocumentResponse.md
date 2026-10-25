

# ReceivedDocumentResponse

A document received over Peppol.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentType** | **String** | Peppol document type |  [optional] |
|**href** | **String** | API path to download the document as received |  [optional] |
|**id** | **UUID** | identifier |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | &lt;code&gt;invoice&lt;/code&gt;, &lt;code&gt;credit-note&lt;/code&gt;, &lt;code&gt;other&lt;/code&gt; (orders, responses, ...) or &lt;code&gt;document&lt;/code&gt;      (received before documents were classified) |  [optional] |
|**messageId** | **String** | access point message identifier |  [optional] |
|**pdfHref** | **String** | API path of a readable PDF view, for invoices and credit notes |  [optional] |
|**receivedAt** | **OffsetDateTime** | time of receipt |  [optional] |
|**reportHref** | **String** | API path of the validation report, if one is stored |  [optional] |
|**sellerId** | **UUID** | receiving seller entity |  [optional] |
|**sender** | **String** | sending participant |  [optional] |
|**validation** | [**ValidationEnum**](#ValidationEnum) | our validation result for invoices and credit notes: &lt;code&gt;valid&lt;/code&gt; or &lt;code&gt;invalid&lt;/code&gt; |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| INVOICE | &quot;invoice&quot; |
| CREDIT_NOTE | &quot;credit-note&quot; |
| OTHER | &quot;other&quot; |
| DOCUMENT | &quot;document&quot; |



## Enum: ValidationEnum

| Name | Value |
|---- | -----|
| VALID | &quot;valid&quot; |
| INVALID | &quot;invalid&quot; |



