/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.1
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
import io.swagger.client.model.FinancialPictureResponseByCategory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * FinancialPictureResponseHistory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T14:10:50.140-04:00")
public class FinancialPictureResponseHistory {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("total_assets")
  private Double totalAssets = null;

  @SerializedName("total_liabilities")
  private Double totalLiabilities = null;

  @SerializedName("net_worth")
  private Double netWorth = null;

  @SerializedName("by_category")
  private List<FinancialPictureResponseByCategory> byCategory = null;

  public FinancialPictureResponseHistory date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the financial picture record
   * @return date
  **/
  @ApiModelProperty(value = "The date of the financial picture record")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public FinancialPictureResponseHistory totalAssets(Double totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

   /**
   * Total assets of the client on this date
   * @return totalAssets
  **/
  @ApiModelProperty(value = "Total assets of the client on this date")
  public Double getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(Double totalAssets) {
    this.totalAssets = totalAssets;
  }

  public FinancialPictureResponseHistory totalLiabilities(Double totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
    return this;
  }

   /**
   * Total liabilities of the client on this date
   * @return totalLiabilities
  **/
  @ApiModelProperty(value = "Total liabilities of the client on this date")
  public Double getTotalLiabilities() {
    return totalLiabilities;
  }

  public void setTotalLiabilities(Double totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
  }

  public FinancialPictureResponseHistory netWorth(Double netWorth) {
    this.netWorth = netWorth;
    return this;
  }

   /**
   * Net worth of the client on this date
   * @return netWorth
  **/
  @ApiModelProperty(value = "Net worth of the client on this date")
  public Double getNetWorth() {
    return netWorth;
  }

  public void setNetWorth(Double netWorth) {
    this.netWorth = netWorth;
  }

  public FinancialPictureResponseHistory byCategory(List<FinancialPictureResponseByCategory> byCategory) {
    this.byCategory = byCategory;
    return this;
  }

  public FinancialPictureResponseHistory addByCategoryItem(FinancialPictureResponseByCategory byCategoryItem) {
    if (this.byCategory == null) {
      this.byCategory = new ArrayList<FinancialPictureResponseByCategory>();
    }
    this.byCategory.add(byCategoryItem);
    return this;
  }

   /**
   * Get byCategory
   * @return byCategory
  **/
  @ApiModelProperty(value = "")
  public List<FinancialPictureResponseByCategory> getByCategory() {
    return byCategory;
  }

  public void setByCategory(List<FinancialPictureResponseByCategory> byCategory) {
    this.byCategory = byCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialPictureResponseHistory financialPictureResponseHistory = (FinancialPictureResponseHistory) o;
    return Objects.equals(this.date, financialPictureResponseHistory.date) &&
        Objects.equals(this.totalAssets, financialPictureResponseHistory.totalAssets) &&
        Objects.equals(this.totalLiabilities, financialPictureResponseHistory.totalLiabilities) &&
        Objects.equals(this.netWorth, financialPictureResponseHistory.netWorth) &&
        Objects.equals(this.byCategory, financialPictureResponseHistory.byCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, totalAssets, totalLiabilities, netWorth, byCategory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialPictureResponseHistory {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    totalLiabilities: ").append(toIndentedString(totalLiabilities)).append("\n");
    sb.append("    netWorth: ").append(toIndentedString(netWorth)).append("\n");
    sb.append("    byCategory: ").append(toIndentedString(byCategory)).append("\n");
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
