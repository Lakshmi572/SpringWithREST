package com.example.rest.PathParameter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseRestController {
    @GetMapping("/details/{cName}/{tutor}")
    public ResponseEntity<String> getCourseDetails(@PathVariable String cName,@PathVariable String tutor){
        String msg="";
        if("SBMS".equals(cName) && "Rob".equals(tutor)){
            msg="SBMS course starts from 3rd October";
        }else if("Hibernate".equals(cName) && "Achan".equals(tutor)){
            msg="Hibernate course starts from 3rd November";
        }else{
            msg="Visit the website to know more";
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
