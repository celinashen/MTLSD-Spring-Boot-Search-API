package io.swagger.api;

import io.swagger.model.ClientSearchRequest;
import io.swagger.model.ClientSearchResponse;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-30T14:37:36.288Z[GMT]")
@Controller
public class EoApiController implements EoApi {

    private static final Logger log = LoggerFactory.getLogger(EoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
    //added request mapping line
    @RequestMapping(value="/test", method={RequestMethod.POST, RequestMethod.GET})
    public ResponseEntity<ClientSearchResponse> searchClient(@ApiParam(value = "", required=true) @RequestHeader(value="Ocp-Apim-Subscr", required=true) String ocpApimSubscr
,@ApiParam(value = "" ,required=true) @RequestHeader(value="organizationId", required=true) String organizationId
,@ApiParam(value = "search client payload" ,required=true )  @Valid @RequestBody ClientSearchRequest body
,@ApiParam(value = "" ) @RequestHeader(value="organizationSiteId", required=false) String organizationSiteId
,@ApiParam(value = "" ) @RequestHeader(value="userId", required=false) String userId
,@ApiParam(value = "" ) @RequestHeader(value="transactionDateTime", required=false) OffsetDateTime transactionDateTime
, @ApiParam(value = "" ) @RequestHeader(value="transactionId", required=false) String transactionId
,@ApiParam(value = "" , allowableValues="en, fr", defaultValue="en") @RequestHeader(value="language", required=false) String language
) {    
        String accept = request.getHeader("Accept");
        /*if(accept != null){
            System.out.println(accept); 
        }*/
        System.out.println(ocpApimSubscr);
        System.out.println(organizationId);
        System.out.println(body);
        System.out.println(organizationSiteId);
        System.out.println(userId);
        System.out.println(transactionDateTime);
        System.out.println(transactionId);
        System.out.println(language);
        if (accept != null && accept.contains("application/json")) {
             try {
                return new ResponseEntity<ClientSearchResponse>(objectMapper.readValue("{\n  \"commonResponse\" : {\n    \"resultInd\" : true,\n    \"message\" : \"message\"\n  },\n  \"clientSearchResultDetails\" : [ {\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"referenceNumber\" : \"referenceNumber\",\n    \"city\" : \"city\",\n    \"postalCode\" : \"postalCode\",\n    \"dateOfBirth\" : \"2000-01-23\"\n  }, {\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"referenceNumber\" : \"referenceNumber\",\n    \"city\" : \"city\",\n    \"postalCode\" : \"postalCode\",\n    \"dateOfBirth\" : \"2000-01-23\"\n  } ]\n}", ClientSearchResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClientSearchResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClientSearchResponse>(HttpStatus.NOT_IMPLEMENTED);
    }
}
