package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeMsg {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){
        String Responsemsg="Welcome to the first app for Spring with Rest";
        return new ResponseEntity<>(Responsemsg, HttpStatus.OK);
    }

    @GetMapping("/wish")
    public ResponseEntity<String> greet(){
        String Responsemsg="Good morning!!!";
        return new ResponseEntity<>(Responsemsg, HttpStatus.OK);
    }
}
