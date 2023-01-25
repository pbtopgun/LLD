package CaseStudy.ParkingLot.src.dtos;

import CaseStudy.ParkingLot.src.models.Ticket;

public class CreateTicketResponseDTO {
    private Ticket ticket;
    private ResponseStatus status;
    
    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
