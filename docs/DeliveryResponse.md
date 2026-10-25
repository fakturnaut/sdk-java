

# DeliveryResponse

A delivery of an invoice.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | **String** | &lt;code&gt;peppol&lt;/code&gt;, &lt;code&gt;email&lt;/code&gt; or &lt;code&gt;anaf&lt;/code&gt; |  [optional] |
|**createdAt** | **OffsetDateTime** | creation time |  [optional] |
|**error** | **String** | last error |  [optional] |
|**externalId** | **String** | identifier at the channel (access point document ID, e-mail Message-ID, ANAF upload index) |  [optional] |
|**failure** | [**DeliveryFailure**](DeliveryFailure.md) | why a Peppol delivery did not arrive, if it did not |  [optional] |
|**id** | **UUID** | identifier |  [optional] |
|**invoiceId** | **UUID** | delivered invoice |  [optional] |
|**peppol** | [**PeppolReferences**](PeppolReferences.md) | access point references of a real Peppol delivery, if any |  [optional] |
|**recipient** | **String** | recipient |  [optional] |
|**simulated** | **Boolean** | &lt;code&gt;true&lt;/code&gt; if nothing was really sent (simulated Peppol access point) |  [optional] |
|**status** | **String** | &lt;code&gt;PENDING&lt;/code&gt;, &lt;code&gt;SENT&lt;/code&gt;, &lt;code&gt;DELIVERED&lt;/code&gt;, &lt;code&gt;REJECTED&lt;/code&gt;, &lt;code&gt;UNCONFIRMED&lt;/code&gt;,      &lt;code&gt;FAILED&lt;/code&gt; or &lt;code&gt;OUTCOME_UNKNOWN&lt;/code&gt; (the access point may have the invoice; it is looked for, never      resent blindly) |  [optional] |
|**updatedAt** | **OffsetDateTime** | last status change |  [optional] |



