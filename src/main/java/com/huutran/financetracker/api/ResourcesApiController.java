package com.huutran.financetracker.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huutran.financetracker.model.AccountRequest;
import com.huutran.financetracker.model.AccountResponse;
import com.huutran.financetracker.model.ResourceResponse;
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
public class ResourcesApiController implements ResourcesApi {

    private static final Logger log = LoggerFactory.getLogger(ResourcesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ResourcesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addRelatedAccount(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "Add related account to resource", schema=@Schema()) @Valid @RequestBody AccountRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<AccountResponse>> getRelatedAccounts(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
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

    public ResponseEntity<ResourceResponse> getResourceById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResourceResponse>(objectMapper.readValue("{\n  \"total_amount\" : \"100000.00\",\n  \"name\" : \"Widget Adapter\",\n  \"id\" : 1,\n  \"remain_amount\" : \"100000.00\",\n  \"total_account\" : 2\n}", ResourceResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResourceResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResourceResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ResourceResponse>> getResources() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ResourceResponse>>(objectMapper.readValue("[ {\n  \"total_amount\" : \"100000.00\",\n  \"name\" : \"Widget Adapter\",\n  \"id\" : 1,\n  \"remain_amount\" : \"100000.00\",\n  \"total_account\" : 2\n}, {\n  \"total_amount\" : \"100000.00\",\n  \"name\" : \"Widget Adapter\",\n  \"id\" : 1,\n  \"remain_amount\" : \"100000.00\",\n  \"total_account\" : 2\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ResourceResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ResourceResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> resourcesIdRelatedAccountsAccountIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("account_id") Integer accountId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateRelatedAccount(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("account_id") Integer accountId,@Parameter(in = ParameterIn.DEFAULT, description = "Update existing account", schema=@Schema()) @Valid @RequestBody AccountRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
