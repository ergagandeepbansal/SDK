=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.7.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.14

=end

require 'spec_helper'
require 'json'

# Unit tests for AtomApi::UtilsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'UtilsApi' do
  before do
    # run before each test
    @instance = AtomApi::UtilsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of UtilsApi' do
    it 'should create an instance of UtilsApi' do
      expect(@instance).to be_instance_of(AtomApi::UtilsApi)
    end
  end

  # unit tests for create_account_status_using_post
  # Create an account status
  # Create an account status record for an account.
  # @param account_status_request accountStatusRequest
  # @param [Hash] opts the optional parameters
  # @return [AccountStatus]
  describe 'create_account_status_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_stage_using_post
  # Create an account stage
  # Create a new account stage
  # @param stage_request stageRequest
  # @param [Hash] opts the optional parameters
  # @return [Stage]
  describe 'create_stage_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_transaction_code_using_post
  # Create a transaction code
  # Create a new transaction code for your firm.
  # @param transaction_request transactionRequest
  # @param [Hash] opts the optional parameters
  # @return [TransactionCode]
  describe 'create_transaction_code_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_account_status_using_delete
  # Delete an account status
  # Permanently delete an account status record from an account’s history.
  # @param account_status_id UUID account_status_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_account_status_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_stage_using_delete
  # Delete an account stage
  # Permanently delete an account stage.
  # @param stage_id UUID stage_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_stage_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_transaction_code_using_delete
  # Delete a transaction code
  # Permanently delete a transaction code for your firm.
  # @param transaction_code_id UUID transaction_code_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_transaction_code_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_account_status_all_using_get
  # List all account statuses
  # Get the account status history information for all accounts.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageAccountStatus]
  describe 'get_account_status_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_account_status_using_get
  # Retrieve an account status
  # Retrieve the information for a specific account status record for an account.
  # @param account_status_id UUID account_status_id
  # @param [Hash] opts the optional parameters
  # @return [AccountStatus]
  describe 'get_account_status_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_stage_all_using_get
  # List all account stages
  # Get the information for all possible account stages.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageStage]
  describe 'get_stage_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_stage_using_get
  # Retrieve an account stage
  # Retrieve the information for a specific account stage.
  # @param stage_id UUID stage_id
  # @param [Hash] opts the optional parameters
  # @return [Stage]
  describe 'get_stage_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_transaction_code_all_using_get
  # List all transaction codes
  # Get the information for all transaction codes defined by your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageTransactionCode]
  describe 'get_transaction_code_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_transaction_code_using_get
  # Retrieve a transaction code
  # Retrieve the information for a transaction code defined by your firm.
  # @param transaction_code_id UUID transaction_code_id
  # @param [Hash] opts the optional parameters
  # @return [TransactionCode]
  describe 'get_transaction_code_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_account_status_using_put
  # Update an account status
  # Update an account status record for an account.
  # @param account_status account_status
  # @param account_status_id UUID account_status_id
  # @param [Hash] opts the optional parameters
  # @return [AccountStatus]
  describe 'update_account_status_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_stage_using_put
  # Update an account stage
  # Update the information for an account stage.
  # @param stage stage
  # @param stage_id UUID stage_id
  # @param [Hash] opts the optional parameters
  # @return [Stage]
  describe 'update_stage_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_transaction_code_using_put
  # Update a transaction code
  # Update a transaction code for your firm.
  # @param transaction_code transaction_code
  # @param transaction_code_id UUID transaction_code_id
  # @param [Hash] opts the optional parameters
  # @return [TransactionCode]
  describe 'update_transaction_code_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end