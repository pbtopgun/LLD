package CaseStudy.ParkingLot.src.repositories;

import java.util.HashMap;
import java.util.Map;

import CaseStudy.ParkingLot.src.models.Ticket;

public class TicketRepository {

    //Storing things in Memory Map 

    Map<Long,Ticket> tickets = new HashMap();
    Long runningId=0L;

    public Ticket save(Ticket ticket) {
        runningId+=1;
        ticket.setId(runningId);
        tickets.put(runningId, ticket);
        return ticket;
    }
       
}
