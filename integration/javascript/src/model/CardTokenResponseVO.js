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
    define(['ApiClient', 'model/ApplePayload', 'model/GooglePayload', 'model/SamsungPayload'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ApplePayload'), require('./GooglePayload'), require('./SamsungPayload'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.CardTokenResponseVO = factory(root.HydrogenIntegrationApi.ApiClient, root.HydrogenIntegrationApi.ApplePayload, root.HydrogenIntegrationApi.GooglePayload, root.HydrogenIntegrationApi.SamsungPayload);
  }
}(this, function(ApiClient, ApplePayload, GooglePayload, SamsungPayload) {
  'use strict';

  /**
   * The CardTokenResponseVO model module.
   * @module model/CardTokenResponseVO
   * @version 1.2.1
   */

  /**
   * Constructs a new <code>CardTokenResponseVO</code>.
   * @alias module:model/CardTokenResponseVO
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>CardTokenResponseVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CardTokenResponseVO} obj Optional instance to populate.
   * @return {module:model/CardTokenResponseVO} The populated <code>CardTokenResponseVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('apple_payload'))
        obj.applePayload = ApplePayload.constructFromObject(data['apple_payload']);
      if (data.hasOwnProperty('card_status'))
        obj.cardStatus = ApiClient.convertToType(data['card_status'], 'String');
      if (data.hasOwnProperty('google_payload'))
        obj.googlePayload = GooglePayload.constructFromObject(data['google_payload']);
      if (data.hasOwnProperty('message'))
        obj.message = ApiClient.convertToType(data['message'], 'String');
      if (data.hasOwnProperty('nucleus_card_id'))
        obj.nucleusCardId = ApiClient.convertToType(data['nucleus_card_id'], 'String');
      if (data.hasOwnProperty('samsung_payload'))
        obj.samsungPayload = SamsungPayload.constructFromObject(data['samsung_payload']);
      if (data.hasOwnProperty('vendor_name'))
        obj.vendorName = ApiClient.convertToType(data['vendor_name'], 'String');
      if (data.hasOwnProperty('vendor_response'))
        obj.vendorResponse = ApiClient.convertToType(data['vendor_response'], Object);
      if (data.hasOwnProperty('wallet'))
        obj.wallet = ApiClient.convertToType(data['wallet'], 'String');
    }
    return obj;
  }

  /**
   * @member {module:model/ApplePayload} applePayload
   */
  exports.prototype.applePayload = undefined;

  /**
   * @member {String} cardStatus
   */
  exports.prototype.cardStatus = undefined;

  /**
   * @member {module:model/GooglePayload} googlePayload
   */
  exports.prototype.googlePayload = undefined;

  /**
   * @member {String} message
   */
  exports.prototype.message = undefined;

  /**
   * @member {String} nucleusCardId
   */
  exports.prototype.nucleusCardId = undefined;

  /**
   * @member {module:model/SamsungPayload} samsungPayload
   */
  exports.prototype.samsungPayload = undefined;

  /**
   * @member {String} vendorName
   */
  exports.prototype.vendorName = undefined;

  /**
   * @member {Object} vendorResponse
   */
  exports.prototype.vendorResponse = undefined;

  /**
   * @member {module:model/CardTokenResponseVO.WalletEnum} wallet
   */
  exports.prototype.wallet = undefined;


  /**
   * Allowed values for the <code>wallet</code> property.
   * @enum {String}
   * @readonly
   */
  exports.WalletEnum = {
    /**
     * value: "apple"
     * @const
     */
    apple: "apple",

    /**
     * value: "google"
     * @const
     */
    google: "google",

    /**
     * value: "samsung"
     * @const
     */
    samsung: "samsung"
  };

  return exports;

}));
