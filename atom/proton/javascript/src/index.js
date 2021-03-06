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

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/AccumulationGoalDepositConfig', 'model/AnnuityCalculatorAccumulationHorizonRequest', 'model/AnnuityCalculatorAnnuityAmountRequest', 'model/AnnuityCalculatorDecumulationHorizonRequest', 'model/AnnuityCalculatorDepositAmountRequest', 'model/AnnuityCalculatorInitialBalanceRequest', 'model/AnnuityDepositSchedule', 'model/BacktestRequest', 'model/BeneficiaryBequestConfig', 'model/BudgetCalculatorRequest', 'model/CalculatorDepositSchedule', 'model/CalculatorDepositSchedule1', 'model/CashFlowAnalysisRequest', 'model/ChildrenEducationConfig', 'model/DecumulationGoalDepositConfig', 'model/DimensionalRiskScoreRequest', 'model/DiversificationScoreRequest', 'model/EducationCalculatorAnnualCostRequest', 'model/EducationCalculatorDepositAmountRequest', 'model/EducationCalculatorPercentCoveredRequest', 'model/EducationConfig', 'model/EmergencyFundCalculatorRequest', 'model/EventStudyRequest', 'model/FinancialHealthCheckRequest', 'model/FinancialPictureRequest', 'model/GoalAccumulationAllocationRequest', 'model/GoalAccumulationRecommendationRequest', 'model/GoalAccumulationStatusRequest', 'model/GoalConfig', 'model/GoalDecumulationAllocationRequest', 'model/GoalDecumulationRecommendationRequest', 'model/GoalDecumulationStatusRequest', 'model/GoalWithdrawalConfig', 'model/GuaranteedRateBenefit', 'model/IncomeConfig', 'model/LifeInsuranceNeedsCalculatorRequest', 'model/MonteCarloRequest', 'model/MortgageCalculatorDownPaymentRequest', 'model/MortgageCalculatorHomePriceRequest', 'model/MortgageCalculatorPeriodicPaymentRequest', 'model/MvoRequest', 'model/OptConfig', 'model/OptConfig1', 'model/PortfolioOptimizationScoreRequest', 'model/PortfolioWhatIfRequest', 'model/PurchaseCalculatorAmountRequest', 'model/PurchaseCalculatorDepositAmountRequest', 'model/PurchaseCalculatorHorizonRequest', 'model/RatioTargets', 'model/RebalancingSignalRequest', 'model/RecommendationConfig', 'model/RecommendationConfig1', 'model/RetirementCalculatorDepositAmountRequest', 'model/RetirementCalculatorExpensesRequest', 'model/RetirementCalculatorPercentCoveredRequest', 'model/RiskAllocationRequest', 'model/RiskScoreRequest', 'model/SavingsCalculatorRequest', 'model/SavingsDepositSchedule', 'model/ScenarioAnalysisRequest', 'model/SensitivityAnalysisRequest', 'model/SensitivityFactor', 'model/Settings', 'model/VariableAnnuityRequest', 'model/WConfig', 'model/WConfig1', 'api/AnnuitiesApi', 'api/FinancialHealthApi', 'api/FinancialPlanningApi', 'api/GoalsApi', 'api/LifeInsuranceApi', 'api/PersonalFinancialManagementApi', 'api/PortfolioConstructionApi', 'api/PortfolioManagementApi', 'api/RiskScoringApi', 'api/SimulationsApi', 'api/AuthApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/AccumulationGoalDepositConfig'), require('./model/AnnuityCalculatorAccumulationHorizonRequest'), require('./model/AnnuityCalculatorAnnuityAmountRequest'), require('./model/AnnuityCalculatorDecumulationHorizonRequest'), require('./model/AnnuityCalculatorDepositAmountRequest'), require('./model/AnnuityCalculatorInitialBalanceRequest'), require('./model/AnnuityDepositSchedule'), require('./model/BacktestRequest'), require('./model/BeneficiaryBequestConfig'), require('./model/BudgetCalculatorRequest'), require('./model/CalculatorDepositSchedule'), require('./model/CalculatorDepositSchedule1'), require('./model/CashFlowAnalysisRequest'), require('./model/ChildrenEducationConfig'), require('./model/DecumulationGoalDepositConfig'), require('./model/DimensionalRiskScoreRequest'), require('./model/DiversificationScoreRequest'), require('./model/EducationCalculatorAnnualCostRequest'), require('./model/EducationCalculatorDepositAmountRequest'), require('./model/EducationCalculatorPercentCoveredRequest'), require('./model/EducationConfig'), require('./model/EmergencyFundCalculatorRequest'), require('./model/EventStudyRequest'), require('./model/FinancialHealthCheckRequest'), require('./model/FinancialPictureRequest'), require('./model/GoalAccumulationAllocationRequest'), require('./model/GoalAccumulationRecommendationRequest'), require('./model/GoalAccumulationStatusRequest'), require('./model/GoalConfig'), require('./model/GoalDecumulationAllocationRequest'), require('./model/GoalDecumulationRecommendationRequest'), require('./model/GoalDecumulationStatusRequest'), require('./model/GoalWithdrawalConfig'), require('./model/GuaranteedRateBenefit'), require('./model/IncomeConfig'), require('./model/LifeInsuranceNeedsCalculatorRequest'), require('./model/MonteCarloRequest'), require('./model/MortgageCalculatorDownPaymentRequest'), require('./model/MortgageCalculatorHomePriceRequest'), require('./model/MortgageCalculatorPeriodicPaymentRequest'), require('./model/MvoRequest'), require('./model/OptConfig'), require('./model/OptConfig1'), require('./model/PortfolioOptimizationScoreRequest'), require('./model/PortfolioWhatIfRequest'), require('./model/PurchaseCalculatorAmountRequest'), require('./model/PurchaseCalculatorDepositAmountRequest'), require('./model/PurchaseCalculatorHorizonRequest'), require('./model/RatioTargets'), require('./model/RebalancingSignalRequest'), require('./model/RecommendationConfig'), require('./model/RecommendationConfig1'), require('./model/RetirementCalculatorDepositAmountRequest'), require('./model/RetirementCalculatorExpensesRequest'), require('./model/RetirementCalculatorPercentCoveredRequest'), require('./model/RiskAllocationRequest'), require('./model/RiskScoreRequest'), require('./model/SavingsCalculatorRequest'), require('./model/SavingsDepositSchedule'), require('./model/ScenarioAnalysisRequest'), require('./model/SensitivityAnalysisRequest'), require('./model/SensitivityFactor'), require('./model/Settings'), require('./model/VariableAnnuityRequest'), require('./model/WConfig'), require('./model/WConfig1'), require('./api/AnnuitiesApi'), require('./api/FinancialHealthApi'), require('./api/FinancialPlanningApi'), require('./api/GoalsApi'), require('./api/LifeInsuranceApi'), require('./api/PersonalFinancialManagementApi'), require('./api/PortfolioConstructionApi'), require('./api/PortfolioManagementApi'), require('./api/RiskScoringApi'), require('./api/SimulationsApi'), require('./api/AuthApi'));
  }
}(function(ApiClient, AccumulationGoalDepositConfig, AnnuityCalculatorAccumulationHorizonRequest, AnnuityCalculatorAnnuityAmountRequest, AnnuityCalculatorDecumulationHorizonRequest, AnnuityCalculatorDepositAmountRequest, AnnuityCalculatorInitialBalanceRequest, AnnuityDepositSchedule, BacktestRequest, BeneficiaryBequestConfig, BudgetCalculatorRequest, CalculatorDepositSchedule, CalculatorDepositSchedule1, CashFlowAnalysisRequest, ChildrenEducationConfig, DecumulationGoalDepositConfig, DimensionalRiskScoreRequest, DiversificationScoreRequest, EducationCalculatorAnnualCostRequest, EducationCalculatorDepositAmountRequest, EducationCalculatorPercentCoveredRequest, EducationConfig, EmergencyFundCalculatorRequest, EventStudyRequest, FinancialHealthCheckRequest, FinancialPictureRequest, GoalAccumulationAllocationRequest, GoalAccumulationRecommendationRequest, GoalAccumulationStatusRequest, GoalConfig, GoalDecumulationAllocationRequest, GoalDecumulationRecommendationRequest, GoalDecumulationStatusRequest, GoalWithdrawalConfig, GuaranteedRateBenefit, IncomeConfig, LifeInsuranceNeedsCalculatorRequest, MonteCarloRequest, MortgageCalculatorDownPaymentRequest, MortgageCalculatorHomePriceRequest, MortgageCalculatorPeriodicPaymentRequest, MvoRequest, OptConfig, OptConfig1, PortfolioOptimizationScoreRequest, PortfolioWhatIfRequest, PurchaseCalculatorAmountRequest, PurchaseCalculatorDepositAmountRequest, PurchaseCalculatorHorizonRequest, RatioTargets, RebalancingSignalRequest, RecommendationConfig, RecommendationConfig1, RetirementCalculatorDepositAmountRequest, RetirementCalculatorExpensesRequest, RetirementCalculatorPercentCoveredRequest, RiskAllocationRequest, RiskScoreRequest, SavingsCalculatorRequest, SavingsDepositSchedule, ScenarioAnalysisRequest, SensitivityAnalysisRequest, SensitivityFactor, Settings, VariableAnnuityRequest, WConfig, WConfig1, AnnuitiesApi, FinancialHealthApi, FinancialPlanningApi, GoalsApi, LifeInsuranceApi, PersonalFinancialManagementApi, PortfolioConstructionApi, PortfolioManagementApi, RiskScoringApi, SimulationsApi, AuthApi) {
  'use strict';

  /**
   * Financial_engineering_module_of_Hydrogen_Atom.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var HydrogenProtonApi = require('index'); // See note below*.
   * var xxxSvc = new HydrogenProtonApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new HydrogenProtonApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new HydrogenProtonApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new HydrogenProtonApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 1.7.18
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The AccumulationGoalDepositConfig model constructor.
     * @property {module:model/AccumulationGoalDepositConfig}
     */
    AccumulationGoalDepositConfig: AccumulationGoalDepositConfig,
    /**
     * The AnnuityCalculatorAccumulationHorizonRequest model constructor.
     * @property {module:model/AnnuityCalculatorAccumulationHorizonRequest}
     */
    AnnuityCalculatorAccumulationHorizonRequest: AnnuityCalculatorAccumulationHorizonRequest,
    /**
     * The AnnuityCalculatorAnnuityAmountRequest model constructor.
     * @property {module:model/AnnuityCalculatorAnnuityAmountRequest}
     */
    AnnuityCalculatorAnnuityAmountRequest: AnnuityCalculatorAnnuityAmountRequest,
    /**
     * The AnnuityCalculatorDecumulationHorizonRequest model constructor.
     * @property {module:model/AnnuityCalculatorDecumulationHorizonRequest}
     */
    AnnuityCalculatorDecumulationHorizonRequest: AnnuityCalculatorDecumulationHorizonRequest,
    /**
     * The AnnuityCalculatorDepositAmountRequest model constructor.
     * @property {module:model/AnnuityCalculatorDepositAmountRequest}
     */
    AnnuityCalculatorDepositAmountRequest: AnnuityCalculatorDepositAmountRequest,
    /**
     * The AnnuityCalculatorInitialBalanceRequest model constructor.
     * @property {module:model/AnnuityCalculatorInitialBalanceRequest}
     */
    AnnuityCalculatorInitialBalanceRequest: AnnuityCalculatorInitialBalanceRequest,
    /**
     * The AnnuityDepositSchedule model constructor.
     * @property {module:model/AnnuityDepositSchedule}
     */
    AnnuityDepositSchedule: AnnuityDepositSchedule,
    /**
     * The BacktestRequest model constructor.
     * @property {module:model/BacktestRequest}
     */
    BacktestRequest: BacktestRequest,
    /**
     * The BeneficiaryBequestConfig model constructor.
     * @property {module:model/BeneficiaryBequestConfig}
     */
    BeneficiaryBequestConfig: BeneficiaryBequestConfig,
    /**
     * The BudgetCalculatorRequest model constructor.
     * @property {module:model/BudgetCalculatorRequest}
     */
    BudgetCalculatorRequest: BudgetCalculatorRequest,
    /**
     * The CalculatorDepositSchedule model constructor.
     * @property {module:model/CalculatorDepositSchedule}
     */
    CalculatorDepositSchedule: CalculatorDepositSchedule,
    /**
     * The CalculatorDepositSchedule1 model constructor.
     * @property {module:model/CalculatorDepositSchedule1}
     */
    CalculatorDepositSchedule1: CalculatorDepositSchedule1,
    /**
     * The CashFlowAnalysisRequest model constructor.
     * @property {module:model/CashFlowAnalysisRequest}
     */
    CashFlowAnalysisRequest: CashFlowAnalysisRequest,
    /**
     * The ChildrenEducationConfig model constructor.
     * @property {module:model/ChildrenEducationConfig}
     */
    ChildrenEducationConfig: ChildrenEducationConfig,
    /**
     * The DecumulationGoalDepositConfig model constructor.
     * @property {module:model/DecumulationGoalDepositConfig}
     */
    DecumulationGoalDepositConfig: DecumulationGoalDepositConfig,
    /**
     * The DimensionalRiskScoreRequest model constructor.
     * @property {module:model/DimensionalRiskScoreRequest}
     */
    DimensionalRiskScoreRequest: DimensionalRiskScoreRequest,
    /**
     * The DiversificationScoreRequest model constructor.
     * @property {module:model/DiversificationScoreRequest}
     */
    DiversificationScoreRequest: DiversificationScoreRequest,
    /**
     * The EducationCalculatorAnnualCostRequest model constructor.
     * @property {module:model/EducationCalculatorAnnualCostRequest}
     */
    EducationCalculatorAnnualCostRequest: EducationCalculatorAnnualCostRequest,
    /**
     * The EducationCalculatorDepositAmountRequest model constructor.
     * @property {module:model/EducationCalculatorDepositAmountRequest}
     */
    EducationCalculatorDepositAmountRequest: EducationCalculatorDepositAmountRequest,
    /**
     * The EducationCalculatorPercentCoveredRequest model constructor.
     * @property {module:model/EducationCalculatorPercentCoveredRequest}
     */
    EducationCalculatorPercentCoveredRequest: EducationCalculatorPercentCoveredRequest,
    /**
     * The EducationConfig model constructor.
     * @property {module:model/EducationConfig}
     */
    EducationConfig: EducationConfig,
    /**
     * The EmergencyFundCalculatorRequest model constructor.
     * @property {module:model/EmergencyFundCalculatorRequest}
     */
    EmergencyFundCalculatorRequest: EmergencyFundCalculatorRequest,
    /**
     * The EventStudyRequest model constructor.
     * @property {module:model/EventStudyRequest}
     */
    EventStudyRequest: EventStudyRequest,
    /**
     * The FinancialHealthCheckRequest model constructor.
     * @property {module:model/FinancialHealthCheckRequest}
     */
    FinancialHealthCheckRequest: FinancialHealthCheckRequest,
    /**
     * The FinancialPictureRequest model constructor.
     * @property {module:model/FinancialPictureRequest}
     */
    FinancialPictureRequest: FinancialPictureRequest,
    /**
     * The GoalAccumulationAllocationRequest model constructor.
     * @property {module:model/GoalAccumulationAllocationRequest}
     */
    GoalAccumulationAllocationRequest: GoalAccumulationAllocationRequest,
    /**
     * The GoalAccumulationRecommendationRequest model constructor.
     * @property {module:model/GoalAccumulationRecommendationRequest}
     */
    GoalAccumulationRecommendationRequest: GoalAccumulationRecommendationRequest,
    /**
     * The GoalAccumulationStatusRequest model constructor.
     * @property {module:model/GoalAccumulationStatusRequest}
     */
    GoalAccumulationStatusRequest: GoalAccumulationStatusRequest,
    /**
     * The GoalConfig model constructor.
     * @property {module:model/GoalConfig}
     */
    GoalConfig: GoalConfig,
    /**
     * The GoalDecumulationAllocationRequest model constructor.
     * @property {module:model/GoalDecumulationAllocationRequest}
     */
    GoalDecumulationAllocationRequest: GoalDecumulationAllocationRequest,
    /**
     * The GoalDecumulationRecommendationRequest model constructor.
     * @property {module:model/GoalDecumulationRecommendationRequest}
     */
    GoalDecumulationRecommendationRequest: GoalDecumulationRecommendationRequest,
    /**
     * The GoalDecumulationStatusRequest model constructor.
     * @property {module:model/GoalDecumulationStatusRequest}
     */
    GoalDecumulationStatusRequest: GoalDecumulationStatusRequest,
    /**
     * The GoalWithdrawalConfig model constructor.
     * @property {module:model/GoalWithdrawalConfig}
     */
    GoalWithdrawalConfig: GoalWithdrawalConfig,
    /**
     * The GuaranteedRateBenefit model constructor.
     * @property {module:model/GuaranteedRateBenefit}
     */
    GuaranteedRateBenefit: GuaranteedRateBenefit,
    /**
     * The IncomeConfig model constructor.
     * @property {module:model/IncomeConfig}
     */
    IncomeConfig: IncomeConfig,
    /**
     * The LifeInsuranceNeedsCalculatorRequest model constructor.
     * @property {module:model/LifeInsuranceNeedsCalculatorRequest}
     */
    LifeInsuranceNeedsCalculatorRequest: LifeInsuranceNeedsCalculatorRequest,
    /**
     * The MonteCarloRequest model constructor.
     * @property {module:model/MonteCarloRequest}
     */
    MonteCarloRequest: MonteCarloRequest,
    /**
     * The MortgageCalculatorDownPaymentRequest model constructor.
     * @property {module:model/MortgageCalculatorDownPaymentRequest}
     */
    MortgageCalculatorDownPaymentRequest: MortgageCalculatorDownPaymentRequest,
    /**
     * The MortgageCalculatorHomePriceRequest model constructor.
     * @property {module:model/MortgageCalculatorHomePriceRequest}
     */
    MortgageCalculatorHomePriceRequest: MortgageCalculatorHomePriceRequest,
    /**
     * The MortgageCalculatorPeriodicPaymentRequest model constructor.
     * @property {module:model/MortgageCalculatorPeriodicPaymentRequest}
     */
    MortgageCalculatorPeriodicPaymentRequest: MortgageCalculatorPeriodicPaymentRequest,
    /**
     * The MvoRequest model constructor.
     * @property {module:model/MvoRequest}
     */
    MvoRequest: MvoRequest,
    /**
     * The OptConfig model constructor.
     * @property {module:model/OptConfig}
     */
    OptConfig: OptConfig,
    /**
     * The OptConfig1 model constructor.
     * @property {module:model/OptConfig1}
     */
    OptConfig1: OptConfig1,
    /**
     * The PortfolioOptimizationScoreRequest model constructor.
     * @property {module:model/PortfolioOptimizationScoreRequest}
     */
    PortfolioOptimizationScoreRequest: PortfolioOptimizationScoreRequest,
    /**
     * The PortfolioWhatIfRequest model constructor.
     * @property {module:model/PortfolioWhatIfRequest}
     */
    PortfolioWhatIfRequest: PortfolioWhatIfRequest,
    /**
     * The PurchaseCalculatorAmountRequest model constructor.
     * @property {module:model/PurchaseCalculatorAmountRequest}
     */
    PurchaseCalculatorAmountRequest: PurchaseCalculatorAmountRequest,
    /**
     * The PurchaseCalculatorDepositAmountRequest model constructor.
     * @property {module:model/PurchaseCalculatorDepositAmountRequest}
     */
    PurchaseCalculatorDepositAmountRequest: PurchaseCalculatorDepositAmountRequest,
    /**
     * The PurchaseCalculatorHorizonRequest model constructor.
     * @property {module:model/PurchaseCalculatorHorizonRequest}
     */
    PurchaseCalculatorHorizonRequest: PurchaseCalculatorHorizonRequest,
    /**
     * The RatioTargets model constructor.
     * @property {module:model/RatioTargets}
     */
    RatioTargets: RatioTargets,
    /**
     * The RebalancingSignalRequest model constructor.
     * @property {module:model/RebalancingSignalRequest}
     */
    RebalancingSignalRequest: RebalancingSignalRequest,
    /**
     * The RecommendationConfig model constructor.
     * @property {module:model/RecommendationConfig}
     */
    RecommendationConfig: RecommendationConfig,
    /**
     * The RecommendationConfig1 model constructor.
     * @property {module:model/RecommendationConfig1}
     */
    RecommendationConfig1: RecommendationConfig1,
    /**
     * The RetirementCalculatorDepositAmountRequest model constructor.
     * @property {module:model/RetirementCalculatorDepositAmountRequest}
     */
    RetirementCalculatorDepositAmountRequest: RetirementCalculatorDepositAmountRequest,
    /**
     * The RetirementCalculatorExpensesRequest model constructor.
     * @property {module:model/RetirementCalculatorExpensesRequest}
     */
    RetirementCalculatorExpensesRequest: RetirementCalculatorExpensesRequest,
    /**
     * The RetirementCalculatorPercentCoveredRequest model constructor.
     * @property {module:model/RetirementCalculatorPercentCoveredRequest}
     */
    RetirementCalculatorPercentCoveredRequest: RetirementCalculatorPercentCoveredRequest,
    /**
     * The RiskAllocationRequest model constructor.
     * @property {module:model/RiskAllocationRequest}
     */
    RiskAllocationRequest: RiskAllocationRequest,
    /**
     * The RiskScoreRequest model constructor.
     * @property {module:model/RiskScoreRequest}
     */
    RiskScoreRequest: RiskScoreRequest,
    /**
     * The SavingsCalculatorRequest model constructor.
     * @property {module:model/SavingsCalculatorRequest}
     */
    SavingsCalculatorRequest: SavingsCalculatorRequest,
    /**
     * The SavingsDepositSchedule model constructor.
     * @property {module:model/SavingsDepositSchedule}
     */
    SavingsDepositSchedule: SavingsDepositSchedule,
    /**
     * The ScenarioAnalysisRequest model constructor.
     * @property {module:model/ScenarioAnalysisRequest}
     */
    ScenarioAnalysisRequest: ScenarioAnalysisRequest,
    /**
     * The SensitivityAnalysisRequest model constructor.
     * @property {module:model/SensitivityAnalysisRequest}
     */
    SensitivityAnalysisRequest: SensitivityAnalysisRequest,
    /**
     * The SensitivityFactor model constructor.
     * @property {module:model/SensitivityFactor}
     */
    SensitivityFactor: SensitivityFactor,
    /**
     * The Settings model constructor.
     * @property {module:model/Settings}
     */
    Settings: Settings,
    /**
     * The VariableAnnuityRequest model constructor.
     * @property {module:model/VariableAnnuityRequest}
     */
    VariableAnnuityRequest: VariableAnnuityRequest,
    /**
     * The WConfig model constructor.
     * @property {module:model/WConfig}
     */
    WConfig: WConfig,
    /**
     * The WConfig1 model constructor.
     * @property {module:model/WConfig1}
     */
    WConfig1: WConfig1,
    /**
     * The AnnuitiesApi service constructor.
     * @property {module:api/AnnuitiesApi}
     */
    AnnuitiesApi: AnnuitiesApi,
    /**
     * The FinancialHealthApi service constructor.
     * @property {module:api/FinancialHealthApi}
     */
    FinancialHealthApi: FinancialHealthApi,
    /**
     * The FinancialPlanningApi service constructor.
     * @property {module:api/FinancialPlanningApi}
     */
    FinancialPlanningApi: FinancialPlanningApi,
    /**
     * The GoalsApi service constructor.
     * @property {module:api/GoalsApi}
     */
    GoalsApi: GoalsApi,
    /**
     * The LifeInsuranceApi service constructor.
     * @property {module:api/LifeInsuranceApi}
     */
    LifeInsuranceApi: LifeInsuranceApi,
    /**
     * The PersonalFinancialManagementApi service constructor.
     * @property {module:api/PersonalFinancialManagementApi}
     */
    PersonalFinancialManagementApi: PersonalFinancialManagementApi,
    /**
     * The PortfolioConstructionApi service constructor.
     * @property {module:api/PortfolioConstructionApi}
     */
    PortfolioConstructionApi: PortfolioConstructionApi,
    /**
     * The PortfolioManagementApi service constructor.
     * @property {module:api/PortfolioManagementApi}
     */
    PortfolioManagementApi: PortfolioManagementApi,
    /**
     * The RiskScoringApi service constructor.
     * @property {module:api/RiskScoringApi}
     */
    RiskScoringApi: RiskScoringApi,
    /**
     * The SimulationsApi service constructor.
     * @property {module:api/SimulationsApi}
     */
    SimulationsApi: SimulationsApi,
    /**
     * The AuthApi service constructor.
     * @property {module:api/AuthApi}
     */
    AuthApi: AuthApi
  };

  return exports;
}));
