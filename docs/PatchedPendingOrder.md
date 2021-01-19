# PatchedPendingOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of the pending order i.e. limit or stop |  [optional]
**price** | **Double** | Stop price or limit price depends on type that activates the order |  [optional]
**stopLoss** | **Double** | Stop Loss target of the order |  [optional]
**takeProfit** | **Double** | Take Profit target of the order |  [optional]
**orderExpiration** | [**OffsetDateTime**](OffsetDateTime.md) | Expiration time of the order [optional/default&#x3D;GTC] |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LIMIT | &quot;LIMIT&quot;
STOP | &quot;STOP&quot;
