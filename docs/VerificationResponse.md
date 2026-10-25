

# VerificationResponse

Full verification details of a seller.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attestationVersion** | **String** | version of the confirmed text, if attested |  [optional] |
|**attestedAt** | **OffsetDateTime** | when the tenant confirmed, if attested |  [optional] |
|**checks** | [**List&lt;VatCheckEntry&gt;**](VatCheckEntry.md) | VAT ID checks, newest first |  [optional] |
|**documents** | [**List&lt;DocumentEntry&gt;**](DocumentEntry.md) | supporting documents, newest first |  [optional] |
|**history** | [**List&lt;HistoryEntry&gt;**](HistoryEntry.md) | status changes, oldest first |  [optional] |
|**verification** | [**VerificationSummary**](VerificationSummary.md) | current state |  [optional] |



