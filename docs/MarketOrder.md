# MarketOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**volume** | **Long** | Requested volume | 
**symbol** | **String** | Name of symbol to place the order for | 
**stopLoss** | **Double** | Stop Loss target of the order |  [optional]
**takeProfit** | **Double** | Take Profit target of the order |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Direction of order i.e. buy or sell | 

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;
