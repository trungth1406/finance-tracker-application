package com.huutran.financetracker.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-24T13:28:10.513Z[GMT]")


public class AccountRequest   {
  @JsonProperty("account_name")
  private String accountName = null;

  @JsonProperty("account_amount")
  private String accountAmount = null;

  public AccountRequest accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
   **/
  @Schema(example = "ACME Corporation", required = true, description = "")
      @NotNull

    public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public AccountRequest accountAmount(String accountAmount) {
    this.accountAmount = accountAmount;
    return this;
  }

  /**
   * Get accountAmount
   * @return accountAmount
   **/
  @Schema(example = "1000000.00", required = true, description = "")
      @NotNull

    public String getAccountAmount() {
    return accountAmount;
  }

  public void setAccountAmount(String accountAmount) {
    this.accountAmount = accountAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRequest accountRequest = (AccountRequest) o;
    return Objects.equals(this.accountName, accountRequest.accountName) &&
        Objects.equals(this.accountAmount, accountRequest.accountAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountAmount: ").append(toIndentedString(accountAmount)).append("\n");
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
