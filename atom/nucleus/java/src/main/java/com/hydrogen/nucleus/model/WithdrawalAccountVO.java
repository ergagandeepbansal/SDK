/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.7.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * WithdrawalAccountVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-04T05:11:20.520Z")
public class WithdrawalAccountVO {
  @SerializedName("withdrawal_account_id")
  private UUID withdrawalAccountId = null;

  @SerializedName("withdrawal_account_name")
  private String withdrawalAccountName = null;

  @SerializedName("withdrawal_amount")
  private Double withdrawalAmount = null;

  @SerializedName("withdrawal_date")
  private OffsetDateTime withdrawalDate = null;

  @SerializedName("withdrawal_direction")
  private String withdrawalDirection = null;

  @SerializedName("withdrawal_id")
  private UUID withdrawalId = null;

  public WithdrawalAccountVO withdrawalAccountId(UUID withdrawalAccountId) {
    this.withdrawalAccountId = withdrawalAccountId;
    return this;
  }

   /**
   * Get withdrawalAccountId
   * @return withdrawalAccountId
  **/
  @ApiModelProperty(value = "")
  public UUID getWithdrawalAccountId() {
    return withdrawalAccountId;
  }

  public void setWithdrawalAccountId(UUID withdrawalAccountId) {
    this.withdrawalAccountId = withdrawalAccountId;
  }

  public WithdrawalAccountVO withdrawalAccountName(String withdrawalAccountName) {
    this.withdrawalAccountName = withdrawalAccountName;
    return this;
  }

   /**
   * Get withdrawalAccountName
   * @return withdrawalAccountName
  **/
  @ApiModelProperty(value = "")
  public String getWithdrawalAccountName() {
    return withdrawalAccountName;
  }

  public void setWithdrawalAccountName(String withdrawalAccountName) {
    this.withdrawalAccountName = withdrawalAccountName;
  }

  public WithdrawalAccountVO withdrawalAmount(Double withdrawalAmount) {
    this.withdrawalAmount = withdrawalAmount;
    return this;
  }

   /**
   * Get withdrawalAmount
   * @return withdrawalAmount
  **/
  @ApiModelProperty(value = "")
  public Double getWithdrawalAmount() {
    return withdrawalAmount;
  }

  public void setWithdrawalAmount(Double withdrawalAmount) {
    this.withdrawalAmount = withdrawalAmount;
  }

  public WithdrawalAccountVO withdrawalDate(OffsetDateTime withdrawalDate) {
    this.withdrawalDate = withdrawalDate;
    return this;
  }

   /**
   * Get withdrawalDate
   * @return withdrawalDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getWithdrawalDate() {
    return withdrawalDate;
  }

  public void setWithdrawalDate(OffsetDateTime withdrawalDate) {
    this.withdrawalDate = withdrawalDate;
  }

  public WithdrawalAccountVO withdrawalDirection(String withdrawalDirection) {
    this.withdrawalDirection = withdrawalDirection;
    return this;
  }

   /**
   * Get withdrawalDirection
   * @return withdrawalDirection
  **/
  @ApiModelProperty(value = "")
  public String getWithdrawalDirection() {
    return withdrawalDirection;
  }

  public void setWithdrawalDirection(String withdrawalDirection) {
    this.withdrawalDirection = withdrawalDirection;
  }

  public WithdrawalAccountVO withdrawalId(UUID withdrawalId) {
    this.withdrawalId = withdrawalId;
    return this;
  }

   /**
   * Get withdrawalId
   * @return withdrawalId
  **/
  @ApiModelProperty(value = "")
  public UUID getWithdrawalId() {
    return withdrawalId;
  }

  public void setWithdrawalId(UUID withdrawalId) {
    this.withdrawalId = withdrawalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WithdrawalAccountVO withdrawalAccountVO = (WithdrawalAccountVO) o;
    return Objects.equals(this.withdrawalAccountId, withdrawalAccountVO.withdrawalAccountId) &&
        Objects.equals(this.withdrawalAccountName, withdrawalAccountVO.withdrawalAccountName) &&
        Objects.equals(this.withdrawalAmount, withdrawalAccountVO.withdrawalAmount) &&
        Objects.equals(this.withdrawalDate, withdrawalAccountVO.withdrawalDate) &&
        Objects.equals(this.withdrawalDirection, withdrawalAccountVO.withdrawalDirection) &&
        Objects.equals(this.withdrawalId, withdrawalAccountVO.withdrawalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withdrawalAccountId, withdrawalAccountName, withdrawalAmount, withdrawalDate, withdrawalDirection, withdrawalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawalAccountVO {\n");
    
    sb.append("    withdrawalAccountId: ").append(toIndentedString(withdrawalAccountId)).append("\n");
    sb.append("    withdrawalAccountName: ").append(toIndentedString(withdrawalAccountName)).append("\n");
    sb.append("    withdrawalAmount: ").append(toIndentedString(withdrawalAmount)).append("\n");
    sb.append("    withdrawalDate: ").append(toIndentedString(withdrawalDate)).append("\n");
    sb.append("    withdrawalDirection: ").append(toIndentedString(withdrawalDirection)).append("\n");
    sb.append("    withdrawalId: ").append(toIndentedString(withdrawalId)).append("\n");
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

