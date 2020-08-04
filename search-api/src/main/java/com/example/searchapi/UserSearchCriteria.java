package com.example.searchapi;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class UserSearchCriteria {
    
    private String firstName;
    private String lastName;
    private String city;
    private String postCode;
    private Integer refNumber;
    private Long concernRoleId;
    private Date dateOfBirth;
    private Date startDate;
    private Date endDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Integer getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(Integer refNumber) {
        this.refNumber = refNumber;
    }

    public Long getConcernRoleId() {
        return concernRoleId;
    }

    public void setConcernRoleId(Long concernRoleId) {
        this.concernRoleId = concernRoleId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


}