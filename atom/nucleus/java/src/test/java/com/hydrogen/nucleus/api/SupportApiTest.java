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


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.model.PageSupportTicketComment;
import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.model.ChatInfo;
import com.hydrogen.nucleus.model.Consultation;
import com.hydrogen.nucleus.model.PageChatInfo;
import com.hydrogen.nucleus.model.PageConsultation;
import com.hydrogen.nucleus.model.PageSale;
import com.hydrogen.nucleus.model.PageSupportTicket;
import com.hydrogen.nucleus.model.Sale;
import com.hydrogen.nucleus.model.SupportTicket;
import com.hydrogen.nucleus.model.SupportTicketComment;
import java.util.UUID;

import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for SupportApi
 */
@Ignore
public class SupportApiTest {

    private final SupportApi api = new SupportApi();

    
    /**
     * Create a Chat
     *
     * Create a Chat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChatUsingPostTest() throws ApiException {
        ChatInfo chatInfoRequest = null;
        ChatInfo response = api.createChatUsingPost(chatInfoRequest);

        // TODO: test validations
    }
    
    /**
     * Create a CIO Consultation
     *
     * Create a new CIO Consultation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConsultationUsingPostTest() throws ApiException {
        Consultation cioConsultationRequest = null;
        Consultation response = api.createConsultationUsingPost(cioConsultationRequest);

        // TODO: test validations
    }
    
    /**
     * Create a sales inquiry
     *
     * Create a new sales inquiry for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSaleUsingPostTest() throws ApiException {
        Sale saleRequest = null;
        Sale response = api.createSaleUsingPost(saleRequest);

        // TODO: test validations
    }
    
    /**
     * Create a support ticket comment
     *
     * Create a new support ticket comment for a support ticket.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSupportTicketCommentUsingPostTest() throws ApiException {
        SupportTicketComment supportTickerCommentRequest = null;
        SupportTicket response = api.createSupportTicketCommentUsingPost(supportTickerCommentRequest);

        // TODO: test validations
    }
    
    /**
     * Create a support ticket
     *
     * Create a new support ticket for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSupportTicketUsingPostTest() throws ApiException {
        SupportTicket supportTicketRequest = null;
        SupportTicket response = api.createSupportTicketUsingPost(supportTicketRequest);

        // TODO: test validations
    }
    
    /**
     * Delete a Chat
     *
     * Permanently delete a Chat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteChatUsingDeleteTest() throws ApiException {
        UUID chatId = null;
        api.deleteChatUsingDelete(chatId);

        // TODO: test validations
    }
    
    /**
     * Delete a CIO Consultation
     *
     * Permanently delete a CIO Consultation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteConsultationUsingDeleteTest() throws ApiException {
        UUID consultationId = null;
        api.deleteConsultationUsingDelete(consultationId);

        // TODO: test validations
    }
    
    /**
     * Delete a sales inquiry
     *
     * Permanently delete a sales inquiry.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSaleUsingDeleteTest() throws ApiException {
        UUID salesId = null;
        api.deleteSaleUsingDelete(salesId);

        // TODO: test validations
    }
    
    /**
     * Delete a support ticket comment
     *
     * Permanently delete a support ticket comment for a support ticket.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSupportTicketCommentUsingDeleteTest() throws ApiException {
        UUID supportTicketCommentId = null;
        api.deleteSupportTicketCommentUsingDelete(supportTicketCommentId);

        // TODO: test validations
    }
    
    /**
     * Delete a support ticket
     *
     * Permanently delete a support ticket for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSupportTicketUsingDeleteTest() throws ApiException {
        UUID supportTicketId = null;
        api.deleteSupportTicketUsingDelete(supportTicketId);

        // TODO: test validations
    }
    
    /**
     * List all open chats
     *
     * Get details for all open chat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChatAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageChatInfo response = api.getChatAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Chat
     *
     * Retrieve the information for a Chat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChatUsingGetTest() throws ApiException {
        UUID chatId = null;
        ChatInfo response = api.getChatUsingGet(chatId);

        // TODO: test validations
    }
    
    /**
     * List all CIO Consultation
     *
     * Get details for all CIO Consultation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsultationAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageConsultation response = api.getConsultationAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a CIO Consultation
     *
     * Retrieve the information for a CIO Consultation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsultationUsingGetTest() throws ApiException {
        UUID consultationId = null;
        Consultation response = api.getConsultationUsingGet(consultationId);

        // TODO: test validations
    }
    
    /**
     * List all sales inquiries
     *
     * Get all sales inquiries defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSaleAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageSale response = api.getSaleAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a sales record
     *
     * Retrieve the information for a sales record
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSaleUsingGetTest() throws ApiException {
        UUID salesId = null;
        Sale response = api.getSaleUsingGet(salesId);

        // TODO: test validations
    }
    
    /**
     * List all support tickets
     *
     * Get the information for all support tickets defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportTicketAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageSupportTicket response = api.getSupportTicketAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all support ticket comments
     *
     * Get the information for all support ticket comments defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportTicketCommentAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageSupportTicketComment response = api.getSupportTicketCommentAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a support ticket comment
     *
     * Retrieve the information for a support ticket comment defined for a support ticket.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportTicketCommentUsingGetTest() throws ApiException {
        UUID supportTicketCommentId = null;
        SupportTicketComment response = api.getSupportTicketCommentUsingGet(supportTicketCommentId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a support ticket
     *
     * Retrieve the information for a support ticket defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportTicketUsingGetTest() throws ApiException {
        UUID supportTicketId = null;
        SupportTicket response = api.getSupportTicketUsingGet(supportTicketId);

        // TODO: test validations
    }
    
    /**
     * Update a Chat
     *
     * Updated the information for a Chat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateChatUsingPutTest() throws ApiException {
        UUID chatId = null;
        ChatInfo chatInfo = null;
        ChatInfo response = api.updateChatUsingPut(chatId, chatInfo);

        // TODO: test validations
    }
    
    /**
     * Update a CIO Consultation
     *
     * Updated the information CIO Consultation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateConsultationUsingPutTest() throws ApiException {
        Consultation consultation = null;
        UUID consultationId = null;
        Consultation response = api.updateConsultationUsingPut(consultation, consultationId);

        // TODO: test validations
    }
    
    /**
     * Update a sales inquiry
     *
     * Update the information for a sales inquiry. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSaleUsingPutTest() throws ApiException {
        Sale sales = null;
        UUID salesId = null;
        Sale response = api.updateSaleUsingPut(sales, salesId);

        // TODO: test validations
    }
    
    /**
     * Update a support ticket comment
     *
     * Update the information for a support ticket comments defined for a support ticket.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSupportTicketCommentUsingPutTest() throws ApiException {
        SupportTicketComment supportTicketComment = null;
        UUID supportTicketCommentId = null;
        SupportTicketComment response = api.updateSupportTicketCommentUsingPut(supportTicketComment, supportTicketCommentId);

        // TODO: test validations
    }
    
    /**
     * Update a support ticket
     *
     * Update the information for a support ticket defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSupportTicketUsingPutTest() throws ApiException {
        SupportTicket supportTicket = null;
        UUID supportTicketId = null;
        SupportTicket response = api.updateSupportTicketUsingPut(supportTicket, supportTicketId);

        // TODO: test validations
    }
    
}
