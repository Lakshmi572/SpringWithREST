package com.example.rest.QueryParameter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/save")
    public ResponseEntity<String> saveStudent(@RequestParam String  name){
        System.out.println(name);
        return new ResponseEntity<>("Student is saved successfully", HttpStatus.OK);
    }
}
