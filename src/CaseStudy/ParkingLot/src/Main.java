package CaseStudy.ParkingLot.src;

import CaseStudy.ParkingLot.src.controller.TicketController;
import CaseStudy.ParkingLot.src.dtos.CreateTicketRequestDTO;
import CaseStudy.ParkingLot.src.dtos.CreateTicketResponseDTO;
import CaseStudy.ParkingLot.src.dtos.ResponseStatus;
import CaseStudy.ParkingLot.src.models.Ticket;
import CaseStudy.ParkingLot.src.models.VehicleType;
import CaseStudy.ParkingLot.src.repositories.TicketRepository;
import CaseStudy.ParkingLot.src.service.GateService;
import CaseStudy.ParkingLot.src.service.TicketService;
import CaseStudy.ParkingLot.src.service.VehicleService;
import CaseStudy.ParkingLot.src.strategies.NearestToExitGate;
import CaseStudy.ParkingLot.src.strategies.SpotAllocationStrategy;

public class Main {
    public static void main(String[] args) throws Exception {
        // Client

        VehicleService vehicleService = new VehicleService();
        GateService gateService = new GateService();
        TicketRepository ticketRepository = new TicketRepository();
        SpotAllocationStrategy allocationStrategy = new NearestToExitGate();

        TicketService ticketService = 
        new TicketService(vehicleService, gateService, ticketRepository, allocationStrategy);

        TicketController ticketController = new TicketController(ticketService);


        //SAMPLE REQUEST
        CreateTicketRequestDTO createTicketRequestDTO = new CreateTicketRequestDTO();
        createTicketRequestDTO.setGateNumber(1L);
        createTicketRequestDTO.setType(VehicleType.ELECTRIC);
        createTicketRequestDTO.setVehicleNumber("KA-ABC-07891892");

        CreateTicketResponseDTO createTicketResponseDTO =  ticketController.createTicket(createTicketRequestDTO);

        if(createTicketResponseDTO.getStatus() == ResponseStatus.SUCCESS) {
            System.out.println("ABLE TO CREATE A TICKET");
            Ticket ticket = createTicketResponseDTO.getTicket();
        }

    }

}
/**
 * Requirement focus:
 * 1. Allow a operator to generate a ticket.
 * 2. Admin should be able to create a Parking Lot!!! 
 * 
 * 
 * H/W
 *  Shoule be able to create a Parking Lot:
 *      ParkingFloor
 *      Gate
 * 
 * Generate a Bill ??
 * 
 */
