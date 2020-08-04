package com.example.searchapi;

import java.util.Date;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.example.searchapi.UserData;
import com.example.searchapi.UserDataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class UserSpecification implements UserService{

    @Autowired
    private UserDataRepository userDataRepository;


    @Override
    public List<UserData> findAll() {
        return userDataRepository.findAll(new Specification<UserData>() {
            @Override
            public Predicate toPredicate(Root<UserData> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return null;
            }
        });
    }

    public List<UserData> findByCriteria(String firstName, String lastName){ //pass object (search criteria) here
        return userDataRepository.findAll(new Specification<UserData>() {
            @Override
            public Predicate toPredicate(Root<UserData> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if(firstName!=null) { //do we need and or or requirements
                    //predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("firstName"), firstName)));
                    predicates.add(criteriaBuilder.and(criteriaBuilder.like(root.get("firstName"), "%"+firstName+"%")));
                    //return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
                }
                if(lastName!=null) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.like(root.get("lastName"), "%"+lastName+"%")));
                }             
             /**   if(empl!=null){
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("employeeRole"), employeeRole)));
                }*/
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        });
    }

    public List<UserData> findBySearchCriteria(UserSearchCriteria search){

        return userDataRepository.findAll(new Specification<UserData>() {
            @Override
            public Predicate toPredicate(Root<UserData> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                String firstName = search.getFirstName();
                String lastName = search.getLastName();
                Integer refNumber = search.getRefNumber();
                Date dateOfBirth = search.getDateOfBirth();
                Long concernRoleId = search.getConcernRoleId();
                String city = search.getCity();
                String postCode = search.getPostCode();

                List<Predicate> predicates = new ArrayList<>();

                if(firstName!=null) { //do we need and or or requirements
                    predicates.add(criteriaBuilder.and(criteriaBuilder.like(root.get("firstName"), "%"+firstName+"%")));
                }
                if(lastName!=null) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.like(root.get("lastName"), "%"+lastName+"%")));
                } 
                if(refNumber!=null) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("refNumber"), refNumber)));
                }         
                if(dateOfBirth!=null) { //is user input going to be formatted? //is date in range?
                   // predicates.add(criteriaBuilder.and(criteriaBuilder.like(root.get("dateOfBirth"), dateOfBirth)));
                //   predicates.add(criteriaBuilder.lessThanOrEqualTo(root.<Date>get("dateOfBirth"), dateOfBirth));
                
                   Predicate onStart = criteriaBuilder.greaterThanOrEqualTo(root.get("startDate"), dateOfBirth);
                   Predicate onEnd = criteriaBuilder.lessThanOrEqualTo(root.get("endDate"), dateOfBirth);
                   predicates.add(onStart);
                   predicates.add(onEnd);
                }     
                if(concernRoleId!=null) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("concernRoleId"), concernRoleId)));
                }      
                if(city!=null) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.like(root.get("city"), "%"+city+"%")));
                }     
                if(postCode!=null) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("postCode"), postCode)));
                }     

                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        });



    }



}

 
            
    



    //Construct Query
 /**   public static Specification<UserData> firstNameContains(String firstName) {
        if (firstName == null){
            return null;
        }
        else{
            return null;
        //   return (root, query, builder) -> builder.equal(root.get("first_name"), firstName);
        }  
    }*/
    


    


    