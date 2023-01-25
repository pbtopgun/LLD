package CaseStudy.ParkingLot.src.controller;

import CaseStudy.ParkingLot.src.dtos.CreateTicketRequestDTO;
import CaseStudy.ParkingLot.src.dtos.CreateTicketResponseDTO;
import CaseStudy.ParkingLot.src.dtos.ResponseStatus;
import CaseStudy.ParkingLot.src.exceptions.NoSpotAvailableException;
import CaseStudy.ParkingLot.src.models.Gate;
import CaseStudy.ParkingLot.src.models.Operator;
import CaseStudy.ParkingLot.src.models.Ticket;
import CaseStudy.ParkingLot.src.models.Vehicle;
import CaseStudy.ParkingLot.src.service.TicketService;



//Interaction point for our clients!!!
public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService service){
        this.ticketService = service;
    }

    //get ///given some info get me more information
    //CRUD

    //Inputs: VehicleInfo, operator info, Gate number, 
    /// DTOs : Data transfer objects

    public CreateTicketResponseDTO createTicket(CreateTicketRequestDTO createTicketRequestDTO) {
        // 1. Get a Vehicle Object from vehicleNumber, work with the vehicle service to get the vehicle
        //2. Get a Slot and create a Ticket!!
        CreateTicketResponseDTO responseDTO = null;
        try {
            Ticket ticket = ticketService.createTicket(createTicketRequestDTO.getVehicleNumber(),createTicketRequestDTO.getGateNumber(),createTicketRequestDTO.getType());
            responseDTO= new CreateTicketResponseDTO();
            responseDTO.setTicket(ticket);
            responseDTO.setStatus(ResponseStatus.SUCCESS);
        } catch(NoSpotAvailableException exception) {
            responseDTO = new CreateTicketResponseDTO();
            responseDTO.setStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
