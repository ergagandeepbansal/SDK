<?php
/**
 * GoalAccumulationRecommendationRequest
 *
 * PHP version 5
 *
 * @category Class
 * @package  com\hydrogen
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Hydrogen Proton API
 *
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.7.18
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.14
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace com\hydrogen\Model;

use \ArrayAccess;
use \com\hydrogen\ObjectSerializer;

/**
 * GoalAccumulationRecommendationRequest Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class GoalAccumulationRecommendationRequest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'goalAccumulationRecommendationRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'thresh' => 'float',
        'n' => 'int',
        'trading_days_per_year' => 'int',
        'conf_tgt' => 'float',
        'client_id' => 'string',
        'curr_inv' => 'float',
        'withdrawal_tax' => 'float',
        'p_ret' => 'float[]',
        'thresh_type' => 'string',
        'p_risk' => 'float[]',
        'adjust_for_compounding' => 'bool',
        'remove_outliers' => 'bool',
        'recommend_type' => 'string',
        'recommendation_config' => 'object',
        'goal_id' => 'string',
        'horizon_frequency' => 'string',
        'deposit_config' => 'object[]',
        'compounding_rate' => 'float',
        'goal_config' => 'object',
        'horizon' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'thresh' => null,
        'n' => 'int32',
        'trading_days_per_year' => 'int32',
        'conf_tgt' => 'float',
        'client_id' => 'uuid',
        'curr_inv' => null,
        'withdrawal_tax' => 'float',
        'p_ret' => 'float',
        'thresh_type' => null,
        'p_risk' => 'float',
        'adjust_for_compounding' => null,
        'remove_outliers' => null,
        'recommend_type' => null,
        'recommendation_config' => null,
        'goal_id' => 'uuid',
        'horizon_frequency' => null,
        'deposit_config' => null,
        'compounding_rate' => 'float',
        'goal_config' => null,
        'horizon' => 'int32'
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
        'thresh' => 'thresh',
        'n' => 'n',
        'trading_days_per_year' => 'trading_days_per_year',
        'conf_tgt' => 'conf_tgt',
        'client_id' => 'client_id',
        'curr_inv' => 'curr_inv',
        'withdrawal_tax' => 'withdrawal_tax',
        'p_ret' => 'p_ret',
        'thresh_type' => 'thresh_type',
        'p_risk' => 'p_risk',
        'adjust_for_compounding' => 'adjust_for_compounding',
        'remove_outliers' => 'remove_outliers',
        'recommend_type' => 'recommend_type',
        'recommendation_config' => 'recommendation_config',
        'goal_id' => 'goal_id',
        'horizon_frequency' => 'horizon_frequency',
        'deposit_config' => 'deposit_config',
        'compounding_rate' => 'compounding_rate',
        'goal_config' => 'goal_config',
        'horizon' => 'horizon'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'thresh' => 'setThresh',
        'n' => 'setN',
        'trading_days_per_year' => 'setTradingDaysPerYear',
        'conf_tgt' => 'setConfTgt',
        'client_id' => 'setClientId',
        'curr_inv' => 'setCurrInv',
        'withdrawal_tax' => 'setWithdrawalTax',
        'p_ret' => 'setPRet',
        'thresh_type' => 'setThreshType',
        'p_risk' => 'setPRisk',
        'adjust_for_compounding' => 'setAdjustForCompounding',
        'remove_outliers' => 'setRemoveOutliers',
        'recommend_type' => 'setRecommendType',
        'recommendation_config' => 'setRecommendationConfig',
        'goal_id' => 'setGoalId',
        'horizon_frequency' => 'setHorizonFrequency',
        'deposit_config' => 'setDepositConfig',
        'compounding_rate' => 'setCompoundingRate',
        'goal_config' => 'setGoalConfig',
        'horizon' => 'setHorizon'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'thresh' => 'getThresh',
        'n' => 'getN',
        'trading_days_per_year' => 'getTradingDaysPerYear',
        'conf_tgt' => 'getConfTgt',
        'client_id' => 'getClientId',
        'curr_inv' => 'getCurrInv',
        'withdrawal_tax' => 'getWithdrawalTax',
        'p_ret' => 'getPRet',
        'thresh_type' => 'getThreshType',
        'p_risk' => 'getPRisk',
        'adjust_for_compounding' => 'getAdjustForCompounding',
        'remove_outliers' => 'getRemoveOutliers',
        'recommend_type' => 'getRecommendType',
        'recommendation_config' => 'getRecommendationConfig',
        'goal_id' => 'getGoalId',
        'horizon_frequency' => 'getHorizonFrequency',
        'deposit_config' => 'getDepositConfig',
        'compounding_rate' => 'getCompoundingRate',
        'goal_config' => 'getGoalConfig',
        'horizon' => 'getHorizon'
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

    const THRESH_TYPE_AMNT = 'amnt';
    const THRESH_TYPE_PERC = 'perc';
    const RECOMMEND_TYPE_RECURRING = 'recurring';
    const RECOMMEND_TYPE_ONE_TIME = 'one-time';
    const RECOMMEND_TYPE_COMBO = 'combo';
    const RECOMMEND_TYPE_HORIZON = 'horizon';
    const HORIZON_FREQUENCY_YEAR = 'year';
    const HORIZON_FREQUENCY_SIX_MONTHS = 'six_months';
    const HORIZON_FREQUENCY_QUARTER = 'quarter';
    const HORIZON_FREQUENCY_MONTH = 'month';
    const HORIZON_FREQUENCY_TWO_WEEKS = 'two_weeks';
    const HORIZON_FREQUENCY_WEEK = 'week';
    const HORIZON_FREQUENCY_DAY = 'day';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getThreshTypeAllowableValues()
    {
        return [
            self::THRESH_TYPE_AMNT,
            self::THRESH_TYPE_PERC,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getRecommendTypeAllowableValues()
    {
        return [
            self::RECOMMEND_TYPE_RECURRING,
            self::RECOMMEND_TYPE_ONE_TIME,
            self::RECOMMEND_TYPE_COMBO,
            self::RECOMMEND_TYPE_HORIZON,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getHorizonFrequencyAllowableValues()
    {
        return [
            self::HORIZON_FREQUENCY_YEAR,
            self::HORIZON_FREQUENCY_SIX_MONTHS,
            self::HORIZON_FREQUENCY_QUARTER,
            self::HORIZON_FREQUENCY_MONTH,
            self::HORIZON_FREQUENCY_TWO_WEEKS,
            self::HORIZON_FREQUENCY_WEEK,
            self::HORIZON_FREQUENCY_DAY,
        ];
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
        $this->container['thresh'] = isset($data['thresh']) ? $data['thresh'] : null;
        $this->container['n'] = isset($data['n']) ? $data['n'] : 1000;
        $this->container['trading_days_per_year'] = isset($data['trading_days_per_year']) ? $data['trading_days_per_year'] : 252;
        $this->container['conf_tgt'] = isset($data['conf_tgt']) ? $data['conf_tgt'] : 0.9;
        $this->container['client_id'] = isset($data['client_id']) ? $data['client_id'] : null;
        $this->container['curr_inv'] = isset($data['curr_inv']) ? $data['curr_inv'] : null;
        $this->container['withdrawal_tax'] = isset($data['withdrawal_tax']) ? $data['withdrawal_tax'] : 0.0;
        $this->container['p_ret'] = isset($data['p_ret']) ? $data['p_ret'] : null;
        $this->container['thresh_type'] = isset($data['thresh_type']) ? $data['thresh_type'] : 'perc';
        $this->container['p_risk'] = isset($data['p_risk']) ? $data['p_risk'] : null;
        $this->container['adjust_for_compounding'] = isset($data['adjust_for_compounding']) ? $data['adjust_for_compounding'] : false;
        $this->container['remove_outliers'] = isset($data['remove_outliers']) ? $data['remove_outliers'] : true;
        $this->container['recommend_type'] = isset($data['recommend_type']) ? $data['recommend_type'] : 'horizon';
        $this->container['recommendation_config'] = isset($data['recommendation_config']) ? $data['recommendation_config'] : null;
        $this->container['goal_id'] = isset($data['goal_id']) ? $data['goal_id'] : null;
        $this->container['horizon_frequency'] = isset($data['horizon_frequency']) ? $data['horizon_frequency'] : 'year';
        $this->container['deposit_config'] = isset($data['deposit_config']) ? $data['deposit_config'] : null;
        $this->container['compounding_rate'] = isset($data['compounding_rate']) ? $data['compounding_rate'] : 0.0;
        $this->container['goal_config'] = isset($data['goal_config']) ? $data['goal_config'] : null;
        $this->container['horizon'] = isset($data['horizon']) ? $data['horizon'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!is_null($this->container['thresh']) && ($this->container['thresh'] < 0)) {
            $invalidProperties[] = "invalid value for 'thresh', must be bigger than or equal to 0.";
        }

        if (!is_null($this->container['n']) && ($this->container['n'] > 10000)) {
            $invalidProperties[] = "invalid value for 'n', must be smaller than or equal to 10000.";
        }

        if (!is_null($this->container['n']) && ($this->container['n'] < 1)) {
            $invalidProperties[] = "invalid value for 'n', must be bigger than or equal to 1.";
        }

        if (!is_null($this->container['trading_days_per_year']) && ($this->container['trading_days_per_year'] > 365)) {
            $invalidProperties[] = "invalid value for 'trading_days_per_year', must be smaller than or equal to 365.";
        }

        if (!is_null($this->container['trading_days_per_year']) && ($this->container['trading_days_per_year'] < 1)) {
            $invalidProperties[] = "invalid value for 'trading_days_per_year', must be bigger than or equal to 1.";
        }

        if (!is_null($this->container['conf_tgt']) && ($this->container['conf_tgt'] > 1)) {
            $invalidProperties[] = "invalid value for 'conf_tgt', must be smaller than or equal to 1.";
        }

        if (!is_null($this->container['conf_tgt']) && ($this->container['conf_tgt'] < 0)) {
            $invalidProperties[] = "invalid value for 'conf_tgt', must be bigger than or equal to 0.";
        }

        if (!is_null($this->container['curr_inv']) && ($this->container['curr_inv'] < 0)) {
            $invalidProperties[] = "invalid value for 'curr_inv', must be bigger than or equal to 0.";
        }

        if (!is_null($this->container['withdrawal_tax']) && ($this->container['withdrawal_tax'] > 1)) {
            $invalidProperties[] = "invalid value for 'withdrawal_tax', must be smaller than or equal to 1.";
        }

        if (!is_null($this->container['withdrawal_tax']) && ($this->container['withdrawal_tax'] < 0)) {
            $invalidProperties[] = "invalid value for 'withdrawal_tax', must be bigger than or equal to 0.";
        }

        if ($this->container['p_ret'] === null) {
            $invalidProperties[] = "'p_ret' can't be null";
        }
        $allowedValues = $this->getThreshTypeAllowableValues();
        if (!is_null($this->container['thresh_type']) && !in_array($this->container['thresh_type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'thresh_type', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['p_risk'] === null) {
            $invalidProperties[] = "'p_risk' can't be null";
        }
        $allowedValues = $this->getRecommendTypeAllowableValues();
        if (!is_null($this->container['recommend_type']) && !in_array($this->container['recommend_type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'recommend_type', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getHorizonFrequencyAllowableValues();
        if (!is_null($this->container['horizon_frequency']) && !in_array($this->container['horizon_frequency'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'horizon_frequency', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if (!is_null($this->container['compounding_rate']) && ($this->container['compounding_rate'] < -1)) {
            $invalidProperties[] = "invalid value for 'compounding_rate', must be bigger than or equal to -1.";
        }

        if (!is_null($this->container['horizon']) && ($this->container['horizon'] > 350)) {
            $invalidProperties[] = "invalid value for 'horizon', must be smaller than or equal to 350.";
        }

        if (!is_null($this->container['horizon']) && ($this->container['horizon'] < 0)) {
            $invalidProperties[] = "invalid value for 'horizon', must be bigger than or equal to 0.";
        }

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
     * Gets thresh
     *
     * @return float
     */
    public function getThresh()
    {
        return $this->container['thresh'];
    }

    /**
     * Sets thresh
     *
     * @param float $thresh thresh
     *
     * @return $this
     */
    public function setThresh($thresh)
    {

        if (!is_null($thresh) && ($thresh < 0)) {
            throw new \InvalidArgumentException('invalid value for $thresh when calling GoalAccumulationRecommendationRequest., must be bigger than or equal to 0.');
        }

        $this->container['thresh'] = $thresh;

        return $this;
    }

    /**
     * Gets n
     *
     * @return int
     */
    public function getN()
    {
        return $this->container['n'];
    }

    /**
     * Sets n
     *
     * @param int $n n
     *
     * @return $this
     */
    public function setN($n)
    {

        if (!is_null($n) && ($n > 10000)) {
            throw new \InvalidArgumentException('invalid value for $n when calling GoalAccumulationRecommendationRequest., must be smaller than or equal to 10000.');
        }
        if (!is_null($n) && ($n < 1)) {
            throw new \InvalidArgumentException('invalid value for $n when calling GoalAccumulationRecommendationRequest., must be bigger than or equal to 1.');
        }

        $this->container['n'] = $n;

        return $this;
    }

    /**
     * Gets trading_days_per_year
     *
     * @return int
     */
    public function getTradingDaysPerYear()
    {
        return $this->container['trading_days_per_year'];
    }

    /**
     * Sets trading_days_per_year
     *
     * @param int $trading_days_per_year trading_days_per_year
     *
     * @return $this
     */
    public function setTradingDaysPerYear($trading_days_per_year)
    {

        if (!is_null($trading_days_per_year) && ($trading_days_per_year > 365)) {
            throw new \InvalidArgumentException('invalid value for $trading_days_per_year when calling GoalAccumulationRecommendationRequest., must be smaller than or equal to 365.');
        }
        if (!is_null($trading_days_per_year) && ($trading_days_per_year < 1)) {
            throw new \InvalidArgumentException('invalid value for $trading_days_per_year when calling GoalAccumulationRecommendationRequest., must be bigger than or equal to 1.');
        }

        $this->container['trading_days_per_year'] = $trading_days_per_year;

        return $this;
    }

    /**
     * Gets conf_tgt
     *
     * @return float
     */
    public function getConfTgt()
    {
        return $this->container['conf_tgt'];
    }

    /**
     * Sets conf_tgt
     *
     * @param float $conf_tgt conf_tgt
     *
     * @return $this
     */
    public function setConfTgt($conf_tgt)
    {

        if (!is_null($conf_tgt) && ($conf_tgt > 1)) {
            throw new \InvalidArgumentException('invalid value for $conf_tgt when calling GoalAccumulationRecommendationRequest., must be smaller than or equal to 1.');
        }
        if (!is_null($conf_tgt) && ($conf_tgt < 0)) {
            throw new \InvalidArgumentException('invalid value for $conf_tgt when calling GoalAccumulationRecommendationRequest., must be bigger than or equal to 0.');
        }

        $this->container['conf_tgt'] = $conf_tgt;

        return $this;
    }

    /**
     * Gets client_id
     *
     * @return string
     */
    public function getClientId()
    {
        return $this->container['client_id'];
    }

    /**
     * Sets client_id
     *
     * @param string $client_id client_id
     *
     * @return $this
     */
    public function setClientId($client_id)
    {
        $this->container['client_id'] = $client_id;

        return $this;
    }

    /**
     * Gets curr_inv
     *
     * @return float
     */
    public function getCurrInv()
    {
        return $this->container['curr_inv'];
    }

    /**
     * Sets curr_inv
     *
     * @param float $curr_inv curr_inv
     *
     * @return $this
     */
    public function setCurrInv($curr_inv)
    {

        if (!is_null($curr_inv) && ($curr_inv < 0)) {
            throw new \InvalidArgumentException('invalid value for $curr_inv when calling GoalAccumulationRecommendationRequest., must be bigger than or equal to 0.');
        }

        $this->container['curr_inv'] = $curr_inv;

        return $this;
    }

    /**
     * Gets withdrawal_tax
     *
     * @return float
     */
    public function getWithdrawalTax()
    {
        return $this->container['withdrawal_tax'];
    }

    /**
     * Sets withdrawal_tax
     *
     * @param float $withdrawal_tax withdrawal_tax
     *
     * @return $this
     */
    public function setWithdrawalTax($withdrawal_tax)
    {

        if (!is_null($withdrawal_tax) && ($withdrawal_tax > 1)) {
            throw new \InvalidArgumentException('invalid value for $withdrawal_tax when calling GoalAccumulationRecommendationRequest., must be smaller than or equal to 1.');
        }
        if (!is_null($withdrawal_tax) && ($withdrawal_tax < 0)) {
            throw new \InvalidArgumentException('invalid value for $withdrawal_tax when calling GoalAccumulationRecommendationRequest., must be bigger than or equal to 0.');
        }

        $this->container['withdrawal_tax'] = $withdrawal_tax;

        return $this;
    }

    /**
     * Gets p_ret
     *
     * @return float[]
     */
    public function getPRet()
    {
        return $this->container['p_ret'];
    }

    /**
     * Sets p_ret
     *
     * @param float[] $p_ret p_ret
     *
     * @return $this
     */
    public function setPRet($p_ret)
    {
        $this->container['p_ret'] = $p_ret;

        return $this;
    }

    /**
     * Gets thresh_type
     *
     * @return string
     */
    public function getThreshType()
    {
        return $this->container['thresh_type'];
    }

    /**
     * Sets thresh_type
     *
     * @param string $thresh_type thresh_type
     *
     * @return $this
     */
    public function setThreshType($thresh_type)
    {
        $allowedValues = $this->getThreshTypeAllowableValues();
        if (!is_null($thresh_type) && !in_array($thresh_type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'thresh_type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['thresh_type'] = $thresh_type;

        return $this;
    }

    /**
     * Gets p_risk
     *
     * @return float[]
     */
    public function getPRisk()
    {
        return $this->container['p_risk'];
    }

    /**
     * Sets p_risk
     *
     * @param float[] $p_risk p_risk
     *
     * @return $this
     */
    public function setPRisk($p_risk)
    {
        $this->container['p_risk'] = $p_risk;

        return $this;
    }

    /**
     * Gets adjust_for_compounding
     *
     * @return bool
     */
    public function getAdjustForCompounding()
    {
        return $this->container['adjust_for_compounding'];
    }

    /**
     * Sets adjust_for_compounding
     *
     * @param bool $adjust_for_compounding adjust_for_compounding
     *
     * @return $this
     */
    public function setAdjustForCompounding($adjust_for_compounding)
    {
        $this->container['adjust_for_compounding'] = $adjust_for_compounding;

        return $this;
    }

    /**
     * Gets remove_outliers
     *
     * @return bool
     */
    public function getRemoveOutliers()
    {
        return $this->container['remove_outliers'];
    }

    /**
     * Sets remove_outliers
     *
     * @param bool $remove_outliers remove_outliers
     *
     * @return $this
     */
    public function setRemoveOutliers($remove_outliers)
    {
        $this->container['remove_outliers'] = $remove_outliers;

        return $this;
    }

    /**
     * Gets recommend_type
     *
     * @return string
     */
    public function getRecommendType()
    {
        return $this->container['recommend_type'];
    }

    /**
     * Sets recommend_type
     *
     * @param string $recommend_type recommend_type
     *
     * @return $this
     */
    public function setRecommendType($recommend_type)
    {
        $allowedValues = $this->getRecommendTypeAllowableValues();
        if (!is_null($recommend_type) && !in_array($recommend_type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'recommend_type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['recommend_type'] = $recommend_type;

        return $this;
    }

    /**
     * Gets recommendation_config
     *
     * @return object
     */
    public function getRecommendationConfig()
    {
        return $this->container['recommendation_config'];
    }

    /**
     * Sets recommendation_config
     *
     * @param object $recommendation_config recommendation_config
     *
     * @return $this
     */
    public function setRecommendationConfig($recommendation_config)
    {
        $this->container['recommendation_config'] = $recommendation_config;

        return $this;
    }

    /**
     * Gets goal_id
     *
     * @return string
     */
    public function getGoalId()
    {
        return $this->container['goal_id'];
    }

    /**
     * Sets goal_id
     *
     * @param string $goal_id goal_id
     *
     * @return $this
     */
    public function setGoalId($goal_id)
    {
        $this->container['goal_id'] = $goal_id;

        return $this;
    }

    /**
     * Gets horizon_frequency
     *
     * @return string
     */
    public function getHorizonFrequency()
    {
        return $this->container['horizon_frequency'];
    }

    /**
     * Sets horizon_frequency
     *
     * @param string $horizon_frequency horizon_frequency
     *
     * @return $this
     */
    public function setHorizonFrequency($horizon_frequency)
    {
        $allowedValues = $this->getHorizonFrequencyAllowableValues();
        if (!is_null($horizon_frequency) && !in_array($horizon_frequency, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'horizon_frequency', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['horizon_frequency'] = $horizon_frequency;

        return $this;
    }

    /**
     * Gets deposit_config
     *
     * @return object[]
     */
    public function getDepositConfig()
    {
        return $this->container['deposit_config'];
    }

    /**
     * Sets deposit_config
     *
     * @param object[] $deposit_config deposit_config
     *
     * @return $this
     */
    public function setDepositConfig($deposit_config)
    {
        $this->container['deposit_config'] = $deposit_config;

        return $this;
    }

    /**
     * Gets compounding_rate
     *
     * @return float
     */
    public function getCompoundingRate()
    {
        return $this->container['compounding_rate'];
    }

    /**
     * Sets compounding_rate
     *
     * @param float $compounding_rate compounding_rate
     *
     * @return $this
     */
    public function setCompoundingRate($compounding_rate)
    {

        if (!is_null($compounding_rate) && ($compounding_rate < -1)) {
            throw new \InvalidArgumentException('invalid value for $compounding_rate when calling GoalAccumulationRecommendationRequest., must be bigger than or equal to -1.');
        }

        $this->container['compounding_rate'] = $compounding_rate;

        return $this;
    }

    /**
     * Gets goal_config
     *
     * @return object
     */
    public function getGoalConfig()
    {
        return $this->container['goal_config'];
    }

    /**
     * Sets goal_config
     *
     * @param object $goal_config goal_config
     *
     * @return $this
     */
    public function setGoalConfig($goal_config)
    {
        $this->container['goal_config'] = $goal_config;

        return $this;
    }

    /**
     * Gets horizon
     *
     * @return int
     */
    public function getHorizon()
    {
        return $this->container['horizon'];
    }

    /**
     * Sets horizon
     *
     * @param int $horizon horizon
     *
     * @return $this
     */
    public function setHorizon($horizon)
    {

        if (!is_null($horizon) && ($horizon > 350)) {
            throw new \InvalidArgumentException('invalid value for $horizon when calling GoalAccumulationRecommendationRequest., must be smaller than or equal to 350.');
        }
        if (!is_null($horizon) && ($horizon < 0)) {
            throw new \InvalidArgumentException('invalid value for $horizon when calling GoalAccumulationRecommendationRequest., must be bigger than or equal to 0.');
        }

        $this->container['horizon'] = $horizon;

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

