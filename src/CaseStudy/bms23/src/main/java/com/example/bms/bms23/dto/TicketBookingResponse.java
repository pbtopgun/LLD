package com.example.bms.bms23.dto;

import com.example.bms.bms23.model.Ticket;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketBookingResponse {
    private String status;
    private String message;
    private Ticket ticket;
}
