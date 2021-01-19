# RegistrationApi

All URIs are relative to *https://9ulhjb8zqd.execute-api.us-east-1.amazonaws.com/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fieldValidate**](RegistrationApi.md#fieldValidate) | **POST** /registration/field/validation | Validate the field of the form based on the field validator value
[**registrationAccountBasicFormMobileGet**](RegistrationApi.md#registrationAccountBasicFormMobileGet) | **GET** /registration/account/basic/form/mobile | 
[**registrationAccountBasicFormPost**](RegistrationApi.md#registrationAccountBasicFormPost) | **POST** /registration/account/basic/form | 
[**registrationAccountBasicFormWebGet**](RegistrationApi.md#registrationAccountBasicFormWebGet) | **GET** /registration/account/basic/form/web | 
[**registrationAccountRealFormMobileGet**](RegistrationApi.md#registrationAccountRealFormMobileGet) | **GET** /registration/account/real/form/mobile | 
[**registrationAccountRealFormPost**](RegistrationApi.md#registrationAccountRealFormPost) | **POST** /registration/account/real/form | 
[**registrationAccountRealFormStatePut**](RegistrationApi.md#registrationAccountRealFormStatePut) | **PUT** /registration/account/real/form/state | 
[**registrationAccountRealFormWebGet**](RegistrationApi.md#registrationAccountRealFormWebGet) | **GET** /registration/account/real/form/web | 
[**registrationVerificationEmailPost**](RegistrationApi.md#registrationVerificationEmailPost) | **POST** /registration/verification/email | Used to verify the user&#x27;s email
[**submitAddressForm**](RegistrationApi.md#submitAddressForm) | **PUT** /user/account/address/form | Submit the address form

<a name="fieldValidate"></a>
# **fieldValidate**
> fieldValidate(acceptLanguage, contentType, xRequestId)

Validate the field of the form based on the field validator value

Validate asynchronously the field of the form

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationApi;


RegistrationApi apiInstance = new RegistrationApi();
String acceptLanguage = "acceptLanguage_example"; // String | Two letter language code to be used for translation
String contentType = "contentType_example"; // String | 
String xRequestId = "xRequestId_example"; // String | 
try {
    apiInstance.fieldValidate(acceptLanguage, contentType, xRequestId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#fieldValidate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Two letter language code to be used for translation |
 **contentType** | **String**|  |
 **xRequestId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="registrationAccountBasicFormMobileGet"></a>
# **registrationAccountBasicFormMobileGet**
> registrationAccountBasicFormMobileGet(userAgent, acceptLanguage, xRequestId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationApi;


RegistrationApi apiInstance = new RegistrationApi();
String userAgent = "userAgent_example"; // String | 
String acceptLanguage = "acceptLanguage_example"; // String | 
String xRequestId = "xRequestId_example"; // String | 
try {
    apiInstance.registrationAccountBasicFormMobileGet(userAgent, acceptLanguage, xRequestId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registrationAccountBasicFormMobileGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAgent** | **String**|  |
 **acceptLanguage** | **String**|  |
 **xRequestId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="registrationAccountBasicFormPost"></a>
# **registrationAccountBasicFormPost**
> registrationAccountBasicFormPost(acceptLanguage, userAgent, tpIpCountry, tpSimCountry, tpIpAddress, xRequestId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationApi;


RegistrationApi apiInstance = new RegistrationApi();
String acceptLanguage = "acceptLanguage_example"; // String | 
String userAgent = "userAgent_example"; // String | 
String tpIpCountry = "tpIpCountry_example"; // String | 
String tpSimCountry = "tpSimCountry_example"; // String | 
String tpIpAddress = "tpIpAddress_example"; // String | 
String xRequestId = "xRequestId_example"; // String | 
try {
    apiInstance.registrationAccountBasicFormPost(acceptLanguage, userAgent, tpIpCountry, tpSimCountry, tpIpAddress, xRequestId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registrationAccountBasicFormPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**|  |
 **userAgent** | **String**|  |
 **tpIpCountry** | **String**|  | [optional]
 **tpSimCountry** | **String**|  | [optional]
 **tpIpAddress** | **String**|  | [optional]
 **xRequestId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="registrationAccountBasicFormWebGet"></a>
# **registrationAccountBasicFormWebGet**
> registrationAccountBasicFormWebGet(userAgent, acceptLanguage, xRequestId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationApi;


RegistrationApi apiInstance = new RegistrationApi();
String userAgent = "userAgent_example"; // String | 
String acceptLanguage = "acceptLanguage_example"; // String | 
String xRequestId = "xRequestId_example"; // String | 
try {
    apiInstance.registrationAccountBasicFormWebGet(userAgent, acceptLanguage, xRequestId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registrationAccountBasicFormWebGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAgent** | **String**|  |
 **acceptLanguage** | **String**|  |
 **xRequestId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="registrationAccountRealFormMobileGet"></a>
# **registrationAccountRealFormMobileGet**
> registrationAccountRealFormMobileGet(userAgent, acceptLanguage, xRequestId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

RegistrationApi apiInstance = new RegistrationApi();
String userAgent = "userAgent_example"; // String | 
String acceptLanguage = "acceptLanguage_example"; // String | 
String xRequestId = "xRequestId_example"; // String | 
try {
    apiInstance.registrationAccountRealFormMobileGet(userAgent, acceptLanguage, xRequestId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registrationAccountRealFormMobileGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAgent** | **String**|  |
 **acceptLanguage** | **String**|  |
 **xRequestId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="registrationAccountRealFormPost"></a>
# **registrationAccountRealFormPost**
> registrationAccountRealFormPost(acceptLanguage, userAgent, tpIpCountry, tpSimCountry, tpIpAddress, xRequestId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

RegistrationApi apiInstance = new RegistrationApi();
String acceptLanguage = "acceptLanguage_example"; // String | 
String userAgent = "userAgent_example"; // String | 
String tpIpCountry = "tpIpCountry_example"; // String | 
String tpSimCountry = "tpSimCountry_example"; // String | 
String tpIpAddress = "tpIpAddress_example"; // String | 
String xRequestId = "xRequestId_example"; // String | 
try {
    apiInstance.registrationAccountRealFormPost(acceptLanguage, userAgent, tpIpCountry, tpSimCountry, tpIpAddress, xRequestId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registrationAccountRealFormPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**|  |
 **userAgent** | **String**|  |
 **tpIpCountry** | **String**|  | [optional]
 **tpSimCountry** | **String**|  | [optional]
 **tpIpAddress** | **String**|  | [optional]
 **xRequestId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="registrationAccountRealFormStatePut"></a>
# **registrationAccountRealFormStatePut**
> registrationAccountRealFormStatePut(userAgent, acceptLanguage, xRequestId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

RegistrationApi apiInstance = new RegistrationApi();
String userAgent = "userAgent_example"; // String | 
String acceptLanguage = "acceptLanguage_example"; // String | 
String xRequestId = "xRequestId_example"; // String | 
try {
    apiInstance.registrationAccountRealFormStatePut(userAgent, acceptLanguage, xRequestId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registrationAccountRealFormStatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAgent** | **String**|  |
 **acceptLanguage** | **String**|  |
 **xRequestId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="registrationAccountRealFormWebGet"></a>
# **registrationAccountRealFormWebGet**
> registrationAccountRealFormWebGet(userAgent, acceptLanguage, xRequestId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

RegistrationApi apiInstance = new RegistrationApi();
String userAgent = "userAgent_example"; // String | 
String acceptLanguage = "acceptLanguage_example"; // String | 
String xRequestId = "xRequestId_example"; // String | 
try {
    apiInstance.registrationAccountRealFormWebGet(userAgent, acceptLanguage, xRequestId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registrationAccountRealFormWebGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAgent** | **String**|  |
 **acceptLanguage** | **String**|  |
 **xRequestId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="registrationVerificationEmailPost"></a>
# **registrationVerificationEmailPost**
> registrationVerificationEmailPost(body, contentType)

Used to verify the user&#x27;s email

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationApi;


RegistrationApi apiInstance = new RegistrationApi();
EmailVerification body = new EmailVerification(); // EmailVerification | 
String contentType = "contentType_example"; // String | 
try {
    apiInstance.registrationVerificationEmailPost(body, contentType);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registrationVerificationEmailPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailVerification**](EmailVerification.md)|  |
 **contentType** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="submitAddressForm"></a>
# **submitAddressForm**
> submitAddressForm(acceptLanguage, authorization, contentType)

Submit the address form

Submit the form in order to update the account&#x27;s address

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: webtrader_cognito_authorizer
ApiKeyAuth webtrader_cognito_authorizer = (ApiKeyAuth) defaultClient.getAuthentication("webtrader_cognito_authorizer");
webtrader_cognito_authorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//webtrader_cognito_authorizer.setApiKeyPrefix("Token");

RegistrationApi apiInstance = new RegistrationApi();
String acceptLanguage = "acceptLanguage_example"; // String | 
String authorization = "authorization_example"; // String | Authorization header - the value of the id token from login response
String contentType = "contentType_example"; // String | The content type of the request body
try {
    apiInstance.submitAddressForm(acceptLanguage, authorization, contentType);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#submitAddressForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**|  |
 **authorization** | **String**| Authorization header - the value of the id token from login response |
 **contentType** | **String**| The content type of the request body |

### Return type

null (empty response body)

### Authorization

[webtrader_cognito_authorizer](../README.md#webtrader_cognito_authorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

