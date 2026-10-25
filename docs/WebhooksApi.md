# WebhooksApi

All URIs are relative to *https://api.fakturnaut.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /webhooks | Registers an endpoint. |
| [**createWebhookWithHttpInfo**](WebhooksApi.md#createWebhookWithHttpInfo) | **POST** /webhooks | Registers an endpoint. |
| [**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{id} | Removes an endpoint; no further events are sent to it. |
| [**deleteWebhookWithHttpInfo**](WebhooksApi.md#deleteWebhookWithHttpInfo) | **DELETE** /webhooks/{id} | Removes an endpoint; no further events are sent to it. |
| [**listWebhookDeliveries**](WebhooksApi.md#listWebhookDeliveries) | **GET** /webhooks/{id}/deliveries | Shows the deliveries to an endpoint of the last 30 days, newest first. |
| [**listWebhookDeliveriesWithHttpInfo**](WebhooksApi.md#listWebhookDeliveriesWithHttpInfo) | **GET** /webhooks/{id}/deliveries | Shows the deliveries to an endpoint of the last 30 days, newest first. |
| [**listWebhooks**](WebhooksApi.md#listWebhooks) | **GET** /webhooks | Lists the endpoints without secrets. |
| [**listWebhooksWithHttpInfo**](WebhooksApi.md#listWebhooksWithHttpInfo) | **GET** /webhooks | Lists the endpoints without secrets. |
| [**resendWebhookDelivery**](WebhooksApi.md#resendWebhookDelivery) | **POST** /webhooks/{id}/deliveries/{deliveryId}/resend | Sends a finished delivery of the last 30 days again, as a new delivery of the same event. |
| [**resendWebhookDeliveryWithHttpInfo**](WebhooksApi.md#resendWebhookDeliveryWithHttpInfo) | **POST** /webhooks/{id}/deliveries/{deliveryId}/resend | Sends a finished delivery of the last 30 days again, as a new delivery of the same event. |
| [**rotateWebhookSecret**](WebhooksApi.md#rotateWebhookSecret) | **POST** /webhooks/{id}/rotate-secret | Gives an endpoint a new signing secret at once; the new secret is in this response only. |
| [**rotateWebhookSecretWithHttpInfo**](WebhooksApi.md#rotateWebhookSecretWithHttpInfo) | **POST** /webhooks/{id}/rotate-secret | Gives an endpoint a new signing secret at once; the new secret is in this response only. |
| [**testWebhook**](WebhooksApi.md#testWebhook) | **POST** /webhooks/{id}/test | Sends a &lt;code&gt;webhook.test&lt;/code&gt; event to the endpoint within seconds, whatever events it has chosen. |
| [**testWebhookWithHttpInfo**](WebhooksApi.md#testWebhookWithHttpInfo) | **POST** /webhooks/{id}/test | Sends a &lt;code&gt;webhook.test&lt;/code&gt; event to the endpoint within seconds, whatever events it has chosen. |
| [**updateWebhook**](WebhooksApi.md#updateWebhook) | **PATCH** /webhooks/{id} | Changes an endpoint&#39;s URL or choice of events; the secret stays. |
| [**updateWebhookWithHttpInfo**](WebhooksApi.md#updateWebhookWithHttpInfo) | **PATCH** /webhooks/{id} | Changes an endpoint&#39;s URL or choice of events; the secret stays. |



## createWebhook

> WebhookResponse createWebhook(webhookRequest)

Registers an endpoint.

Registers an endpoint. The signing secret is in this response only.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        WebhookRequest webhookRequest = new WebhookRequest(); // WebhookRequest | target URL
        try {
            WebhookResponse result = apiInstance.createWebhook(webhookRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#createWebhook");
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
| **webhookRequest** | [**WebhookRequest**](WebhookRequest.md)| target URL | |

### Return type

[**WebhookResponse**](WebhookResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 with the endpoint and its secret |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## createWebhookWithHttpInfo

> ApiResponse<WebhookResponse> createWebhookWithHttpInfo(webhookRequest)

Registers an endpoint.

Registers an endpoint. The signing secret is in this response only.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        WebhookRequest webhookRequest = new WebhookRequest(); // WebhookRequest | target URL
        try {
            ApiResponse<WebhookResponse> response = apiInstance.createWebhookWithHttpInfo(webhookRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#createWebhook");
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
| **webhookRequest** | [**WebhookRequest**](WebhookRequest.md)| target URL | |

### Return type

ApiResponse<[**WebhookResponse**](WebhookResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 with the endpoint and its secret |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## deleteWebhook

> WebhookResponse deleteWebhook(id)

Removes an endpoint; no further events are sent to it.

Removes an endpoint; no further events are sent to it.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | endpoint
        try {
            WebhookResponse result = apiInstance.deleteWebhook(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#deleteWebhook");
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
| **id** | **UUID**| endpoint | |

### Return type

[**WebhookResponse**](WebhookResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the removed endpoint |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## deleteWebhookWithHttpInfo

> ApiResponse<WebhookResponse> deleteWebhookWithHttpInfo(id)

Removes an endpoint; no further events are sent to it.

Removes an endpoint; no further events are sent to it.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | endpoint
        try {
            ApiResponse<WebhookResponse> response = apiInstance.deleteWebhookWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#deleteWebhook");
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
| **id** | **UUID**| endpoint | |

### Return type

ApiResponse<[**WebhookResponse**](WebhookResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the removed endpoint |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## listWebhookDeliveries

> List<WebhookDeliveryResponse> listWebhookDeliveries(id, limit)

Shows the deliveries to an endpoint of the last 30 days, newest first.

Shows the deliveries to an endpoint of the last 30 days, newest first.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | endpoint
        Integer limit = 50; // Integer | maximum number, 1 to 100
        try {
            List<WebhookDeliveryResponse> result = apiInstance.listWebhookDeliveries(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#listWebhookDeliveries");
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
| **id** | **UUID**| endpoint | |
| **limit** | **Integer**| maximum number, 1 to 100 | [optional] [default to 50] |

### Return type

[**List&lt;WebhookDeliveryResponse&gt;**](WebhookDeliveryResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | deliveries, newest first |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## listWebhookDeliveriesWithHttpInfo

> ApiResponse<List<WebhookDeliveryResponse>> listWebhookDeliveriesWithHttpInfo(id, limit)

Shows the deliveries to an endpoint of the last 30 days, newest first.

Shows the deliveries to an endpoint of the last 30 days, newest first.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | endpoint
        Integer limit = 50; // Integer | maximum number, 1 to 100
        try {
            ApiResponse<List<WebhookDeliveryResponse>> response = apiInstance.listWebhookDeliveriesWithHttpInfo(id, limit);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#listWebhookDeliveries");
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
| **id** | **UUID**| endpoint | |
| **limit** | **Integer**| maximum number, 1 to 100 | [optional] [default to 50] |

### Return type

ApiResponse<[**List&lt;WebhookDeliveryResponse&gt;**](WebhookDeliveryResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | deliveries, newest first |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## listWebhooks

> List<WebhookResponse> listWebhooks()

Lists the endpoints without secrets.

Lists the endpoints without secrets.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        try {
            List<WebhookResponse> result = apiInstance.listWebhooks();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#listWebhooks");
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

[**List&lt;WebhookResponse&gt;**](WebhookResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | endpoints, newest first |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## listWebhooksWithHttpInfo

> ApiResponse<List<WebhookResponse>> listWebhooksWithHttpInfo()

Lists the endpoints without secrets.

Lists the endpoints without secrets.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        try {
            ApiResponse<List<WebhookResponse>> response = apiInstance.listWebhooksWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#listWebhooks");
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

ApiResponse<[**List&lt;WebhookResponse&gt;**](WebhookResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | endpoints, newest first |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## resendWebhookDelivery

> WebhookDeliveryResponse resendWebhookDelivery(id, deliveryId)

Sends a finished delivery of the last 30 days again, as a new delivery of the same event.

Sends a finished delivery of the last 30 days again, as a new delivery of the same event.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | endpoint
        UUID deliveryId = UUID.randomUUID(); // UUID | delivery to send again
        try {
            WebhookDeliveryResponse result = apiInstance.resendWebhookDelivery(id, deliveryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#resendWebhookDelivery");
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
| **id** | **UUID**| endpoint | |
| **deliveryId** | **UUID**| delivery to send again | |

### Return type

[**WebhookDeliveryResponse**](WebhookDeliveryResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Queued; it is sent within seconds |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## resendWebhookDeliveryWithHttpInfo

> ApiResponse<WebhookDeliveryResponse> resendWebhookDeliveryWithHttpInfo(id, deliveryId)

Sends a finished delivery of the last 30 days again, as a new delivery of the same event.

Sends a finished delivery of the last 30 days again, as a new delivery of the same event.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | endpoint
        UUID deliveryId = UUID.randomUUID(); // UUID | delivery to send again
        try {
            ApiResponse<WebhookDeliveryResponse> response = apiInstance.resendWebhookDeliveryWithHttpInfo(id, deliveryId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#resendWebhookDelivery");
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
| **id** | **UUID**| endpoint | |
| **deliveryId** | **UUID**| delivery to send again | |

### Return type

ApiResponse<[**WebhookDeliveryResponse**](WebhookDeliveryResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Queued; it is sent within seconds |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## rotateWebhookSecret

> WebhookResponse rotateWebhookSecret(id)

Gives an endpoint a new signing secret at once; the new secret is in this response only.

Gives an endpoint a new signing secret at once; the new secret is in this response only.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | endpoint
        try {
            WebhookResponse result = apiInstance.rotateWebhookSecret(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#rotateWebhookSecret");
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
| **id** | **UUID**| endpoint | |

### Return type

[**WebhookResponse**](WebhookResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the endpoint with its new secret |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## rotateWebhookSecretWithHttpInfo

> ApiResponse<WebhookResponse> rotateWebhookSecretWithHttpInfo(id)

Gives an endpoint a new signing secret at once; the new secret is in this response only.

Gives an endpoint a new signing secret at once; the new secret is in this response only.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | endpoint
        try {
            ApiResponse<WebhookResponse> response = apiInstance.rotateWebhookSecretWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#rotateWebhookSecret");
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
| **id** | **UUID**| endpoint | |

### Return type

ApiResponse<[**WebhookResponse**](WebhookResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the endpoint with its new secret |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## testWebhook

> WebhookDeliveryResponse testWebhook(id)

Sends a &lt;code&gt;webhook.test&lt;/code&gt; event to the endpoint within seconds, whatever events it has chosen.

Sends a &lt;code&gt;webhook.test&lt;/code&gt; event to the endpoint within seconds, whatever events it has chosen.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | endpoint
        try {
            WebhookDeliveryResponse result = apiInstance.testWebhook(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#testWebhook");
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
| **id** | **UUID**| endpoint | |

### Return type

[**WebhookDeliveryResponse**](WebhookDeliveryResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Queued; it is sent within seconds |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## testWebhookWithHttpInfo

> ApiResponse<WebhookDeliveryResponse> testWebhookWithHttpInfo(id)

Sends a &lt;code&gt;webhook.test&lt;/code&gt; event to the endpoint within seconds, whatever events it has chosen.

Sends a &lt;code&gt;webhook.test&lt;/code&gt; event to the endpoint within seconds, whatever events it has chosen.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | endpoint
        try {
            ApiResponse<WebhookDeliveryResponse> response = apiInstance.testWebhookWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#testWebhook");
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
| **id** | **UUID**| endpoint | |

### Return type

ApiResponse<[**WebhookDeliveryResponse**](WebhookDeliveryResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Queued; it is sent within seconds |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## updateWebhook

> WebhookResponse updateWebhook(id, webhookUpdateRequest)

Changes an endpoint&#39;s URL or choice of events; the secret stays.

Changes an endpoint&#39;s URL or choice of events; the secret stays.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | endpoint
        WebhookUpdateRequest webhookUpdateRequest = new WebhookUpdateRequest(); // WebhookUpdateRequest | new URL and/or events
        try {
            WebhookResponse result = apiInstance.updateWebhook(id, webhookUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#updateWebhook");
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
| **id** | **UUID**| endpoint | |
| **webhookUpdateRequest** | [**WebhookUpdateRequest**](WebhookUpdateRequest.md)| new URL and/or events | |

### Return type

[**WebhookResponse**](WebhookResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the changed endpoint |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## updateWebhookWithHttpInfo

> ApiResponse<WebhookResponse> updateWebhookWithHttpInfo(id, webhookUpdateRequest)

Changes an endpoint&#39;s URL or choice of events; the secret stays.

Changes an endpoint&#39;s URL or choice of events; the secret stays.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | endpoint
        WebhookUpdateRequest webhookUpdateRequest = new WebhookUpdateRequest(); // WebhookUpdateRequest | new URL and/or events
        try {
            ApiResponse<WebhookResponse> response = apiInstance.updateWebhookWithHttpInfo(id, webhookUpdateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#updateWebhook");
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
| **id** | **UUID**| endpoint | |
| **webhookUpdateRequest** | [**WebhookUpdateRequest**](WebhookUpdateRequest.md)| new URL and/or events | |

### Return type

ApiResponse<[**WebhookResponse**](WebhookResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the changed endpoint |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

