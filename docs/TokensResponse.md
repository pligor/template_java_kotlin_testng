# TokensResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idToken** | **String** | The ID token that should be used as Authorization header |  [optional]
**idTokenExpirationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The id token expiration in UTC date time |  [optional]
**refreshTokenExpirationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The refresh token expiration in UTC date time |  [optional]
**accessToken** | **String** | The access token. Might be needed in cases of updating user settings, for instance setting up MFA via application. |  [optional]
**accessTokenExpirationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The access token expiration in UTC date time |  [optional]
**refreshToken** | **String** | The refresh token |  [optional]
