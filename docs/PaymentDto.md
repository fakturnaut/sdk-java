

# PaymentDto

Payment instructions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountName** | **String** | account holder (BT-85) |  [optional] |
|**bic** | **String** | payee BIC (BT-86) |  [optional] |
|**creditorId** | **String** | SEPA creditor identifier (BT-90) |  [optional] |
|**debitedIban** | **String** | IBAN to be debited (BT-91) |  [optional] |
|**iban** | **String** | payee IBAN (BT-84) |  [optional] |
|**mandateReference** | **String** | SEPA mandate reference (BT-89) |  [optional] |
|**meansCode** | **String** | UNTDID 4461 code, default 58 (SEPA credit transfer) |  [optional] |
|**remittanceInformation** | **String** | reference to quote with the payment (BT-83) |  [optional] |



