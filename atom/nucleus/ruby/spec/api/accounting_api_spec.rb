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

# Unit tests for AtomApi::AccountingApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AccountingApi' do
  before do
    # run before each test
    @instance = AtomApi::AccountingApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AccountingApi' do
    it 'should create an instance of AccountingApi' do
      expect(@instance).to be_instance_of(AtomApi::AccountingApi)
    end
  end

  # unit tests for create_accounting_using_post
  # Create an accounting
  # Store stats pulled from accounting vendors.
  # @param accounting accounting
  # @param [Hash] opts the optional parameters
  # @return [Accounting]
  describe 'create_accounting_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_accounting_using_delete
  # Delete an accounting
  # Permanently delete an accounting.
  # @param accounting_id UUID accounting_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_accounting_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_accounting_all_using_get
  # List all accounting
  # Get information for all accounting for all clients defined for your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageAccounting]
  describe 'get_accounting_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_accounting_using_get
  # Retrieve an accounting
  # Retrieve the information for a specific accounting associated with a client.
  # @param accounting_id UUID accounting_id
  # @param [Hash] opts the optional parameters
  # @return [Accounting]
  describe 'get_accounting_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_accounting_using_put
  # Update an accounting
  # Update the information for an accounting.
  # @param accounting accounting
  # @param accounting_id UUID accounting_id
  # @param [Hash] opts the optional parameters
  # @return [Accounting]
  describe 'update_accounting_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end