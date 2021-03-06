/*
 * Molecule API Documentation
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.molecule.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * WalletClients
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-21T09:54:56.296Z")
public class WalletClients {
  @SerializedName("nucleus_client_id")
  private UUID nucleusClientId = null;

  /**
   * Gets or Sets clientWalletAssociationType
   */
  @JsonAdapter(ClientWalletAssociationTypeEnum.Adapter.class)
  public enum ClientWalletAssociationTypeEnum {
    JOINT("joint"),
    
    OWNER("owner"),
    
    TRUSTEE("trustee"),
    
    VIEWER("viewer"),
    
    ADMIN("admin");

    private String value;

    ClientWalletAssociationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClientWalletAssociationTypeEnum fromValue(String text) {
      for (ClientWalletAssociationTypeEnum b : ClientWalletAssociationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ClientWalletAssociationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClientWalletAssociationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClientWalletAssociationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ClientWalletAssociationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("client_wallet_association_type")
  private ClientWalletAssociationTypeEnum clientWalletAssociationType = null;

  @SerializedName("is_primary")
  private Boolean isPrimary = null;

  public WalletClients nucleusClientId(UUID nucleusClientId) {
    this.nucleusClientId = nucleusClientId;
    return this;
  }

   /**
   * Get nucleusClientId
   * @return nucleusClientId
  **/
  @ApiModelProperty(required = true, value = "")
  public UUID getNucleusClientId() {
    return nucleusClientId;
  }

  public void setNucleusClientId(UUID nucleusClientId) {
    this.nucleusClientId = nucleusClientId;
  }

  public WalletClients clientWalletAssociationType(ClientWalletAssociationTypeEnum clientWalletAssociationType) {
    this.clientWalletAssociationType = clientWalletAssociationType;
    return this;
  }

   /**
   * Get clientWalletAssociationType
   * @return clientWalletAssociationType
  **/
  @ApiModelProperty(required = true, value = "")
  public ClientWalletAssociationTypeEnum getClientWalletAssociationType() {
    return clientWalletAssociationType;
  }

  public void setClientWalletAssociationType(ClientWalletAssociationTypeEnum clientWalletAssociationType) {
    this.clientWalletAssociationType = clientWalletAssociationType;
  }

  public WalletClients isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletClients walletClients = (WalletClients) o;
    return Objects.equals(this.nucleusClientId, walletClients.nucleusClientId) &&
        Objects.equals(this.clientWalletAssociationType, walletClients.clientWalletAssociationType) &&
        Objects.equals(this.isPrimary, walletClients.isPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nucleusClientId, clientWalletAssociationType, isPrimary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletClients {\n");
    
    sb.append("    nucleusClientId: ").append(toIndentedString(nucleusClientId)).append("\n");
    sb.append("    clientWalletAssociationType: ").append(toIndentedString(clientWalletAssociationType)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
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

