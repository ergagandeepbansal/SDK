/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.7.18
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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.FinancialHealthCheckRequest = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The FinancialHealthCheckRequest model module.
   * @module model/FinancialHealthCheckRequest
   * @version 1.7.18
   */

  /**
   * Constructs a new <code>FinancialHealthCheckRequest</code>.
   * @alias module:model/FinancialHealthCheckRequest
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>FinancialHealthCheckRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FinancialHealthCheckRequest} obj Optional instance to populate.
   * @return {module:model/FinancialHealthCheckRequest} The populated <code>FinancialHealthCheckRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('lookback_periods'))
        obj.lookbackPeriods = ApiClient.convertToType(data['lookback_periods'], 'Number');
      if (data.hasOwnProperty('gross_annual_income'))
        obj.grossAnnualIncome = ApiClient.convertToType(data['gross_annual_income'], 'Number');
      if (data.hasOwnProperty('ratio_targets'))
        obj.ratioTargets = ApiClient.convertToType(data['ratio_targets'], Object);
      if (data.hasOwnProperty('liquid_assets'))
        obj.liquidAssets = ApiClient.convertToType(data['liquid_assets'], 'Number');
      if (data.hasOwnProperty('client_id'))
        obj.clientId = ApiClient.convertToType(data['client_id'], 'String');
      if (data.hasOwnProperty('net_monthly_income'))
        obj.netMonthlyIncome = ApiClient.convertToType(data['net_monthly_income'], 'Number');
      if (data.hasOwnProperty('total_liabilities'))
        obj.totalLiabilities = ApiClient.convertToType(data['total_liabilities'], 'Number');
      if (data.hasOwnProperty('non_liquid_assets'))
        obj.nonLiquidAssets = ApiClient.convertToType(data['non_liquid_assets'], 'Number');
      if (data.hasOwnProperty('short_term_liabilities'))
        obj.shortTermLiabilities = ApiClient.convertToType(data['short_term_liabilities'], 'Number');
      if (data.hasOwnProperty('monthly_expenses'))
        obj.monthlyExpenses = ApiClient.convertToType(data['monthly_expenses'], 'Number');
    }
    return obj;
  }

  /**
   * @member {Number} lookbackPeriods
   * @default 3
   */
  exports.prototype.lookbackPeriods = 3;

  /**
   * @member {Number} grossAnnualIncome
   */
  exports.prototype.grossAnnualIncome = undefined;

  /**
   * @member {Object} ratioTargets
   */
  exports.prototype.ratioTargets = undefined;

  /**
   * @member {Number} liquidAssets
   */
  exports.prototype.liquidAssets = undefined;

  /**
   * @member {String} clientId
   */
  exports.prototype.clientId = undefined;

  /**
   * @member {Number} netMonthlyIncome
   */
  exports.prototype.netMonthlyIncome = undefined;

  /**
   * @member {Number} totalLiabilities
   */
  exports.prototype.totalLiabilities = undefined;

  /**
   * @member {Number} nonLiquidAssets
   */
  exports.prototype.nonLiquidAssets = undefined;

  /**
   * @member {Number} shortTermLiabilities
   */
  exports.prototype.shortTermLiabilities = undefined;

  /**
   * @member {Number} monthlyExpenses
   */
  exports.prototype.monthlyExpenses = undefined;

  return exports;

}));
