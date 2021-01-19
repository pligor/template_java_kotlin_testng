# PendingOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Name of symbol to place the order for | 
**direction** | [**DirectionEnum**](#DirectionEnum) | Direction of order i.e. buy or sell | 
**volume** | **Long** | Requested volume | 
**type** | [**TypeEnum**](#TypeEnum) | Type of the pending order i.e. limit or stop | 
**price** | **Double** | Stop price or limit price depends on type that activates the order | 
**stopLoss** | **Double** | Stop Loss target of the order |  [optional]
**takeProfit** | **Double** | Take Profit target of the order |  [optional]
**orderExpiration** | [**OffsetDateTime**](OffsetDateTime.md) | Expiration time of the order [optional/default&#x3D;GTC] |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LIMIT | &quot;LIMIT&quot;
STOP | &quot;STOP&quot;
