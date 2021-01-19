# CmscorsApi

All URIs are relative to *https://9ulhjb8zqd.execute-api.us-east-1.amazonaws.com/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cmsGraphqlOptions**](CmscorsApi.md#cmsGraphqlOptions) | **OPTIONS** /cms/graphql | 

<a name="cmsGraphqlOptions"></a>
# **cmsGraphqlOptions**
> Empty cmsGraphqlOptions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CmscorsApi;


CmscorsApi apiInstance = new CmscorsApi();
try {
    Empty result = apiInstance.cmsGraphqlOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CmscorsApi#cmsGraphqlOptions");
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

