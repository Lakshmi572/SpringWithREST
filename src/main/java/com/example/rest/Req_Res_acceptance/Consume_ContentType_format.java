package com.example.rest.Req_Res_acceptance;

import com.example.rest.Entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Consume_ContentType_format {
    @PostMapping(value = "/sent", consumes = "application/xml", produces = "application/json")
    public ResponseEntity<Student> sentStudent(@RequestBody Student s1){
        System.out.println(s1);
        String msg="Student saved successfully";
        return new ResponseEntity<>(s1, HttpStatus.OK);
    }
}
