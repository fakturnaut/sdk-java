# InvoicesApi

All URIs are relative to *https://api.fakturnaut.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadInvoiceDocument**](InvoicesApi.md#downloadInvoiceDocument) | **GET** /invoices/{id}/document | Downloads an archived document exactly as issued. |
| [**downloadInvoiceDocumentWithHttpInfo**](InvoicesApi.md#downloadInvoiceDocumentWithHttpInfo) | **GET** /invoices/{id}/document | Downloads an archived document exactly as issued. |
| [**getInvoice**](InvoicesApi.md#getInvoice) | **GET** /invoices/{id} | Returns an invoice with links to its documents. |
| [**getInvoiceWithHttpInfo**](InvoicesApi.md#getInvoiceWithHttpInfo) | **GET** /invoices/{id} | Returns an invoice with links to its documents. |
| [**issueInvoice**](InvoicesApi.md#issueInvoice) | **POST** /invoices | Issues an invoice: validates it, generates the requested formats, checks them officially and archives them. |
| [**issueInvoiceWithHttpInfo**](InvoicesApi.md#issueInvoiceWithHttpInfo) | **POST** /invoices | Issues an invoice: validates it, generates the requested formats, checks them officially and archives them. |
| [**listInvoices**](InvoicesApi.md#listInvoices) | **GET** /invoices | Lists the tenant&#39;s invoices, newest first. |
| [**listInvoicesWithHttpInfo**](InvoicesApi.md#listInvoicesWithHttpInfo) | **GET** /invoices | Lists the tenant&#39;s invoices, newest first. |
| [**validateInvoice**](InvoicesApi.md#validateInvoice) | **POST** /invoices/validate | Validates an invoice without issuing it and returns the calculated totals. |
| [**validateInvoiceWithHttpInfo**](InvoicesApi.md#validateInvoiceWithHttpInfo) | **POST** /invoices/validate | Validates an invoice without issuing it and returns the calculated totals. |



## downloadInvoiceDocument

> File downloadInvoiceDocument(id, format)

Downloads an archived document exactly as issued.

Downloads an archived document exactly as issued.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fakturnaut.com/v1");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | invoice identifier
        String format = "format_example"; // String | <code>xrechnung-ubl</code>, <code>xrechnung-cii</code>, <code>zugferd</code>, <code>ro-efactura-ubl</code> or <code>ro-efactura-cii</code>
        try {
            File result = apiInstance.downloadInvoiceDocument(id, format);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#downloadInvoiceDocument");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| invoice identifier | |
| **format** | **String**| &lt;code&gt;xrechnung-ubl&lt;/code&gt;, &lt;code&gt;xrechnung-cii&lt;/code&gt;, &lt;code&gt;zugferd&lt;/code&gt;, &lt;code&gt;ro-efactura-ubl&lt;/code&gt; or &lt;code&gt;ro-efactura-cii&lt;/code&gt; | |

### Return type

[**File**](File.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/xml, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the document bytes with their media type; the ETag is the SHA-256 of the content |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## downloadInvoiceDocumentWithHttpInfo

> ApiResponse<File> downloadInvoiceDocumentWithHttpInfo(id, format)

Downloads an archived document exactly as issued.

Downloads an archived document exactly as issued.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fakturnaut.com/v1");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | invoice identifier
        String format = "format_example"; // String | <code>xrechnung-ubl</code>, <code>xrechnung-cii</code>, <code>zugferd</code>, <code>ro-efactura-ubl</code> or <code>ro-efactura-cii</code>
        try {
            ApiResponse<File> response = apiInstance.downloadInvoiceDocumentWithHttpInfo(id, format);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#downloadInvoiceDocument");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| invoice identifier | |
| **format** | **String**| &lt;code&gt;xrechnung-ubl&lt;/code&gt;, &lt;code&gt;xrechnung-cii&lt;/code&gt;, &lt;code&gt;zugferd&lt;/code&gt;, &lt;code&gt;ro-efactura-ubl&lt;/code&gt; or &lt;code&gt;ro-efactura-cii&lt;/code&gt; | |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/xml, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the document bytes with their media type; the ETag is the SHA-256 of the content |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## getInvoice

> InvoiceResponse getInvoice(id)

Returns an invoice with links to its documents.

Returns an invoice with links to its documents.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fakturnaut.com/v1");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | invoice identifier
        try {
            InvoiceResponse result = apiInstance.getInvoice(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#getInvoice");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| invoice identifier | |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the invoice |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## getInvoiceWithHttpInfo

> ApiResponse<InvoiceResponse> getInvoiceWithHttpInfo(id)

Returns an invoice with links to its documents.

Returns an invoice with links to its documents.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fakturnaut.com/v1");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | invoice identifier
        try {
            ApiResponse<InvoiceResponse> response = apiInstance.getInvoiceWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#getInvoice");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| invoice identifier | |

### Return type

ApiResponse<[**InvoiceResponse**](InvoiceResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the invoice |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## issueInvoice

> InvoiceResponse issueInvoice(invoiceRequest, idempotencyKey)

Issues an invoice: validates it, generates the requested formats, checks them officially and archives them.

Issues an invoice: validates it, generates the requested formats, checks them officially and archives them.  A repeated request with the same &lt;code&gt;Idempotency-Key&lt;/code&gt; and body returns the original invoice.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fakturnaut.com/v1");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        InvoiceRequest invoiceRequest = new InvoiceRequest(); // InvoiceRequest | invoice data
        String idempotencyKey = "idempotencyKey_example"; // String | optional idempotency key
        try {
            InvoiceResponse result = apiInstance.issueInvoice(invoiceRequest, idempotencyKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#issueInvoice");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceRequest** | [**InvoiceRequest**](InvoiceRequest.md)| invoice data | |
| **idempotencyKey** | **String**| optional idempotency key | [optional] |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A repeat with the same Idempotency-Key and body: the original result, with header Idempotent-Replayed: true |  * Idempotent-Replayed - true for a replayed result <br>  |
| **201** | 201 with the archived invoice, or 200 with header &lt;code&gt;Idempotent-Replayed: true&lt;/code&gt; for a repeat |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## issueInvoiceWithHttpInfo

> ApiResponse<InvoiceResponse> issueInvoiceWithHttpInfo(invoiceRequest, idempotencyKey)

Issues an invoice: validates it, generates the requested formats, checks them officially and archives them.

Issues an invoice: validates it, generates the requested formats, checks them officially and archives them.  A repeated request with the same &lt;code&gt;Idempotency-Key&lt;/code&gt; and body returns the original invoice.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fakturnaut.com/v1");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        InvoiceRequest invoiceRequest = new InvoiceRequest(); // InvoiceRequest | invoice data
        String idempotencyKey = "idempotencyKey_example"; // String | optional idempotency key
        try {
            ApiResponse<InvoiceResponse> response = apiInstance.issueInvoiceWithHttpInfo(invoiceRequest, idempotencyKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#issueInvoice");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceRequest** | [**InvoiceRequest**](InvoiceRequest.md)| invoice data | |
| **idempotencyKey** | **String**| optional idempotency key | [optional] |

### Return type

ApiResponse<[**InvoiceResponse**](InvoiceResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A repeat with the same Idempotency-Key and body: the original result, with header Idempotent-Replayed: true |  * Idempotent-Replayed - true for a replayed result <br>  |
| **201** | 201 with the archived invoice, or 200 with header &lt;code&gt;Idempotent-Replayed: true&lt;/code&gt; for a repeat |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## listInvoices

> PageDtoInvoiceResponse listInvoices(page, size)

Lists the tenant&#39;s invoices, newest first.

Lists the tenant&#39;s invoices, newest first.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fakturnaut.com/v1");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        Integer page = 0; // Integer | zero-based page number
        Integer size = 20; // Integer | page size, 1 to 100
        try {
            PageDtoInvoiceResponse result = apiInstance.listInvoices(page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#listInvoices");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| zero-based page number | [optional] [default to 0] |
| **size** | **Integer**| page size, 1 to 100 | [optional] [default to 20] |

### Return type

[**PageDtoInvoiceResponse**](PageDtoInvoiceResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | one page of invoices (without documents) |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## listInvoicesWithHttpInfo

> ApiResponse<PageDtoInvoiceResponse> listInvoicesWithHttpInfo(page, size)

Lists the tenant&#39;s invoices, newest first.

Lists the tenant&#39;s invoices, newest first.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fakturnaut.com/v1");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        Integer page = 0; // Integer | zero-based page number
        Integer size = 20; // Integer | page size, 1 to 100
        try {
            ApiResponse<PageDtoInvoiceResponse> response = apiInstance.listInvoicesWithHttpInfo(page, size);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#listInvoices");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| zero-based page number | [optional] [default to 0] |
| **size** | **Integer**| page size, 1 to 100 | [optional] [default to 20] |

### Return type

ApiResponse<[**PageDtoInvoiceResponse**](PageDtoInvoiceResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | one page of invoices (without documents) |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## validateInvoice

> ValidationResponse validateInvoice(invoiceRequest)

Validates an invoice without issuing it and returns the calculated totals.

Validates an invoice without issuing it and returns the calculated totals.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fakturnaut.com/v1");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        InvoiceRequest invoiceRequest = new InvoiceRequest(); // InvoiceRequest | invoice data
        try {
            ValidationResponse result = apiInstance.validateInvoice(invoiceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#validateInvoice");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceRequest** | [**InvoiceRequest**](InvoiceRequest.md)| invoice data | |

### Return type

[**ValidationResponse**](ValidationResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the verdict, totals and all findings |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## validateInvoiceWithHttpInfo

> ApiResponse<ValidationResponse> validateInvoiceWithHttpInfo(invoiceRequest)

Validates an invoice without issuing it and returns the calculated totals.

Validates an invoice without issuing it and returns the calculated totals.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fakturnaut.com/v1");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        InvoiceRequest invoiceRequest = new InvoiceRequest(); // InvoiceRequest | invoice data
        try {
            ApiResponse<ValidationResponse> response = apiInstance.validateInvoiceWithHttpInfo(invoiceRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#validateInvoice");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceRequest** | [**InvoiceRequest**](InvoiceRequest.md)| invoice data | |

### Return type

ApiResponse<[**ValidationResponse**](ValidationResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the verdict, totals and all findings |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

