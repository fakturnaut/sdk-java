

# ValidationResponse

Result of validating an invoice without issuing it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**findings** | [**List&lt;FindingDto&gt;**](FindingDto.md) | all findings |  [optional] |
|**summary** | [**LocalizedText**](LocalizedText.md) | plain-language verdict |  [optional] |
|**totals** | [**TotalsDto**](TotalsDto.md) | calculated totals |  [optional] |
|**valid** | **Boolean** | &lt;code&gt;true&lt;/code&gt; if the invoice has no error and could be issued |  [optional] |



