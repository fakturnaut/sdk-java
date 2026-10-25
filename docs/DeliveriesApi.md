# DeliveriesApi

All URIs are relative to *https://api.fakturnaut.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deliverInvoice**](DeliveriesApi.md#deliverInvoice) | **POST** /invoices/{invoiceId}/deliveries | Delivers an invoice. |
| [**deliverInvoiceWithHttpInfo**](DeliveriesApi.md#deliverInvoiceWithHttpInfo) | **POST** /invoices/{invoiceId}/deliveries | Delivers an invoice. |
| [**getDelivery**](DeliveriesApi.md#getDelivery) | **GET** /deliveries/{id} | Returns one delivery. |
| [**getDeliveryWithHttpInfo**](DeliveriesApi.md#getDeliveryWithHttpInfo) | **GET** /deliveries/{id} | Returns one delivery. |
| [**listInvoiceDeliveries**](DeliveriesApi.md#listInvoiceDeliveries) | **GET** /invoices/{invoiceId}/deliveries | Lists the deliveries of an invoice. |
| [**listInvoiceDeliveriesWithHttpInfo**](DeliveriesApi.md#listInvoiceDeliveriesWithHttpInfo) | **GET** /invoices/{invoiceId}/deliveries | Lists the deliveries of an invoice. |



## deliverInvoice

> DeliveryResponse deliverInvoice(invoiceId, deliveryRequest, idempotencyKey)

Delivers an invoice.

Delivers an invoice. The response shows the status after the first attempt; later changes arrive as webhook  events &lt;code&gt;delivery.updated&lt;/code&gt; and via &lt;code&gt;GET /v1/deliveries/{id&lt;/code&gt;}.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.DeliveriesApi;

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

        DeliveriesApi apiInstance = new DeliveriesApi(defaultClient);
        UUID invoiceId = UUID.randomUUID(); // UUID | invoice
        DeliveryRequest deliveryRequest = new DeliveryRequest(); // DeliveryRequest | channel, recipient and resend flag
        String idempotencyKey = "idempotencyKey_example"; // String | optional idempotency key; a repeat returns the first delivery (200,      <code>Idempotent-Replayed: true</code>)
        try {
            DeliveryResponse result = apiInstance.deliverInvoice(invoiceId, deliveryRequest, idempotencyKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveriesApi#deliverInvoice");
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
| **invoiceId** | **UUID**| invoice | |
| **deliveryRequest** | [**DeliveryRequest**](DeliveryRequest.md)| channel, recipient and resend flag | |
| **idempotencyKey** | **String**| optional idempotency key; a repeat returns the first delivery (200,      &lt;code&gt;Idempotent-Replayed: true&lt;/code&gt;) | [optional] |

### Return type

[**DeliveryResponse**](DeliveryResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A repeat with the same Idempotency-Key and body: the original result, with header Idempotent-Replayed: true |  * Idempotent-Replayed - true for a replayed result <br>  |
| **201** | 201 with the delivery |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## deliverInvoiceWithHttpInfo

> ApiResponse<DeliveryResponse> deliverInvoiceWithHttpInfo(invoiceId, deliveryRequest, idempotencyKey)

Delivers an invoice.

Delivers an invoice. The response shows the status after the first attempt; later changes arrive as webhook  events &lt;code&gt;delivery.updated&lt;/code&gt; and via &lt;code&gt;GET /v1/deliveries/{id&lt;/code&gt;}.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.DeliveriesApi;

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

        DeliveriesApi apiInstance = new DeliveriesApi(defaultClient);
        UUID invoiceId = UUID.randomUUID(); // UUID | invoice
        DeliveryRequest deliveryRequest = new DeliveryRequest(); // DeliveryRequest | channel, recipient and resend flag
        String idempotencyKey = "idempotencyKey_example"; // String | optional idempotency key; a repeat returns the first delivery (200,      <code>Idempotent-Replayed: true</code>)
        try {
            ApiResponse<DeliveryResponse> response = apiInstance.deliverInvoiceWithHttpInfo(invoiceId, deliveryRequest, idempotencyKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveriesApi#deliverInvoice");
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
| **invoiceId** | **UUID**| invoice | |
| **deliveryRequest** | [**DeliveryRequest**](DeliveryRequest.md)| channel, recipient and resend flag | |
| **idempotencyKey** | **String**| optional idempotency key; a repeat returns the first delivery (200,      &lt;code&gt;Idempotent-Replayed: true&lt;/code&gt;) | [optional] |

### Return type

ApiResponse<[**DeliveryResponse**](DeliveryResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A repeat with the same Idempotency-Key and body: the original result, with header Idempotent-Replayed: true |  * Idempotent-Replayed - true for a replayed result <br>  |
| **201** | 201 with the delivery |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## getDelivery

> DeliveryResponse getDelivery(id)

Returns one delivery.

Returns one delivery.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.DeliveriesApi;

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

        DeliveriesApi apiInstance = new DeliveriesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | delivery
        try {
            DeliveryResponse result = apiInstance.getDelivery(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveriesApi#getDelivery");
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
| **id** | **UUID**| delivery | |

### Return type

[**DeliveryResponse**](DeliveryResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the delivery |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## getDeliveryWithHttpInfo

> ApiResponse<DeliveryResponse> getDeliveryWithHttpInfo(id)

Returns one delivery.

Returns one delivery.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.DeliveriesApi;

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

        DeliveriesApi apiInstance = new DeliveriesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | delivery
        try {
            ApiResponse<DeliveryResponse> response = apiInstance.getDeliveryWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveriesApi#getDelivery");
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
| **id** | **UUID**| delivery | |

### Return type

ApiResponse<[**DeliveryResponse**](DeliveryResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the delivery |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## listInvoiceDeliveries

> List<DeliveryResponse> listInvoiceDeliveries(invoiceId)

Lists the deliveries of an invoice.

Lists the deliveries of an invoice.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.DeliveriesApi;

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

        DeliveriesApi apiInstance = new DeliveriesApi(defaultClient);
        UUID invoiceId = UUID.randomUUID(); // UUID | invoice
        try {
            List<DeliveryResponse> result = apiInstance.listInvoiceDeliveries(invoiceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveriesApi#listInvoiceDeliveries");
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
| **invoiceId** | **UUID**| invoice | |

### Return type

[**List&lt;DeliveryResponse&gt;**](DeliveryResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | deliveries, oldest first |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## listInvoiceDeliveriesWithHttpInfo

> ApiResponse<List<DeliveryResponse>> listInvoiceDeliveriesWithHttpInfo(invoiceId)

Lists the deliveries of an invoice.

Lists the deliveries of an invoice.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.DeliveriesApi;

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

        DeliveriesApi apiInstance = new DeliveriesApi(defaultClient);
        UUID invoiceId = UUID.randomUUID(); // UUID | invoice
        try {
            ApiResponse<List<DeliveryResponse>> response = apiInstance.listInvoiceDeliveriesWithHttpInfo(invoiceId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveriesApi#listInvoiceDeliveries");
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
| **invoiceId** | **UUID**| invoice | |

### Return type

ApiResponse<[**List&lt;DeliveryResponse&gt;**](DeliveryResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | deliveries, oldest first |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

