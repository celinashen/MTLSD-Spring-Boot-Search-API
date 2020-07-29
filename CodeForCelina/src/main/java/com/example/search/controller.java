package com.example.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.IOException;
@Controller
public class controller {
    @Autowired
    private service service;
    @GetMapping("/")
    public String getModel(Model model){
        List<userdata> userdatas = service.getDatas();
        model.addAttribute("userdatas",userdatas);
        return "userdata";
    }   
    //etc.
    //@PostMapping(...)
    //public String ...{
        
        //return "...";
    //} 
}