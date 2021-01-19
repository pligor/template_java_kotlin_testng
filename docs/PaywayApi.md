# PaywayApi

All URIs are relative to *https://9ulhjb8zqd.execute-api.us-east-1.amazonaws.com/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**achBankAccountDetails**](PaywayApi.md#achBankAccountDetails) | **GET** /payway/customer/ach/account | This API will return ACH bank account details. The information should be handled as confidential
[**createPlaidLinkToken**](PaywayApi.md#createPlaidLinkToken) | **POST** /payway/link/token | This API will return a Plaid Link Token for Mobile applications to initate Plaid Link
[**createPlaidLinkTokenUpdateMode**](PaywayApi.md#createPlaidLinkTokenUpdateMode) | **POST** /payway/link/update_mode/token | This API will return a Plaid Link Token for Mobile applications to initate Plaid Link in Update Mode
[**depositTransaction**](PaywayApi.md#depositTransaction) | **POST** /payway/deposits | This API creates a deposit transaction and returns the url for customer redirection and transaction reference number
[**linkAccount**](PaywayApi.md#linkAccount) | **POST** /payway/funding/link-account | This API will authenticate an account with Plaid, Get a Dwolla token from Plaid, Create Customer at Dwolla using the token obtained and attach the authenticated Account to the new created customer
[**manualLinkAccount**](PaywayApi.md#manualLinkAccount) | **POST** /payway/funding/manual-link-account | The API to manually link an ACH account
[**paymentProvider**](PaywayApi.md#paymentProvider) | **GET** /payway/public/deposits/redirect_request/{transactionRef} | This API will redirect the customer to payment provider
[**retrieveAccessTokenOfPendingPlaid**](PaywayApi.md#retrieveAccessTokenOfPendingPlaid) | **GET** /payway/account/linked-account/{itemUuid} | With this API you can get the Access token of a pending Plaid link process to initiate the validation of the amounts to authenticate an account
[**retrieveAccessTokenOfPendingPlaidManual**](PaywayApi.md#retrieveAccessTokenOfPendingPlaidManual) | **GET** /payway/account/manual-linked-account/{itemUuid} | With this API you can get the Access token of a pending Plaid link process to initiate the validation of the amounts to authenticate an account (manual)

<a name="achBankAccountDetails"></a>
# **achBankAccountDetails**
> Payway200ResponseModel achBankAccountDetails(authorization, tpTradingAccountId)

This API will return ACH bank account details. The information should be handled as confidential

This API will return ACH bank account details. The information should be handled as confidential

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaywayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

PaywayApi apiInstance = new PaywayApi();
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    Payway200ResponseModel result = apiInstance.achBankAccountDetails(authorization, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayApi#achBankAccountDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**Payway200ResponseModel**](Payway200ResponseModel.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPlaidLinkToken"></a>
# **createPlaidLinkToken**
> Payway200ResponseModel createPlaidLinkToken(authorization, contentType, tpTradingAccountId)

This API will return a Plaid Link Token for Mobile applications to initate Plaid Link

This API will return a Plaid Link Token for Mobile applications to initate Plaid Link

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaywayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

PaywayApi apiInstance = new PaywayApi();
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    Payway200ResponseModel result = apiInstance.createPlaidLinkToken(authorization, contentType, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayApi#createPlaidLinkToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**Payway200ResponseModel**](Payway200ResponseModel.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPlaidLinkTokenUpdateMode"></a>
# **createPlaidLinkTokenUpdateMode**
> Payway200ResponseModel createPlaidLinkTokenUpdateMode(authorization, contentType, tpTradingAccountId)

This API will return a Plaid Link Token for Mobile applications to initate Plaid Link in Update Mode

This API will return a Plaid Link Token for Mobile applications to initate Plaid Link in Update Mode

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaywayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

PaywayApi apiInstance = new PaywayApi();
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    Payway200ResponseModel result = apiInstance.createPlaidLinkTokenUpdateMode(authorization, contentType, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayApi#createPlaidLinkTokenUpdateMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**Payway200ResponseModel**](Payway200ResponseModel.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="depositTransaction"></a>
# **depositTransaction**
> Payway201ResponseModel depositTransaction(authorization, contentType, tpTradingAccountId)

This API creates a deposit transaction and returns the url for customer redirection and transaction reference number

his API creates a deposit transaction and returns the url for customer redirection and transaction reference number

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaywayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

PaywayApi apiInstance = new PaywayApi();
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    Payway201ResponseModel result = apiInstance.depositTransaction(authorization, contentType, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayApi#depositTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**Payway201ResponseModel**](Payway201ResponseModel.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="linkAccount"></a>
# **linkAccount**
> Payway201ResponseModel linkAccount(authorization, contentType, tpTradingAccountId)

This API will authenticate an account with Plaid, Get a Dwolla token from Plaid, Create Customer at Dwolla using the token obtained and attach the authenticated Account to the new created customer

This API will authenticate an account with Plaid, Get a Dwolla token from Plaid, Create Customer at Dwolla using the token obtained and attach the authenticated Account to the new created customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaywayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

PaywayApi apiInstance = new PaywayApi();
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    Payway201ResponseModel result = apiInstance.linkAccount(authorization, contentType, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayApi#linkAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**Payway201ResponseModel**](Payway201ResponseModel.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="manualLinkAccount"></a>
# **manualLinkAccount**
> Payway201ResponseModel manualLinkAccount(authorization, contentType, tpTradingAccountId)

The API to manually link an ACH account

The API to manually link an ACH account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaywayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

PaywayApi apiInstance = new PaywayApi();
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    Payway201ResponseModel result = apiInstance.manualLinkAccount(authorization, contentType, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayApi#manualLinkAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**Payway201ResponseModel**](Payway201ResponseModel.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentProvider"></a>
# **paymentProvider**
> Payway200ResponseModel paymentProvider(transactionRef, authorization, tpTradingAccountId)

This API will redirect the customer to payment provider

This API will redirect the customer to payment provider

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaywayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

PaywayApi apiInstance = new PaywayApi();
String transactionRef = "transactionRef_example"; // String | Transaction reference number
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    Payway200ResponseModel result = apiInstance.paymentProvider(transactionRef, authorization, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayApi#paymentProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRef** | **String**| Transaction reference number |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**Payway200ResponseModel**](Payway200ResponseModel.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAccessTokenOfPendingPlaid"></a>
# **retrieveAccessTokenOfPendingPlaid**
> Payway200ResponseModel retrieveAccessTokenOfPendingPlaid(itemUuid, authorization, tpTradingAccountId)

With this API you can get the Access token of a pending Plaid link process to initiate the validation of the amounts to authenticate an account

With this API you can get the Access token of a pending Plaid link process to initiate the validation of the amounts to authenticate an account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaywayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

PaywayApi apiInstance = new PaywayApi();
String itemUuid = "itemUuid_example"; // String | Item UUID
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    Payway200ResponseModel result = apiInstance.retrieveAccessTokenOfPendingPlaid(itemUuid, authorization, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayApi#retrieveAccessTokenOfPendingPlaid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemUuid** | **String**| Item UUID |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**Payway200ResponseModel**](Payway200ResponseModel.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAccessTokenOfPendingPlaidManual"></a>
# **retrieveAccessTokenOfPendingPlaidManual**
> Payway200ResponseModel retrieveAccessTokenOfPendingPlaidManual(itemUuid, authorization, tpTradingAccountId)

With this API you can get the Access token of a pending Plaid link process to initiate the validation of the amounts to authenticate an account (manual)

With this API you can get the Access token of a pending Plaid link process to initiate the validation of the amounts to authenticate an account (manual)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaywayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_authorizer
ApiKeyAuth webtrader_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_authorizer");
webtrader_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_authorizer.setApiKeyPrefix("Token");

PaywayApi apiInstance = new PaywayApi();
String itemUuid = "itemUuid_example"; // String | Item UUID
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
Long tpTradingAccountId = 789L; // Long | Mt5 trading account id
try {
    Payway200ResponseModel result = apiInstance.retrieveAccessTokenOfPendingPlaidManual(itemUuid, authorization, tpTradingAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayApi#retrieveAccessTokenOfPendingPlaidManual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemUuid** | **String**| Item UUID |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **tpTradingAccountId** | **Long**| Mt5 trading account id |

### Return type

[**Payway200ResponseModel**](Payway200ResponseModel.md)

### Authorization

[webtrader_authorizer](../README.md#webtrader_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

