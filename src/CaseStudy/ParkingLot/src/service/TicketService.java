package CaseStudy.ParkingLot.src.service;

import java.util.Date;

import CaseStudy.ParkingLot.src.exceptions.NoSpotAvailableException;
import CaseStudy.ParkingLot.src.models.Gate;
import CaseStudy.ParkingLot.src.models.ParkingSpot;
import CaseStudy.ParkingLot.src.models.Ticket;
import CaseStudy.ParkingLot.src.models.Vehicle;
import CaseStudy.ParkingLot.src.models.VehicleType;
import CaseStudy.ParkingLot.src.repositories.TicketRepository;
import CaseStudy.ParkingLot.src.strategies.SpotAllocationStrategy;

public class TicketService {
    private VehicleService vehicleService;
    private GateService gateService;
    private TicketRepository repository;
    private SpotAllocationStrategy allocationStrategy;



    
    //BREAK 10:43

    //injection
    public TicketService(VehicleService vehicleService, GateService gateService, TicketRepository repository,
            SpotAllocationStrategy allocationStrategy) {
        this.vehicleService = vehicleService;
        this.gateService = gateService;
        this.repository = repository;
        this.allocationStrategy = allocationStrategy;
    }




    public Ticket createTicket(String vehicleNumber, Long gateNumber, VehicleType type) throws NoSpotAvailableException{
        //Get the vehicle from vehicleNumber
        Vehicle vehicle = vehicleService.getVehicleByNumber(vehicleNumber);
        if(vehicle == null) {
            vehicleService.addVehicle(vehicleNumber,type);
        }
        
        Gate gate = gateService.getGateByNumber(gateNumber);
        if(gate == null) {
            //Just throw GateNotFoundException()
        }

        ParkingSpot spot= allocationStrategy.allocate(type, gate);
        
        if(spot == null) {
            throw new NoSpotAvailableException("Not Available Spot");
        }

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setGate(gate);
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(spot);
        ticket.setOperator(gate.getOperator());

        Ticket savedTicket = repository.save(ticket);

        return savedTicket;
    }
    
}
