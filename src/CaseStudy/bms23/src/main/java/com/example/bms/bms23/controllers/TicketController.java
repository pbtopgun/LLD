package com.example.bms.bms23.controllers;

import com.example.bms.bms23.dto.TicketBookingRequest;
import com.example.bms.bms23.dto.TicketBookingResponse;
import com.example.bms.bms23.exception.ShowAndShowSeatAreNotRelatedException;
import com.example.bms.bms23.exception.ShowNOtAvailableException;
import com.example.bms.bms23.exception.ShowSeatNotAvailableException;
import com.example.bms.bms23.model.Ticket;
import com.example.bms.bms23.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public TicketBookingResponse bookTicket(TicketBookingRequest ticketBookingRequest) throws
            ShowAndShowSeatAreNotRelatedException,
            ShowNOtAvailableException,
            ShowSeatNotAvailableException {
        //Input Validation
        if(ticketBookingRequest.getShowId() != null && ticketBookingRequest.getShowSeatIds()!=null
                &&  ticketBookingRequest.getShowSeatIds().size() > 0) {
            Ticket ticket = this.ticketService.bookTicket(ticketBookingRequest.getShowSeatIds(),
                    ticketBookingRequest.getShowId());
            TicketBookingResponse successTicketResponse =  new TicketBookingResponse();
            successTicketResponse.setStatus("success");
            successTicketResponse.setTicket(ticket);
        }

        TicketBookingResponse ticketBookingResponse =  new TicketBookingResponse();
        ticketBookingResponse.setMessage("Failure, not valid inputs, please give showId or Provide Seats");
        ticketBookingResponse.setStatus("failure");
        return ticketBookingResponse;
    }
}
