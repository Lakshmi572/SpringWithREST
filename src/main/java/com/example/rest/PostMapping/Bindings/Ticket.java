package com.example.rest.PostMapping.Bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private Integer pnr;
    private String status;
    private Float price;
}
