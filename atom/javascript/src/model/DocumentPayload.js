/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.2-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.DocumentPayload = factory(root.atom_api.ApiClient, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, SecondaryId) {
  'use strict';




  /**
   * The DocumentPayload model module.
   * @module model/DocumentPayload
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>DocumentPayload</code>.
   * @alias module:model/DocumentPayload
   * @class
   * @param docSize {Number} Size of the document. Must be a whole number
   */
  var exports = function(docSize) {
    var _this = this;

    _this['doc_size'] = docSize;








  };

  /**
   * Constructs a <code>DocumentPayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DocumentPayload} obj Optional instance to populate.
   * @return {module:model/DocumentPayload} The populated <code>DocumentPayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('doc_size')) {
        obj['doc_size'] = ApiClient.convertToType(data['doc_size'], 'Number');
      }
      if (data.hasOwnProperty('doc_name')) {
        obj['doc_name'] = ApiClient.convertToType(data['doc_name'], 'String');
      }
      if (data.hasOwnProperty('doc_type')) {
        obj['doc_type'] = ApiClient.convertToType(data['doc_type'], 'String');
      }
      if (data.hasOwnProperty('doc_file')) {
        obj['doc_file'] = ApiClient.convertToType(data['doc_file'], 'String');
      }
      if (data.hasOwnProperty('url_path')) {
        obj['url_path'] = ApiClient.convertToType(data['url_path'], 'String');
      }
      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('account_id')) {
        obj['account_id'] = ApiClient.convertToType(data['account_id'], 'String');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], Object);
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = SecondaryId.constructFromObject(data['secondary_id']);
      }
    }
    return obj;
  }

  /**
   * Size of the document. Must be a whole number
   * @member {Number} doc_size
   */
  exports.prototype['doc_size'] = undefined;
  /**
   * Name or title of the document
   * @member {String} doc_name
   */
  exports.prototype['doc_name'] = undefined;
  /**
   * Type of document such as “Compliance” or “Registration”
   * @member {String} doc_type
   */
  exports.prototype['doc_type'] = undefined;
  /**
   * File path or content for the document
   * @member {String} doc_file
   */
  exports.prototype['doc_file'] = undefined;
  /**
   * URL path for the document such as http://domain.com/sample.pdf
   * @member {String} url_path
   */
  exports.prototype['url_path'] = undefined;
  /**
   * In the case that the document relates to a specific Client, the ID of the client
   * @member {String} client_id
   */
  exports.prototype['client_id'] = undefined;
  /**
   * In the case that the document relates to a specific Account, the ID of the account
   * @member {String} account_id
   */
  exports.prototype['account_id'] = undefined;
  /**
   * Custom information associated with the document in the format key:value
   * @member {Object} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * @member {module:model/SecondaryId} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;



  return exports;
}));

