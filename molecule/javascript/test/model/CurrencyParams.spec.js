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
    describe('CurrencyParams', function() {
      beforeEach(function() {
        instance = new MoleculeApiDocumentation.CurrencyParams();
      });

      it('should create an instance of CurrencyParams', function() {
        // TODO: update the code to test CurrencyParams
        expect(instance).to.be.a(MoleculeApiDocumentation.CurrencyParams);
      });

      it('should have the property address (base name: "address")', function() {
        // TODO: update the code to test the property address
        expect(instance).to.have.property('address');
        // expect(instance.address).to.be(expectedValueLiteral);
      });

      it('should have the property logo (base name: "logo")', function() {
        // TODO: update the code to test the property logo
        expect(instance).to.have.property('logo');
        // expect(instance.logo).to.be(expectedValueLiteral);
      });

    });
  });

}));
