# StatusApi

All URIs are relative to *https://api.fakturnaut.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**hello**](StatusApi.md#hello) | **GET** /hello | Returns a greeting in the caller&#39;s preferred language. |
| [**helloWithHttpInfo**](StatusApi.md#helloWithHttpInfo) | **GET** /hello | Returns a greeting in the caller&#39;s preferred language. |



## hello

> HelloResponse hello()

Returns a greeting in the caller&#39;s preferred language.

Returns a greeting in the caller&#39;s preferred language.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fakturnaut.com/v1");

        StatusApi apiInstance = new StatusApi(defaultClient);
        try {
            HelloResponse result = apiInstance.hello();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#hello");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**HelloResponse**](HelloResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the greeting payload |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## helloWithHttpInfo

> ApiResponse<HelloResponse> helloWithHttpInfo()

Returns a greeting in the caller&#39;s preferred language.

Returns a greeting in the caller&#39;s preferred language.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fakturnaut.com/v1");

        StatusApi apiInstance = new StatusApi(defaultClient);
        try {
            ApiResponse<HelloResponse> response = apiInstance.helloWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#hello");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**HelloResponse**](HelloResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the greeting payload |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

