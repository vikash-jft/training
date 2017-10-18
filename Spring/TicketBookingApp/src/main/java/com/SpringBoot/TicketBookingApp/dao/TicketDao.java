package com.SpringBoot.TicketBookingApp.dao;

import com.SpringBoot.TicketBookingApp.bean.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketDao extends JpaRepository<Ticket, Integer> {

}
