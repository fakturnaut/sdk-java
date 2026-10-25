

# InvoiceResponse

An issued invoice.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amountDue** | **BigDecimal** | amount due (BT-115) |  [optional] |
|**buyerName** | **String** | buyer name (BT-44) |  [optional] |
|**createdAt** | **OffsetDateTime** | archiving time |  [optional] |
|**currency** | **String** | currency (BT-5) |  [optional] |
|**documents** | [**List&lt;DocumentDto&gt;**](DocumentDto.md) | archived documents (empty in list results) |  [optional] |
|**findings** | [**List&lt;FindingDto&gt;**](FindingDto.md) | warnings and information found while issuing; &lt;code&gt;null&lt;/code&gt; when not freshly issued |  [optional] |
|**id** | **UUID** | identifier |  [optional] |
|**issueDate** | **LocalDate** | issue date (BT-2) |  [optional] |
|**number** | **String** | invoice number (BT-1) |  [optional] |
|**sellerId** | **UUID** | issuing seller entity |  [optional] |
|**typeCode** | **String** | type code (BT-3) |  [optional] |



