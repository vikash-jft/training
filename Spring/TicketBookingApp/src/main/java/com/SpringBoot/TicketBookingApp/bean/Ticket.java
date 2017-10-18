package com.SpringBoot.TicketBookingApp.bean;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ticketId")
    private Integer ticketId;
    @Column(name = "passangerName",nullable = false)
    private String passangerName;
    @Column(name = "sourceStation")
    private String sourceStation;
    @Column(name = "destStation")
    private String destStation;
    @Column(name = "journeyDate")
    private Date journeyDate;
    @Column(name = "email")
    private String email;

    public Ticket() {
    }
    public Ticket(String passangerName, String sourceStation, String destStation, Date journeyDate, String email) {
        this.passangerName = passangerName;
        this.sourceStation = sourceStation;
        this.destStation = destStation;
        this.journeyDate = journeyDate;
        this.email = email;
    }
    public Integer getTicketId() {
        return ticketId;
    }
    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }
    public String getPassangerName() {
        return passangerName;
    }
    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }
    public String getSourceStation() {
        return sourceStation;
    }
    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }
    public String getDestStation() {
        return destStation;
    }
    public void setDestStation(String destStation) {
        this.destStation = destStation;
    }
    public Date getJourneyDate() {
        return journeyDate;
    }
    public void setJourneyDate(Date journeyDate) {
        this.journeyDate = journeyDate;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
