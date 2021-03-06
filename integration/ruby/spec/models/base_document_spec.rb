=begin
#Hydrogen Integration API

#The Hydrogen Integration API

OpenAPI spec version: 1.2.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.14

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for IntegrationApi::BaseDocument
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'BaseDocument' do
  before do
    # run before each test
    @instance = IntegrationApi::BaseDocument.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of BaseDocument' do
    it 'should create an instance of BaseDocument' do
      expect(@instance).to be_instance_of(IntegrationApi::BaseDocument)
    end
  end
  describe 'test attribute "data"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "type"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["BASIC_INFO", "ADDRESS_INFO", "PERSONAL_INFO", "IDENTIFICATION_INFO", "EMPLOYMENT_INFO", "INVESTOR_PROFILE_INFO", "COMPLIANCE_AML_INFO", "DISCLOSURES", "MARGIN_DISCLOSURE", "MARKETING_INFO", "CUSTODIAN_INFO", "INSTITUTIONAL_INFO", "DIRECTOR_INFO", "TRUST_INFO", "JOINT_BASIC_INFO", "JOINT_ADDRESS_INFO", "JOINT_PERSONAL_INFO", "JOINT_IDENTIFICATION_INFO", "JOINT_EMPLOYMENT_INFO", "JOINT_INVESTOR_PROFILE_INFO", "JOINT_COMPLIANCE_AML_INFO", "JOINT_DISCLOSURES", "JOINT_MARGIN_DISCLOSURE", "JOINT_MARKETING_INFO", "JOINT_CUSTODIAN_INFO", "JOINT_INSTITUTIONAL_INFO", "JOINT_DIRECTOR_INFO", "JOINT_TRUST_INFO"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.type = value }.not_to raise_error
      # end
    end
  end

end
