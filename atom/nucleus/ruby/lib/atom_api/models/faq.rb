=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.7.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.14

=end

require 'date'

module AtomApi
  # Faq Object
  class Faq
    # answer
    attr_accessor :answer

    # category
    attr_accessor :category

    attr_accessor :create_date

    attr_accessor :faq_keywords

    attr_accessor :id

    # isActive
    attr_accessor :is_active

    # isFeatured
    attr_accessor :is_featured

    attr_accessor :metadata

    # number
    attr_accessor :number

    # question
    attr_accessor :question

    attr_accessor :secondary_id

    # seoName
    attr_accessor :seo_name

    # subcategory
    attr_accessor :subcategory

    attr_accessor :update_date

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'answer' => :'answer',
        :'category' => :'category',
        :'create_date' => :'create_date',
        :'faq_keywords' => :'faq_keywords',
        :'id' => :'id',
        :'is_active' => :'is_active',
        :'is_featured' => :'is_featured',
        :'metadata' => :'metadata',
        :'number' => :'number',
        :'question' => :'question',
        :'secondary_id' => :'secondary_id',
        :'seo_name' => :'seo_name',
        :'subcategory' => :'subcategory',
        :'update_date' => :'update_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'answer' => :'String',
        :'category' => :'String',
        :'create_date' => :'DateTime',
        :'faq_keywords' => :'Array<FAQKeyword>',
        :'id' => :'String',
        :'is_active' => :'BOOLEAN',
        :'is_featured' => :'BOOLEAN',
        :'metadata' => :'Hash<String, String>',
        :'number' => :'Integer',
        :'question' => :'String',
        :'secondary_id' => :'String',
        :'seo_name' => :'String',
        :'subcategory' => :'String',
        :'update_date' => :'DateTime'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'answer')
        self.answer = attributes[:'answer']
      end

      if attributes.has_key?(:'category')
        self.category = attributes[:'category']
      end

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end

      if attributes.has_key?(:'faq_keywords')
        if (value = attributes[:'faq_keywords']).is_a?(Array)
          self.faq_keywords = value
        end
      end

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'is_active')
        self.is_active = attributes[:'is_active']
      end

      if attributes.has_key?(:'is_featured')
        self.is_featured = attributes[:'is_featured']
      end

      if attributes.has_key?(:'metadata')
        if (value = attributes[:'metadata']).is_a?(Hash)
          self.metadata = value
        end
      end

      if attributes.has_key?(:'number')
        self.number = attributes[:'number']
      end

      if attributes.has_key?(:'question')
        self.question = attributes[:'question']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'seo_name')
        self.seo_name = attributes[:'seo_name']
      end

      if attributes.has_key?(:'subcategory')
        self.subcategory = attributes[:'subcategory']
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @answer.nil?
        invalid_properties.push('invalid value for "answer", answer cannot be nil.')
      end

      if @question.nil?
        invalid_properties.push('invalid value for "question", question cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @answer.nil?
      return false if @question.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          answer == o.answer &&
          category == o.category &&
          create_date == o.create_date &&
          faq_keywords == o.faq_keywords &&
          id == o.id &&
          is_active == o.is_active &&
          is_featured == o.is_featured &&
          metadata == o.metadata &&
          number == o.number &&
          question == o.question &&
          secondary_id == o.secondary_id &&
          seo_name == o.seo_name &&
          subcategory == o.subcategory &&
          update_date == o.update_date
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [answer, category, create_date, faq_keywords, id, is_active, is_featured, metadata, number, question, secondary_id, seo_name, subcategory, update_date].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
        def build_from_hash(attributes)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        elsif attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", attributes[self.class.attribute_map[key]])
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
   value
  when :Date
    value
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
    temp_model = AtomApi.const_get(type).new
    temp_model.build_from_hash(value)
  end
end# Returns the string representation of the object
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