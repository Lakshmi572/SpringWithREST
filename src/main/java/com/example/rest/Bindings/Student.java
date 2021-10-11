package com.example.rest.Bindings;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Student {
    private Integer studentId;
    private String studentName;
    private Address address;
}
