

# SellerResponse

A seller entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountName** | **String** | holder of the default account |  [optional] |
|**bic** | **String** | BIC of the default account |  [optional] |
|**createdAt** | **OffsetDateTime** | creation time |  [optional] |
|**iban** | **String** | default account |  [optional] |
|**id** | **UUID** | identifier |  [optional] |
|**party** | [**PartyDto**](PartyDto.md) | seller party data |  [optional] |
|**verification** | [**VerificationSummary**](VerificationSummary.md) | verification state (real Peppol needs &lt;code&gt;verified&lt;/code&gt;, ADR 0012) |  [optional] |



