/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetAccountAssetSizeResponseInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T13:59:38.361-04:00")
public class GetAccountAssetSizeResponseInner {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("value")
  private Double value = null;

  @SerializedName("additions")
  private Double additions = null;

  public GetAccountAssetSizeResponseInner date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date for this asset size record
   * @return date
  **/
  @ApiModelProperty(value = "Date for this asset size record")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public GetAccountAssetSizeResponseInner value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Monetary value of the account on the particular date
   * @return value
  **/
  @ApiModelProperty(value = "Monetary value of the account on the particular date")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public GetAccountAssetSizeResponseInner additions(Double additions) {
    this.additions = additions;
    return this;
  }

   /**
   * Amount added to the account value since the last asset size date, usually via deposit
   * @return additions
  **/
  @ApiModelProperty(value = "Amount added to the account value since the last asset size date, usually via deposit")
  public Double getAdditions() {
    return additions;
  }

  public void setAdditions(Double additions) {
    this.additions = additions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountAssetSizeResponseInner getAccountAssetSizeResponseInner = (GetAccountAssetSizeResponseInner) o;
    return Objects.equals(this.date, getAccountAssetSizeResponseInner.date) &&
        Objects.equals(this.value, getAccountAssetSizeResponseInner.value) &&
        Objects.equals(this.additions, getAccountAssetSizeResponseInner.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, value, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountAssetSizeResponseInner {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
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
