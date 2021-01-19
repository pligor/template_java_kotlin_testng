# LoginResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mfaType** | [**MultiFactorAuthenticationType**](MultiFactorAuthenticationType.md) |  |  [optional]
**mfaDeliveryDestination** | **String** | Destination where verification code has been sent |  [optional]
**codeExpirationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The verification code expiration in UTC date time |  [optional]
**idToken** | **String** | The ID token that should be used as Authorization header |  [optional]
**idTokenExpirationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The id token expiration in UTC date time |  [optional]
**refreshTokenExpirationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The refresh token expiration in UTC date time |  [optional]
**mfaSession** | **String** | Session of current MFA process |  [optional]
**mfaRequired** | **Boolean** | Is MFA required for the current user |  [optional]
**accessToken** | **String** | The access token. Might be needed in cases of updating user settings, for instance setting up MFA via application. |  [optional]
**userId** | **String** | ID of the user, it is needed only for MFA flow |  [optional]
**accessTokenExpirationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The access token expiration in UTC date time |  [optional]
**refreshToken** | **String** | The refresh token |  [optional]
