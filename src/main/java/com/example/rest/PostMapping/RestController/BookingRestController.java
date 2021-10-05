package com.example.rest.PostMapping.RestController;

import com.example.rest.PostMapping.Bindings.Passanger;
import com.example.rest.PostMapping.Bindings.Ticket;
import com.example.rest.PostMapping.PassangerService.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BookingRestController {
    @Autowired
    private Service service;

    @PostMapping(
            value="/book",
            produces = {"application/xml","application/json"},
            consumes = {"application/xml","application/json"}
    )
    public ResponseEntity<Ticket> booking(Passanger passanger){
        Ticket ticket = service.bookTicket(passanger);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }
}
