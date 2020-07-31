package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommonResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-30T14:37:36.288Z[GMT]")


public class CommonResponse   {
  @JsonProperty("resultInd")
  private Boolean resultInd = null;

  @JsonProperty("message")
  private String message = null;

  public CommonResponse resultInd(Boolean resultInd) {
    this.resultInd = resultInd;
    return this;
  }

  /**
   * Indicates if the call was successful
   * @return resultInd
  **/
  @ApiModelProperty(value = "Indicates if the call was successful")
  
    public Boolean isResultInd() {
    return resultInd;
  }

  public void setResultInd(Boolean resultInd) {
    this.resultInd = resultInd;
  }

  public CommonResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Informational message about the call status
   * @return message
  **/
  @ApiModelProperty(value = "Informational message about the call status")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponse commonResponse = (CommonResponse) o;
    return Objects.equals(this.resultInd, commonResponse.resultInd) &&
        Objects.equals(this.message, commonResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultInd, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponse {\n");
    
    sb.append("    resultInd: ").append(toIndentedString(resultInd)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
