# ReceivedDocumentsApi

All URIs are relative to *https://api.fakturnaut.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadReceivedDocument**](ReceivedDocumentsApi.md#downloadReceivedDocument) | **GET** /received-documents/{id}/content | Downloads a received document as received (UBL XML). |
| [**downloadReceivedDocumentWithHttpInfo**](ReceivedDocumentsApi.md#downloadReceivedDocumentWithHttpInfo) | **GET** /received-documents/{id}/content | Downloads a received document as received (UBL XML). |
| [**getReceivedDocument**](ReceivedDocumentsApi.md#getReceivedDocument) | **GET** /received-documents/{id} | Returns the metadata of a received document. |
| [**getReceivedDocumentWithHttpInfo**](ReceivedDocumentsApi.md#getReceivedDocumentWithHttpInfo) | **GET** /received-documents/{id} | Returns the metadata of a received document. |
| [**getReceivedDocumentReport**](ReceivedDocumentsApi.md#getReceivedDocumentReport) | **GET** /received-documents/{id}/report | Returns the validation report stored with a received invoice or credit note. |
| [**getReceivedDocumentReportWithHttpInfo**](ReceivedDocumentsApi.md#getReceivedDocumentReportWithHttpInfo) | **GET** /received-documents/{id}/report | Returns the validation report stored with a received invoice or credit note. |
| [**listReceivedDocuments**](ReceivedDocumentsApi.md#listReceivedDocuments) | **GET** /received-documents | Lists received documents, newest first, optionally only one seller&#39;s, those received in a date range (calendar  days in Germany, both inclusive) or those with a validation result. |
| [**listReceivedDocumentsWithHttpInfo**](ReceivedDocumentsApi.md#listReceivedDocumentsWithHttpInfo) | **GET** /received-documents | Lists received documents, newest first, optionally only one seller&#39;s, those received in a date range (calendar  days in Germany, both inclusive) or those with a validation result. |
| [**renderReceivedDocument**](ReceivedDocumentsApi.md#renderReceivedDocument) | **GET** /received-documents/{id}/pdf | Renders a received invoice or credit note as a readable PDF. |
| [**renderReceivedDocumentWithHttpInfo**](ReceivedDocumentsApi.md#renderReceivedDocumentWithHttpInfo) | **GET** /received-documents/{id}/pdf | Renders a received invoice or credit note as a readable PDF. |



## downloadReceivedDocument

> File downloadReceivedDocument(id)

Downloads a received document as received (UBL XML).

Downloads a received document as received (UBL XML).

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.ReceivedDocumentsApi;

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

        ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | document
        try {
            File result = apiInstance.downloadReceivedDocument(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivedDocumentsApi#downloadReceivedDocument");
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
| **id** | **UUID**| document | |

### Return type

[**File**](File.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the XML |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## downloadReceivedDocumentWithHttpInfo

> ApiResponse<File> downloadReceivedDocumentWithHttpInfo(id)

Downloads a received document as received (UBL XML).

Downloads a received document as received (UBL XML).

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.ReceivedDocumentsApi;

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

        ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | document
        try {
            ApiResponse<File> response = apiInstance.downloadReceivedDocumentWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivedDocumentsApi#downloadReceivedDocument");
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
| **id** | **UUID**| document | |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the XML |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## getReceivedDocument

> ReceivedDocumentResponse getReceivedDocument(id)

Returns the metadata of a received document.

Returns the metadata of a received document.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.ReceivedDocumentsApi;

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

        ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | document
        try {
            ReceivedDocumentResponse result = apiInstance.getReceivedDocument(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivedDocumentsApi#getReceivedDocument");
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
| **id** | **UUID**| document | |

### Return type

[**ReceivedDocumentResponse**](ReceivedDocumentResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the metadata |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## getReceivedDocumentWithHttpInfo

> ApiResponse<ReceivedDocumentResponse> getReceivedDocumentWithHttpInfo(id)

Returns the metadata of a received document.

Returns the metadata of a received document.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.ReceivedDocumentsApi;

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

        ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | document
        try {
            ApiResponse<ReceivedDocumentResponse> response = apiInstance.getReceivedDocumentWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivedDocumentsApi#getReceivedDocument");
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
| **id** | **UUID**| document | |

### Return type

ApiResponse<[**ReceivedDocumentResponse**](ReceivedDocumentResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the metadata |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## getReceivedDocumentReport

> ReceivedReportResponse getReceivedDocumentReport(id)

Returns the validation report stored with a received invoice or credit note.

Returns the validation report stored with a received invoice or credit note.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.ReceivedDocumentsApi;

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

        ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | document
        try {
            ReceivedReportResponse result = apiInstance.getReceivedDocumentReport(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivedDocumentsApi#getReceivedDocumentReport");
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
| **id** | **UUID**| document | |

### Return type

[**ReceivedReportResponse**](ReceivedReportResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the report as it was when the document arrived |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## getReceivedDocumentReportWithHttpInfo

> ApiResponse<ReceivedReportResponse> getReceivedDocumentReportWithHttpInfo(id)

Returns the validation report stored with a received invoice or credit note.

Returns the validation report stored with a received invoice or credit note.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.ReceivedDocumentsApi;

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

        ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | document
        try {
            ApiResponse<ReceivedReportResponse> response = apiInstance.getReceivedDocumentReportWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivedDocumentsApi#getReceivedDocumentReport");
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
| **id** | **UUID**| document | |

### Return type

ApiResponse<[**ReceivedReportResponse**](ReceivedReportResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the report as it was when the document arrived |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## listReceivedDocuments

> PageDtoReceivedDocumentResponse listReceivedDocuments(page, size, sellerId, from, to, validation)

Lists received documents, newest first, optionally only one seller&#39;s, those received in a date range (calendar  days in Germany, both inclusive) or those with a validation result.

Lists received documents, newest first, optionally only one seller&#39;s, those received in a date range (calendar  days in Germany, both inclusive) or those with a validation result.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.ReceivedDocumentsApi;

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

        ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
        Integer page = 0; // Integer | zero-based page number
        Integer size = 20; // Integer | page size, 1 to 100
        UUID sellerId = UUID.randomUUID(); // UUID | only documents for this seller entity
        LocalDate from = LocalDate.now(); // LocalDate | received on or after this day
        LocalDate to = LocalDate.now(); // LocalDate | received on or before this day
        String validation = "valid"; // String | only <code>valid</code> or <code>invalid</code> invoices and credit notes
        try {
            PageDtoReceivedDocumentResponse result = apiInstance.listReceivedDocuments(page, size, sellerId, from, to, validation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivedDocumentsApi#listReceivedDocuments");
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
| **sellerId** | **UUID**| only documents for this seller entity | [optional] |
| **from** | **LocalDate**| received on or after this day | [optional] |
| **to** | **LocalDate**| received on or before this day | [optional] |
| **validation** | **String**| only &lt;code&gt;valid&lt;/code&gt; or &lt;code&gt;invalid&lt;/code&gt; invoices and credit notes | [optional] [enum: valid, invalid] |

### Return type

[**PageDtoReceivedDocumentResponse**](PageDtoReceivedDocumentResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | one page |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## listReceivedDocumentsWithHttpInfo

> ApiResponse<PageDtoReceivedDocumentResponse> listReceivedDocumentsWithHttpInfo(page, size, sellerId, from, to, validation)

Lists received documents, newest first, optionally only one seller&#39;s, those received in a date range (calendar  days in Germany, both inclusive) or those with a validation result.

Lists received documents, newest first, optionally only one seller&#39;s, those received in a date range (calendar  days in Germany, both inclusive) or those with a validation result.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.ReceivedDocumentsApi;

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

        ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
        Integer page = 0; // Integer | zero-based page number
        Integer size = 20; // Integer | page size, 1 to 100
        UUID sellerId = UUID.randomUUID(); // UUID | only documents for this seller entity
        LocalDate from = LocalDate.now(); // LocalDate | received on or after this day
        LocalDate to = LocalDate.now(); // LocalDate | received on or before this day
        String validation = "valid"; // String | only <code>valid</code> or <code>invalid</code> invoices and credit notes
        try {
            ApiResponse<PageDtoReceivedDocumentResponse> response = apiInstance.listReceivedDocumentsWithHttpInfo(page, size, sellerId, from, to, validation);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivedDocumentsApi#listReceivedDocuments");
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
| **sellerId** | **UUID**| only documents for this seller entity | [optional] |
| **from** | **LocalDate**| received on or after this day | [optional] |
| **to** | **LocalDate**| received on or before this day | [optional] |
| **validation** | **String**| only &lt;code&gt;valid&lt;/code&gt; or &lt;code&gt;invalid&lt;/code&gt; invoices and credit notes | [optional] [enum: valid, invalid] |

### Return type

ApiResponse<[**PageDtoReceivedDocumentResponse**](PageDtoReceivedDocumentResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | one page |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## renderReceivedDocument

> byte[] renderReceivedDocument(id, acceptLanguage)

Renders a received invoice or credit note as a readable PDF.

Renders a received invoice or credit note as a readable PDF.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.ReceivedDocumentsApi;

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

        ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | document
        String acceptLanguage = "acceptLanguage_example"; // String | <code>Accept-Language</code>; English if it starts with <code>en</code>, else German
        try {
            byte[] result = apiInstance.renderReceivedDocument(id, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivedDocumentsApi#renderReceivedDocument");
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
| **id** | **UUID**| document | |
| **acceptLanguage** | **String**| &lt;code&gt;Accept-Language&lt;/code&gt;; English if it starts with &lt;code&gt;en&lt;/code&gt;, else German | [optional] |

### Return type

**byte[]**


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the PDF |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## renderReceivedDocumentWithHttpInfo

> ApiResponse<byte[]> renderReceivedDocumentWithHttpInfo(id, acceptLanguage)

Renders a received invoice or credit note as a readable PDF.

Renders a received invoice or credit note as a readable PDF.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.ReceivedDocumentsApi;

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

        ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | document
        String acceptLanguage = "acceptLanguage_example"; // String | <code>Accept-Language</code>; English if it starts with <code>en</code>, else German
        try {
            ApiResponse<byte[]> response = apiInstance.renderReceivedDocumentWithHttpInfo(id, acceptLanguage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivedDocumentsApi#renderReceivedDocument");
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
| **id** | **UUID**| document | |
| **acceptLanguage** | **String**| &lt;code&gt;Accept-Language&lt;/code&gt;; English if it starts with &lt;code&gt;en&lt;/code&gt;, else German | [optional] |

### Return type

ApiResponse<**byte[]**>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the PDF |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

