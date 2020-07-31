/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ClientSearchRequest;
import io.swagger.model.ClientSearchResponse;
import org.threeten.bp.OffsetDateTime;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-30T14:37:36.288Z[GMT]")
@Api(value = "eo", description = "the eo API")
public interface EoApi {

    @ApiOperation(value = "", nickname = "searchClient", notes = "", response = ClientSearchResponse.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ClientSearchResponse.class),
        @ApiResponse(code = 400, message = "Bad request", response = ClientSearchResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ClientSearchResponse.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ClientSearchResponse.class),
        @ApiResponse(code = 500, message = "Internal Server error", response = ClientSearchResponse.class) })
    @RequestMapping(value = "/eo/clients/search",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ClientSearchResponse> searchClient(@ApiParam(value = "" ,required=true) @RequestHeader(value="Ocp-Apim-Subscr", required=true) String ocpApimSubscr
,@ApiParam(value = "" ,required=true) @RequestHeader(value="organizationId", required=true) String organizationId
,@ApiParam(value = "search client payload" ,required=true )  @Valid @RequestBody ClientSearchRequest body
,@ApiParam(value = "" ) @RequestHeader(value="organizationSiteId", required=false) String organizationSiteId
,@ApiParam(value = "" ) @RequestHeader(value="userId", required=false) String userId
,@ApiParam(value = "" ) @RequestHeader(value="transactionDateTime", required=false) OffsetDateTime transactionDateTime
,@ApiParam(value = "" ) @RequestHeader(value="transactionId", required=false) String transactionId
,@ApiParam(value = "" , allowableValues="en, fr", defaultValue="en") @RequestHeader(value="language", required=false) String language
);

}
