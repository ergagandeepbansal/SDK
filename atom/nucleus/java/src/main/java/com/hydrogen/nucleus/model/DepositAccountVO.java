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
 * DepositAccountVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-04T05:11:20.520Z")
public class DepositAccountVO {
  @SerializedName("deposit_account_id")
  private UUID depositAccountId = null;

  @SerializedName("deposit_account_name")
  private String depositAccountName = null;

  @SerializedName("deposit_amount")
  private Double depositAmount = null;

  @SerializedName("deposit_direction")
  private String depositDirection = null;

  @SerializedName("deposit_id")
  private UUID depositId = null;

  @SerializedName("deposit_received_date")
  private OffsetDateTime depositReceivedDate = null;

  public DepositAccountVO depositAccountId(UUID depositAccountId) {
    this.depositAccountId = depositAccountId;
    return this;
  }

   /**
   * Get depositAccountId
   * @return depositAccountId
  **/
  @ApiModelProperty(value = "")
  public UUID getDepositAccountId() {
    return depositAccountId;
  }

  public void setDepositAccountId(UUID depositAccountId) {
    this.depositAccountId = depositAccountId;
  }

  public DepositAccountVO depositAccountName(String depositAccountName) {
    this.depositAccountName = depositAccountName;
    return this;
  }

   /**
   * Get depositAccountName
   * @return depositAccountName
  **/
  @ApiModelProperty(value = "")
  public String getDepositAccountName() {
    return depositAccountName;
  }

  public void setDepositAccountName(String depositAccountName) {
    this.depositAccountName = depositAccountName;
  }

  public DepositAccountVO depositAmount(Double depositAmount) {
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * Get depositAmount
   * @return depositAmount
  **/
  @ApiModelProperty(value = "")
  public Double getDepositAmount() {
    return depositAmount;
  }

  public void setDepositAmount(Double depositAmount) {
    this.depositAmount = depositAmount;
  }

  public DepositAccountVO depositDirection(String depositDirection) {
    this.depositDirection = depositDirection;
    return this;
  }

   /**
   * Get depositDirection
   * @return depositDirection
  **/
  @ApiModelProperty(value = "")
  public String getDepositDirection() {
    return depositDirection;
  }

  public void setDepositDirection(String depositDirection) {
    this.depositDirection = depositDirection;
  }

  public DepositAccountVO depositId(UUID depositId) {
    this.depositId = depositId;
    return this;
  }

   /**
   * Get depositId
   * @return depositId
  **/
  @ApiModelProperty(value = "")
  public UUID getDepositId() {
    return depositId;
  }

  public void setDepositId(UUID depositId) {
    this.depositId = depositId;
  }

  public DepositAccountVO depositReceivedDate(OffsetDateTime depositReceivedDate) {
    this.depositReceivedDate = depositReceivedDate;
    return this;
  }

   /**
   * Get depositReceivedDate
   * @return depositReceivedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDepositReceivedDate() {
    return depositReceivedDate;
  }

  public void setDepositReceivedDate(OffsetDateTime depositReceivedDate) {
    this.depositReceivedDate = depositReceivedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountVO depositAccountVO = (DepositAccountVO) o;
    return Objects.equals(this.depositAccountId, depositAccountVO.depositAccountId) &&
        Objects.equals(this.depositAccountName, depositAccountVO.depositAccountName) &&
        Objects.equals(this.depositAmount, depositAccountVO.depositAmount) &&
        Objects.equals(this.depositDirection, depositAccountVO.depositDirection) &&
        Objects.equals(this.depositId, depositAccountVO.depositId) &&
        Objects.equals(this.depositReceivedDate, depositAccountVO.depositReceivedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositAccountId, depositAccountName, depositAmount, depositDirection, depositId, depositReceivedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountVO {\n");
    
    sb.append("    depositAccountId: ").append(toIndentedString(depositAccountId)).append("\n");
    sb.append("    depositAccountName: ").append(toIndentedString(depositAccountName)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    depositDirection: ").append(toIndentedString(depositDirection)).append("\n");
    sb.append("    depositId: ").append(toIndentedString(depositId)).append("\n");
    sb.append("    depositReceivedDate: ").append(toIndentedString(depositReceivedDate)).append("\n");
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

