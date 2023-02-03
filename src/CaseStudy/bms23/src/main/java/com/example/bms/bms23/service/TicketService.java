package com.example.bms.bms23.service;

import com.example.bms.bms23.exception.ShowAndShowSeatAreNotRelatedException;
import com.example.bms.bms23.exception.ShowNOtAvailableException;
import com.example.bms.bms23.exception.ShowSeatNotAvailableException;
import com.example.bms.bms23.model.SeatStatus;
import com.example.bms.bms23.model.Show;
import com.example.bms.bms23.model.ShowSeat;
import com.example.bms.bms23.model.Ticket;
import com.example.bms.bms23.model.TicketStatus;
import com.example.bms.bms23.repository.ShowRepository;
import com.example.bms.bms23.repository.ShowSeatRepository;
import com.example.bms.bms23.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    private ShowSeatRepository showSeatRepository;
    private ShowRepository showRepository;
    private TicketRepository ticketRepository;

    @Autowired
    public TicketService(ShowSeatRepository showSeatRepository,
                         ShowRepository showRepository,
                         TicketRepository ticketRepository){
        this.showSeatRepository=showSeatRepository;
        this.showRepository=showRepository;
        this.ticketRepository = ticketRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(List<Long> showSeatIds,Long showId) throws ShowNOtAvailableException,
            ShowSeatNotAvailableException,
            ShowAndShowSeatAreNotRelatedException {
        //Fetch the showseatIds
        List<ShowSeat> showSeats = this.showSeatRepository.findAllById(showSeatIds);

        Optional<Show> optionalShow = showRepository.findById(showId);

        if(!optionalShow.isPresent()) {
            throw new ShowNOtAvailableException("Show is not available");
        }

        //Validate if the showId and showseats belong to same showId!!
        //Check if all of them are available!!
        for(ShowSeat showSeat:showSeats) {
            if(showSeat.getSeatStatus() != SeatStatus.AVAILABLE) {
                throw new ShowSeatNotAvailableException("All seats are not available for booking at the moment, " +
                        "please choose another available seats");
            }
            if(showSeat.getShow().getId() != showId) {
                throw new ShowAndShowSeatAreNotRelatedException("Error!");
            }
        }
        //Lock these seats for the booking.
        for(ShowSeat showSeat:showSeats) {
            showSeat.setSeatStatus(SeatStatus.LOCKED);
            showSeatRepository.save(showSeat);
        }

        //Create a ticket with say Pending status
        Ticket ticket = new Ticket();
        ticket.setShowSeatList(showSeats);
        ticket.setTicketStatus(TicketStatus.PENDING);
        ticket.setShow(showRepository.findById(showId).get());
        ticket.setTimeofBooking(new Date());

        //ticket.setTotalAmount();  /// put a calculation

        return ticketRepository.save(ticket);
    }
}

//Scenario1: Concurrency
          //[Showseat]   ,ShowId
//  bookTicket1 : [2,3,4],1
//  bookTicket2 : [4,5,6],1


//  bookTicket100 : [4,5,6],2
//  bookTicket101 : [1,2,3],2
//  bookTicket102 : [4,5,6],5
//  bookTicket103 : [4,5,6],6
//  bookTicket104 : [4,5,6],9




//Scenario2: Non-Currency
/***
 *
 *      [ 1,2,3,4,5,6
 *        7,8,9,10,...]
 *
 *
 *
 *
 *     [ 1,-2,-3,-4,5,6
 *          7,8,9,10,...]
 *
 */
