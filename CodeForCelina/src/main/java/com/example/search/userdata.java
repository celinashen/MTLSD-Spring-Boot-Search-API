package com.example.search;
import javax.persistence.*;

@Entity
@Table
public class userdata{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    public userdata(){}
    public userdata(String firstName, String lastName){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
}