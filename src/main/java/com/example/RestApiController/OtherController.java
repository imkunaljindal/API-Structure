package com.example.RestApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {

    @Autowired
    User obj1;

   public OtherController(){
       System.out.println("OtherController constructor is being called by Spring");
   }

   @GetMapping("/other-controller")
   public User fun(){
       System.out.println("The address of User object in Other Controller " +obj1);
      return obj1;
   }
}
