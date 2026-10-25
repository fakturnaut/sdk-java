

# PartyDto

A party (buyer, or seller entity data).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | [**AddressDto**](AddressDto.md) | postal address |  |
|**contact** | [**ContactDto**](ContactDto.md) | contact details |  [optional] |
|**electronicAddress** | **String** | electronic address (BT-34 / BT-49) |  [optional] |
|**electronicAddressScheme** | **String** | EAS code, e.g. &lt;code&gt;EM&lt;/code&gt; or &lt;code&gt;0204&lt;/code&gt; |  [optional] |
|**identifier** | **String** | party identifier (e.g. GLN) |  [optional] |
|**identifierScheme** | **String** | ISO 6523 scheme of the identifier |  [optional] |
|**legalRegistrationId** | **String** | legal registration identifier |  [optional] |
|**name** | **String** | registered name |  |
|**taxNumber** | **String** | local tax number (sellers only) |  [optional] |
|**tradingName** | **String** | trading name |  [optional] |
|**vatId** | **String** | VAT identifier with country prefix |  [optional] |



