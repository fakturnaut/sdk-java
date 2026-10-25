

# LineDto

An invoice line.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowances** | [**List&lt;AllowanceChargeDto&gt;**](AllowanceChargeDto.md) | line allowances |  [optional] |
|**baseQuantity** | **BigDecimal** | price base quantity (BT-149) |  [optional] |
|**charges** | [**List&lt;AllowanceChargeDto&gt;**](AllowanceChargeDto.md) | line charges |  [optional] |
|**description** | **String** | item description (BT-154) |  [optional] |
|**id** | **String** | line identifier, default its position |  [optional] |
|**name** | **String** | item name (BT-153) |  |
|**netPrice** | **BigDecimal** | net unit price (BT-146) |  |
|**period** | [**PeriodDto**](PeriodDto.md) | line period |  [optional] |
|**quantity** | **BigDecimal** | invoiced quantity (BT-129) |  |
|**sellerItemId** | **String** | seller&#39;s item identifier (BT-155) |  [optional] |
|**unitCode** | **String** | UN/ECE Rec. 20 unit code (BT-130), default C62 |  [optional] |
|**vatCategory** | **String** | VAT category code, default S |  [optional] |
|**vatRate** | **BigDecimal** | VAT rate in percent |  [optional] |



