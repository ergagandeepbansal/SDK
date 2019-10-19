/**
 * Hydrogen Molecule API
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.8-SNAPSHOT
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
    if (!root.molecule_api) {
      root.molecule_api = {};
    }
    root.molecule_api.WalletCreateWhitelist = factory(root.molecule_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The WalletCreateWhitelist model module.
   * @module model/WalletCreateWhitelist
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>WalletCreateWhitelist</code>.
   * @alias module:model/WalletCreateWhitelist
   * @class
   * @param tokenId {String} The ID of the token whitelisted
   */
  var exports = function(tokenId) {
    var _this = this;

    _this['token_id'] = tokenId;



  };

  /**
   * Constructs a <code>WalletCreateWhitelist</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WalletCreateWhitelist} obj Optional instance to populate.
   * @return {module:model/WalletCreateWhitelist} The populated <code>WalletCreateWhitelist</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('token_id')) {
        obj['token_id'] = ApiClient.convertToType(data['token_id'], 'String');
      }
      if (data.hasOwnProperty('role')) {
        obj['role'] = ApiClient.convertToType(data['role'], 'String');
      }
      if (data.hasOwnProperty('sell_restriction')) {
        obj['sell_restriction'] = ApiClient.convertToType(data['sell_restriction'], 'String');
      }
      if (data.hasOwnProperty('buy_restriction')) {
        obj['buy_restriction'] = ApiClient.convertToType(data['buy_restriction'], 'String');
      }
    }
    return obj;
  }

  /**
   * The ID of the token whitelisted
   * @member {String} token_id
   */
  exports.prototype['token_id'] = undefined;
  /**
   * The role of the wallet over the token
   * @member {String} role
   */
  exports.prototype['role'] = undefined;
  /**
   * The date when resale restrictions should be lifted for the wallet
   * @member {String} sell_restriction
   */
  exports.prototype['sell_restriction'] = undefined;
  /**
   * The date when the buy restrictions should be lifted for the wallet
   * @member {String} buy_restriction
   */
  exports.prototype['buy_restriction'] = undefined;



  return exports;
}));

