package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ClientSearchResult;
import io.swagger.model.CommonResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClientSearchResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-30T14:37:36.288Z[GMT]")


public class ClientSearchResponse   {
  @JsonProperty("commonResponse")
  private CommonResponse commonResponse = null;

  @JsonProperty("clientSearchResultDetails")
  @Valid
  private List<ClientSearchResult> clientSearchResultDetails = null;

  public ClientSearchResponse commonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
    return this;
  }

  /**
   * Get commonResponse
   * @return commonResponse
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CommonResponse getCommonResponse() {
    return commonResponse;
  }

  public void setCommonResponse(CommonResponse commonResponse) {
    this.commonResponse = commonResponse;
  }

  public ClientSearchResponse clientSearchResultDetails(List<ClientSearchResult> clientSearchResultDetails) {
    this.clientSearchResultDetails = clientSearchResultDetails;
    return this;
  }

  public ClientSearchResponse addClientSearchResultDetailsItem(ClientSearchResult clientSearchResultDetailsItem) {
    if (this.clientSearchResultDetails == null) {
      this.clientSearchResultDetails = new ArrayList<ClientSearchResult>();
    }
    this.clientSearchResultDetails.add(clientSearchResultDetailsItem);
    return this;
  }

  /**
   * Get clientSearchResultDetails
   * @return clientSearchResultDetails
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ClientSearchResult> getClientSearchResultDetails() {
    return clientSearchResultDetails;
  }

  public void setClientSearchResultDetails(List<ClientSearchResult> clientSearchResultDetails) {
    this.clientSearchResultDetails = clientSearchResultDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientSearchResponse clientSearchResponse = (ClientSearchResponse) o;
    return Objects.equals(this.commonResponse, clientSearchResponse.commonResponse) &&
        Objects.equals(this.clientSearchResultDetails, clientSearchResponse.clientSearchResultDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonResponse, clientSearchResultDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientSearchResponse {\n");
    
    sb.append("    commonResponse: ").append(toIndentedString(commonResponse)).append("\n");
    sb.append("    clientSearchResultDetails: ").append(toIndentedString(clientSearchResultDetails)).append("\n");
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
