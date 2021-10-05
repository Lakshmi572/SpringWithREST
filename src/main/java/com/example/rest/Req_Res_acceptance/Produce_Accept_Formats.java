package com.example.rest.Req_Res_acceptance;

import com.example.rest.Entity.Address;
import com.example.rest.Entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resource")
public class Produce_Accept_Formats {
    @GetMapping(value = {"/res"}, produces = {"application/xml"})
    public ResponseEntity<Student> formats(){
        Student s1=new Student();
        s1.setStudentId(572);
        s1.setStudentName("Ram");
        Address a1=new Address();
        a1.setCity("Hyd");
        a1.setState("Telangana");
        a1.setCountry("India");
        s1.setAddress(a1);
        return new ResponseEntity<>(s1, HttpStatus.OK);
    }
}
