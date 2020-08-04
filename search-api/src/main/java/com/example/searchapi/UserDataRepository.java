package com.example.searchapi;

import java.util.List;

import javax.transaction.Transactional;

import com.example.searchapi.UserData;
import com.example.searchapi.UserSpecification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserDataRepository extends JpaRepository<UserData, Long>, CrudRepository<UserData, Long>, JpaSpecificationExecutor<UserData>{


    List<UserData> findByFirstName(String firstName);

    //List<UserData> findAll(Specification<UserData> specification);

    List<UserData> findAll();

    
   
    
    /**
    Specification<UserData> specification = Specification
        .where(firstName == null ? null : firstNameContains(firstName))
        .and(lastName == null ? null : lastNameContains(lastName));
*/

//	List<UserData> getSome(String firstName);

 

   // Object findOne(String firstName);
    
   // List<UserData> findByFirst_name(String first_name);


    

}