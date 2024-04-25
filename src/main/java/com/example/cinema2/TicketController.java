package com.example.cinema2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TicketController {

    @Autowired
    CinemaRepository rep;

    @PostMapping("/saveTicket")
    public void saved(AllTickets tickets){
        rep.saveTicket(tickets);
    }

    @GetMapping("/getTickets")
    public List<AllTickets> getTickets(){
        return rep.getTickets();
    }

   // @PostMapping("/deleteAll")


}
