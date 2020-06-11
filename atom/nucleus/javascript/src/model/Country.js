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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenAtomApi) {
      root.HydrogenAtomApi = {};
    }
    root.HydrogenAtomApi.Country = factory(root.HydrogenAtomApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Country model module.
   * @module model/Country
   * @version 1.7.0
   */

  /**
   * Constructs a new <code>Country</code>.
   * Country Object
   * @alias module:model/Country
   * @class
   * @param alpha2Code {String} alpha_2_code
   * @param country {String} country
   */
  var exports = function(alpha2Code, country) {
    var _this = this;

    _this['alpha2_code'] = alpha2Code;

    _this['country'] = country;


  };

  /**
   * Constructs a <code>Country</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Country} obj Optional instance to populate.
   * @return {module:model/Country} The populated <code>Country</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('alpha2_code')) {
        obj['alpha2_code'] = ApiClient.convertToType(data['alpha2_code'], 'String');
      }
      if (data.hasOwnProperty('alpha3_code')) {
        obj['alpha3_code'] = ApiClient.convertToType(data['alpha3_code'], 'String');
      }
      if (data.hasOwnProperty('country')) {
        obj['country'] = ApiClient.convertToType(data['country'], 'String');
      }
      if (data.hasOwnProperty('latitude')) {
        obj['latitude'] = ApiClient.convertToType(data['latitude'], 'Number');
      }
      if (data.hasOwnProperty('longitude')) {
        obj['longitude'] = ApiClient.convertToType(data['longitude'], 'Number');
      }
    }
    return obj;
  }

  /**
   * alpha_2_code
   * @member {String} alpha2_code
   */
  exports.prototype['alpha2_code'] = undefined;
  /**
   * alpha_3_code
   * @member {String} alpha3_code
   */
  exports.prototype['alpha3_code'] = undefined;
  /**
   * country
   * @member {String} country
   */
  exports.prototype['country'] = undefined;
  /**
   * latitude
   * @member {Number} latitude
   */
  exports.prototype['latitude'] = undefined;
  /**
   * longitude
   * @member {Number} longitude
   */
  exports.prototype['longitude'] = undefined;



  return exports;
}));

