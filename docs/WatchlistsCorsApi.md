# WatchlistsCorsApi

All URIs are relative to *https://9ulhjb8zqd.execute-api.us-east-1.amazonaws.com/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**watchlistsOptions**](WatchlistsCorsApi.md#watchlistsOptions) | **OPTIONS** /watchlists | 
[**watchlistsOrderOptions**](WatchlistsCorsApi.md#watchlistsOrderOptions) | **OPTIONS** /watchlists/order | 
[**watchlistsWatchlistIdOptions**](WatchlistsCorsApi.md#watchlistsWatchlistIdOptions) | **OPTIONS** /watchlists/{watchlistId} | 
[**watchlistsWatchlistIdSymbolsOptions**](WatchlistsCorsApi.md#watchlistsWatchlistIdSymbolsOptions) | **OPTIONS** /watchlists/{watchlistId}/symbols | 
[**watchlistsWatchlistIdSymbolsOrderOptions**](WatchlistsCorsApi.md#watchlistsWatchlistIdSymbolsOrderOptions) | **OPTIONS** /watchlists/{watchlistId}/symbols/order | 
[**watchlistsWatchlistIdSymbolsSymbolOptions**](WatchlistsCorsApi.md#watchlistsWatchlistIdSymbolsSymbolOptions) | **OPTIONS** /watchlists/{watchlistId}/symbols/{symbol} | 

<a name="watchlistsOptions"></a>
# **watchlistsOptions**
> Empty watchlistsOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WatchlistsCorsApi;


WatchlistsCorsApi apiInstance = new WatchlistsCorsApi();
try {
    Empty result = apiInstance.watchlistsOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsCorsApi#watchlistsOptions");
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

<a name="watchlistsOrderOptions"></a>
# **watchlistsOrderOptions**
> Empty watchlistsOrderOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WatchlistsCorsApi;


WatchlistsCorsApi apiInstance = new WatchlistsCorsApi();
try {
    Empty result = apiInstance.watchlistsOrderOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsCorsApi#watchlistsOrderOptions");
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

<a name="watchlistsWatchlistIdOptions"></a>
# **watchlistsWatchlistIdOptions**
> Empty watchlistsWatchlistIdOptions(watchlistId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WatchlistsCorsApi;


WatchlistsCorsApi apiInstance = new WatchlistsCorsApi();
Long watchlistId = 789L; // Long | Id of the watchlist
try {
    Empty result = apiInstance.watchlistsWatchlistIdOptions(watchlistId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsCorsApi#watchlistsWatchlistIdOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watchlistId** | **Long**| Id of the watchlist |

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="watchlistsWatchlistIdSymbolsOptions"></a>
# **watchlistsWatchlistIdSymbolsOptions**
> Empty watchlistsWatchlistIdSymbolsOptions(watchlistId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WatchlistsCorsApi;


WatchlistsCorsApi apiInstance = new WatchlistsCorsApi();
Long watchlistId = 789L; // Long | Id of the watchlist
try {
    Empty result = apiInstance.watchlistsWatchlistIdSymbolsOptions(watchlistId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsCorsApi#watchlistsWatchlistIdSymbolsOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watchlistId** | **Long**| Id of the watchlist |

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="watchlistsWatchlistIdSymbolsOrderOptions"></a>
# **watchlistsWatchlistIdSymbolsOrderOptions**
> Empty watchlistsWatchlistIdSymbolsOrderOptions(watchlistId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WatchlistsCorsApi;


WatchlistsCorsApi apiInstance = new WatchlistsCorsApi();
Long watchlistId = 789L; // Long | Id of the watchlist
try {
    Empty result = apiInstance.watchlistsWatchlistIdSymbolsOrderOptions(watchlistId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsCorsApi#watchlistsWatchlistIdSymbolsOrderOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watchlistId** | **Long**| Id of the watchlist |

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="watchlistsWatchlistIdSymbolsSymbolOptions"></a>
# **watchlistsWatchlistIdSymbolsSymbolOptions**
> Empty watchlistsWatchlistIdSymbolsSymbolOptions(watchlistId, symbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WatchlistsCorsApi;


WatchlistsCorsApi apiInstance = new WatchlistsCorsApi();
Long watchlistId = 789L; // Long | Id of the watchlist
String symbol = "symbol_example"; // String | Symbol name
try {
    Empty result = apiInstance.watchlistsWatchlistIdSymbolsSymbolOptions(watchlistId, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsCorsApi#watchlistsWatchlistIdSymbolsSymbolOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watchlistId** | **Long**| Id of the watchlist |
 **symbol** | **String**| Symbol name |

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

