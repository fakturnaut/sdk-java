

# FindingDto

A validation finding.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**location** | **String** | business term or XPath the finding refers to |  [optional] |
|**message** | [**LocalizedText**](LocalizedText.md) | plain-language explanation in German and English |  [optional] |
|**ruleId** | **String** | official or engine rule identifier, e.g. &lt;code&gt;BR-CO-10&lt;/code&gt; |  [optional] |
|**severity** | **String** | &lt;code&gt;ERROR&lt;/code&gt;, &lt;code&gt;WARNING&lt;/code&gt; or &lt;code&gt;INFO&lt;/code&gt; |  [optional] |
|**source** | **String** | &lt;code&gt;BUSINESS_RULES&lt;/code&gt;, &lt;code&gt;XML_SCHEMA&lt;/code&gt;, &lt;code&gt;SCHEMATRON&lt;/code&gt; or &lt;code&gt;DOCUMENT&lt;/code&gt; |  [optional] |



