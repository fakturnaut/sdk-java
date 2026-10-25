

# AllowanceChargeDto

An allowance or charge, on document or line level.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **BigDecimal** | fixed amount; ignored if a percentage is given |  [optional] |
|**baseAmount** | **BigDecimal** | base amount for the percentage |  [optional] |
|**percentage** | **BigDecimal** | percentage of the base amount |  [optional] |
|**reason** | **String** | reason text |  [optional] |
|**reasonCode** | **String** | UNTDID 5189 / 7161 reason code |  [optional] |
|**vatCategory** | **String** | VAT category code (document level only), default S |  [optional] |
|**vatRate** | **BigDecimal** | VAT rate in percent (document level only) |  [optional] |



