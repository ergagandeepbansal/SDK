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

# Unit tests for AtomApi::InsuranceApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'InsuranceApi' do
  before do
    # run before each test
    @instance = AtomApi::InsuranceApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of InsuranceApi' do
    it 'should create an instance of InsuranceApi' do
      expect(@instance).to be_instance_of(AtomApi::InsuranceApi)
    end
  end

  # unit tests for create_insurance_coverage_using_post
  # Create a insurance coverage request
  # Create a new insurance coverage.
  # @param insurance_coverage insuranceCoverage
  # @param [Hash] opts the optional parameters
  # @return [InsuranceCoverage]
  describe 'create_insurance_coverage_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_insurance_discount_using_post
  # Create a insurance discount request
  # Create a new insurance discount.
  # @param insurance_discount insuranceDiscount
  # @param [Hash] opts the optional parameters
  # @return [InsuranceDiscount]
  describe 'create_insurance_discount_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_insurance_quote_using_post
  # Create a insuranceQuote request
  # Create a new insuranceQuote request.
  # @param insurance_quote insuranceQuote
  # @param [Hash] opts the optional parameters
  # @return [InsuranceQuote]
  describe 'create_insurance_quote_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_insurance_coverage_using_delete
  # Delete an insurance coverage request
  # Delete an  insurance coverage.
  # @param insurance_coverage_id UUID insurance_coverage_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_insurance_coverage_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_insurance_discount_using_delete
  # Delete an insurance discount request
  # Delete an  insurance discount.
  # @param insurance_discount_id UUID insurance_discount_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_insurance_discount_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_insurance_quote_using_delete
  # Delete a insuranceQuote request
  # Permanently delete a insuranceQuote request.
  # @param insurance_quote UUID insurance_quote_id
  # @param insurance_quote_id insurance_quote_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_insurance_quote_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_insurance_coverage_all_using_get
  # Get all insurance coverage request
  # Get all new insurance coverage.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageInsuranceCoverage]
  describe 'get_insurance_coverage_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_insurance_coverage_using_get
  # Get a insurance coverage request
  # Get a new insurance coverage.
  # @param insurance_coverage_id UUID insurance_coverage_id
  # @param [Hash] opts the optional parameters
  # @return [InsuranceCoverage]
  describe 'get_insurance_coverage_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_insurance_discount_all_using_get
  # Get all insurance discount request
  # Get all new insurance discount.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageInsuranceDiscount]
  describe 'get_insurance_discount_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_insurance_discount_using_get
  # Get a insurance discount request
  # Get a new insurance discount.
  # @param insurance_discount_id  UUID insurance_discount_id
  # @param [Hash] opts the optional parameters
  # @return [InsuranceDiscount]
  describe 'get_insurance_discount_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_insurance_quote_all_using_get
  # List all insuranceQuote requests
  # Get the information for all insuranceQuote requests.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageInsuranceQuote]
  describe 'get_insurance_quote_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_insurance_quote_using_get
  # Retrieve a insuranceQuote request
  # Retrieve the information for a insuranceQuote request.
  # @param insurance_quote UUID insurance_quote_id
  # @param insurance_quote_id insurance_quote_id
  # @param [Hash] opts the optional parameters
  # @return [InsuranceQuote]
  describe 'get_insurance_quote_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_insurance_coverage_using_put
  # Update a insurance coverage request
  # Update a new insurance coverage.
  # @param insurance_coverage insurance_coverage
  # @param insurance_coverage_id UUID insurance_coverage_id
  # @param [Hash] opts the optional parameters
  # @return [InsuranceCoverage]
  describe 'update_insurance_coverage_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_insurance_discount_using_put
  # Update an insurance discount 
  # Update an new insurance .
  # @param insurance_discount insurance_discount
  # @param insurance_discount_id UUID insurance_discount_id
  # @param [Hash] opts the optional parameters
  # @return [InsuranceDiscount]
  describe 'update_insurance_discount_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_insurance_quote_using_put
  # Update a insuranceQuote request
  # Update the information for a insuranceQuote request.
  # @param insurance_quote insurance_quote
  # @param insurance_quote_id UUID insurance_quote_id
  # @param [Hash] opts the optional parameters
  # @return [InsuranceQuote]
  describe 'update_insurance_quote_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end