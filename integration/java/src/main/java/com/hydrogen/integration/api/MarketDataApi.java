/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.api;

import com.hydrogen.integration.ApiCallback;
import com.hydrogen.integration.ApiClient;
import com.hydrogen.integration.ApiException;
import com.hydrogen.integration.ApiResponse;
import com.hydrogen.integration.Configuration;
import com.hydrogen.integration.Pair;
import com.hydrogen.integration.ProgressRequestBody;
import com.hydrogen.integration.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.hydrogen.integration.model.MdHistoryRequestCO;
import com.hydrogen.integration.model.MdHistoryResponseVO;
import com.hydrogen.integration.model.MdQuoteResponseVO;
import com.hydrogen.integration.model.MdQuoteRequestCO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketDataApi {
    private ApiClient apiClient;

    public MarketDataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MarketDataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createMarketDataHistoricalUsingPost
     * @param historyRequest historyRequest (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createMarketDataHistoricalUsingPostCall(MdHistoryRequestCO historyRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = historyRequest;

        // create path and map variables
        String localVarPath = "/market_data/historical";

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
            "application/json"
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
    private com.squareup.okhttp.Call createMarketDataHistoricalUsingPostValidateBeforeCall(MdHistoryRequestCO historyRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'historyRequest' is set
        if (historyRequest == null) {
            throw new ApiException("Missing the required parameter 'historyRequest' when calling createMarketDataHistoricalUsingPost(Async)");
        }
        

        com.squareup.okhttp.Call call = createMarketDataHistoricalUsingPostCall(historyRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create historical market data
     * 
     * @param historyRequest historyRequest (required)
     * @return MdHistoryResponseVO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MdHistoryResponseVO createMarketDataHistoricalUsingPost(MdHistoryRequestCO historyRequest) throws ApiException {
        ApiResponse<MdHistoryResponseVO> resp = createMarketDataHistoricalUsingPostWithHttpInfo(historyRequest);
        return resp.getData();
    }

    /**
     * Create historical market data
     * 
     * @param historyRequest historyRequest (required)
     * @return ApiResponse&lt;MdHistoryResponseVO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MdHistoryResponseVO> createMarketDataHistoricalUsingPostWithHttpInfo(MdHistoryRequestCO historyRequest) throws ApiException {
        com.squareup.okhttp.Call call = createMarketDataHistoricalUsingPostValidateBeforeCall(historyRequest, null, null);
        Type localVarReturnType = new TypeToken<MdHistoryResponseVO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create historical market data (asynchronously)
     * 
     * @param historyRequest historyRequest (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createMarketDataHistoricalUsingPostAsync(MdHistoryRequestCO historyRequest, final ApiCallback<MdHistoryResponseVO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createMarketDataHistoricalUsingPostValidateBeforeCall(historyRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MdHistoryResponseVO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createMarketDataQuoteUsingPost
     * @param quoteRequest quoteRequest (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createMarketDataQuoteUsingPostCall(MdQuoteRequestCO quoteRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = quoteRequest;

        // create path and map variables
        String localVarPath = "/market_data/quote";

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
            "application/json"
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
    private com.squareup.okhttp.Call createMarketDataQuoteUsingPostValidateBeforeCall(MdQuoteRequestCO quoteRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'quoteRequest' is set
        if (quoteRequest == null) {
            throw new ApiException("Missing the required parameter 'quoteRequest' when calling createMarketDataQuoteUsingPost(Async)");
        }
        

        com.squareup.okhttp.Call call = createMarketDataQuoteUsingPostCall(quoteRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create quote market data
     * 
     * @param quoteRequest quoteRequest (required)
     * @return MdQuoteResponseVO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MdQuoteResponseVO createMarketDataQuoteUsingPost(MdQuoteRequestCO quoteRequest) throws ApiException {
        ApiResponse<MdQuoteResponseVO> resp = createMarketDataQuoteUsingPostWithHttpInfo(quoteRequest);
        return resp.getData();
    }

    /**
     * Create quote market data
     * 
     * @param quoteRequest quoteRequest (required)
     * @return ApiResponse&lt;MdQuoteResponseVO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MdQuoteResponseVO> createMarketDataQuoteUsingPostWithHttpInfo(MdQuoteRequestCO quoteRequest) throws ApiException {
        com.squareup.okhttp.Call call = createMarketDataQuoteUsingPostValidateBeforeCall(quoteRequest, null, null);
        Type localVarReturnType = new TypeToken<MdQuoteResponseVO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create quote market data (asynchronously)
     * 
     * @param quoteRequest quoteRequest (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createMarketDataQuoteUsingPostAsync(MdQuoteRequestCO quoteRequest, final ApiCallback<MdQuoteResponseVO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createMarketDataQuoteUsingPostValidateBeforeCall(quoteRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MdQuoteResponseVO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
