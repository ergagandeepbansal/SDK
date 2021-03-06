<?php
/**
 * BrokerageAccountCO
 *
 * PHP version 5
 *
 * @category Class
 * @package  com\hydrogen\integration
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Hydrogen Integration API
 *
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.14
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace com\hydrogen\integration\Model;

use \ArrayAccess;
use \com\hydrogen\integration\ObjectSerializer;

/**
 * BrokerageAccountCO Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\integration
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class BrokerageAccountCO implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'BrokerageAccountCO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'electron_document_id' => 'string[]',
        'nucleus_account_id' => 'string',
        'nucleus_account_type_id' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'electron_document_id' => 'uuid',
        'nucleus_account_id' => 'uuid',
        'nucleus_account_type_id' => 'uuid'
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'electron_document_id' => 'electron_document_id',
        'nucleus_account_id' => 'nucleus_account_id',
        'nucleus_account_type_id' => 'nucleus_account_type_id'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'electron_document_id' => 'setElectronDocumentId',
        'nucleus_account_id' => 'setNucleusAccountId',
        'nucleus_account_type_id' => 'setNucleusAccountTypeId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'electron_document_id' => 'getElectronDocumentId',
        'nucleus_account_id' => 'getNucleusAccountId',
        'nucleus_account_type_id' => 'getNucleusAccountTypeId'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['electron_document_id'] = isset($data['electron_document_id']) ? $data['electron_document_id'] : null;
        $this->container['nucleus_account_id'] = isset($data['nucleus_account_id']) ? $data['nucleus_account_id'] : null;
        $this->container['nucleus_account_type_id'] = isset($data['nucleus_account_type_id']) ? $data['nucleus_account_type_id'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets electron_document_id
     *
     * @return string[]
     */
    public function getElectronDocumentId()
    {
        return $this->container['electron_document_id'];
    }

    /**
     * Sets electron_document_id
     *
     * @param string[] $electron_document_id electron_document_id
     *
     * @return $this
     */
    public function setElectronDocumentId($electron_document_id)
    {
        $this->container['electron_document_id'] = $electron_document_id;

        return $this;
    }

    /**
     * Gets nucleus_account_id
     *
     * @return string
     */
    public function getNucleusAccountId()
    {
        return $this->container['nucleus_account_id'];
    }

    /**
     * Sets nucleus_account_id
     *
     * @param string $nucleus_account_id nucleus_account_id
     *
     * @return $this
     */
    public function setNucleusAccountId($nucleus_account_id)
    {
        $this->container['nucleus_account_id'] = $nucleus_account_id;

        return $this;
    }

    /**
     * Gets nucleus_account_type_id
     *
     * @return string
     */
    public function getNucleusAccountTypeId()
    {
        return $this->container['nucleus_account_type_id'];
    }

    /**
     * Sets nucleus_account_type_id
     *
     * @param string $nucleus_account_type_id nucleus_account_type_id
     *
     * @return $this
     */
    public function setNucleusAccountTypeId($nucleus_account_type_id)
    {
        $this->container['nucleus_account_type_id'] = $nucleus_account_type_id;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


