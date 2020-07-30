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
 * userdata
 */
@ApiModel(description = "userdata")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-30T13:23:07.267Z")




public class Userdata   {
  @JsonProperty("PK")
  private Integer PK = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("dateOfBirth")
  private String dateOfBirth = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("City")
  private String city = null;

  @JsonProperty("referenceNumber")
  private String referenceNumber = null;

  @JsonProperty("postCode")
  private String postCode = null;

  @JsonProperty("concernRoleId")
  private Integer concernRoleId = null;

  public Userdata PK(Integer PK) {
    this.PK = PK;
    return this;
  }

  /**
   * PK
   * @return PK
  **/
  @ApiModelProperty(value = "PK")


  public Integer getPK() {
    return PK;
  }

  public void setPK(Integer PK) {
    this.PK = PK;
  }

  public Userdata firstName(String firstName) {
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

  public Userdata lastName(String lastName) {
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

  public Userdata dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Date of Birth of Client
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Date of Birth of Client")


  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Userdata gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Gender of client, the endpoint of API to retrieve the list of gender options.
   * @return gender
  **/
  @ApiModelProperty(value = "Gender of client, the endpoint of API to retrieve the list of gender options.")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Userdata city(String city) {
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

  public Userdata referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Reference Number of Client in EO (CaMS person reference id)
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "Reference Number of Client in EO (CaMS person reference id)")


  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public Userdata postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * postcode
   * @return postCode
  **/
  @ApiModelProperty(value = "postcode")


  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public Userdata concernRoleId(Integer concernRoleId) {
    this.concernRoleId = concernRoleId;
    return this;
  }

  /**
   * concern role id
   * @return concernRoleId
  **/
  @ApiModelProperty(value = "concern role id")


  public Integer getConcernRoleId() {
    return concernRoleId;
  }

  public void setConcernRoleId(Integer concernRoleId) {
    this.concernRoleId = concernRoleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Userdata userdata = (Userdata) o;
    return Objects.equals(this.PK, userdata.PK) &&
        Objects.equals(this.firstName, userdata.firstName) &&
        Objects.equals(this.lastName, userdata.lastName) &&
        Objects.equals(this.dateOfBirth, userdata.dateOfBirth) &&
        Objects.equals(this.gender, userdata.gender) &&
        Objects.equals(this.city, userdata.city) &&
        Objects.equals(this.referenceNumber, userdata.referenceNumber) &&
        Objects.equals(this.postCode, userdata.postCode) &&
        Objects.equals(this.concernRoleId, userdata.concernRoleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PK, firstName, lastName, dateOfBirth, gender, city, referenceNumber, postCode, concernRoleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Userdata {\n");
    
    sb.append("    PK: ").append(toIndentedString(PK)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    concernRoleId: ").append(toIndentedString(concernRoleId)).append("\n");
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

