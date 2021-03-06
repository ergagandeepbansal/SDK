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
 * AccountVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-04T05:11:20.520Z")
public class AccountVO {
  @SerializedName("account_asset_size")
  private Double accountAssetSize = null;

  @SerializedName("account_asset_size_date")
  private OffsetDateTime accountAssetSizeDate = null;

  @SerializedName("account_created_date")
  private OffsetDateTime accountCreatedDate = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("account_name")
  private String accountName = null;

  @SerializedName("account_secondary_id")
  private String accountSecondaryId = null;

  @SerializedName("account_type")
  private String accountType = null;

  @SerializedName("account_updated_date")
  private OffsetDateTime accountUpdatedDate = null;

  public AccountVO accountAssetSize(Double accountAssetSize) {
    this.accountAssetSize = accountAssetSize;
    return this;
  }

   /**
   * Get accountAssetSize
   * @return accountAssetSize
  **/
  @ApiModelProperty(value = "")
  public Double getAccountAssetSize() {
    return accountAssetSize;
  }

  public void setAccountAssetSize(Double accountAssetSize) {
    this.accountAssetSize = accountAssetSize;
  }

  public AccountVO accountAssetSizeDate(OffsetDateTime accountAssetSizeDate) {
    this.accountAssetSizeDate = accountAssetSizeDate;
    return this;
  }

   /**
   * Get accountAssetSizeDate
   * @return accountAssetSizeDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAccountAssetSizeDate() {
    return accountAssetSizeDate;
  }

  public void setAccountAssetSizeDate(OffsetDateTime accountAssetSizeDate) {
    this.accountAssetSizeDate = accountAssetSizeDate;
  }

  public AccountVO accountCreatedDate(OffsetDateTime accountCreatedDate) {
    this.accountCreatedDate = accountCreatedDate;
    return this;
  }

   /**
   * Get accountCreatedDate
   * @return accountCreatedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAccountCreatedDate() {
    return accountCreatedDate;
  }

  public void setAccountCreatedDate(OffsetDateTime accountCreatedDate) {
    this.accountCreatedDate = accountCreatedDate;
  }

  public AccountVO accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public AccountVO accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public AccountVO accountSecondaryId(String accountSecondaryId) {
    this.accountSecondaryId = accountSecondaryId;
    return this;
  }

   /**
   * Get accountSecondaryId
   * @return accountSecondaryId
  **/
  @ApiModelProperty(value = "")
  public String getAccountSecondaryId() {
    return accountSecondaryId;
  }

  public void setAccountSecondaryId(String accountSecondaryId) {
    this.accountSecondaryId = accountSecondaryId;
  }

  public AccountVO accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public AccountVO accountUpdatedDate(OffsetDateTime accountUpdatedDate) {
    this.accountUpdatedDate = accountUpdatedDate;
    return this;
  }

   /**
   * Get accountUpdatedDate
   * @return accountUpdatedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAccountUpdatedDate() {
    return accountUpdatedDate;
  }

  public void setAccountUpdatedDate(OffsetDateTime accountUpdatedDate) {
    this.accountUpdatedDate = accountUpdatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountVO accountVO = (AccountVO) o;
    return Objects.equals(this.accountAssetSize, accountVO.accountAssetSize) &&
        Objects.equals(this.accountAssetSizeDate, accountVO.accountAssetSizeDate) &&
        Objects.equals(this.accountCreatedDate, accountVO.accountCreatedDate) &&
        Objects.equals(this.accountId, accountVO.accountId) &&
        Objects.equals(this.accountName, accountVO.accountName) &&
        Objects.equals(this.accountSecondaryId, accountVO.accountSecondaryId) &&
        Objects.equals(this.accountType, accountVO.accountType) &&
        Objects.equals(this.accountUpdatedDate, accountVO.accountUpdatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountAssetSize, accountAssetSizeDate, accountCreatedDate, accountId, accountName, accountSecondaryId, accountType, accountUpdatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountVO {\n");
    
    sb.append("    accountAssetSize: ").append(toIndentedString(accountAssetSize)).append("\n");
    sb.append("    accountAssetSizeDate: ").append(toIndentedString(accountAssetSizeDate)).append("\n");
    sb.append("    accountCreatedDate: ").append(toIndentedString(accountCreatedDate)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountSecondaryId: ").append(toIndentedString(accountSecondaryId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountUpdatedDate: ").append(toIndentedString(accountUpdatedDate)).append("\n");
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

