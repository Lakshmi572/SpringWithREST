package com.example.rest.PostMapping.Bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
public class Passanger {
    private Integer Id;
    private String name;
    private String from;
    private String to;
    private String doj;
}
