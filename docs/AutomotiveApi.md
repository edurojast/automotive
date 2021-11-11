# AutomotiveApi

All URIs are relative to *https://carautomotive.swagger.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrder**](AutomotiveApi.md#deleteOrder) | **DELETE** /automotive/order/{orderId} | Delete purchase order by ID
[**getInventory**](AutomotiveApi.md#getInventory) | **GET** /automotive/inventory | Returns car inventories by status
[**getOrderById**](AutomotiveApi.md#getOrderById) | **GET** /automotive/order/{orderId} | Find purchase order by ID
[**placeOrder**](AutomotiveApi.md#placeOrder) | **POST** /automotive/order | Place an order for a car


<a name="deleteOrder"></a>
# **deleteOrder**
> deleteOrder(orderId)

Delete purchase order by ID

For valid response try integer IDs with positive integer value.         Negative or non-integer values will generate API errors

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutomotiveApi;


AutomotiveApi apiInstance = new AutomotiveApi();
Long orderId = 789L; // Long | ID of the order that needs to be deleted
try {
    apiInstance.deleteOrder(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomotiveApi#deleteOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| ID of the order that needs to be deleted |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getInventory"></a>
# **getInventory**
> Map&lt;String, Integer&gt; getInventory()

Returns car inventories by status

Returns a map of status codes to quantities

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutomotiveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutomotiveApi apiInstance = new AutomotiveApi();
try {
    Map<String, Integer> result = apiInstance.getInventory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomotiveApi#getInventory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, Integer&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderById"></a>
# **getOrderById**
> Order getOrderById(orderId)

Find purchase order by ID

For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10.         Other values will generated exceptions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutomotiveApi;


AutomotiveApi apiInstance = new AutomotiveApi();
Long orderId = 789L; // Long | ID of car that needs to be fetched
try {
    Order result = apiInstance.getOrderById(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomotiveApi#getOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| ID of car that needs to be fetched |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="placeOrder"></a>
# **placeOrder**
> Order placeOrder(body)

Place an order for a car



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutomotiveApi;


AutomotiveApi apiInstance = new AutomotiveApi();
Order body = new Order(); // Order | order placed for purchasing the car
try {
    Order result = apiInstance.placeOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomotiveApi#placeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)| order placed for purchasing the car |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

