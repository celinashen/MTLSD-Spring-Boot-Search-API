package com.example.searchapi;

import com.example.searchapi.ResourceNotFoundException;
import com.example.searchapi.UserData;
import com.example.searchapi.UserDataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping(value="/test", method={RequestMethod.POST})
    public List<UserData> searchClient(@RequestBody @Valid UserSearchCriteria search){
        return (List<UserData>)userSpec.findBySearchCriteria(search);
    }
}
