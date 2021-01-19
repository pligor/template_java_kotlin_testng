# UserApi

All URIs are relative to *https://9ulhjb8zqd.execute-api.us-east-1.amazonaws.com/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAddressForm**](UserApi.md#fetchAddressForm) | **GET** /user/account/address/form/mobile | Fetch the address form for mobile client
[**fetchMobileNumberForm**](UserApi.md#fetchMobileNumberForm) | **GET** /user/account/mobile_number/form/mobile | Fetch the mobile number form for mobile client
[**fetchPasswordForm**](UserApi.md#fetchPasswordForm) | **GET** /user/account/password/form/mobile | Fetch the password form for mobile client
[**getAccountStatus**](UserApi.md#getAccountStatus) | **GET** /user/account/status | 
[**getAuthenticationInformation**](UserApi.md#getAuthenticationInformation) | **GET** /user/multi-factor-authentication | 
[**submitEmailForm**](UserApi.md#submitEmailForm) | **PUT** /user/account/email/form | Submits the email form
[**submitMobileNumberForm**](UserApi.md#submitMobileNumberForm) | **PUT** /user/account/mobile_number/form | Submits the mobile number form
[**submitPasswordForm**](UserApi.md#submitPasswordForm) | **PUT** /user/account/password/form | Submits the password form
[**updateAuthentication**](UserApi.md#updateAuthentication) | **PATCH** /user/multi-factor-authentication | 
[**verifyAuthenticationApplication**](UserApi.md#verifyAuthenticationApplication) | **POST** /user/multi-factor-authentication/application/verify | 

<a name="fetchAddressForm"></a>
# **fetchAddressForm**
> fetchAddressForm(acceptLanguage, authorization)

Fetch the address form for mobile client

Fetch the form that describes account&#x27;s address for mobile client

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String acceptLanguage = "acceptLanguage_example"; // String | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
try {
    apiInstance.fetchAddressForm(acceptLanguage, authorization);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#fetchAddressForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |

### Return type

null (empty response body)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fetchMobileNumberForm"></a>
# **fetchMobileNumberForm**
> fetchMobileNumberForm(acceptLanguage, authorization)

Fetch the mobile number form for mobile client

Fetch the form that describes account mobile number for mobile client

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String acceptLanguage = "acceptLanguage_example"; // String | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
try {
    apiInstance.fetchMobileNumberForm(acceptLanguage, authorization);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#fetchMobileNumberForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |

### Return type

null (empty response body)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fetchPasswordForm"></a>
# **fetchPasswordForm**
> fetchPasswordForm(acceptLanguage, authorization)

Fetch the password form for mobile client

Fetch the form that describes account password for mobile client

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String acceptLanguage = "acceptLanguage_example"; // String | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
try {
    apiInstance.fetchPasswordForm(acceptLanguage, authorization);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#fetchPasswordForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |

### Return type

null (empty response body)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAccountStatus"></a>
# **getAccountStatus**
> StandardResponseJThalesAccountStatus getAccountStatus(authorization)



Get basic lead or brand account email verification status and their trading account statuses

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
try {
    StandardResponseJThalesAccountStatus result = apiInstance.getAccountStatus(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAccountStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization header - the value of the id token from login response |

### Return type

[**StandardResponseJThalesAccountStatus**](StandardResponseJThalesAccountStatus.md)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAuthenticationInformation"></a>
# **getAuthenticationInformation**
> StandardResponseMultiFactorAuthenticationResponse getAuthenticationInformation(authorization)



Retrieving multi factor authentication settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
try {
    StandardResponseMultiFactorAuthenticationResponse result = apiInstance.getAuthenticationInformation(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAuthenticationInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization header - the value of the id token from login response |

### Return type

[**StandardResponseMultiFactorAuthenticationResponse**](StandardResponseMultiFactorAuthenticationResponse.md)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitEmailForm"></a>
# **submitEmailForm**
> submitEmailForm(body, acceptLanguage, authorization, contentType)

Submits the email form

Submit the form in order to update the account&#x27;s email

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
EmailForm body = new EmailForm(); // EmailForm | Email form request body
String acceptLanguage = "acceptLanguage_example"; // String | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
try {
    apiInstance.submitEmailForm(body, acceptLanguage, authorization, contentType);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#submitEmailForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailForm**](EmailForm.md)| Email form request body |
 **acceptLanguage** | **String**|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |

### Return type

null (empty response body)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="submitMobileNumberForm"></a>
# **submitMobileNumberForm**
> submitMobileNumberForm(body, acceptLanguage, authorization, contentType)

Submits the mobile number form

Submit the form in order to update the account&#x27;s mobile number

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
MobileNumberForm body = new MobileNumberForm(); // MobileNumberForm | Mobile number form request body
String acceptLanguage = "acceptLanguage_example"; // String | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
try {
    apiInstance.submitMobileNumberForm(body, acceptLanguage, authorization, contentType);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#submitMobileNumberForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MobileNumberForm**](MobileNumberForm.md)| Mobile number form request body |
 **acceptLanguage** | **String**|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |

### Return type

null (empty response body)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="submitPasswordForm"></a>
# **submitPasswordForm**
> submitPasswordForm(body, acceptLanguage, authorization, contentType, tpAccessToken)

Submits the password form

Submit the form in order to update the account&#x27;s password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
PasswordForm body = new PasswordForm(); // PasswordForm | Password form request body
String acceptLanguage = "acceptLanguage_example"; // String | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
String tpAccessToken = "tpAccessToken_example"; // String | Access token header - the value of the access token from login response
try {
    apiInstance.submitPasswordForm(body, acceptLanguage, authorization, contentType, tpAccessToken);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#submitPasswordForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PasswordForm**](PasswordForm.md)| Password form request body |
 **acceptLanguage** | **String**|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |
 **tpAccessToken** | **String**| Access token header - the value of the access token from login response |

### Return type

null (empty response body)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateAuthentication"></a>
# **updateAuthentication**
> StandardResponseMultiFactorAuthenticationUpdateResponse updateAuthentication(body, authorization, contentType)



Update multi factor authentication setting for a user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
MultiFactorAuthenticationUpdateRequest body = new MultiFactorAuthenticationUpdateRequest(); // MultiFactorAuthenticationUpdateRequest | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
try {
    StandardResponseMultiFactorAuthenticationUpdateResponse result = apiInstance.updateAuthentication(body, authorization, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateAuthentication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MultiFactorAuthenticationUpdateRequest**](MultiFactorAuthenticationUpdateRequest.md)|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |

### Return type

[**StandardResponseMultiFactorAuthenticationUpdateResponse**](StandardResponseMultiFactorAuthenticationUpdateResponse.md)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyAuthenticationApplication"></a>
# **verifyAuthenticationApplication**
> StandardResponseMultiFactorAuthenticationResponse verifyAuthenticationApplication(body, authorization, contentType)



Verify MFA application while setting up MFA for the user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
MultiFactorAuthenticationApplicationVerifyRequest body = new MultiFactorAuthenticationApplicationVerifyRequest(); // MultiFactorAuthenticationApplicationVerifyRequest | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
try {
    StandardResponseMultiFactorAuthenticationResponse result = apiInstance.verifyAuthenticationApplication(body, authorization, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#verifyAuthenticationApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MultiFactorAuthenticationApplicationVerifyRequest**](MultiFactorAuthenticationApplicationVerifyRequest.md)|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |

### Return type

[**StandardResponseMultiFactorAuthenticationResponse**](StandardResponseMultiFactorAuthenticationResponse.md)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

