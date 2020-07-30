package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person Search Results
 */
@ApiModel(description = "Person Search Results")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-30T14:37:36.288Z[GMT]")


public class ClientSearchRequest   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("dateOfBirth")
  private LocalDate dateOfBirth = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("referenceNumber")
  private String referenceNumber = null;

  public ClientSearchRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First Name of the Person
   * @return firstName
  **/
  @ApiModelProperty(value = "First Name of the Person")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ClientSearchRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last Name of the Person
   * @return lastName
  **/
  @ApiModelProperty(value = "Last Name of the Person")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ClientSearchRequest dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Date of Birth of the Person
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Date of Birth of the Person")
  
    @Valid
    public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public ClientSearchRequest gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * gender of client, the endpoint of API to retrieve the list of gender options 
   * @return gender
  **/
  @ApiModelProperty(value = "gender of client, the endpoint of API to retrieve the list of gender options ")
  
    public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public ClientSearchRequest referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Reference Number of Person in EO
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "Reference Number of Person in EO")
  
    public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientSearchRequest clientSearchRequest = (ClientSearchRequest) o;
    return Objects.equals(this.firstName, clientSearchRequest.firstName) &&
        Objects.equals(this.lastName, clientSearchRequest.lastName) &&
        Objects.equals(this.dateOfBirth, clientSearchRequest.dateOfBirth) &&
        Objects.equals(this.gender, clientSearchRequest.gender) &&
        Objects.equals(this.referenceNumber, clientSearchRequest.referenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, dateOfBirth, gender, referenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientSearchRequest {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
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
