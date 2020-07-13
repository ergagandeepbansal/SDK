/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Webhook Object
 */
@ApiModel(description = "Webhook Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-11T07:03:53.789Z")
public class Webhook {
  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("id")
  private UUID id = null;

  /**
   * Gets or Sets integrationService
   */
  @JsonAdapter(IntegrationServiceEnum.Adapter.class)
  public enum IntegrationServiceEnum {
    KYC("KYC"),
    
    KYC_STATUS("KYC_STATUS");

    private String value;

    IntegrationServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntegrationServiceEnum fromValue(String text) {
      for (IntegrationServiceEnum b : IntegrationServiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IntegrationServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntegrationServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntegrationServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IntegrationServiceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("integration_service")
  private List<IntegrationServiceEnum> integrationService = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  @SerializedName("url")
  private String url = null;

  public Webhook createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public Webhook integrationService(List<IntegrationServiceEnum> integrationService) {
    this.integrationService = integrationService;
    return this;
  }

  public Webhook addIntegrationServiceItem(IntegrationServiceEnum integrationServiceItem) {
    if (this.integrationService == null) {
      this.integrationService = new ArrayList<IntegrationServiceEnum>();
    }
    this.integrationService.add(integrationServiceItem);
    return this;
  }

   /**
   * integration_service
   * @return integrationService
  **/
  @ApiModelProperty(example = "[\"kyc\",\"kyc_status\"]", value = "integration_service")
  public List<IntegrationServiceEnum> getIntegrationService() {
    return integrationService;
  }

  public void setIntegrationService(List<IntegrationServiceEnum> integrationService) {
    this.integrationService = integrationService;
  }

  public Webhook isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * isActive
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "isActive")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Webhook secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }

   /**
   * Get secret
   * @return secret
  **/
  @ApiModelProperty(example = "MDAwMTgzYWMtMjI4OC00NTY0LWE3NmItMTE5ZjQ2OTRiZTk4", value = "")
  public String getSecret() {
    return secret;
  }

  public Webhook updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public Webhook url(String url) {
    this.url = url;
    return this;
  }

   /**
   * url
   * @return url
  **/
  @ApiModelProperty(example = "http://localhost/url", required = true, value = "url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.createDate, webhook.createDate) &&
        Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.integrationService, webhook.integrationService) &&
        Objects.equals(this.isActive, webhook.isActive) &&
        Objects.equals(this.secondaryId, webhook.secondaryId) &&
        Objects.equals(this.secret, webhook.secret) &&
        Objects.equals(this.updateDate, webhook.updateDate) &&
        Objects.equals(this.url, webhook.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDate, id, integrationService, isActive, secondaryId, secret, updateDate, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationService: ").append(toIndentedString(integrationService)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
