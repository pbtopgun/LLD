package com.example.bms.bms23.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private double totalAmount;

    @ManyToOne
    private Show show;


    @ManyToMany
    private List<ShowSeat> showSeatList;
    @Enumerated(EnumType.ORDINAL)
    private TicketStatus ticketStatus;
    private Date timeofBooking;

    @OneToMany(mappedBy = "ticket")
    private List<Payment> payments;
}
