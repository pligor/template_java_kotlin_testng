# AuthenticationCorsApi

All URIs are relative to *https://9ulhjb8zqd.execute-api.us-east-1.amazonaws.com/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticationLoginOptions**](AuthenticationCorsApi.md#authenticationLoginOptions) | **OPTIONS** /authentication/login | 
[**authenticationLogoutOptions**](AuthenticationCorsApi.md#authenticationLogoutOptions) | **OPTIONS** /authentication/logout | 
[**authenticationMultiFactorCodeVerifyOptions**](AuthenticationCorsApi.md#authenticationMultiFactorCodeVerifyOptions) | **OPTIONS** /authentication/multi-factor-code/verify | 
[**authenticationTokensRefreshOptions**](AuthenticationCorsApi.md#authenticationTokensRefreshOptions) | **OPTIONS** /authentication/tokens/refresh | 

<a name="authenticationLoginOptions"></a>
# **authenticationLoginOptions**
> Empty authenticationLoginOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationCorsApi;


AuthenticationCorsApi apiInstance = new AuthenticationCorsApi();
try {
    Empty result = apiInstance.authenticationLoginOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationCorsApi#authenticationLoginOptions");
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

<a name="authenticationLogoutOptions"></a>
# **authenticationLogoutOptions**
> Empty authenticationLogoutOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationCorsApi;


AuthenticationCorsApi apiInstance = new AuthenticationCorsApi();
try {
    Empty result = apiInstance.authenticationLogoutOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationCorsApi#authenticationLogoutOptions");
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

<a name="authenticationMultiFactorCodeVerifyOptions"></a>
# **authenticationMultiFactorCodeVerifyOptions**
> Empty authenticationMultiFactorCodeVerifyOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationCorsApi;


AuthenticationCorsApi apiInstance = new AuthenticationCorsApi();
try {
    Empty result = apiInstance.authenticationMultiFactorCodeVerifyOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationCorsApi#authenticationMultiFactorCodeVerifyOptions");
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

<a name="authenticationTokensRefreshOptions"></a>
# **authenticationTokensRefreshOptions**
> Empty authenticationTokensRefreshOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationCorsApi;


AuthenticationCorsApi apiInstance = new AuthenticationCorsApi();
try {
    Empty result = apiInstance.authenticationTokensRefreshOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationCorsApi#authenticationTokensRefreshOptions");
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

