/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.7.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.api;

import com.hydrogen.model.FinancialOffer;
import com.hydrogen.ApiException;
import com.hydrogen.model.PageFinancialOffer;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for FinancialOfferApi
 */
@Ignore
public class FinancialOfferApiTest {

    private final FinancialOfferApi api = new FinancialOfferApi();

    
    /**
     * Create a comparison request
     *
     * Create a new comparison request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFinancialOfferUsingPostTest() throws ApiException {
        FinancialOffer financialOffer = null;
        FinancialOffer response = api.createFinancialOfferUsingPost(financialOffer);

        // TODO: test validations
    }
    
    /**
     * Delete a comparison request
     *
     * Permanently delete a comparison request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFinancialOfferUsingDeleteTest() throws ApiException {
        UUID financialOffer = null;
        UUID financialOfferId = null;
        api.deleteFinancialOfferUsingDelete(financialOffer, financialOfferId);

        // TODO: test validations
    }
    
    /**
     * List all comparison requests
     *
     * Get the information for all comparison requests.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFinancialOfferAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageFinancialOffer response = api.getFinancialOfferAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a comparison request
     *
     * Retrieve the information for a comparison request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFinancialOfferUsingGetTest() throws ApiException {
        UUID financialOffer = null;
        UUID financialOfferId = null;
        FinancialOffer response = api.getFinancialOfferUsingGet(financialOffer, financialOfferId);

        // TODO: test validations
    }
    
    /**
     * Update a comparison request
     *
     * Update the information for a comparison request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFinancialOfferUsingPutTest() throws ApiException {
        FinancialOffer financialOffer = null;
        UUID financialOfferId = null;
        FinancialOffer response = api.updateFinancialOfferUsingPut(financialOffer, financialOfferId);

        // TODO: test validations
    }
    
}