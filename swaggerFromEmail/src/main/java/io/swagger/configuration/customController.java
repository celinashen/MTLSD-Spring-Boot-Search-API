package io.swagger.configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.model.ClientSearchRequest;
import org.springframework.web.bind.annotation.ModelAttribute;

@SpringBootApplication
@Controller
public class customController {
    @RequestMapping(value="/try", method={RequestMethod.GET, RequestMethod.POST})
    public String hello(Model model){
        ClientSearchRequest  ClientSearchRequest =  new ClientSearchRequest();
        model.addAttribute("ClientSearchRequest", ClientSearchRequest);
        System.out.print("ClientSearchRequest");
        return "template";
    }
    //@PostMapping("/try")
    //public String custom(@ModelAttribute("ClientSearchRequest") ClientSearchRequest ClientSearchRequest) {
        //Gson gson=new GsonBuilder().setPrettyPrinting().create();
        //String jsonData=gson.toJson(ClientSearchRequest);
        //System.out.println(jsonData);
        //System.out.println("jsonData");
        //return "yes";
    //}
}