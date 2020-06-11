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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.HydrogenAtomApi);
  }
}(this, function(expect, HydrogenAtomApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HydrogenAtomApi.GoalTrack();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('GoalTrack', function() {
    it('should create an instance of GoalTrack', function() {
      // uncomment below and update the code to test GoalTrack
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be.a(HydrogenAtomApi.GoalTrack);
    });

    it('should have the property accounts (base name: "accounts")', function() {
      // uncomment below and update the code to test the property accounts
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property accumulationHorizon (base name: "accumulation_horizon")', function() {
      // uncomment below and update the code to test the property accumulationHorizon
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property clientId (base name: "client_id")', function() {
      // uncomment below and update the code to test the property clientId
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property currentInvestment (base name: "current_investment")', function() {
      // uncomment below and update the code to test the property currentInvestment
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property decumulationHorizon (base name: "decumulation_horizon")', function() {
      // uncomment below and update the code to test the property decumulationHorizon
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property goalAchievementScore (base name: "goal_achievement_score")', function() {
      // uncomment below and update the code to test the property goalAchievementScore
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property goalAmount (base name: "goal_amount")', function() {
      // uncomment below and update the code to test the property goalAmount
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property goalId (base name: "goal_id")', function() {
      // uncomment below and update the code to test the property goalId
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property goalProbability (base name: "goal_probability")', function() {
      // uncomment below and update the code to test the property goalProbability
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property onTrack (base name: "on_track")', function() {
      // uncomment below and update the code to test the property onTrack
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property progress (base name: "progress")', function() {
      // uncomment below and update the code to test the property progress
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property projectionBalance (base name: "projection_balance")', function() {
      // uncomment below and update the code to test the property projectionBalance
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property projectionDate (base name: "projection_date")', function() {
      // uncomment below and update the code to test the property projectionDate
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property statusTimeStamp (base name: "status_time_stamp")', function() {
      // uncomment below and update the code to test the property statusTimeStamp
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenAtomApi.GoalTrack();
      //expect(instance).to.be();
    });

  });

}));