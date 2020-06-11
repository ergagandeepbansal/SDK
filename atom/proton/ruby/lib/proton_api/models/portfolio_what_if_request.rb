=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.7.18
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.14

=end

require 'date'

module ProtonApi
  class PortfolioWhatIfRequest
    attr_accessor :use_proxy_data

    attr_accessor :altered_portfolio_tickers

    attr_accessor :current_portfolio_tickers

    attr_accessor :start_date

    attr_accessor :end_date

    attr_accessor :model_id

    attr_accessor :allocation_id

    attr_accessor :account_id

    attr_accessor :portfolio_id

    attr_accessor :aggregation_account_id

    attr_accessor :altered_portfolio_weights

    attr_accessor :market_data_source

    attr_accessor :current_portfolio_weights

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'use_proxy_data' => :'use_proxy_data',
        :'altered_portfolio_tickers' => :'altered_portfolio_tickers',
        :'current_portfolio_tickers' => :'current_portfolio_tickers',
        :'start_date' => :'start_date',
        :'end_date' => :'end_date',
        :'model_id' => :'model_id',
        :'allocation_id' => :'allocation_id',
        :'account_id' => :'account_id',
        :'portfolio_id' => :'portfolio_id',
        :'aggregation_account_id' => :'aggregation_account_id',
        :'altered_portfolio_weights' => :'altered_portfolio_weights',
        :'market_data_source' => :'market_data_source',
        :'current_portfolio_weights' => :'current_portfolio_weights'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'use_proxy_data' => :'BOOLEAN',
        :'altered_portfolio_tickers' => :'Array<String>',
        :'current_portfolio_tickers' => :'Array<String>',
        :'start_date' => :'String',
        :'end_date' => :'String',
        :'model_id' => :'String',
        :'allocation_id' => :'String',
        :'account_id' => :'String',
        :'portfolio_id' => :'String',
        :'aggregation_account_id' => :'String',
        :'altered_portfolio_weights' => :'Array<Float>',
        :'market_data_source' => :'String',
        :'current_portfolio_weights' => :'Array<Float>'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'use_proxy_data')
        self.use_proxy_data = attributes[:'use_proxy_data']
      else
        self.use_proxy_data = false
      end

      if attributes.has_key?(:'altered_portfolio_tickers')
        if (value = attributes[:'altered_portfolio_tickers']).is_a?(Array)
          self.altered_portfolio_tickers = value
        end
      end

      if attributes.has_key?(:'current_portfolio_tickers')
        if (value = attributes[:'current_portfolio_tickers']).is_a?(Array)
          self.current_portfolio_tickers = value
        end
      end

      if attributes.has_key?(:'start_date')
        self.start_date = attributes[:'start_date']
      end

      if attributes.has_key?(:'end_date')
        self.end_date = attributes[:'end_date']
      end

      if attributes.has_key?(:'model_id')
        self.model_id = attributes[:'model_id']
      end

      if attributes.has_key?(:'allocation_id')
        self.allocation_id = attributes[:'allocation_id']
      end

      if attributes.has_key?(:'account_id')
        self.account_id = attributes[:'account_id']
      end

      if attributes.has_key?(:'portfolio_id')
        self.portfolio_id = attributes[:'portfolio_id']
      end

      if attributes.has_key?(:'aggregation_account_id')
        self.aggregation_account_id = attributes[:'aggregation_account_id']
      end

      if attributes.has_key?(:'altered_portfolio_weights')
        if (value = attributes[:'altered_portfolio_weights']).is_a?(Array)
          self.altered_portfolio_weights = value
        end
      end

      if attributes.has_key?(:'market_data_source')
        self.market_data_source = attributes[:'market_data_source']
      else
        self.market_data_source = 'nucleus'
      end

      if attributes.has_key?(:'current_portfolio_weights')
        if (value = attributes[:'current_portfolio_weights']).is_a?(Array)
          self.current_portfolio_weights = value
        end
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @altered_portfolio_weights.nil?
        invalid_properties.push('invalid value for "altered_portfolio_weights", altered_portfolio_weights cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @altered_portfolio_weights.nil?
      market_data_source_validator = EnumAttributeValidator.new('String', ['nucleus', 'integration'])
      return false unless market_data_source_validator.valid?(@market_data_source)
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] market_data_source Object to be assigned
    def market_data_source=(market_data_source)
      validator = EnumAttributeValidator.new('String', ['nucleus', 'integration'])
      unless validator.valid?(market_data_source)
        fail ArgumentError, 'invalid value for "market_data_source", must be one of #{validator.allowable_values}.'
      end
      @market_data_source = market_data_source
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          use_proxy_data == o.use_proxy_data &&
          altered_portfolio_tickers == o.altered_portfolio_tickers &&
          current_portfolio_tickers == o.current_portfolio_tickers &&
          start_date == o.start_date &&
          end_date == o.end_date &&
          model_id == o.model_id &&
          allocation_id == o.allocation_id &&
          account_id == o.account_id &&
          portfolio_id == o.portfolio_id &&
          aggregation_account_id == o.aggregation_account_id &&
          altered_portfolio_weights == o.altered_portfolio_weights &&
          market_data_source == o.market_data_source &&
          current_portfolio_weights == o.current_portfolio_weights
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [use_proxy_data, altered_portfolio_tickers, current_portfolio_tickers, start_date, end_date, model_id, allocation_id, account_id, portfolio_id, aggregation_account_id, altered_portfolio_weights, market_data_source, current_portfolio_weights].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = ProtonApi.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end
end