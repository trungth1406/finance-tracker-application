package com.huutran.financetracker.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huutran.financetracker.dao.Account;
import com.huutran.financetracker.model.AccountRequest;
import com.huutran.financetracker.model.AccountResponse;
import com.huutran.financetracker.model.TransactionRequest;
import com.huutran.financetracker.model.TransactionResponse;
import com.huutran.financetracker.services.BaseService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-24T13:28:10.513Z[GMT]")
@RestController
public class AccountsApiController implements AccountsApi {

    final BaseService<Account, Long> accountService;

    @Autowired
    public AccountsApiController(BaseService<Account, Long> service) {
        this.accountService = service;
    }

    public ResponseEntity<TransactionResponse> createRelatedTransaction(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody TransactionRequest body) {

        return new ResponseEntity<TransactionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteAccountWithID(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") Integer id) {

        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteRelatedTransaction(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("transaction_id") Integer transactionId) {

        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountResponse> getAccountById(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") Integer id) {


        return new ResponseEntity<AccountResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<AccountResponse>> getAccounts() {
        ResponseEntity<List<Object>> listResponseEntity = this.accountService.searchAll(Pageable.unpaged());
        return new ResponseEntity(listResponseEntity, HttpStatus.OK);

    }

    public ResponseEntity<List<TransactionResponse>> getRelatedTransaction(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") Integer id) {


        return new ResponseEntity<List<TransactionResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountResponse> updateAccountWithId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody AccountRequest body) {


        return new ResponseEntity<AccountResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TransactionResponse> updateRelatedTransactions(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("transaction_id") Integer transactionId) {

        return new ResponseEntity<TransactionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
