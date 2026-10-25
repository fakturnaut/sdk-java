# InboundApi

All URIs are relative to *https://api.fakturnaut.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**parseDocument**](InboundApi.md#parseDocument) | **POST** /inbound/parse | Detects the format, reads and validates a received document, and returns a plain-language report with an  HTML view. |
| [**parseDocumentWithHttpInfo**](InboundApi.md#parseDocumentWithHttpInfo) | **POST** /inbound/parse | Detects the format, reads and validates a received document, and returns a plain-language report with an  HTML view. |
| [**renderDocument**](InboundApi.md#renderDocument) | **POST** /inbound/render | Renders a received document as a readable PDF. |
| [**renderDocumentWithHttpInfo**](InboundApi.md#renderDocumentWithHttpInfo) | **POST** /inbound/render | Renders a received document as a readable PDF. |



## parseDocument

> InspectionResponse parseDocument(body, acceptLanguage)

Detects the format, reads and validates a received document, and returns a plain-language report with an  HTML view.

Detects the format, reads and validates a received document, and returns a plain-language report with an  HTML view.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InboundApi;

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

        InboundApi apiInstance = new InboundApi(defaultClient);
        File body = new File("/path/to/file"); // File | The file as the raw request body
        String acceptLanguage = "acceptLanguage_example"; // String | <code>Accept-Language</code>; English if it starts with <code>en</code>, else German
        try {
            InspectionResponse result = apiInstance.parseDocument(body, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#parseDocument");
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
| **body** | **File**| The file as the raw request body | |
| **acceptLanguage** | **String**| &lt;code&gt;Accept-Language&lt;/code&gt;; English if it starts with &lt;code&gt;en&lt;/code&gt;, else German | [optional] |

### Return type

[**InspectionResponse**](InspectionResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/octet-stream, application/pdf, application/xml, text/xml
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the report |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## parseDocumentWithHttpInfo

> ApiResponse<InspectionResponse> parseDocumentWithHttpInfo(body, acceptLanguage)

Detects the format, reads and validates a received document, and returns a plain-language report with an  HTML view.

Detects the format, reads and validates a received document, and returns a plain-language report with an  HTML view.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InboundApi;

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

        InboundApi apiInstance = new InboundApi(defaultClient);
        File body = new File("/path/to/file"); // File | The file as the raw request body
        String acceptLanguage = "acceptLanguage_example"; // String | <code>Accept-Language</code>; English if it starts with <code>en</code>, else German
        try {
            ApiResponse<InspectionResponse> response = apiInstance.parseDocumentWithHttpInfo(body, acceptLanguage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#parseDocument");
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
| **body** | **File**| The file as the raw request body | |
| **acceptLanguage** | **String**| &lt;code&gt;Accept-Language&lt;/code&gt;; English if it starts with &lt;code&gt;en&lt;/code&gt;, else German | [optional] |

### Return type

ApiResponse<[**InspectionResponse**](InspectionResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/octet-stream, application/pdf, application/xml, text/xml
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the report |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## renderDocument

> File renderDocument(body, acceptLanguage)

Renders a received document as a readable PDF.

Renders a received document as a readable PDF.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InboundApi;

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

        InboundApi apiInstance = new InboundApi(defaultClient);
        File body = new File("/path/to/file"); // File | The file as the raw request body
        String acceptLanguage = "acceptLanguage_example"; // String | <code>Accept-Language</code>; English if it starts with <code>en</code>, else German
        try {
            File result = apiInstance.renderDocument(body, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#renderDocument");
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
| **body** | **File**| The file as the raw request body | |
| **acceptLanguage** | **String**| &lt;code&gt;Accept-Language&lt;/code&gt;; English if it starts with &lt;code&gt;en&lt;/code&gt;, else German | [optional] |

### Return type

[**File**](File.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/octet-stream, application/pdf, application/xml, text/xml
- **Accept**: application/pdf, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the PDF |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## renderDocumentWithHttpInfo

> ApiResponse<File> renderDocumentWithHttpInfo(body, acceptLanguage)

Renders a received document as a readable PDF.

Renders a received document as a readable PDF.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.InboundApi;

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

        InboundApi apiInstance = new InboundApi(defaultClient);
        File body = new File("/path/to/file"); // File | The file as the raw request body
        String acceptLanguage = "acceptLanguage_example"; // String | <code>Accept-Language</code>; English if it starts with <code>en</code>, else German
        try {
            ApiResponse<File> response = apiInstance.renderDocumentWithHttpInfo(body, acceptLanguage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#renderDocument");
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
| **body** | **File**| The file as the raw request body | |
| **acceptLanguage** | **String**| &lt;code&gt;Accept-Language&lt;/code&gt;; English if it starts with &lt;code&gt;en&lt;/code&gt;, else German | [optional] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/octet-stream, application/pdf, application/xml, text/xml
- **Accept**: application/pdf, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the PDF |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

