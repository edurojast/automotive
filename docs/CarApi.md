# CarApi

All URIs are relative to *https://carautomotive.swagger.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCar**](CarApi.md#addCar) | **POST** /car | Add a new car to the automotive
[**deleteCar**](CarApi.md#deleteCar) | **DELETE** /car/{carId} | Deletes a car
[**findCarsByStatus**](CarApi.md#findCarsByStatus) | **GET** /car/findByStatus | Finds Cars by status
[**findCarsByTags**](CarApi.md#findCarsByTags) | **GET** /car/findByTags | Finds Cars by tags
[**getCarById**](CarApi.md#getCarById) | **GET** /car/{carId} | Find car by ID
[**updateCar**](CarApi.md#updateCar) | **PUT** /car | Update an existing car
[**updateCarWithForm**](CarApi.md#updateCarWithForm) | **POST** /car/{carId} | Updates a car in the automotive with form data
[**uploadFile**](CarApi.md#uploadFile) | **POST** /car/{carId}/uploadImage | uploads an image


<a name="addCar"></a>
# **addCar**
> addCar(body)

Add a new car to the automotive



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: carautomotive_auth
OAuth carautomotive_auth = (OAuth) defaultClient.getAuthentication("carautomotive_auth");
carautomotive_auth.setAccessToken("YOUR ACCESS TOKEN");

CarApi apiInstance = new CarApi();
Car body = new Car(); // Car | Car object that needs to be added to the automotive
try {
    apiInstance.addCar(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CarApi#addCar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Car**](Car.md)| Car object that needs to be added to the automotive |

### Return type

null (empty response body)

### Authorization

[carautomotive_auth](../README.md#carautomotive_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="deleteCar"></a>
# **deleteCar**
> deleteCar(carId, apiKey)

Deletes a car



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: carautomotive_auth
OAuth carautomotive_auth = (OAuth) defaultClient.getAuthentication("carautomotive_auth");
carautomotive_auth.setAccessToken("YOUR ACCESS TOKEN");

CarApi apiInstance = new CarApi();
Long carId = 789L; // Long | Car id to delete
String apiKey = "apiKey_example"; // String | 
try {
    apiInstance.deleteCar(carId, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling CarApi#deleteCar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **carId** | **Long**| Car id to delete |
 **apiKey** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[carautomotive_auth](../README.md#carautomotive_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="findCarsByStatus"></a>
# **findCarsByStatus**
> List&lt;Car&gt; findCarsByStatus(status)

Finds Cars by status

Multiple status values can be provided with comma separated strings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: carautomotive_auth
OAuth carautomotive_auth = (OAuth) defaultClient.getAuthentication("carautomotive_auth");
carautomotive_auth.setAccessToken("YOUR ACCESS TOKEN");

CarApi apiInstance = new CarApi();
List<String> status = Arrays.asList("status_example"); // List<String> | Status values that need to be considered for filter
try {
    List<Car> result = apiInstance.findCarsByStatus(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarApi#findCarsByStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**List&lt;String&gt;**](String.md)| Status values that need to be considered for filter | [enum: available, pending, sold]

### Return type

[**List&lt;Car&gt;**](Car.md)

### Authorization

[carautomotive_auth](../README.md#carautomotive_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="findCarsByTags"></a>
# **findCarsByTags**
> List&lt;Car&gt; findCarsByTags(tags)

Finds Cars by tags

Muliple tags can be provided with comma separated strings. Use         tag1, tag2, tag3 for testing.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: carautomotive_auth
OAuth carautomotive_auth = (OAuth) defaultClient.getAuthentication("carautomotive_auth");
carautomotive_auth.setAccessToken("YOUR ACCESS TOKEN");

CarApi apiInstance = new CarApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | Tags to filter by
try {
    List<Car> result = apiInstance.findCarsByTags(tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarApi#findCarsByTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| Tags to filter by |

### Return type

[**List&lt;Car&gt;**](Car.md)

### Authorization

[carautomotive_auth](../README.md#carautomotive_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getCarById"></a>
# **getCarById**
> Car getCarById(carId)

Find car by ID

Returns a single car

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CarApi apiInstance = new CarApi();
Long carId = 789L; // Long | ID of car to return
try {
    Car result = apiInstance.getCarById(carId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarApi#getCarById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **carId** | **Long**| ID of car to return |

### Return type

[**Car**](Car.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateCar"></a>
# **updateCar**
> updateCar(body)

Update an existing car



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: carautomotive_auth
OAuth carautomotive_auth = (OAuth) defaultClient.getAuthentication("carautomotive_auth");
carautomotive_auth.setAccessToken("YOUR ACCESS TOKEN");

CarApi apiInstance = new CarApi();
Car body = new Car(); // Car | Car object that needs to be added to the automotive
try {
    apiInstance.updateCar(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CarApi#updateCar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Car**](Car.md)| Car object that needs to be added to the automotive |

### Return type

null (empty response body)

### Authorization

[carautomotive_auth](../README.md#carautomotive_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="updateCarWithForm"></a>
# **updateCarWithForm**
> updateCarWithForm(carId, name, status)

Updates a car in the automotive with form data



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: carautomotive_auth
OAuth carautomotive_auth = (OAuth) defaultClient.getAuthentication("carautomotive_auth");
carautomotive_auth.setAccessToken("YOUR ACCESS TOKEN");

CarApi apiInstance = new CarApi();
Long carId = 789L; // Long | ID of car that needs to be updated
String name = "name_example"; // String | Updated name of the car
String status = "status_example"; // String | Updated status of the car
try {
    apiInstance.updateCarWithForm(carId, name, status);
} catch (ApiException e) {
    System.err.println("Exception when calling CarApi#updateCarWithForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **carId** | **Long**| ID of car that needs to be updated |
 **name** | **String**| Updated name of the car | [optional]
 **status** | **String**| Updated status of the car | [optional]

### Return type

null (empty response body)

### Authorization

[carautomotive_auth](../README.md#carautomotive_auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="uploadFile"></a>
# **uploadFile**
> ModelApiResponse uploadFile(carId, additionalMetadata, file)

uploads an image



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: carautomotive_auth
OAuth carautomotive_auth = (OAuth) defaultClient.getAuthentication("carautomotive_auth");
carautomotive_auth.setAccessToken("YOUR ACCESS TOKEN");

CarApi apiInstance = new CarApi();
Long carId = 789L; // Long | ID of car to update
String additionalMetadata = "additionalMetadata_example"; // String | Additional data to pass to server
File file = new File("/path/to/file.txt"); // File | file to upload
try {
    ModelApiResponse result = apiInstance.uploadFile(carId, additionalMetadata, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **carId** | **Long**| ID of car to update |
 **additionalMetadata** | **String**| Additional data to pass to server | [optional]
 **file** | **File**| file to upload | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[carautomotive_auth](../README.md#carautomotive_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

