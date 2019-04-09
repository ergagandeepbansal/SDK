# AggregationAccountPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** | The ID of a client to which the aggregation account belongs | 
**account_name** | **str** | The name of the held-away account for this aggregation account record | 
**institution_name** | **str** | The name of the institution holding the held-away account for this aggregation account record | 
**category** | **str** | Category for the held-away account such as “Bank Account” | [optional] 
**subcategory** | **str** | Subcategory for the held-away account such as “Checking Account” | [optional] 
**account_number** | **str** | The account number of the held-away account for this aggregation account record | [optional] 
**mask** | **str** | The masked version of the account number of the held-away account for this aggregation account record | [optional] 
**currency_code** | **str** | Alphabetic currency code for the base currency of the account linked, limited to 3 characters | [optional] 
**is_active** | **bool** | Indicates if the aggregation account record is active. Defaults to true which indicates it is active | [optional] [default to True]
**metadata** | **object** | Custom information associated with the aggregation account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

