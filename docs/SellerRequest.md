

# SellerRequest

Request to create a seller entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountName** | **String** | holder of the default account |  [optional] |
|**authorizationConfirmed** | **Boolean** | &lt;code&gt;true&lt;/code&gt; to confirm that the seller authorised the tenant to issue and      receive invoices on its behalf (attestation &lt;code&gt;seller-authorization-v1&lt;/code&gt;, needed for verification) |  [optional] |
|**bic** | **String** | BIC of the default account |  [optional] |
|**iban** | **String** | default account for SEPA credit transfer |  [optional] |
|**party** | [**PartyDto**](PartyDto.md) | seller party data (BG-4) |  |



