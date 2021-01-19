# PaywayCorsApi

All URIs are relative to *https://9ulhjb8zqd.execute-api.us-east-1.amazonaws.com/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paywayAccountLinkedAccountItemUuidOptions**](PaywayCorsApi.md#paywayAccountLinkedAccountItemUuidOptions) | **OPTIONS** /payway/account/linked-account/{itemUuid} | 
[**paywayAccountManualLinkedAccountItemUuidOptions**](PaywayCorsApi.md#paywayAccountManualLinkedAccountItemUuidOptions) | **OPTIONS** /payway/account/manual-linked-account/{itemUuid} | 
[**paywayCustomerAchAccountOptions**](PaywayCorsApi.md#paywayCustomerAchAccountOptions) | **OPTIONS** /payway/customer/ach/account | 
[**paywayDepositsOptions**](PaywayCorsApi.md#paywayDepositsOptions) | **OPTIONS** /payway/deposits | 
[**paywayFundingLinkAccountOptions**](PaywayCorsApi.md#paywayFundingLinkAccountOptions) | **OPTIONS** /payway/funding/link-account | 
[**paywayFundingManualLinkAccountOptions**](PaywayCorsApi.md#paywayFundingManualLinkAccountOptions) | **OPTIONS** /payway/funding/manual-link-account | 
[**paywayLinkTokenOptions**](PaywayCorsApi.md#paywayLinkTokenOptions) | **OPTIONS** /payway/link/token | 
[**paywayLinkUpdateModeTokenOptions**](PaywayCorsApi.md#paywayLinkUpdateModeTokenOptions) | **OPTIONS** /payway/link/update_mode/token | 
[**paywayPublicDepositsRedirectRequestTransactionRefOptions**](PaywayCorsApi.md#paywayPublicDepositsRedirectRequestTransactionRefOptions) | **OPTIONS** /payway/public/deposits/redirect_request/{transactionRef} | 

<a name="paywayAccountLinkedAccountItemUuidOptions"></a>
# **paywayAccountLinkedAccountItemUuidOptions**
> Empty paywayAccountLinkedAccountItemUuidOptions(itemUuid)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaywayCorsApi;


PaywayCorsApi apiInstance = new PaywayCorsApi();
String itemUuid = "itemUuid_example"; // String | Item UUID
try {
    Empty result = apiInstance.paywayAccountLinkedAccountItemUuidOptions(itemUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayCorsApi#paywayAccountLinkedAccountItemUuidOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemUuid** | **String**| Item UUID |

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paywayAccountManualLinkedAccountItemUuidOptions"></a>
# **paywayAccountManualLinkedAccountItemUuidOptions**
> Empty paywayAccountManualLinkedAccountItemUuidOptions(itemUuid)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaywayCorsApi;


PaywayCorsApi apiInstance = new PaywayCorsApi();
String itemUuid = "itemUuid_example"; // String | Item UUID
try {
    Empty result = apiInstance.paywayAccountManualLinkedAccountItemUuidOptions(itemUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayCorsApi#paywayAccountManualLinkedAccountItemUuidOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemUuid** | **String**| Item UUID |

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paywayCustomerAchAccountOptions"></a>
# **paywayCustomerAchAccountOptions**
> Empty paywayCustomerAchAccountOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaywayCorsApi;


PaywayCorsApi apiInstance = new PaywayCorsApi();
try {
    Empty result = apiInstance.paywayCustomerAchAccountOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayCorsApi#paywayCustomerAchAccountOptions");
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

<a name="paywayDepositsOptions"></a>
# **paywayDepositsOptions**
> Empty paywayDepositsOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaywayCorsApi;


PaywayCorsApi apiInstance = new PaywayCorsApi();
try {
    Empty result = apiInstance.paywayDepositsOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayCorsApi#paywayDepositsOptions");
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

<a name="paywayFundingLinkAccountOptions"></a>
# **paywayFundingLinkAccountOptions**
> Empty paywayFundingLinkAccountOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaywayCorsApi;


PaywayCorsApi apiInstance = new PaywayCorsApi();
try {
    Empty result = apiInstance.paywayFundingLinkAccountOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayCorsApi#paywayFundingLinkAccountOptions");
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

<a name="paywayFundingManualLinkAccountOptions"></a>
# **paywayFundingManualLinkAccountOptions**
> Empty paywayFundingManualLinkAccountOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaywayCorsApi;


PaywayCorsApi apiInstance = new PaywayCorsApi();
try {
    Empty result = apiInstance.paywayFundingManualLinkAccountOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayCorsApi#paywayFundingManualLinkAccountOptions");
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

<a name="paywayLinkTokenOptions"></a>
# **paywayLinkTokenOptions**
> Empty paywayLinkTokenOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaywayCorsApi;


PaywayCorsApi apiInstance = new PaywayCorsApi();
try {
    Empty result = apiInstance.paywayLinkTokenOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayCorsApi#paywayLinkTokenOptions");
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

<a name="paywayLinkUpdateModeTokenOptions"></a>
# **paywayLinkUpdateModeTokenOptions**
> Empty paywayLinkUpdateModeTokenOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaywayCorsApi;


PaywayCorsApi apiInstance = new PaywayCorsApi();
try {
    Empty result = apiInstance.paywayLinkUpdateModeTokenOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayCorsApi#paywayLinkUpdateModeTokenOptions");
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

<a name="paywayPublicDepositsRedirectRequestTransactionRefOptions"></a>
# **paywayPublicDepositsRedirectRequestTransactionRefOptions**
> Empty paywayPublicDepositsRedirectRequestTransactionRefOptions(transactionRef)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaywayCorsApi;


PaywayCorsApi apiInstance = new PaywayCorsApi();
String transactionRef = "transactionRef_example"; // String | Transaction reference number
try {
    Empty result = apiInstance.paywayPublicDepositsRedirectRequestTransactionRefOptions(transactionRef);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaywayCorsApi#paywayPublicDepositsRedirectRequestTransactionRefOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRef** | **String**| Transaction reference number |

### Return type

[**Empty**](Empty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

