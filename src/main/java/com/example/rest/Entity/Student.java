package com.example.rest.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer studentId;
    private String studentName;
    private Address address;
}
