package com.huutran.financetracker.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResourceResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-24T13:28:10.513Z[GMT]")


public class ResourceResponse   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("total_account")
  private BigDecimal totalAccount = null;

  @JsonProperty("total_amount")
  private String totalAmount = null;

  @JsonProperty("remain_amount")
  private String remainAmount = null;

  public ResourceResponse() {
  }

  public ResourceResponse id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public ResourceResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Widget Adapter", required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceResponse totalAccount(BigDecimal totalAccount) {
    this.totalAccount = totalAccount;
    return this;
  }

  /**
   * Get totalAccount
   * @return totalAccount
   **/
  @Schema(example = "2", description = "")
  
    @Valid
    public BigDecimal getTotalAccount() {
    return totalAccount;
  }

  public void setTotalAccount(BigDecimal totalAccount) {
    this.totalAccount = totalAccount;
  }

  public ResourceResponse totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
   **/
  @Schema(example = "100000.00", required = true, description = "")
      @NotNull

    public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public ResourceResponse remainAmount(String remainAmount) {
    this.remainAmount = remainAmount;
    return this;
  }

  /**
   * Get remainAmount
   * @return remainAmount
   **/
  @Schema(example = "100000.00", required = true, description = "")
      @NotNull

    public String getRemainAmount() {
    return remainAmount;
  }

  public void setRemainAmount(String remainAmount) {
    this.remainAmount = remainAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceResponse resourceResponse = (ResourceResponse) o;
    return Objects.equals(this.id, resourceResponse.id) &&
        Objects.equals(this.name, resourceResponse.name) &&
        Objects.equals(this.totalAccount, resourceResponse.totalAccount) &&
        Objects.equals(this.totalAmount, resourceResponse.totalAmount) &&
        Objects.equals(this.remainAmount, resourceResponse.remainAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, totalAccount, totalAmount, remainAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalAccount: ").append(toIndentedString(totalAccount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    remainAmount: ").append(toIndentedString(remainAmount)).append("\n");
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
