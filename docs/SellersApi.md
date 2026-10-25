# SellersApi

All URIs are relative to *https://api.fakturnaut.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateSellerPeppol**](SellersApi.md#activateSellerPeppol) | **POST** /sellers/{id}/peppol | Activates real Peppol for a seller: registers it at our Peppol access point for sending and, if asked for and  nobody else serves its address, for receiving. |
| [**activateSellerPeppolWithHttpInfo**](SellersApi.md#activateSellerPeppolWithHttpInfo) | **POST** /sellers/{id}/peppol | Activates real Peppol for a seller: registers it at our Peppol access point for sending and, if asked for and  nobody else serves its address, for receiving. |
| [**attestSeller**](SellersApi.md#attestSeller) | **POST** /sellers/{id}/attestation | Confirms that the seller authorised the tenant to issue and receive invoices on its behalf. |
| [**attestSellerWithHttpInfo**](SellersApi.md#attestSellerWithHttpInfo) | **POST** /sellers/{id}/attestation | Confirms that the seller authorised the tenant to issue and receive invoices on its behalf. |
| [**createSeller**](SellersApi.md#createSeller) | **POST** /sellers | Creates a seller entity whose data is used on all its invoices, and starts its verification. |
| [**createSellerWithHttpInfo**](SellersApi.md#createSellerWithHttpInfo) | **POST** /sellers | Creates a seller entity whose data is used on all its invoices, and starts its verification. |
| [**enableSellerPeppolReceiving**](SellersApi.md#enableSellerPeppolReceiving) | **POST** /sellers/{id}/peppol/receiving | Switches receiving through us on, if nobody else serves the seller&#39;s Peppol address. |
| [**enableSellerPeppolReceivingWithHttpInfo**](SellersApi.md#enableSellerPeppolReceivingWithHttpInfo) | **POST** /sellers/{id}/peppol/receiving | Switches receiving through us on, if nobody else serves the seller&#39;s Peppol address. |
| [**getSeller**](SellersApi.md#getSeller) | **GET** /sellers/{id} | Returns a seller entity. |
| [**getSellerWithHttpInfo**](SellersApi.md#getSellerWithHttpInfo) | **GET** /sellers/{id} | Returns a seller entity. |
| [**getSellerPeppol**](SellersApi.md#getSellerPeppol) | **GET** /sellers/{id}/peppol | Returns a seller&#39;s Peppol registration. |
| [**getSellerPeppolWithHttpInfo**](SellersApi.md#getSellerPeppolWithHttpInfo) | **GET** /sellers/{id}/peppol | Returns a seller&#39;s Peppol registration. |
| [**getSellerVerification**](SellersApi.md#getSellerVerification) | **GET** /sellers/{id}/verification | Returns the verification details: state, history, VAT ID checks and uploaded documents. |
| [**getSellerVerificationWithHttpInfo**](SellersApi.md#getSellerVerificationWithHttpInfo) | **GET** /sellers/{id}/verification | Returns the verification details: state, history, VAT ID checks and uploaded documents. |
| [**listSellers**](SellersApi.md#listSellers) | **GET** /sellers | Lists the tenant&#39;s seller entities by name. |
| [**listSellersWithHttpInfo**](SellersApi.md#listSellersWithHttpInfo) | **GET** /sellers | Lists the tenant&#39;s seller entities by name. |
| [**renewSellerPeppolVerification**](SellersApi.md#renewSellerPeppolVerification) | **POST** /sellers/{id}/peppol/verification | Asks the access point for a new identity-check link (the old one may be lost or expired). |
| [**renewSellerPeppolVerificationWithHttpInfo**](SellersApi.md#renewSellerPeppolVerificationWithHttpInfo) | **POST** /sellers/{id}/peppol/verification | Asks the access point for a new identity-check link (the old one may be lost or expired). |
| [**updateSeller**](SellersApi.md#updateSeller) | **PUT** /sellers/{id} | Replaces a seller entity&#39;s data. |
| [**updateSellerWithHttpInfo**](SellersApi.md#updateSellerWithHttpInfo) | **PUT** /sellers/{id} | Replaces a seller entity&#39;s data. |
| [**uploadSellerDocument**](SellersApi.md#uploadSellerDocument) | **POST** /sellers/{id}/documents | Uploads a supporting document (PDF, PNG or JPEG, at most 10 MB) as the raw request body. |
| [**uploadSellerDocumentWithHttpInfo**](SellersApi.md#uploadSellerDocumentWithHttpInfo) | **POST** /sellers/{id}/documents | Uploads a supporting document (PDF, PNG or JPEG, at most 10 MB) as the raw request body. |



## activateSellerPeppol

> PeppolStatusResponse activateSellerPeppol(id, peppolActivationRequest)

Activates real Peppol for a seller: registers it at our Peppol access point for sending and, if asked for and  nobody else serves its address, for receiving.

Activates real Peppol for a seller: registers it at our Peppol access point for sending and, if asked for and  nobody else serves its address, for receiving. Repeating the call returns the existing registration (200).

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller
        PeppolActivationRequest peppolActivationRequest = new PeppolActivationRequest(); // PeppolActivationRequest | whether the seller also wants to receive through us
        try {
            PeppolStatusResponse result = apiInstance.activateSellerPeppol(id, peppolActivationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#activateSellerPeppol");
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
| **id** | **UUID**| seller | |
| **peppolActivationRequest** | [**PeppolActivationRequest**](PeppolActivationRequest.md)| whether the seller also wants to receive through us | [optional] |

### Return type

[**PeppolStatusResponse**](PeppolStatusResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 201 with the registration and the identity-check link |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## activateSellerPeppolWithHttpInfo

> ApiResponse<PeppolStatusResponse> activateSellerPeppolWithHttpInfo(id, peppolActivationRequest)

Activates real Peppol for a seller: registers it at our Peppol access point for sending and, if asked for and  nobody else serves its address, for receiving.

Activates real Peppol for a seller: registers it at our Peppol access point for sending and, if asked for and  nobody else serves its address, for receiving. Repeating the call returns the existing registration (200).

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller
        PeppolActivationRequest peppolActivationRequest = new PeppolActivationRequest(); // PeppolActivationRequest | whether the seller also wants to receive through us
        try {
            ApiResponse<PeppolStatusResponse> response = apiInstance.activateSellerPeppolWithHttpInfo(id, peppolActivationRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#activateSellerPeppol");
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
| **id** | **UUID**| seller | |
| **peppolActivationRequest** | [**PeppolActivationRequest**](PeppolActivationRequest.md)| whether the seller also wants to receive through us | [optional] |

### Return type

ApiResponse<[**PeppolStatusResponse**](PeppolStatusResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 201 with the registration and the identity-check link |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## attestSeller

> VerificationSummary attestSeller(id, attestationRequest)

Confirms that the seller authorised the tenant to issue and receive invoices on its behalf.

Confirms that the seller authorised the tenant to issue and receive invoices on its behalf.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller identifier
        AttestationRequest attestationRequest = new AttestationRequest(); // AttestationRequest | <code>{&quot;confirmed&quot;: true</code>}
        try {
            VerificationSummary result = apiInstance.attestSeller(id, attestationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#attestSeller");
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
| **id** | **UUID**| seller identifier | |
| **attestationRequest** | [**AttestationRequest**](AttestationRequest.md)| &lt;code&gt;{&amp;quot;confirmed&amp;quot;: true&lt;/code&gt;} | |

### Return type

[**VerificationSummary**](VerificationSummary.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the verification state after re-running the checks |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## attestSellerWithHttpInfo

> ApiResponse<VerificationSummary> attestSellerWithHttpInfo(id, attestationRequest)

Confirms that the seller authorised the tenant to issue and receive invoices on its behalf.

Confirms that the seller authorised the tenant to issue and receive invoices on its behalf.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller identifier
        AttestationRequest attestationRequest = new AttestationRequest(); // AttestationRequest | <code>{&quot;confirmed&quot;: true</code>}
        try {
            ApiResponse<VerificationSummary> response = apiInstance.attestSellerWithHttpInfo(id, attestationRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#attestSeller");
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
| **id** | **UUID**| seller identifier | |
| **attestationRequest** | [**AttestationRequest**](AttestationRequest.md)| &lt;code&gt;{&amp;quot;confirmed&amp;quot;: true&lt;/code&gt;} | |

### Return type

ApiResponse<[**VerificationSummary**](VerificationSummary.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the verification state after re-running the checks |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## createSeller

> SellerResponse createSeller(sellerRequest)

Creates a seller entity whose data is used on all its invoices, and starts its verification.

Creates a seller entity whose data is used on all its invoices, and starts its verification.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        SellerRequest sellerRequest = new SellerRequest(); // SellerRequest | seller data and the optional authorisation confirmation
        try {
            SellerResponse result = apiInstance.createSeller(sellerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#createSeller");
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
| **sellerRequest** | [**SellerRequest**](SellerRequest.md)| seller data and the optional authorisation confirmation | |

### Return type

[**SellerResponse**](SellerResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 with the seller |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## createSellerWithHttpInfo

> ApiResponse<SellerResponse> createSellerWithHttpInfo(sellerRequest)

Creates a seller entity whose data is used on all its invoices, and starts its verification.

Creates a seller entity whose data is used on all its invoices, and starts its verification.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        SellerRequest sellerRequest = new SellerRequest(); // SellerRequest | seller data and the optional authorisation confirmation
        try {
            ApiResponse<SellerResponse> response = apiInstance.createSellerWithHttpInfo(sellerRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#createSeller");
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
| **sellerRequest** | [**SellerRequest**](SellerRequest.md)| seller data and the optional authorisation confirmation | |

### Return type

ApiResponse<[**SellerResponse**](SellerResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 with the seller |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## enableSellerPeppolReceiving

> PeppolStatusResponse enableSellerPeppolReceiving(id)

Switches receiving through us on, if nobody else serves the seller&#39;s Peppol address.

Switches receiving through us on, if nobody else serves the seller&#39;s Peppol address.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller
        try {
            PeppolStatusResponse result = apiInstance.enableSellerPeppolReceiving(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#enableSellerPeppolReceiving");
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
| **id** | **UUID**| seller | |

### Return type

[**PeppolStatusResponse**](PeppolStatusResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the registration; &lt;code&gt;receivingBlocked&lt;/code&gt; names the provider if another one serves the address |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## enableSellerPeppolReceivingWithHttpInfo

> ApiResponse<PeppolStatusResponse> enableSellerPeppolReceivingWithHttpInfo(id)

Switches receiving through us on, if nobody else serves the seller&#39;s Peppol address.

Switches receiving through us on, if nobody else serves the seller&#39;s Peppol address.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller
        try {
            ApiResponse<PeppolStatusResponse> response = apiInstance.enableSellerPeppolReceivingWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#enableSellerPeppolReceiving");
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
| **id** | **UUID**| seller | |

### Return type

ApiResponse<[**PeppolStatusResponse**](PeppolStatusResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the registration; &lt;code&gt;receivingBlocked&lt;/code&gt; names the provider if another one serves the address |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## getSeller

> SellerResponse getSeller(id)

Returns a seller entity.

Returns a seller entity.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller identifier
        try {
            SellerResponse result = apiInstance.getSeller(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#getSeller");
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
| **id** | **UUID**| seller identifier | |

### Return type

[**SellerResponse**](SellerResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the seller |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## getSellerWithHttpInfo

> ApiResponse<SellerResponse> getSellerWithHttpInfo(id)

Returns a seller entity.

Returns a seller entity.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller identifier
        try {
            ApiResponse<SellerResponse> response = apiInstance.getSellerWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#getSeller");
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
| **id** | **UUID**| seller identifier | |

### Return type

ApiResponse<[**SellerResponse**](SellerResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the seller |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## getSellerPeppol

> PeppolStatusResponse getSellerPeppol(id)

Returns a seller&#39;s Peppol registration.

Returns a seller&#39;s Peppol registration.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller
        try {
            PeppolStatusResponse result = apiInstance.getSellerPeppol(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#getSellerPeppol");
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
| **id** | **UUID**| seller | |

### Return type

[**PeppolStatusResponse**](PeppolStatusResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the registration |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## getSellerPeppolWithHttpInfo

> ApiResponse<PeppolStatusResponse> getSellerPeppolWithHttpInfo(id)

Returns a seller&#39;s Peppol registration.

Returns a seller&#39;s Peppol registration.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller
        try {
            ApiResponse<PeppolStatusResponse> response = apiInstance.getSellerPeppolWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#getSellerPeppol");
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
| **id** | **UUID**| seller | |

### Return type

ApiResponse<[**PeppolStatusResponse**](PeppolStatusResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the registration |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## getSellerVerification

> VerificationResponse getSellerVerification(id)

Returns the verification details: state, history, VAT ID checks and uploaded documents.

Returns the verification details: state, history, VAT ID checks and uploaded documents.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller identifier
        try {
            VerificationResponse result = apiInstance.getSellerVerification(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#getSellerVerification");
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
| **id** | **UUID**| seller identifier | |

### Return type

[**VerificationResponse**](VerificationResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the details |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## getSellerVerificationWithHttpInfo

> ApiResponse<VerificationResponse> getSellerVerificationWithHttpInfo(id)

Returns the verification details: state, history, VAT ID checks and uploaded documents.

Returns the verification details: state, history, VAT ID checks and uploaded documents.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller identifier
        try {
            ApiResponse<VerificationResponse> response = apiInstance.getSellerVerificationWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#getSellerVerification");
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
| **id** | **UUID**| seller identifier | |

### Return type

ApiResponse<[**VerificationResponse**](VerificationResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the details |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## listSellers

> PageDtoSellerResponse listSellers(page, size)

Lists the tenant&#39;s seller entities by name.

Lists the tenant&#39;s seller entities by name.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        Integer page = 0; // Integer | zero-based page number
        Integer size = 20; // Integer | page size, 1 to 100
        try {
            PageDtoSellerResponse result = apiInstance.listSellers(page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#listSellers");
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

[**PageDtoSellerResponse**](PageDtoSellerResponse.md)


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

## listSellersWithHttpInfo

> ApiResponse<PageDtoSellerResponse> listSellersWithHttpInfo(page, size)

Lists the tenant&#39;s seller entities by name.

Lists the tenant&#39;s seller entities by name.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        Integer page = 0; // Integer | zero-based page number
        Integer size = 20; // Integer | page size, 1 to 100
        try {
            ApiResponse<PageDtoSellerResponse> response = apiInstance.listSellersWithHttpInfo(page, size);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#listSellers");
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

ApiResponse<[**PageDtoSellerResponse**](PageDtoSellerResponse.md)>


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


## renewSellerPeppolVerification

> PeppolStatusResponse renewSellerPeppolVerification(id)

Asks the access point for a new identity-check link (the old one may be lost or expired).

Asks the access point for a new identity-check link (the old one may be lost or expired).

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller
        try {
            PeppolStatusResponse result = apiInstance.renewSellerPeppolVerification(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#renewSellerPeppolVerification");
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
| **id** | **UUID**| seller | |

### Return type

[**PeppolStatusResponse**](PeppolStatusResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the registration with the new link |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## renewSellerPeppolVerificationWithHttpInfo

> ApiResponse<PeppolStatusResponse> renewSellerPeppolVerificationWithHttpInfo(id)

Asks the access point for a new identity-check link (the old one may be lost or expired).

Asks the access point for a new identity-check link (the old one may be lost or expired).

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller
        try {
            ApiResponse<PeppolStatusResponse> response = apiInstance.renewSellerPeppolVerificationWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#renewSellerPeppolVerification");
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
| **id** | **UUID**| seller | |

### Return type

ApiResponse<[**PeppolStatusResponse**](PeppolStatusResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the registration with the new link |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## updateSeller

> SellerResponse updateSeller(id, sellerRequest)

Replaces a seller entity&#39;s data.

Replaces a seller entity&#39;s data. Changing its name, VAT ID or Peppol address restarts the verification; with  Peppol activated, a new VAT ID or register number goes to the access point, which asks for a new identity check.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller identifier
        SellerRequest sellerRequest = new SellerRequest(); // SellerRequest | new seller data
        try {
            SellerResponse result = apiInstance.updateSeller(id, sellerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#updateSeller");
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
| **id** | **UUID**| seller identifier | |
| **sellerRequest** | [**SellerRequest**](SellerRequest.md)| new seller data | |

### Return type

[**SellerResponse**](SellerResponse.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the seller |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## updateSellerWithHttpInfo

> ApiResponse<SellerResponse> updateSellerWithHttpInfo(id, sellerRequest)

Replaces a seller entity&#39;s data.

Replaces a seller entity&#39;s data. Changing its name, VAT ID or Peppol address restarts the verification; with  Peppol activated, a new VAT ID or register number goes to the access point, which asks for a new identity check.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller identifier
        SellerRequest sellerRequest = new SellerRequest(); // SellerRequest | new seller data
        try {
            ApiResponse<SellerResponse> response = apiInstance.updateSellerWithHttpInfo(id, sellerRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#updateSeller");
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
| **id** | **UUID**| seller identifier | |
| **sellerRequest** | [**SellerRequest**](SellerRequest.md)| new seller data | |

### Return type

ApiResponse<[**SellerResponse**](SellerResponse.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the seller |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |


## uploadSellerDocument

> DocumentEntry uploadSellerDocument(id, type, body, fileName)

Uploads a supporting document (PDF, PNG or JPEG, at most 10 MB) as the raw request body.

Uploads a supporting document (PDF, PNG or JPEG, at most 10 MB) as the raw request body.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller identifier
        String type = "type_example"; // String | <code>commercial-register</code>, <code>trade-registration</code> or <code>signed-authorization</code>
        File body = new File("/path/to/file"); // File | The file as the raw request body
        String fileName = "document"; // String | original file name
        try {
            DocumentEntry result = apiInstance.uploadSellerDocument(id, type, body, fileName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#uploadSellerDocument");
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
| **id** | **UUID**| seller identifier | |
| **type** | **String**| &lt;code&gt;commercial-register&lt;/code&gt;, &lt;code&gt;trade-registration&lt;/code&gt; or &lt;code&gt;signed-authorization&lt;/code&gt; | |
| **body** | **File**| The file as the raw request body | |
| **fileName** | **String**| original file name | [optional] [default to document] |

### Return type

[**DocumentEntry**](DocumentEntry.md)


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/pdf, image/jpeg, image/png
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 with the stored document&#39;s metadata |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

## uploadSellerDocumentWithHttpInfo

> ApiResponse<DocumentEntry> uploadSellerDocumentWithHttpInfo(id, type, body, fileName)

Uploads a supporting document (PDF, PNG or JPEG, at most 10 MB) as the raw request body.

Uploads a supporting document (PDF, PNG or JPEG, at most 10 MB) as the raw request body.

### Example

```java
// Import classes:
import com.fakturnaut.sdk.ApiClient;
import com.fakturnaut.sdk.ApiException;
import com.fakturnaut.sdk.ApiResponse;
import com.fakturnaut.sdk.Configuration;
import com.fakturnaut.sdk.auth.*;
import com.fakturnaut.sdk.models.*;
import com.fakturnaut.sdk.api.SellersApi;

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

        SellersApi apiInstance = new SellersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | seller identifier
        String type = "type_example"; // String | <code>commercial-register</code>, <code>trade-registration</code> or <code>signed-authorization</code>
        File body = new File("/path/to/file"); // File | The file as the raw request body
        String fileName = "document"; // String | original file name
        try {
            ApiResponse<DocumentEntry> response = apiInstance.uploadSellerDocumentWithHttpInfo(id, type, body, fileName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SellersApi#uploadSellerDocument");
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
| **id** | **UUID**| seller identifier | |
| **type** | **String**| &lt;code&gt;commercial-register&lt;/code&gt;, &lt;code&gt;trade-registration&lt;/code&gt; or &lt;code&gt;signed-authorization&lt;/code&gt; | |
| **body** | **File**| The file as the raw request body | |
| **fileName** | **String**| original file name | [optional] [default to document] |

### Return type

ApiResponse<[**DocumentEntry**](DocumentEntry.md)>


### Authorization

[apiKey](../README.md#apiKey), [bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/pdf, image/jpeg, image/png
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 with the stored document&#39;s metadata |  -  |
| **0** | An error as RFC 9457 problem with a stable code, e.g. invoice.invalid |  -  |

