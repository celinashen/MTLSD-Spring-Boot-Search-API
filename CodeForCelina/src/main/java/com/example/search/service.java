package com.example.search;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class service {
    @Autowired
    private repository repository;
    
    public Optional<userdata> getData(Integer id){
        return repository.findById(id);
    }
    public List<userdata> getDatas(){
        return repository.findAll();
    }
}