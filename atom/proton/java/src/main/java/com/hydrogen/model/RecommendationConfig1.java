/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.7.18
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * RecommendationConfig1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-29T05:03:35.524Z")
public class RecommendationConfig1 {
  @SerializedName("recommended_inflation")
  private Float recommendedInflation = 0.0f;

  @SerializedName("inv_min")
  private BigDecimal invMin = null;

  @SerializedName("inv_max")
  private BigDecimal invMax = null;

  @SerializedName("dep_min")
  private BigDecimal depMin = null;

  @SerializedName("horizon_min")
  private Integer horizonMin = 1;

  @SerializedName("dep_max")
  private BigDecimal depMax = null;

  @SerializedName("horizon_max")
  private Integer horizonMax = 64;

  public RecommendationConfig1 recommendedInflation(Float recommendedInflation) {
    this.recommendedInflation = recommendedInflation;
    return this;
  }

   /**
   * Get recommendedInflation
   * minimum: -1
   * @return recommendedInflation
  **/
  @ApiModelProperty(value = "")
  public Float getRecommendedInflation() {
    return recommendedInflation;
  }

  public void setRecommendedInflation(Float recommendedInflation) {
    this.recommendedInflation = recommendedInflation;
  }

  public RecommendationConfig1 invMin(BigDecimal invMin) {
    this.invMin = invMin;
    return this;
  }

   /**
   * Get invMin
   * minimum: 0
   * @return invMin
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getInvMin() {
    return invMin;
  }

  public void setInvMin(BigDecimal invMin) {
    this.invMin = invMin;
  }

  public RecommendationConfig1 invMax(BigDecimal invMax) {
    this.invMax = invMax;
    return this;
  }

   /**
   * Get invMax
   * minimum: 0
   * @return invMax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getInvMax() {
    return invMax;
  }

  public void setInvMax(BigDecimal invMax) {
    this.invMax = invMax;
  }

  public RecommendationConfig1 depMin(BigDecimal depMin) {
    this.depMin = depMin;
    return this;
  }

   /**
   * Get depMin
   * minimum: 0
   * @return depMin
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDepMin() {
    return depMin;
  }

  public void setDepMin(BigDecimal depMin) {
    this.depMin = depMin;
  }

  public RecommendationConfig1 horizonMin(Integer horizonMin) {
    this.horizonMin = horizonMin;
    return this;
  }

   /**
   * Get horizonMin
   * minimum: 0
   * @return horizonMin
  **/
  @ApiModelProperty(value = "")
  public Integer getHorizonMin() {
    return horizonMin;
  }

  public void setHorizonMin(Integer horizonMin) {
    this.horizonMin = horizonMin;
  }

  public RecommendationConfig1 depMax(BigDecimal depMax) {
    this.depMax = depMax;
    return this;
  }

   /**
   * Get depMax
   * minimum: 0
   * @return depMax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDepMax() {
    return depMax;
  }

  public void setDepMax(BigDecimal depMax) {
    this.depMax = depMax;
  }

  public RecommendationConfig1 horizonMax(Integer horizonMax) {
    this.horizonMax = horizonMax;
    return this;
  }

   /**
   * Get horizonMax
   * minimum: 0
   * @return horizonMax
  **/
  @ApiModelProperty(value = "")
  public Integer getHorizonMax() {
    return horizonMax;
  }

  public void setHorizonMax(Integer horizonMax) {
    this.horizonMax = horizonMax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationConfig1 recommendationConfig1 = (RecommendationConfig1) o;
    return Objects.equals(this.recommendedInflation, recommendationConfig1.recommendedInflation) &&
        Objects.equals(this.invMin, recommendationConfig1.invMin) &&
        Objects.equals(this.invMax, recommendationConfig1.invMax) &&
        Objects.equals(this.depMin, recommendationConfig1.depMin) &&
        Objects.equals(this.horizonMin, recommendationConfig1.horizonMin) &&
        Objects.equals(this.depMax, recommendationConfig1.depMax) &&
        Objects.equals(this.horizonMax, recommendationConfig1.horizonMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendedInflation, invMin, invMax, depMin, horizonMin, depMax, horizonMax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationConfig1 {\n");
    
    sb.append("    recommendedInflation: ").append(toIndentedString(recommendedInflation)).append("\n");
    sb.append("    invMin: ").append(toIndentedString(invMin)).append("\n");
    sb.append("    invMax: ").append(toIndentedString(invMax)).append("\n");
    sb.append("    depMin: ").append(toIndentedString(depMin)).append("\n");
    sb.append("    horizonMin: ").append(toIndentedString(horizonMin)).append("\n");
    sb.append("    depMax: ").append(toIndentedString(depMax)).append("\n");
    sb.append("    horizonMax: ").append(toIndentedString(horizonMax)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
