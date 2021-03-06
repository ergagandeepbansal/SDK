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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.MoleculeApiDocumentation);
  }
}(this, function(expect, MoleculeApiDocumentation) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('WalletResponse', function() {
      beforeEach(function() {
        instance = new MoleculeApiDocumentation.WalletResponse();
      });

      it('should create an instance of WalletResponse', function() {
        // TODO: update the code to test WalletResponse
        expect(instance).to.be.a(MoleculeApiDocumentation.WalletResponse);
      });

      it('should have the property id (base name: "id")', function() {
        // TODO: update the code to test the property id
        expect(instance).to.have.property('id');
        // expect(instance.id).to.be(expectedValueLiteral);
      });

      it('should have the property walletKeyId (base name: "wallet_key_id")', function() {
        // TODO: update the code to test the property walletKeyId
        expect(instance).to.have.property('walletKeyId');
        // expect(instance.walletKeyId).to.be(expectedValueLiteral);
      });

      it('should have the property name (base name: "name")', function() {
        // TODO: update the code to test the property name
        expect(instance).to.have.property('name');
        // expect(instance.name).to.be(expectedValueLiteral);
      });

      it('should have the property type (base name: "type")', function() {
        // TODO: update the code to test the property type
        expect(instance).to.have.property('type');
        // expect(instance.type).to.be(expectedValueLiteral);
      });

      it('should have the property isActive (base name: "is_active")', function() {
        // TODO: update the code to test the property isActive
        expect(instance).to.have.property('isActive');
        // expect(instance.isActive).to.be(expectedValueLiteral);
      });

      it('should have the property secondaryId (base name: "secondary_id")', function() {
        // TODO: update the code to test the property secondaryId
        expect(instance).to.have.property('secondaryId');
        // expect(instance.secondaryId).to.be(expectedValueLiteral);
      });

      it('should have the property recordStatus (base name: "record_status")', function() {
        // TODO: update the code to test the property recordStatus
        expect(instance).to.have.property('recordStatus');
        // expect(instance.recordStatus).to.be(expectedValueLiteral);
      });

      it('should have the property createDate (base name: "create_date")', function() {
        // TODO: update the code to test the property createDate
        expect(instance).to.have.property('createDate');
        // expect(instance.createDate).to.be(expectedValueLiteral);
      });

      it('should have the property updateDate (base name: "update_date")', function() {
        // TODO: update the code to test the property updateDate
        expect(instance).to.have.property('updateDate');
        // expect(instance.updateDate).to.be(expectedValueLiteral);
      });

      it('should have the property clients (base name: "clients")', function() {
        // TODO: update the code to test the property clients
        expect(instance).to.have.property('clients');
        // expect(instance.clients).to.be(expectedValueLiteral);
      });

      it('should have the property metadata (base name: "metadata")', function() {
        // TODO: update the code to test the property metadata
        expect(instance).to.have.property('metadata');
        // expect(instance.metadata).to.be(expectedValueLiteral);
      });

      it('should have the property tokenWhitelists (base name: "token_whitelists")', function() {
        // TODO: update the code to test the property tokenWhitelists
        expect(instance).to.have.property('tokenWhitelists');
        // expect(instance.tokenWhitelists).to.be(expectedValueLiteral);
      });

    });
  });

}));
