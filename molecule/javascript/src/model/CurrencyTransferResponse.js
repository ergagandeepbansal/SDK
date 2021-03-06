/*
 * Molecule API Documentation
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.3.0
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
    if (!root.MoleculeApiDocumentation) {
      root.MoleculeApiDocumentation = {};
    }
    root.MoleculeApiDocumentation.CurrencyTransferResponse = factory(root.MoleculeApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The CurrencyTransferResponse model module.
   * @module model/CurrencyTransferResponse
   * @version 1.3.0
   */

  /**
   * Constructs a new <code>CurrencyTransferResponse</code>.
   * @alias module:model/CurrencyTransferResponse
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>CurrencyTransferResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CurrencyTransferResponse} obj Optional instance to populate.
   * @return {module:model/CurrencyTransferResponse} The populated <code>CurrencyTransferResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'String');
      if (data.hasOwnProperty('sender_wallet_id'))
        obj.senderWalletId = ApiClient.convertToType(data['sender_wallet_id'], 'String');
      if (data.hasOwnProperty('receiver_wallet_id'))
        obj.receiverWalletId = ApiClient.convertToType(data['receiver_wallet_id'], 'String');
      if (data.hasOwnProperty('currency_id'))
        obj.currencyId = ApiClient.convertToType(data['currency_id'], 'String');
      if (data.hasOwnProperty('amount'))
        obj.amount = ApiClient.convertToType(data['amount'], 'Number');
      if (data.hasOwnProperty('transaction_hash'))
        obj.transactionHash = ApiClient.convertToType(data['transaction_hash'], 'String');
      if (data.hasOwnProperty('is_active'))
        obj.isActive = ApiClient.convertToType(data['is_active'], 'Boolean');
      if (data.hasOwnProperty('record_status'))
        obj.recordStatus = ApiClient.convertToType(data['record_status'], 'String');
      if (data.hasOwnProperty('create_date'))
        obj.createDate = ApiClient.convertToType(data['create_date'], 'Date');
      if (data.hasOwnProperty('update_date'))
        obj.updateDate = ApiClient.convertToType(data['update_date'], 'Date');
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype.id = undefined;

  /**
   * @member {String} senderWalletId
   */
  exports.prototype.senderWalletId = undefined;

  /**
   * @member {String} receiverWalletId
   */
  exports.prototype.receiverWalletId = undefined;

  /**
   * @member {String} currencyId
   */
  exports.prototype.currencyId = undefined;

  /**
   * @member {Number} amount
   */
  exports.prototype.amount = undefined;

  /**
   * @member {String} transactionHash
   */
  exports.prototype.transactionHash = undefined;

  /**
   * @member {Boolean} isActive
   */
  exports.prototype.isActive = undefined;

  /**
   * @member {String} recordStatus
   */
  exports.prototype.recordStatus = undefined;

  /**
   * @member {Date} createDate
   */
  exports.prototype.createDate = undefined;

  /**
   * @member {Date} updateDate
   */
  exports.prototype.updateDate = undefined;

  return exports;

}));
