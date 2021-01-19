# WatchlistsApi

All URIs are relative to *https://9ulhjb8zqd.execute-api.us-east-1.amazonaws.com/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSymbol**](WatchlistsApi.md#addSymbol) | **POST** /watchlists/{watchlistId}/symbols | Adds symbol to watchlist
[**addWatchlist**](WatchlistsApi.md#addWatchlist) | **POST** /watchlists | Creates new custom watchlist for user
[**changeSymbolOrder**](WatchlistsApi.md#changeSymbolOrder) | **PUT** /watchlists/{watchlistId}/symbols/order | Reorders symbols inside watchlist
[**changeWatchlistsOrder**](WatchlistsApi.md#changeWatchlistsOrder) | **PUT** /watchlists/order | Reorders watchlists
[**deleteWatchList**](WatchlistsApi.md#deleteWatchList) | **DELETE** /watchlists/{watchlistId} | Deletes custom watchlist
[**removesSymbol**](WatchlistsApi.md#removesSymbol) | **DELETE** /watchlists/{watchlistId}/symbols/{symbol} | Removes symbol from Watchlist
[**updateWatchlist**](WatchlistsApi.md#updateWatchlist) | **PATCH** /watchlists/{watchlistId} | Updates custom watchlist
[**watchlists**](WatchlistsApi.md#watchlists) | **GET** /watchlists | Retrieves list of available watchlists for user

<a name="addSymbol"></a>
# **addSymbol**
> addSymbol(body, authorization, contentType, tpTradingAccountId, watchlistId)

Adds symbol to watchlist

Adds symbol to watchlist

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WatchlistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

WatchlistsApi apiInstance = new WatchlistsApi();
WatchlistSymbol body = new WatchlistSymbol(); // WatchlistSymbol | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
Long watchlistId = 789L; // Long | Id of the watchlist
try {
    apiInstance.addSymbol(body, authorization, contentType, tpTradingAccountId, watchlistId);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsApi#addSymbol");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WatchlistSymbol**](WatchlistSymbol.md)|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |
 **watchlistId** | **Long**| Id of the watchlist |

### Return type

null (empty response body)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWatchlist"></a>
# **addWatchlist**
> addWatchlist(body, authorization, contentType, tpTradingAccountId)

Creates new custom watchlist for user

Creates new custom watchlist for user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WatchlistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

WatchlistsApi apiInstance = new WatchlistsApi();
WatchlistName body = new WatchlistName(); // WatchlistName | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    apiInstance.addWatchlist(body, authorization, contentType, tpTradingAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsApi#addWatchlist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WatchlistName**](WatchlistName.md)|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

null (empty response body)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="changeSymbolOrder"></a>
# **changeSymbolOrder**
> changeSymbolOrder(body, authorization, contentType, tpTradingAccountId, watchlistId)

Reorders symbols inside watchlist

Reorders symbols inside watchlist

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WatchlistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

WatchlistsApi apiInstance = new WatchlistsApi();
List<String> body = Arrays.asList("body_example"); // List<String> | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
Long watchlistId = 789L; // Long | Id of the watchlist
try {
    apiInstance.changeSymbolOrder(body, authorization, contentType, tpTradingAccountId, watchlistId);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsApi#changeSymbolOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;String&gt;**](String.md)|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |
 **watchlistId** | **Long**| Id of the watchlist |

### Return type

null (empty response body)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changeWatchlistsOrder"></a>
# **changeWatchlistsOrder**
> changeWatchlistsOrder(body, authorization, contentType, tpTradingAccountId)

Reorders watchlists

Reorders watchlists

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WatchlistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

WatchlistsApi apiInstance = new WatchlistsApi();
List<Long> body = Arrays.asList(56L); // List<Long> | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    apiInstance.changeWatchlistsOrder(body, authorization, contentType, tpTradingAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsApi#changeWatchlistsOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Long&gt;**](Long.md)|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

null (empty response body)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWatchList"></a>
# **deleteWatchList**
> deleteWatchList(watchlistId, authorization, contentType, tpTradingAccountId)

Deletes custom watchlist

Deletes custom watchlist

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WatchlistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

WatchlistsApi apiInstance = new WatchlistsApi();
Long watchlistId = 789L; // Long | Id of the watchlist
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    apiInstance.deleteWatchList(watchlistId, authorization, contentType, tpTradingAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsApi#deleteWatchList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watchlistId** | **Long**| Id of the watchlist |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

null (empty response body)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removesSymbol"></a>
# **removesSymbol**
> removesSymbol(watchlistId, symbol, authorization, tpTradingAccountId)

Removes symbol from Watchlist

Removes symbol from Watchlist

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WatchlistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

WatchlistsApi apiInstance = new WatchlistsApi();
Long watchlistId = 789L; // Long | Id of the watchlist
String symbol = "symbol_example"; // String | Symbol name
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    apiInstance.removesSymbol(watchlistId, symbol, authorization, tpTradingAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsApi#removesSymbol");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watchlistId** | **Long**| Id of the watchlist |
 **symbol** | **String**| Symbol name |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

null (empty response body)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWatchlist"></a>
# **updateWatchlist**
> updateWatchlist(body, authorization, contentType, tpTradingAccountId, watchlistId)

Updates custom watchlist

Updates custom watchlist

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WatchlistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

WatchlistsApi apiInstance = new WatchlistsApi();
CustomerWatchlist body = new CustomerWatchlist(); // CustomerWatchlist | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
Long watchlistId = 789L; // Long | Id of the watchlist
try {
    apiInstance.updateWatchlist(body, authorization, contentType, tpTradingAccountId, watchlistId);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsApi#updateWatchlist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerWatchlist**](CustomerWatchlist.md)|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |
 **watchlistId** | **Long**| Id of the watchlist |

### Return type

null (empty response body)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="watchlists"></a>
# **watchlists**
> StandardResponseListWatchlist watchlists(authorization, tpTradingAccountId)

Retrieves list of available watchlists for user

Retrieves list of available watchlists for user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WatchlistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

WatchlistsApi apiInstance = new WatchlistsApi();
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    StandardResponseListWatchlist result = apiInstance.watchlists(authorization, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WatchlistsApi#watchlists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**StandardResponseListWatchlist**](StandardResponseListWatchlist.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

