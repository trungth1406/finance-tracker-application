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
 * AccountResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-24T13:28:10.513Z[GMT]")


public class AccountResponse   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("total_amount")
  private String totalAmount = null;

  @JsonProperty("remain_amount")
  private String remainAmount = null;

  public AccountResponse id(BigDecimal id) {
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

  public AccountResponse name(String name) {
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

  public AccountResponse totalAmount(String totalAmount) {
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

  public AccountResponse remainAmount(String remainAmount) {
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
    AccountResponse accountResponse = (AccountResponse) o;
    return Objects.equals(this.id, accountResponse.id) &&
        Objects.equals(this.name, accountResponse.name) &&
        Objects.equals(this.totalAmount, accountResponse.totalAmount) &&
        Objects.equals(this.remainAmount, accountResponse.remainAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, totalAmount, remainAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
