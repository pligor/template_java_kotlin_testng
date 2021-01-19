# TradingError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** | Short human readable description of the error |  [optional]
**details** | **String** | More detailed description of the error |  [optional]
**service** | **String** | Service that originally generated this error that meant to be sent to the client |  [optional]
**type** | [**TradingErrorType**](TradingErrorType.md) |  |  [optional]
**time** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the formatted error |  [optional]
**reason** | [**TradingErrorReason**](TradingErrorReason.md) |  |  [optional]
