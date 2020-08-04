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

    List<UserData> findAll();
    
}
