/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.7.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/AccountAdvisorVO', 'model/ClientAdvisorOverviewVO'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AccountAdvisorVO'), require('./ClientAdvisorOverviewVO'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.AdvisorOverviewVO = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.AccountAdvisorVO, root.HydrogenNucleusApi.ClientAdvisorOverviewVO);
  }
}(this, function(ApiClient, AccountAdvisorVO, ClientAdvisorOverviewVO) {
  'use strict';




  /**
   * The AdvisorOverviewVO model module.
   * @module model/AdvisorOverviewVO
   * @version 1.7.0
   */

  /**
   * Constructs a new <code>AdvisorOverviewVO</code>.
   * @alias module:model/AdvisorOverviewVO
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>AdvisorOverviewVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdvisorOverviewVO} obj Optional instance to populate.
   * @return {module:model/AdvisorOverviewVO} The populated <code>AdvisorOverviewVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('account_list')) {
        obj['account_list'] = ApiClient.convertToType(data['account_list'], [AccountAdvisorVO]);
      }
      if (data.hasOwnProperty('client_list')) {
        obj['client_list'] = ApiClient.convertToType(data['client_list'], [ClientAdvisorOverviewVO]);
      }
      if (data.hasOwnProperty('total_accounts_managed')) {
        obj['total_accounts_managed'] = ApiClient.convertToType(data['total_accounts_managed'], 'Number');
      }
      if (data.hasOwnProperty('total_assets_managed')) {
        obj['total_assets_managed'] = ApiClient.convertToType(data['total_assets_managed'], 'Number');
      }
      if (data.hasOwnProperty('total_clients_managed')) {
        obj['total_clients_managed'] = ApiClient.convertToType(data['total_clients_managed'], 'Number');
      }
    }
    return obj;
  }

  /**
   * @member {Array.<module:model/AccountAdvisorVO>} account_list
   */
  exports.prototype['account_list'] = undefined;
  /**
   * @member {Array.<module:model/ClientAdvisorOverviewVO>} client_list
   */
  exports.prototype['client_list'] = undefined;
  /**
   * @member {Number} total_accounts_managed
   */
  exports.prototype['total_accounts_managed'] = undefined;
  /**
   * @member {Number} total_assets_managed
   */
  exports.prototype['total_assets_managed'] = undefined;
  /**
   * @member {Number} total_clients_managed
   */
  exports.prototype['total_clients_managed'] = undefined;



  return exports;
}));


