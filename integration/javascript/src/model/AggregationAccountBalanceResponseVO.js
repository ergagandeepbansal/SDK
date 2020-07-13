/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.14
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/AggregationAccountBalance'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AggregationAccountBalance'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.AggregationAccountBalanceResponseVO = factory(root.HydrogenIntegrationApi.ApiClient, root.HydrogenIntegrationApi.AggregationAccountBalance);
  }
}(this, function(ApiClient, AggregationAccountBalance) {
  'use strict';

  /**
   * The AggregationAccountBalanceResponseVO model module.
   * @module model/AggregationAccountBalanceResponseVO
   * @version 1.2.1
   */

  /**
   * Constructs a new <code>AggregationAccountBalanceResponseVO</code>.
   * @alias module:model/AggregationAccountBalanceResponseVO
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>AggregationAccountBalanceResponseVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AggregationAccountBalanceResponseVO} obj Optional instance to populate.
   * @return {module:model/AggregationAccountBalanceResponseVO} The populated <code>AggregationAccountBalanceResponseVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('message'))
        obj.message = ApiClient.convertToType(data['message'], 'String');
      if (data.hasOwnProperty('nucleus_aggregation_account_id'))
        obj.nucleusAggregationAccountId = ApiClient.convertToType(data['nucleus_aggregation_account_id'], 'String');
      if (data.hasOwnProperty('nucleus_balance_posted'))
        obj.nucleusBalancePosted = AggregationAccountBalance.constructFromObject(data['nucleus_balance_posted']);
      if (data.hasOwnProperty('vendor_name'))
        obj.vendorName = ApiClient.convertToType(data['vendor_name'], 'String');
    }
    return obj;
  }

  /**
   * @member {String} message
   */
  exports.prototype.message = undefined;

  /**
   * @member {String} nucleusAggregationAccountId
   */
  exports.prototype.nucleusAggregationAccountId = undefined;

  /**
   * @member {module:model/AggregationAccountBalance} nucleusBalancePosted
   */
  exports.prototype.nucleusBalancePosted = undefined;

  /**
   * @member {String} vendorName
   */
  exports.prototype.vendorName = undefined;

  return exports;

}));