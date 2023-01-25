package CaseStudy.ParkingLot.src.dtos;

import CaseStudy.ParkingLot.src.models.VehicleType;

public class CreateTicketRequestDTO {
    
    //vehicle, gate
    private Long gateNumber;
    private String vehicleNumber;
    private VehicleType type;

    public Long getGateNumber() {
        return gateNumber;
    }
    public void setGateNumber(Long gateNumber) {
        this.gateNumber = gateNumber;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public VehicleType getType() {
        return type;
    }
    public void setType(VehicleType type) {
        this.type = type;
    }

    
}
