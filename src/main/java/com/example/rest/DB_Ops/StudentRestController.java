package com.example.rest.DB_Ops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.rest.DB_Ops.StudentRepo;


@RequestMapping("/studentEntity")
@RestController
public class StudentRestController {
    private StudentRepo repo;

    @PostMapping(value = "/save",
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"})
    public ResponseEntity<String> saveStudent(@RequestBody StudentEntity s1) {
        String msg = "";
        StudentEntity save = repo.save(s1);
        if (save.getId() != null) {
            msg = "student saved successfully";
        } else {
            msg = "Operation failed";
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
