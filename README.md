# Fakturnaut Java SDK

Java 17+ client for the [Fakturnaut API](https://fakturnaut.com/docs) (`java.net.http`, Jackson): issue, validate,
deliver and check EN 16931 e-invoices (XRechnung, ZUGFeRD, RO e-Factura).

```xml
<dependency>
  <groupId>com.fakturnaut</groupId>
  <artifactId>fakturnaut-sdk</artifactId>
  <version>1.0.0</version>
</dependency>
```

```java
ApiClient client = new ApiClient();
String key = System.getenv("FAKTURNAUT_KEY"); // fkn_test_… for the sandbox
client.setRequestInterceptor(request -> request.header("Authorization", "Bearer " + key));
InvoicesApi invoices = new InvoicesApi(client);
InvoiceResponse issued = invoices.issueInvoice(request, Idempotency.newKey());
```

Errors throw `ApiException`; `getResponseBody()` is an RFC 9457 problem with a stable `code`.

## Webhooks

```java
boolean ok = Webhooks.verify(rawBody, request.getHeader("Einvoice-Timestamp"),
        request.getHeader("Einvoice-Signature"), System.getenv("FAKTURNAUT_WEBHOOK_SECRET"));
```

Generated from `api/openapi.json`; the helpers live in `com.fakturnaut.sdk.helpers`. Build and test: `mvn verify`.
