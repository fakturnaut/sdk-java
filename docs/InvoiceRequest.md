

# InvoiceRequest

Request to validate or issue an invoice. Seller data comes from the referenced seller entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowances** | [**List&lt;AllowanceChargeDto&gt;**](AllowanceChargeDto.md) | document-level allowances (BG-20) |  [optional] |
|**buyer** | [**PartyDto**](PartyDto.md) | buyer (BG-7) |  |
|**buyerReference** | **String** | buyer reference or Leitweg-ID (BT-10) |  [optional] |
|**charges** | [**List&lt;AllowanceChargeDto&gt;**](AllowanceChargeDto.md) | document-level charges (BG-21) |  [optional] |
|**contractReference** | **String** | contract reference (BT-12) |  [optional] |
|**currency** | **String** | ISO 4217 currency (BT-5), default EUR |  [optional] |
|**deliveryAddress** | [**AddressDto**](AddressDto.md) | the address the goods go to (BG-15), needed for intra-community supplies (BR-IC-12) |  [optional] |
|**deliveryDate** | **LocalDate** | actual delivery date (BT-72) |  [optional] |
|**deliveryPartyName** | **String** | the name of the party receiving the goods (BT-70) |  [optional] |
|**dueDate** | **LocalDate** | payment due date (BT-9) |  [optional] |
|**formats** | **List&lt;String&gt;** | formats to generate: &lt;code&gt;xrechnung-ubl&lt;/code&gt;, &lt;code&gt;xrechnung-cii&lt;/code&gt;, &lt;code&gt;zugferd&lt;/code&gt;,      &lt;code&gt;ro-efactura-ubl&lt;/code&gt;, &lt;code&gt;ro-efactura-cii&lt;/code&gt;; none means the seller country&#39;s formats |  [optional] |
|**invoicePeriod** | [**PeriodDto**](PeriodDto.md) | invoicing period (BG-14) |  [optional] |
|**issueDate** | **LocalDate** | issue date (BT-2) |  |
|**lines** | [**List&lt;LineDto&gt;**](LineDto.md) | invoice lines (BG-25) |  |
|**notes** | [**List&lt;Note&gt;**](Note.md) | invoice notes (BG-1) |  [optional] |
|**number** | **String** | invoice number (BT-1) |  |
|**payment** | [**PaymentDto**](PaymentDto.md) | payment instructions (BG-16); default: SEPA transfer to the seller&#39;s account |  [optional] |
|**paymentTerms** | **String** | payment terms text (BT-20) |  [optional] |
|**precedingInvoices** | [**List&lt;PrecedingInvoice&gt;**](PrecedingInvoice.md) | preceding invoices, for credit notes and corrections (BG-3) |  [optional] |
|**prepaidAmount** | **BigDecimal** | amount already paid (BT-113) |  [optional] |
|**projectReference** | **String** | project reference (BT-11) |  [optional] |
|**purchaseOrderReference** | **String** | purchase order reference (BT-13) |  [optional] |
|**seller** | [**PartyDto**](PartyDto.md) | seller party data (public create tool only; the API takes it from the seller entity) |  [optional] |
|**sellerId** | **UUID** | seller entity issuing the invoice (API; required there) |  [optional] |
|**taxRepresentative** | [**TaxRepresentativeDto**](TaxRepresentativeDto.md) | seller tax representative (BG-11) |  [optional] |
|**typeCode** | **String** | UNTDID 1001 type code (BT-3), default 380 |  [optional] |
|**vatAccounting** | [**VatAccountingDto**](VatAccountingDto.md) | VAT accounting currency and the VAT total in it (BT-6, BT-111), e.g. RON for a Romanian      seller&#39;s EUR invoice |  [optional] |
|**vatExemptions** | [**List&lt;VatExemptionDto&gt;**](VatExemptionDto.md) | exemption reasons per VAT category, overriding the country defaults (BT-120/121) |  [optional] |



