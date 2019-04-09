# atom_api.ModelPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the model usually used to indicate what is included in the model | 
**category** | **String** | Category that the model falls under such as “Tech” | [optional] 
**description** | **String** | Description of what types of investments are represented in the model | [optional] 
**clientId** | **String** | If the model is to be used by a specific client such as an advisor, the ID of the client | [optional] 
**nodeMap** | **[String]** |  | [optional] 
**isActive** | **Boolean** | Indicates for whether or not the model is active. Defaults to true which indicates that it is currently active | [optional] [default to true]
**metadata** | **Object** | Custom information associated with the model in the format key:value. | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

