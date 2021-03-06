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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.HydrogenProtonApi);
  }
}(this, function(expect, HydrogenProtonApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HydrogenProtonApi.FinancialHealthApi();
  });

  describe('(package)', function() {
    describe('FinancialHealthApi', function() {
      describe('diversificationScore', function() {
        it('should call diversificationScore successfully', function(done) {
          // TODO: uncomment, update parameter values for diversificationScore call and complete the assertions
          /*
          var diversificationScoreRequest = new HydrogenProtonApi.DiversificationScoreRequest();
          diversificationScoreRequest.useProxyData = false;
          diversificationScoreRequest.startDate = new Date();
          diversificationScoreRequest.portfolioTickers = [""];
          diversificationScoreRequest.endDate = new Date();
          diversificationScoreRequest.modelId = """00000000-0000-0000-0000-000000000000";
          diversificationScoreRequest.allocationId = """00000000-0000-0000-0000-000000000000";
          diversificationScoreRequest.accountId = """00000000-0000-0000-0000-000000000000";
          diversificationScoreRequest.portfolioId = """00000000-0000-0000-0000-000000000000";
          diversificationScoreRequest.portfolioWeights = [0.0];
          diversificationScoreRequest.aggregationAccountId = """00000000-0000-0000-0000-000000000000";
          diversificationScoreRequest.marketDataSource = "nucleus";

          instance.diversificationScore(diversificationScoreRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('emergencyFundCalculator', function() {
        it('should call emergencyFundCalculator successfully', function(done) {
          // TODO: uncomment, update parameter values for emergencyFundCalculator call and complete the assertions
          /*
          var emergencyFundCalculatorRequest = new HydrogenProtonApi.EmergencyFundCalculatorRequest();
          emergencyFundCalculatorRequest.telecomPayments = 0.0;
          emergencyFundCalculatorRequest.frequencyUnit = "year";
          emergencyFundCalculatorRequest.debtPayments = 0.0;
          emergencyFundCalculatorRequest.lookbackPeriods = 0;
          emergencyFundCalculatorRequest.emergencyFundDuration = 0;
          emergencyFundCalculatorRequest.housingCost = 0.0;
          emergencyFundCalculatorRequest.insurancePayments = 0.0;
          emergencyFundCalculatorRequest.interestRate = 0.0;
          emergencyFundCalculatorRequest.otherExpenses = ;
          emergencyFundCalculatorRequest.clientId = """00000000-0000-0000-0000-000000000000";
          emergencyFundCalculatorRequest.currentEmergencyFundBalance = 0.0;
          emergencyFundCalculatorRequest.aggregationAccountIds = ["""00000000-0000-0000-0000-000000000000"];
          emergencyFundCalculatorRequest.accountIds = ["""00000000-0000-0000-0000-000000000000"];
          emergencyFundCalculatorRequest.utilityPayments = 0.0;
          emergencyFundCalculatorRequest.savingsHorizon = [0];
          emergencyFundCalculatorRequest.foodCosts = 0.0;
          emergencyFundCalculatorRequest.transportationCosts = 0.0;

          instance.emergencyFundCalculator(emergencyFundCalculatorRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('financialHealthCheck', function() {
        it('should call financialHealthCheck successfully', function(done) {
          // TODO: uncomment, update parameter values for financialHealthCheck call and complete the assertions
          /*
          var financialHealthCheckRequest = new HydrogenProtonApi.FinancialHealthCheckRequest();
          financialHealthCheckRequest.lookbackPeriods = 0;
          financialHealthCheckRequest.grossAnnualIncome = 0.0;
          financialHealthCheckRequest.ratioTargets = ;
          financialHealthCheckRequest.liquidAssets = 0.0;
          financialHealthCheckRequest.clientId = """00000000-0000-0000-0000-000000000000";
          financialHealthCheckRequest.netMonthlyIncome = 0.0;
          financialHealthCheckRequest.totalLiabilities = 0.0;
          financialHealthCheckRequest.nonLiquidAssets = 0.0;
          financialHealthCheckRequest.shortTermLiabilities = 0.0;
          financialHealthCheckRequest.monthlyExpenses = 0.0;

          instance.financialHealthCheck(financialHealthCheckRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('portfolioOptimizationScore', function() {
        it('should call portfolioOptimizationScore successfully', function(done) {
          // TODO: uncomment, update parameter values for portfolioOptimizationScore call and complete the assertions
          /*
          var portfolioOptimizationScoreRequest = new HydrogenProtonApi.PortfolioOptimizationScoreRequest();
          portfolioOptimizationScoreRequest.useProxyData = false;
          portfolioOptimizationScoreRequest.startDate = new Date();
          portfolioOptimizationScoreRequest.portfolioTickers = [""];
          portfolioOptimizationScoreRequest.endDate = new Date();
          portfolioOptimizationScoreRequest.modelId = """00000000-0000-0000-0000-000000000000";
          portfolioOptimizationScoreRequest.allocationId = """00000000-0000-0000-0000-000000000000";
          portfolioOptimizationScoreRequest.accountId = """00000000-0000-0000-0000-000000000000";
          portfolioOptimizationScoreRequest.portfolioId = """00000000-0000-0000-0000-000000000000";
          portfolioOptimizationScoreRequest.portfolioWeights = [0.0];
          portfolioOptimizationScoreRequest.tgtType = "risk";
          portfolioOptimizationScoreRequest.aggregationAccountId = """00000000-0000-0000-0000-000000000000";
          portfolioOptimizationScoreRequest.optConfig = ;
          portfolioOptimizationScoreRequest.marketDataSource = "nucleus";

          instance.portfolioOptimizationScore(portfolioOptimizationScoreRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
