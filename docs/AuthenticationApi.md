# AuthenticationApi

All URIs are relative to *https://9ulhjb8zqd.execute-api.us-east-1.amazonaws.com/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](AuthenticationApi.md#login) | **POST** /authentication/login | 
[**logout**](AuthenticationApi.md#logout) | **POST** /authentication/logout | 
[**multiFactorVerification**](AuthenticationApi.md#multiFactorVerification) | **POST** /authentication/multi-factor-code/verify | 
[**refreshTokens**](AuthenticationApi.md#refreshTokens) | **POST** /authentication/tokens/refresh | 

<a name="login"></a>
# **login**
> StandardResponseLoginResponse login(body, contentType)



User receives authentication tokens after logging in

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
LoginRequest body = new LoginRequest(); // LoginRequest | 
String contentType = "contentType_example"; // String | The content type of the request body
try {
    StandardResponseLoginResponse result = apiInstance.login(body, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginRequest**](LoginRequest.md)|  |
 **contentType** | **String**| The content type of the request body |

### Return type

[**StandardResponseLoginResponse**](StandardResponseLoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> logout(authorization, contentType)



User&#x27;s all refresh tokens are invalidated after log out. The ID Token is still valid until expiration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
try {
    apiInstance.logout(authorization, contentType);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#logout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |

### Return type

null (empty response body)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="multiFactorVerification"></a>
# **multiFactorVerification**
> StandardResponseTokensResponse multiFactorVerification(body, contentType)



Verification of MFA code

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
MultiFactorAuthenticationCodeRequest body = new MultiFactorAuthenticationCodeRequest(); // MultiFactorAuthenticationCodeRequest | 
String contentType = "contentType_example"; // String | The content type of the request body
try {
    StandardResponseTokensResponse result = apiInstance.multiFactorVerification(body, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#multiFactorVerification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MultiFactorAuthenticationCodeRequest**](MultiFactorAuthenticationCodeRequest.md)|  |
 **contentType** | **String**| The content type of the request body |

### Return type

[**StandardResponseTokensResponse**](StandardResponseTokensResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refreshTokens"></a>
# **refreshTokens**
> StandardResponseTokensResponse refreshTokens(body, contentType)



Refreshing the access token and ID token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
RefreshTokenRequest body = new RefreshTokenRequest(); // RefreshTokenRequest | 
String contentType = "contentType_example"; // String | The content type of the request body
try {
    StandardResponseTokensResponse result = apiInstance.refreshTokens(body, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#refreshTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RefreshTokenRequest**](RefreshTokenRequest.md)|  |
 **contentType** | **String**| The content type of the request body |

### Return type

[**StandardResponseTokensResponse**](StandardResponseTokensResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

