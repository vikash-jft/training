package com.SpringBoot.TicketBookingApp.controller;

import com.SpringBoot.TicketBookingApp.bean.Ticket;
import com.SpringBoot.TicketBookingApp.services.TicketBookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TicketbookingController {

    @Autowired
    private TicketBookingServices ticketBookingServices;

    @GetMapping("/user/tickets/{ticketid}")
    @ResponseBody
    public Ticket getTicketById(@PathVariable("ticketid") Integer ticketid){
        return ticketBookingServices.getTicketById(ticketid);
    }
    @GetMapping("/admin/tickets/allTickets")
    @ResponseBody
    public Iterable<Ticket> getAllTickets(){
        return ticketBookingServices.getAllTickets();
    }
}
