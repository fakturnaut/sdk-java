

# InspectionResponse

Result of checking a received document.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**findings** | [**List&lt;FindingDto&gt;**](FindingDto.md) | all findings |  [optional] |
|**format** | [**LocalizedText**](LocalizedText.md) | detected format, e.g. \&quot;XRechnung (UBL)\&quot;; &lt;code&gt;null&lt;/code&gt; if unreadable |  [optional] |
|**html** | **String** | readable HTML view; &lt;code&gt;null&lt;/code&gt; if unreadable |  [optional] |
|**invoice** | [**InvoiceSummaryDto**](InvoiceSummaryDto.md) | key data; &lt;code&gt;null&lt;/code&gt; if unreadable |  [optional] |
|**summary** | [**LocalizedText**](LocalizedText.md) | plain-language verdict |  [optional] |
|**valid** | **Boolean** | &lt;code&gt;true&lt;/code&gt; if the document is a valid e-invoice |  [optional] |



