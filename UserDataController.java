package com.example.searchapi;

import com.example.searchapi.ResourceNotFoundException;
//import com.example.searchapi.exception.ResourceNotFoundException;
import com.example.searchapi.UserData;
import com.example.searchapi.UserDataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.ws.rs.Path;

import io.swagger.annotations.*;

@RestController
@RequestMapping("/api")
public class UserDataController {


    @Autowired
    UserDataRepository userDataRepository;

    @Autowired
    //UserSpecification userSpec = new UserSpecification();
    UserService userSpec;

    UserSearchCriteria search;

    @GetMapping("/search")
    public List<UserData> getAllData() {
        return userSpec.findAll();
    }

    @RequestMapping("/search/{concern_role_id}")
    public UserData getDataById(@PathVariable(value = "concern_role_id") Long concernRoleId) {
        return userDataRepository.findById(concernRoleId)
            .orElseThrow(() -> new ResourceNotFoundException("UserData","concernRoleId",concernRoleId));
    }

  /**  @RequestMapping(method = RequestMethod.GET)
    public List<UserData> getFirstName(@RequestParam(value="first_name") String firstName) {
        return userDataRepository.findByFirstName(firstName);
    }*/

   /**
    @RequestMapping("/dynamicSearch/{first_name}")
    public List<UserData> findAllByCriteria(@PathVariable(value="first_name") String firstName) {
     //   Specification<UserData> spec = UserSpecification.firstNameContains(firstName);
     //   List<UserData> list = userDataRepository.findAll(Specification.where(spec));
        return (List<UserData>)userSpec.findByCriteria(firstName, "Thi");

        //return (List<UserData>)userSpec.findByCriteria(null);
        //return (List<UserData>) userDataRepository.findByFirstName(firstName);
    }

    @GetMapping("/search1/{first_name}")
    public List<UserData> getDataByName(@PathVariable(value = "first_name") String firstName) {
        return (List<UserData>) userDataRepository.findByFirstName(firstName);
    }*/

    @RequestMapping(value="/test", method={RequestMethod.POST})
    public List<UserData> searchClient(@RequestBody @Valid UserSearchCriteria search){
        return (List<UserData>)userSpec.findBySearchCriteria(search);
    }
}