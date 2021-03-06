/*
 * Molecule API Documentation
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.molecule.api;

import com.hydrogen.molecule.ApiCallback;
import com.hydrogen.molecule.ApiClient;
import com.hydrogen.molecule.ApiException;
import com.hydrogen.molecule.ApiResponse;
import com.hydrogen.molecule.Configuration;
import com.hydrogen.molecule.Pair;
import com.hydrogen.molecule.ProgressRequestBody;
import com.hydrogen.molecule.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.hydrogen.molecule.model.PageTokenTransferResponse;
import com.hydrogen.molecule.model.TokenTransferParams;
import com.hydrogen.molecule.model.TokenTransferResponse;
import com.hydrogen.molecule.model.TransactionSuccessResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenTransferApi {
    private ApiClient apiClient;

    public TokenTransferApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokenTransferApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createTokenTransferUsingPost
     * @param tokenTransferParams It enables a user to transfer Tokens (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createTokenTransferUsingPostCall(TokenTransferParams tokenTransferParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tokenTransferParams;

        // create path and map variables
        String localVarPath = "/token_transfer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createTokenTransferUsingPostValidateBeforeCall(TokenTransferParams tokenTransferParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'tokenTransferParams' is set
        if (tokenTransferParams == null) {
            throw new ApiException("Missing the required parameter 'tokenTransferParams' when calling createTokenTransferUsingPost(Async)");
        }
        

        com.squareup.okhttp.Call call = createTokenTransferUsingPostCall(tokenTransferParams, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates Token Transfer record
     * 
     * @param tokenTransferParams It enables a user to transfer Tokens (required)
     * @return TransactionSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransactionSuccessResponse createTokenTransferUsingPost(TokenTransferParams tokenTransferParams) throws ApiException {
        ApiResponse<TransactionSuccessResponse> resp = createTokenTransferUsingPostWithHttpInfo(tokenTransferParams);
        return resp.getData();
    }

    /**
     * Creates Token Transfer record
     * 
     * @param tokenTransferParams It enables a user to transfer Tokens (required)
     * @return ApiResponse&lt;TransactionSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransactionSuccessResponse> createTokenTransferUsingPostWithHttpInfo(TokenTransferParams tokenTransferParams) throws ApiException {
        com.squareup.okhttp.Call call = createTokenTransferUsingPostValidateBeforeCall(tokenTransferParams, null, null);
        Type localVarReturnType = new TypeToken<TransactionSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates Token Transfer record (asynchronously)
     * 
     * @param tokenTransferParams It enables a user to transfer Tokens (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createTokenTransferUsingPostAsync(TokenTransferParams tokenTransferParams, final ApiCallback<TransactionSuccessResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createTokenTransferUsingPostValidateBeforeCall(tokenTransferParams, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTokenTransferAllUsingGet
     * @param walletId To filter response Token Transfer list by Wallet ID (optional)
     * @param page To filter response Token Transfer list by page number (optional)
     * @param size Number of records per page (optional)
     * @param orderBy Field to sort record list (optional)
     * @param ascending Sorting order (optional)
     * @param getLatest To fetch latest (one) record (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTokenTransferAllUsingGetCall(UUID walletId, Integer page, Integer size, String orderBy, Boolean ascending, Boolean getLatest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/token_transfer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (walletId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("wallet_id", walletId));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_by", orderBy));
        if (ascending != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ascending", ascending));
        if (getLatest != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("get_latest", getLatest));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTokenTransferAllUsingGetValidateBeforeCall(UUID walletId, Integer page, Integer size, String orderBy, Boolean ascending, Boolean getLatest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getTokenTransferAllUsingGetCall(walletId, page, size, orderBy, ascending, getLatest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch Token Transfer record list
     * 
     * @param walletId To filter response Token Transfer list by Wallet ID (optional)
     * @param page To filter response Token Transfer list by page number (optional)
     * @param size Number of records per page (optional)
     * @param orderBy Field to sort record list (optional)
     * @param ascending Sorting order (optional)
     * @param getLatest To fetch latest (one) record (optional)
     * @return PageTokenTransferResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageTokenTransferResponse getTokenTransferAllUsingGet(UUID walletId, Integer page, Integer size, String orderBy, Boolean ascending, Boolean getLatest) throws ApiException {
        ApiResponse<PageTokenTransferResponse> resp = getTokenTransferAllUsingGetWithHttpInfo(walletId, page, size, orderBy, ascending, getLatest);
        return resp.getData();
    }

    /**
     * Fetch Token Transfer record list
     * 
     * @param walletId To filter response Token Transfer list by Wallet ID (optional)
     * @param page To filter response Token Transfer list by page number (optional)
     * @param size Number of records per page (optional)
     * @param orderBy Field to sort record list (optional)
     * @param ascending Sorting order (optional)
     * @param getLatest To fetch latest (one) record (optional)
     * @return ApiResponse&lt;PageTokenTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageTokenTransferResponse> getTokenTransferAllUsingGetWithHttpInfo(UUID walletId, Integer page, Integer size, String orderBy, Boolean ascending, Boolean getLatest) throws ApiException {
        com.squareup.okhttp.Call call = getTokenTransferAllUsingGetValidateBeforeCall(walletId, page, size, orderBy, ascending, getLatest, null, null);
        Type localVarReturnType = new TypeToken<PageTokenTransferResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch Token Transfer record list (asynchronously)
     * 
     * @param walletId To filter response Token Transfer list by Wallet ID (optional)
     * @param page To filter response Token Transfer list by page number (optional)
     * @param size Number of records per page (optional)
     * @param orderBy Field to sort record list (optional)
     * @param ascending Sorting order (optional)
     * @param getLatest To fetch latest (one) record (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTokenTransferAllUsingGetAsync(UUID walletId, Integer page, Integer size, String orderBy, Boolean ascending, Boolean getLatest, final ApiCallback<PageTokenTransferResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTokenTransferAllUsingGetValidateBeforeCall(walletId, page, size, orderBy, ascending, getLatest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageTokenTransferResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTokenTransferUsingGet
     * @param tokenTransferId Token Transfer ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTokenTransferUsingGetCall(UUID tokenTransferId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/token_transfer/{token_transfer_id}"
            .replaceAll("\\{" + "token_transfer_id" + "\\}", apiClient.escapeString(tokenTransferId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTokenTransferUsingGetValidateBeforeCall(UUID tokenTransferId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'tokenTransferId' is set
        if (tokenTransferId == null) {
            throw new ApiException("Missing the required parameter 'tokenTransferId' when calling getTokenTransferUsingGet(Async)");
        }
        

        com.squareup.okhttp.Call call = getTokenTransferUsingGetCall(tokenTransferId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch Token Transfer record details
     * 
     * @param tokenTransferId Token Transfer ID (required)
     * @return TokenTransferResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TokenTransferResponse getTokenTransferUsingGet(UUID tokenTransferId) throws ApiException {
        ApiResponse<TokenTransferResponse> resp = getTokenTransferUsingGetWithHttpInfo(tokenTransferId);
        return resp.getData();
    }

    /**
     * Fetch Token Transfer record details
     * 
     * @param tokenTransferId Token Transfer ID (required)
     * @return ApiResponse&lt;TokenTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TokenTransferResponse> getTokenTransferUsingGetWithHttpInfo(UUID tokenTransferId) throws ApiException {
        com.squareup.okhttp.Call call = getTokenTransferUsingGetValidateBeforeCall(tokenTransferId, null, null);
        Type localVarReturnType = new TypeToken<TokenTransferResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch Token Transfer record details (asynchronously)
     * 
     * @param tokenTransferId Token Transfer ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTokenTransferUsingGetAsync(UUID tokenTransferId, final ApiCallback<TokenTransferResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTokenTransferUsingGetValidateBeforeCall(tokenTransferId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TokenTransferResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
