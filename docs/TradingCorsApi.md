# TradingCorsApi

All URIs are relative to *https://9ulhjb8zqd.execute-api.us-east-1.amazonaws.com/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**candlesOptions**](TradingCorsApi.md#candlesOptions) | **OPTIONS** /candles | 
[**ordersMarketOptions**](TradingCorsApi.md#ordersMarketOptions) | **OPTIONS** /orders/market | 
[**ordersPendingOptions**](TradingCorsApi.md#ordersPendingOptions) | **OPTIONS** /orders/pending | 
[**ordersPendingOrderIdOptions**](TradingCorsApi.md#ordersPendingOrderIdOptions) | **OPTIONS** /orders/pending/{orderId} | 
[**positionsPositionIdCloseOptions**](TradingCorsApi.md#positionsPositionIdCloseOptions) | **OPTIONS** /positions/{positionId}/close | 
[**positionsPositionIdOptions**](TradingCorsApi.md#positionsPositionIdOptions) | **OPTIONS** /positions/{positionId} | 

<a name="candlesOptions"></a>
# **candlesOptions**
> Empty candlesOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradingCorsApi;


TradingCorsApi apiInstance = new TradingCorsApi();
try {
    Empty result = apiInstance.candlesOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingCorsApi#candlesOptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ordersMarketOptions"></a>
# **ordersMarketOptions**
> Empty ordersMarketOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradingCorsApi;


TradingCorsApi apiInstance = new TradingCorsApi();
try {
    Empty result = apiInstance.ordersMarketOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingCorsApi#ordersMarketOptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ordersPendingOptions"></a>
# **ordersPendingOptions**
> Empty ordersPendingOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradingCorsApi;


TradingCorsApi apiInstance = new TradingCorsApi();
try {
    Empty result = apiInstance.ordersPendingOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingCorsApi#ordersPendingOptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ordersPendingOrderIdOptions"></a>
# **ordersPendingOrderIdOptions**
> Empty ordersPendingOrderIdOptions(orderId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradingCorsApi;


TradingCorsApi apiInstance = new TradingCorsApi();
Integer orderId = 56; // Integer | Id of the order
try {
    Empty result = apiInstance.ordersPendingOrderIdOptions(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingCorsApi#ordersPendingOrderIdOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**| Id of the order |

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="positionsPositionIdCloseOptions"></a>
# **positionsPositionIdCloseOptions**
> Empty positionsPositionIdCloseOptions(positionId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradingCorsApi;


TradingCorsApi apiInstance = new TradingCorsApi();
Integer positionId = 56; // Integer | Id of the position
try {
    Empty result = apiInstance.positionsPositionIdCloseOptions(positionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingCorsApi#positionsPositionIdCloseOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **positionId** | **Integer**| Id of the position |

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="positionsPositionIdOptions"></a>
# **positionsPositionIdOptions**
> Empty positionsPositionIdOptions(positionId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradingCorsApi;


TradingCorsApi apiInstance = new TradingCorsApi();
Integer positionId = 56; // Integer | Id of the position
try {
    Empty result = apiInstance.positionsPositionIdOptions(positionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingCorsApi#positionsPositionIdOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **positionId** | **Integer**| Id of the position |

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

