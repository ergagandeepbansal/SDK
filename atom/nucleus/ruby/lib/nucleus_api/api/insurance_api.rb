=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.7.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.14

=end

require 'uri'

module NucleusApi
  class InsuranceApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create a insurance coverage request
    # Create a new insurance coverage.
    # @param insurance_coverage insuranceCoverage
    # @param [Hash] opts the optional parameters
    # @return [InsuranceCoverage]
    def create_insurance_coverage_using_post(insurance_coverage, opts = {})
      data, _status_code, _headers = create_insurance_coverage_using_post_with_http_info(insurance_coverage, opts)
      data
    end

    # Create a insurance coverage request
    # Create a new insurance coverage.
    # @param insurance_coverage insuranceCoverage
    # @param [Hash] opts the optional parameters
    # @return [Array<(InsuranceCoverage, Fixnum, Hash)>] InsuranceCoverage data, response status code and response headers
    def create_insurance_coverage_using_post_with_http_info(insurance_coverage, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.create_insurance_coverage_using_post ...'
      end
      # verify the required parameter 'insurance_coverage' is set
      if @api_client.config.client_side_validation && insurance_coverage.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_coverage' when calling InsuranceApi.create_insurance_coverage_using_post"
      end
      # resource path
      local_var_path = '/insurance_coverage'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(insurance_coverage)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InsuranceCoverage')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#create_insurance_coverage_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Create a insurance discount request
    # Create a new insurance discount.
    # @param insurance_discount insuranceDiscount
    # @param [Hash] opts the optional parameters
    # @return [InsuranceDiscount]
    def create_insurance_discount_using_post(insurance_discount, opts = {})
      data, _status_code, _headers = create_insurance_discount_using_post_with_http_info(insurance_discount, opts)
      data
    end

    # Create a insurance discount request
    # Create a new insurance discount.
    # @param insurance_discount insuranceDiscount
    # @param [Hash] opts the optional parameters
    # @return [Array<(InsuranceDiscount, Fixnum, Hash)>] InsuranceDiscount data, response status code and response headers
    def create_insurance_discount_using_post_with_http_info(insurance_discount, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.create_insurance_discount_using_post ...'
      end
      # verify the required parameter 'insurance_discount' is set
      if @api_client.config.client_side_validation && insurance_discount.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_discount' when calling InsuranceApi.create_insurance_discount_using_post"
      end
      # resource path
      local_var_path = '/insurance_discount'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(insurance_discount)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InsuranceDiscount')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#create_insurance_discount_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Create a insuranceQuote request
    # Create a new insuranceQuote request.
    # @param insurance_quote insuranceQuote
    # @param [Hash] opts the optional parameters
    # @return [InsuranceQuote]
    def create_insurance_quote_using_post(insurance_quote, opts = {})
      data, _status_code, _headers = create_insurance_quote_using_post_with_http_info(insurance_quote, opts)
      data
    end

    # Create a insuranceQuote request
    # Create a new insuranceQuote request.
    # @param insurance_quote insuranceQuote
    # @param [Hash] opts the optional parameters
    # @return [Array<(InsuranceQuote, Fixnum, Hash)>] InsuranceQuote data, response status code and response headers
    def create_insurance_quote_using_post_with_http_info(insurance_quote, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.create_insurance_quote_using_post ...'
      end
      # verify the required parameter 'insurance_quote' is set
      if @api_client.config.client_side_validation && insurance_quote.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_quote' when calling InsuranceApi.create_insurance_quote_using_post"
      end
      # resource path
      local_var_path = '/insurance_quote'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(insurance_quote)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InsuranceQuote')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#create_insurance_quote_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete an insurance coverage request
    # Delete an  insurance coverage.
    # @param insurance_coverage_id UUID insurance_coverage_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_insurance_coverage_using_delete(insurance_coverage_id, opts = {})
      delete_insurance_coverage_using_delete_with_http_info(insurance_coverage_id, opts)
      nil
    end

    # Delete an insurance coverage request
    # Delete an  insurance coverage.
    # @param insurance_coverage_id UUID insurance_coverage_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_insurance_coverage_using_delete_with_http_info(insurance_coverage_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.delete_insurance_coverage_using_delete ...'
      end
      # verify the required parameter 'insurance_coverage_id' is set
      if @api_client.config.client_side_validation && insurance_coverage_id.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_coverage_id' when calling InsuranceApi.delete_insurance_coverage_using_delete"
      end
      # resource path
      local_var_path = '/insurance_coverage/{insurance_coverage_id}'.sub('{' + 'insurance_coverage_id' + '}', insurance_coverage_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#delete_insurance_coverage_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete an insurance discount request
    # Delete an  insurance discount.
    # @param insurance_discount_id UUID insurance_discount_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_insurance_discount_using_delete(insurance_discount_id, opts = {})
      delete_insurance_discount_using_delete_with_http_info(insurance_discount_id, opts)
      nil
    end

    # Delete an insurance discount request
    # Delete an  insurance discount.
    # @param insurance_discount_id UUID insurance_discount_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_insurance_discount_using_delete_with_http_info(insurance_discount_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.delete_insurance_discount_using_delete ...'
      end
      # verify the required parameter 'insurance_discount_id' is set
      if @api_client.config.client_side_validation && insurance_discount_id.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_discount_id' when calling InsuranceApi.delete_insurance_discount_using_delete"
      end
      # resource path
      local_var_path = '/insurance_discount/{insurance_discount_id}'.sub('{' + 'insurance_discount_id' + '}', insurance_discount_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#delete_insurance_discount_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a insuranceQuote request
    # Permanently delete a insuranceQuote request.
    # @param insurance_quote UUID insurance_quote_id
    # @param insurance_quote_id insurance_quote_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_insurance_quote_using_delete(insurance_quote, insurance_quote_id, opts = {})
      delete_insurance_quote_using_delete_with_http_info(insurance_quote, insurance_quote_id, opts)
      nil
    end

    # Delete a insuranceQuote request
    # Permanently delete a insuranceQuote request.
    # @param insurance_quote UUID insurance_quote_id
    # @param insurance_quote_id insurance_quote_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_insurance_quote_using_delete_with_http_info(insurance_quote, insurance_quote_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.delete_insurance_quote_using_delete ...'
      end
      # verify the required parameter 'insurance_quote' is set
      if @api_client.config.client_side_validation && insurance_quote.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_quote' when calling InsuranceApi.delete_insurance_quote_using_delete"
      end
      # verify the required parameter 'insurance_quote_id' is set
      if @api_client.config.client_side_validation && insurance_quote_id.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_quote_id' when calling InsuranceApi.delete_insurance_quote_using_delete"
      end
      # resource path
      local_var_path = '/insurance_quote/{insurance_quote_id}'.sub('{' + 'insurance_quote' + '}', insurance_quote.to_s).sub('{' + 'insurance_quote_id' + '}', insurance_quote_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#delete_insurance_quote_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get all insurance coverage request
    # Get all new insurance coverage.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageInsuranceCoverage]
    def get_insurance_coverage_all_using_get(opts = {})
      data, _status_code, _headers = get_insurance_coverage_all_using_get_with_http_info(opts)
      data
    end

    # Get all insurance coverage request
    # Get all new insurance coverage.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageInsuranceCoverage, Fixnum, Hash)>] PageInsuranceCoverage data, response status code and response headers
    def get_insurance_coverage_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.get_insurance_coverage_all_using_get ...'
      end
      # resource path
      local_var_path = '/insurance_coverage'

      # query parameters
      query_params = {}
      query_params[:'ascending'] = opts[:'ascending'] if !opts[:'ascending'].nil?
      query_params[:'filter'] = opts[:'filter'] if !opts[:'filter'].nil?
      query_params[:'order_by'] = opts[:'order_by'] if !opts[:'order_by'].nil?
      query_params[:'page'] = opts[:'page'] if !opts[:'page'].nil?
      query_params[:'size'] = opts[:'size'] if !opts[:'size'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'PageInsuranceCoverage')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#get_insurance_coverage_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get a insurance coverage request
    # Get a new insurance coverage.
    # @param insurance_coverage_id UUID insurance_coverage_id
    # @param [Hash] opts the optional parameters
    # @return [InsuranceCoverage]
    def get_insurance_coverage_using_get(insurance_coverage_id, opts = {})
      data, _status_code, _headers = get_insurance_coverage_using_get_with_http_info(insurance_coverage_id, opts)
      data
    end

    # Get a insurance coverage request
    # Get a new insurance coverage.
    # @param insurance_coverage_id UUID insurance_coverage_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(InsuranceCoverage, Fixnum, Hash)>] InsuranceCoverage data, response status code and response headers
    def get_insurance_coverage_using_get_with_http_info(insurance_coverage_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.get_insurance_coverage_using_get ...'
      end
      # verify the required parameter 'insurance_coverage_id' is set
      if @api_client.config.client_side_validation && insurance_coverage_id.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_coverage_id' when calling InsuranceApi.get_insurance_coverage_using_get"
      end
      # resource path
      local_var_path = '/insurance_coverage/{insurance_coverage_id}'.sub('{' + 'insurance_coverage_id' + '}', insurance_coverage_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InsuranceCoverage')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#get_insurance_coverage_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get all insurance discount request
    # Get all new insurance discount.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageInsuranceDiscount]
    def get_insurance_discount_all_using_get(opts = {})
      data, _status_code, _headers = get_insurance_discount_all_using_get_with_http_info(opts)
      data
    end

    # Get all insurance discount request
    # Get all new insurance discount.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageInsuranceDiscount, Fixnum, Hash)>] PageInsuranceDiscount data, response status code and response headers
    def get_insurance_discount_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.get_insurance_discount_all_using_get ...'
      end
      # resource path
      local_var_path = '/insurance_discount'

      # query parameters
      query_params = {}
      query_params[:'ascending'] = opts[:'ascending'] if !opts[:'ascending'].nil?
      query_params[:'filter'] = opts[:'filter'] if !opts[:'filter'].nil?
      query_params[:'order_by'] = opts[:'order_by'] if !opts[:'order_by'].nil?
      query_params[:'page'] = opts[:'page'] if !opts[:'page'].nil?
      query_params[:'size'] = opts[:'size'] if !opts[:'size'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'PageInsuranceDiscount')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#get_insurance_discount_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get a insurance discount request
    # Get a new insurance discount.
    # @param insurance_discount_id  UUID insurance_discount_id
    # @param [Hash] opts the optional parameters
    # @return [InsuranceDiscount]
    def get_insurance_discount_using_get(insurance_discount_id, opts = {})
      data, _status_code, _headers = get_insurance_discount_using_get_with_http_info(insurance_discount_id, opts)
      data
    end

    # Get a insurance discount request
    # Get a new insurance discount.
    # @param insurance_discount_id  UUID insurance_discount_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(InsuranceDiscount, Fixnum, Hash)>] InsuranceDiscount data, response status code and response headers
    def get_insurance_discount_using_get_with_http_info(insurance_discount_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.get_insurance_discount_using_get ...'
      end
      # verify the required parameter 'insurance_discount_id' is set
      if @api_client.config.client_side_validation && insurance_discount_id.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_discount_id' when calling InsuranceApi.get_insurance_discount_using_get"
      end
      # resource path
      local_var_path = '/insurance_discount/{insurance_discount_id}'.sub('{' + 'insurance_discount_id' + '}', insurance_discount_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InsuranceDiscount')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#get_insurance_discount_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all insuranceQuote requests
    # Get the information for all insuranceQuote requests.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageInsuranceQuote]
    def get_insurance_quote_all_using_get(opts = {})
      data, _status_code, _headers = get_insurance_quote_all_using_get_with_http_info(opts)
      data
    end

    # List all insuranceQuote requests
    # Get the information for all insuranceQuote requests.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageInsuranceQuote, Fixnum, Hash)>] PageInsuranceQuote data, response status code and response headers
    def get_insurance_quote_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.get_insurance_quote_all_using_get ...'
      end
      # resource path
      local_var_path = '/insurance_quote'

      # query parameters
      query_params = {}
      query_params[:'ascending'] = opts[:'ascending'] if !opts[:'ascending'].nil?
      query_params[:'filter'] = opts[:'filter'] if !opts[:'filter'].nil?
      query_params[:'order_by'] = opts[:'order_by'] if !opts[:'order_by'].nil?
      query_params[:'page'] = opts[:'page'] if !opts[:'page'].nil?
      query_params[:'size'] = opts[:'size'] if !opts[:'size'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'PageInsuranceQuote')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#get_insurance_quote_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a insuranceQuote request
    # Retrieve the information for a insuranceQuote request.
    # @param insurance_quote UUID insurance_quote_id
    # @param insurance_quote_id insurance_quote_id
    # @param [Hash] opts the optional parameters
    # @return [InsuranceQuote]
    def get_insurance_quote_using_get(insurance_quote, insurance_quote_id, opts = {})
      data, _status_code, _headers = get_insurance_quote_using_get_with_http_info(insurance_quote, insurance_quote_id, opts)
      data
    end

    # Retrieve a insuranceQuote request
    # Retrieve the information for a insuranceQuote request.
    # @param insurance_quote UUID insurance_quote_id
    # @param insurance_quote_id insurance_quote_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(InsuranceQuote, Fixnum, Hash)>] InsuranceQuote data, response status code and response headers
    def get_insurance_quote_using_get_with_http_info(insurance_quote, insurance_quote_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.get_insurance_quote_using_get ...'
      end
      # verify the required parameter 'insurance_quote' is set
      if @api_client.config.client_side_validation && insurance_quote.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_quote' when calling InsuranceApi.get_insurance_quote_using_get"
      end
      # verify the required parameter 'insurance_quote_id' is set
      if @api_client.config.client_side_validation && insurance_quote_id.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_quote_id' when calling InsuranceApi.get_insurance_quote_using_get"
      end
      # resource path
      local_var_path = '/insurance_quote/{insurance_quote_id}'.sub('{' + 'insurance_quote' + '}', insurance_quote.to_s).sub('{' + 'insurance_quote_id' + '}', insurance_quote_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InsuranceQuote')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#get_insurance_quote_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a insurance coverage request
    # Update a new insurance coverage.
    # @param insurance_coverage insurance_coverage
    # @param insurance_coverage_id UUID insurance_coverage_id
    # @param [Hash] opts the optional parameters
    # @return [InsuranceCoverage]
    def update_insurance_coverage_using_put(insurance_coverage, insurance_coverage_id, opts = {})
      data, _status_code, _headers = update_insurance_coverage_using_put_with_http_info(insurance_coverage, insurance_coverage_id, opts)
      data
    end

    # Update a insurance coverage request
    # Update a new insurance coverage.
    # @param insurance_coverage insurance_coverage
    # @param insurance_coverage_id UUID insurance_coverage_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(InsuranceCoverage, Fixnum, Hash)>] InsuranceCoverage data, response status code and response headers
    def update_insurance_coverage_using_put_with_http_info(insurance_coverage, insurance_coverage_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.update_insurance_coverage_using_put ...'
      end
      # verify the required parameter 'insurance_coverage' is set
      if @api_client.config.client_side_validation && insurance_coverage.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_coverage' when calling InsuranceApi.update_insurance_coverage_using_put"
      end
      # verify the required parameter 'insurance_coverage_id' is set
      if @api_client.config.client_side_validation && insurance_coverage_id.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_coverage_id' when calling InsuranceApi.update_insurance_coverage_using_put"
      end
      # resource path
      local_var_path = '/insurance_coverage/{insurance_coverage_id}'.sub('{' + 'insurance_coverage_id' + '}', insurance_coverage_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(insurance_coverage)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InsuranceCoverage')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#update_insurance_coverage_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update an insurance discount 
    # Update an new insurance .
    # @param insurance_discount insurance_discount
    # @param insurance_discount_id UUID insurance_discount_id
    # @param [Hash] opts the optional parameters
    # @return [InsuranceDiscount]
    def update_insurance_discount_using_put(insurance_discount, insurance_discount_id, opts = {})
      data, _status_code, _headers = update_insurance_discount_using_put_with_http_info(insurance_discount, insurance_discount_id, opts)
      data
    end

    # Update an insurance discount 
    # Update an new insurance .
    # @param insurance_discount insurance_discount
    # @param insurance_discount_id UUID insurance_discount_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(InsuranceDiscount, Fixnum, Hash)>] InsuranceDiscount data, response status code and response headers
    def update_insurance_discount_using_put_with_http_info(insurance_discount, insurance_discount_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.update_insurance_discount_using_put ...'
      end
      # verify the required parameter 'insurance_discount' is set
      if @api_client.config.client_side_validation && insurance_discount.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_discount' when calling InsuranceApi.update_insurance_discount_using_put"
      end
      # verify the required parameter 'insurance_discount_id' is set
      if @api_client.config.client_side_validation && insurance_discount_id.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_discount_id' when calling InsuranceApi.update_insurance_discount_using_put"
      end
      # resource path
      local_var_path = '/insurance_discount/{insurance_discount_id}'.sub('{' + 'insurance_discount_id' + '}', insurance_discount_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(insurance_discount)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InsuranceDiscount')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#update_insurance_discount_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a insuranceQuote request
    # Update the information for a insuranceQuote request.
    # @param insurance_quote insurance_quote
    # @param insurance_quote_id UUID insurance_quote_id
    # @param [Hash] opts the optional parameters
    # @return [InsuranceQuote]
    def update_insurance_quote_using_put(insurance_quote, insurance_quote_id, opts = {})
      data, _status_code, _headers = update_insurance_quote_using_put_with_http_info(insurance_quote, insurance_quote_id, opts)
      data
    end

    # Update a insuranceQuote request
    # Update the information for a insuranceQuote request.
    # @param insurance_quote insurance_quote
    # @param insurance_quote_id UUID insurance_quote_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(InsuranceQuote, Fixnum, Hash)>] InsuranceQuote data, response status code and response headers
    def update_insurance_quote_using_put_with_http_info(insurance_quote, insurance_quote_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: InsuranceApi.update_insurance_quote_using_put ...'
      end
      # verify the required parameter 'insurance_quote' is set
      if @api_client.config.client_side_validation && insurance_quote.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_quote' when calling InsuranceApi.update_insurance_quote_using_put"
      end
      # verify the required parameter 'insurance_quote_id' is set
      if @api_client.config.client_side_validation && insurance_quote_id.nil?
        fail ArgumentError, "Missing the required parameter 'insurance_quote_id' when calling InsuranceApi.update_insurance_quote_using_put"
      end
      # resource path
      local_var_path = '/insurance_quote/{insurance_quote_id}'.sub('{' + 'insurance_quote_id' + '}', insurance_quote_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(insurance_quote)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InsuranceQuote')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InsuranceApi#update_insurance_quote_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
