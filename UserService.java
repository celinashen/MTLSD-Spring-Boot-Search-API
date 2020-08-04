package com.example.searchapi;

import java.util.List;

import com.example.searchapi.UserData;

public interface UserService {
    
    List<UserData> findAll();
    
    List<UserData> findByCriteria(String firstName, String lastName);

    List<UserData> findBySearchCriteria(UserSearchCriteria search);

    
}