package com.huutran.financetracker.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransactionResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-24T13:28:10.513Z[GMT]")


public class TransactionResponse   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("date_of_execution")
  private LocalDate dateOfExecution = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("fk_account")
  private Integer fkAccount = null;

  public TransactionResponse id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TransactionResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(example = "DEPOSIT", required = true, description = "")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TransactionResponse dateOfExecution(LocalDate dateOfExecution) {
    this.dateOfExecution = dateOfExecution;
    return this;
  }

  /**
   * Get dateOfExecution
   * @return dateOfExecution
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public LocalDate getDateOfExecution() {
    return dateOfExecution;
  }

  public void setDateOfExecution(LocalDate dateOfExecution) {
    this.dateOfExecution = dateOfExecution;
  }

  public TransactionResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(example = "Deposit to this account", required = true, description = "")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TransactionResponse amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(example = "1000000.00", required = true, description = "")
      @NotNull

    public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public TransactionResponse fkAccount(Integer fkAccount) {
    this.fkAccount = fkAccount;
    return this;
  }

  /**
   * Get fkAccount
   * @return fkAccount
   **/
  @Schema(example = "128", required = true, description = "")
      @NotNull

    public Integer getFkAccount() {
    return fkAccount;
  }

  public void setFkAccount(Integer fkAccount) {
    this.fkAccount = fkAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResponse transactionResponse = (TransactionResponse) o;
    return Objects.equals(this.id, transactionResponse.id) &&
        Objects.equals(this.type, transactionResponse.type) &&
        Objects.equals(this.dateOfExecution, transactionResponse.dateOfExecution) &&
        Objects.equals(this.description, transactionResponse.description) &&
        Objects.equals(this.amount, transactionResponse.amount) &&
        Objects.equals(this.fkAccount, transactionResponse.fkAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, dateOfExecution, description, amount, fkAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateOfExecution: ").append(toIndentedString(dateOfExecution)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fkAccount: ").append(toIndentedString(fkAccount)).append("\n");
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
