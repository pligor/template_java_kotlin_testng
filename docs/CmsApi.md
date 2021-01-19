# CmsApi

All URIs are relative to *https://9ulhjb8zqd.execute-api.us-east-1.amazonaws.com/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cmsgraphql**](CmsApi.md#cmsgraphql) | **POST** /cms/graphql | CMS endpoint for graphql

<a name="cmsgraphql"></a>
# **cmsgraphql**
> cmsgraphql(contentType)

CMS endpoint for graphql

CMS endpoint for graphql

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CmsApi;


CmsApi apiInstance = new CmsApi();
String contentType = "contentType_example"; // String | The content type of the request body
try {
    apiInstance.cmsgraphql(contentType);
} catch (ApiException e) {
    System.err.println("Exception when calling CmsApi#cmsgraphql");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**| The content type of the request body |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

