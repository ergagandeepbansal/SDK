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

# Unit tests for AtomApi::AuditLogApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AuditLogApi' do
  before do
    # run before each test
    @instance = AtomApi::AuditLogApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AuditLogApi' do
    it 'should create an instance of AuditLogApi' do
      expect(@instance).to be_instance_of(AtomApi::AuditLogApi)
    end
  end

  # unit tests for create_audit_log_using_post
  # Create a audit log
  # Create a new audit log.
  # @param audit_log auditLog
  # @param [Hash] opts the optional parameters
  # @return [AuditLog]
  describe 'create_audit_log_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_audit_log_all_using_get
  # List all audit log
  # Get details for all audit log.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageAuditLog]
  describe 'get_audit_log_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_audit_log_using_get
  # Retrieve a audit log
  # Retrieve the information for a audit log.
  # @param audit_log_id UUID audit_log_id
  # @param [Hash] opts the optional parameters
  # @return [AuditLog]
  describe 'get_audit_log_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end