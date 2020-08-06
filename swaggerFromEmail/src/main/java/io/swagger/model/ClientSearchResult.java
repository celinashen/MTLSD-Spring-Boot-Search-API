package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClientSearchResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-30T14:37:36.288Z[GMT]")


public class ClientSearchResult   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("dateOfBirth")
  private LocalDate dateOfBirth = null;

  @JsonProperty("referenceNumber")
  private String referenceNumber = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  public ClientSearchResult firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First Name of the Client
   * @return firstName
  **/
  @ApiModelProperty(value = "First Name of the Client")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ClientSearchResult lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last Name of the Client
   * @return lastName
  **/
  @ApiModelProperty(value = "Last Name of the Client")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ClientSearchResult dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Date of Birth of the Client
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Date of Birth of the Client")
  
    @Valid
    public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public ClientSearchResult referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Reference Number of Client in EO
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "Reference Number of Client in EO")
  
    public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public ClientSearchResult city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City of the Client's Primary Address
   * @return city
  **/
  @ApiModelProperty(value = "City of the Client's Primary Address")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ClientSearchResult postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal Code of the Client's Primary Address
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal Code of the Client's Primary Address")
  
    public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientSearchResult clientSearchResult = (ClientSearchResult) o;
    return Objects.equals(this.firstName, clientSearchResult.firstName) &&
        Objects.equals(this.lastName, clientSearchResult.lastName) &&
        Objects.equals(this.dateOfBirth, clientSearchResult.dateOfBirth) &&
        Objects.equals(this.referenceNumber, clientSearchResult.referenceNumber) &&
        Objects.equals(this.city, clientSearchResult.city) &&
        Objects.equals(this.postalCode, clientSearchResult.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, dateOfBirth, referenceNumber, city, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientSearchResult {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

