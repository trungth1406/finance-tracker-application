package com.huutran.financetracker.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huutran.financetracker.model.AccountRequest;
import com.huutran.financetracker.model.AccountResponse;
import com.huutran.financetracker.model.TransactionRequest;
import com.huutran.financetracker.model.TransactionResponse;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-24T13:28:10.513Z[GMT]")
@RestController
public class AccountsApiController implements AccountsApi {

    private static final Logger log = LoggerFactory.getLogger(AccountsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<TransactionResponse> createRelatedTransaction(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody TransactionRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TransactionResponse>(objectMapper.readValue("{\n  \"amount\" : \"1000000.00\",\n  \"fk_account\" : 128,\n  \"description\" : \"Deposit to this account\",\n  \"date_of_execution\" : \"2000-01-23\",\n  \"id\" : 1,\n  \"type\" : \"DEPOSIT\"\n}", TransactionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TransactionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TransactionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteAccountWithID(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteRelatedTransaction(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("transaction_id") Integer transactionId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountResponse> getAccountById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountResponse>(objectMapper.readValue("{\n  \"total_amount\" : \"100000.00\",\n  \"name\" : \"Widget Adapter\",\n  \"id\" : 1,\n  \"remain_amount\" : \"100000.00\"\n}", AccountResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<AccountResponse>> getAccounts() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<AccountResponse>>(objectMapper.readValue("[ {\n  \"total_amount\" : \"100000.00\",\n  \"name\" : \"Widget Adapter\",\n  \"id\" : 1,\n  \"remain_amount\" : \"100000.00\"\n}, {\n  \"total_amount\" : \"100000.00\",\n  \"name\" : \"Widget Adapter\",\n  \"id\" : 1,\n  \"remain_amount\" : \"100000.00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<AccountResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<AccountResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<TransactionResponse>> getRelatedTransaction(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<TransactionResponse>>(objectMapper.readValue("[ {\n  \"amount\" : \"1000000.00\",\n  \"fk_account\" : 128,\n  \"description\" : \"Deposit to this account\",\n  \"date_of_execution\" : \"2000-01-23\",\n  \"id\" : 1,\n  \"type\" : \"DEPOSIT\"\n}, {\n  \"amount\" : \"1000000.00\",\n  \"fk_account\" : 128,\n  \"description\" : \"Deposit to this account\",\n  \"date_of_execution\" : \"2000-01-23\",\n  \"id\" : 1,\n  \"type\" : \"DEPOSIT\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<TransactionResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<TransactionResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountResponse> updateAccountWithId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody AccountRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountResponse>(objectMapper.readValue("{\n  \"total_amount\" : \"100000.00\",\n  \"name\" : \"Widget Adapter\",\n  \"id\" : 1,\n  \"remain_amount\" : \"100000.00\"\n}", AccountResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TransactionResponse> updateRelatedTransactions(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("transaction_id") Integer transactionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TransactionResponse>(objectMapper.readValue("{\n  \"amount\" : \"1000000.00\",\n  \"fk_account\" : 128,\n  \"description\" : \"Deposit to this account\",\n  \"date_of_execution\" : \"2000-01-23\",\n  \"id\" : 1,\n  \"type\" : \"DEPOSIT\"\n}", TransactionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TransactionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TransactionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
