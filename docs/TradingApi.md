# TradingApi

All URIs are relative to *https://9ulhjb8zqd.execute-api.us-east-1.amazonaws.com/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**candlesGet**](TradingApi.md#candlesGet) | **GET** /candles | 
[**ordersMarketPost**](TradingApi.md#ordersMarketPost) | **POST** /orders/market | Place market order
[**ordersPendingOrderIdDelete**](TradingApi.md#ordersPendingOrderIdDelete) | **DELETE** /orders/pending/{orderId} | Cancels a pending order in placed state
[**ordersPendingOrderIdPatch**](TradingApi.md#ordersPendingOrderIdPatch) | **PATCH** /orders/pending/{orderId} | Modify a pending order
[**ordersPendingPost**](TradingApi.md#ordersPendingPost) | **POST** /orders/pending | Place a pending order
[**positionsPositionIdClosePost**](TradingApi.md#positionsPositionIdClosePost) | **POST** /positions/{positionId}/close | Places a close order for an existing position
[**positionsPositionIdPatch**](TradingApi.md#positionsPositionIdPatch) | **PATCH** /positions/{positionId} | Modifies an existing position

<a name="candlesGet"></a>
# **candlesGet**
> candlesGet(resolution, symbol, endDate, noOfCandles)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradingApi;


TradingApi apiInstance = new TradingApi();
String resolution = "resolution_example"; // String | 
String symbol = "symbol_example"; // String | 
String endDate = "endDate_example"; // String | 
String noOfCandles = "noOfCandles_example"; // String | 
try {
    apiInstance.candlesGet(resolution, symbol, endDate, noOfCandles);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#candlesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resolution** | **String**|  |
 **symbol** | **String**|  |
 **endDate** | **String**|  |
 **noOfCandles** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ordersMarketPost"></a>
# **ordersMarketPost**
> StandardResponseOrderResult ordersMarketPost(body, authorization, contentType, tpTradingAccountId)

Place market order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

TradingApi apiInstance = new TradingApi();
MarketOrder body = new MarketOrder(); // MarketOrder | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    StandardResponseOrderResult result = apiInstance.ordersMarketPost(body, authorization, contentType, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#ordersMarketPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MarketOrder**](MarketOrder.md)|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**StandardResponseOrderResult**](StandardResponseOrderResult.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ordersPendingOrderIdDelete"></a>
# **ordersPendingOrderIdDelete**
> StandardResponseOrderResult ordersPendingOrderIdDelete(orderId, authorization, contentType, tpTradingAccountId)

Cancels a pending order in placed state

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

TradingApi apiInstance = new TradingApi();
Integer orderId = 56; // Integer | Id of the order
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    StandardResponseOrderResult result = apiInstance.ordersPendingOrderIdDelete(orderId, authorization, contentType, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#ordersPendingOrderIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**| Id of the order |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**StandardResponseOrderResult**](StandardResponseOrderResult.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ordersPendingOrderIdPatch"></a>
# **ordersPendingOrderIdPatch**
> StandardResponseOrderResult ordersPendingOrderIdPatch(body, authorization, contentType, tpTradingAccountId, orderId)

Modify a pending order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

TradingApi apiInstance = new TradingApi();
PatchedPendingOrder body = new PatchedPendingOrder(); // PatchedPendingOrder | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | 
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
Integer orderId = 56; // Integer | Id of the order
try {
    StandardResponseOrderResult result = apiInstance.ordersPendingOrderIdPatch(body, authorization, contentType, tpTradingAccountId, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#ordersPendingOrderIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PatchedPendingOrder**](PatchedPendingOrder.md)|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**|  |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |
 **orderId** | **Integer**| Id of the order |

### Return type

[**StandardResponseOrderResult**](StandardResponseOrderResult.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ordersPendingPost"></a>
# **ordersPendingPost**
> StandardResponseOrderResult ordersPendingPost(body, authorization, contentType, tpTradingAccountId)

Place a pending order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

TradingApi apiInstance = new TradingApi();
PendingOrder body = new PendingOrder(); // PendingOrder | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    StandardResponseOrderResult result = apiInstance.ordersPendingPost(body, authorization, contentType, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#ordersPendingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PendingOrder**](PendingOrder.md)|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**StandardResponseOrderResult**](StandardResponseOrderResult.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="positionsPositionIdClosePost"></a>
# **positionsPositionIdClosePost**
> StandardResponsePositionResult positionsPositionIdClosePost(body, authorization, contentType, tpTradingAccountId, positionId)

Places a close order for an existing position

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

TradingApi apiInstance = new TradingApi();
ClosePosition body = new ClosePosition(); // ClosePosition | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
Integer positionId = 56; // Integer | Id of the position
try {
    StandardResponsePositionResult result = apiInstance.positionsPositionIdClosePost(body, authorization, contentType, tpTradingAccountId, positionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#positionsPositionIdClosePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClosePosition**](ClosePosition.md)|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |
 **positionId** | **Integer**| Id of the position |

### Return type

[**StandardResponsePositionResult**](StandardResponsePositionResult.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="positionsPositionIdPatch"></a>
# **positionsPositionIdPatch**
> StandardResponsePositionResult positionsPositionIdPatch(body, authorization, contentType, tpTradingAccountId, positionId)

Modifies an existing position

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

TradingApi apiInstance = new TradingApi();
ModifyPosition body = new ModifyPosition(); // ModifyPosition | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
Integer positionId = 56; // Integer | Id of the position
try {
    StandardResponsePositionResult result = apiInstance.positionsPositionIdPatch(body, authorization, contentType, tpTradingAccountId, positionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#positionsPositionIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModifyPosition**](ModifyPosition.md)|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |
 **positionId** | **Integer**| Id of the position |

### Return type

[**StandardResponsePositionResult**](StandardResponsePositionResult.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

