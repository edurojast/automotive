# ClientApi

All URIs are relative to *https://carautomotive.swagger.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClient**](ClientApi.md#createClient) | **POST** /client | Create client
[**createClientsWithArrayInput**](ClientApi.md#createClientsWithArrayInput) | **POST** /client/createWithArray | Creates list of clients with given input array
[**createClientsWithListInput**](ClientApi.md#createClientsWithListInput) | **POST** /client/createWithList | Creates list of clients with given input array
[**deleteClient**](ClientApi.md#deleteClient) | **DELETE** /client/{clientname} | Delete client
[**getClientByName**](ClientApi.md#getClientByName) | **GET** /client/{clientname} | Get client by client name
[**loginClient**](ClientApi.md#loginClient) | **GET** /client/login | Logs client into the system
[**logoutClient**](ClientApi.md#logoutClient) | **GET** /client/logout | Logs out current logged in client session
[**updateClient**](ClientApi.md#updateClient) | **PUT** /client/{clientname} | Updated client


<a name="createClient"></a>
# **createClient**
> createClient(body)

Create client

This can only be done by the logged in client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
Client body = new Client(); // Client | Created client object
try {
    apiInstance.createClient(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#createClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Client**](Client.md)| Created client object |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="createClientsWithArrayInput"></a>
# **createClientsWithArrayInput**
> createClientsWithArrayInput(body)

Creates list of clients with given input array



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
List<Client> body = Arrays.asList(new Client()); // List<Client> | List of client object
try {
    apiInstance.createClientsWithArrayInput(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#createClientsWithArrayInput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Client&gt;**](Client.md)| List of client object |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="createClientsWithListInput"></a>
# **createClientsWithListInput**
> createClientsWithListInput(body)

Creates list of clients with given input array



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
List<Client> body = Arrays.asList(new Client()); // List<Client> | List of client object
try {
    apiInstance.createClientsWithListInput(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#createClientsWithListInput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Client&gt;**](Client.md)| List of client object |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="deleteClient"></a>
# **deleteClient**
> deleteClient(clientname)

Delete client

This can only be done by the logged in client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
String clientname = "clientname_example"; // String | The name that needs to be deleted
try {
    apiInstance.deleteClient(clientname);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#deleteClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientname** | **String**| The name that needs to be deleted |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getClientByName"></a>
# **getClientByName**
> Client getClientByName(clientname)

Get client by client name



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
String clientname = "clientname_example"; // String | The name that needs to be fetched. Use client1 for testing. 
try {
    Client result = apiInstance.getClientByName(clientname);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientname** | **String**| The name that needs to be fetched. Use client1 for testing.  |

### Return type

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="loginClient"></a>
# **loginClient**
> String loginClient(clientname, password)

Logs client into the system



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
String clientname = "clientname_example"; // String | The client name for login
String password = "password_example"; // String | The password for login in clear text
try {
    String result = apiInstance.loginClient(clientname, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#loginClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientname** | **String**| The client name for login |
 **password** | **String**| The password for login in clear text |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="logoutClient"></a>
# **logoutClient**
> logoutClient()

Logs out current logged in client session



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
try {
    apiInstance.logoutClient();
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#logoutClient");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateClient"></a>
# **updateClient**
> updateClient(clientname, body)

Updated client

This can only be done by the logged in client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
String clientname = "clientname_example"; // String | name that need to be updated
Client body = new Client(); // Client | Updated client object
try {
    apiInstance.updateClient(clientname, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#updateClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientname** | **String**| name that need to be updated |
 **body** | [**Client**](Client.md)| Updated client object |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

