package com.SpringBoot.TicketBookingApp.services;

import com.SpringBoot.TicketBookingApp.bean.Ticket;
import com.SpringBoot.TicketBookingApp.dao.TicketDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingServices {
    @Autowired
    private TicketDao ticketDao;

    public Ticket getTicketById(Integer id) {
        return ticketDao.findOne(id);
    }

    public Iterable<Ticket> getAllTickets() {
        return ticketDao.findAll();
    }
}
