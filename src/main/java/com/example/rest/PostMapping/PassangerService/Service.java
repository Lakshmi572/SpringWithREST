package com.example.rest.PostMapping.PassangerService;

import com.example.rest.PostMapping.Bindings.Passanger;
import com.example.rest.PostMapping.Bindings.Ticket;

@org.springframework.stereotype.Service
public class Service {
    public Ticket bookTicket(Passanger p1){
        Ticket t1=new Ticket();
        t1.setPnr(786878);
        t1.setStatus("Success");
        t1.setPrice(980.00F);
        return t1;
    }
}
