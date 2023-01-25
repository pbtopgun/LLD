package CaseStudy.ParkingLot.src.models;

public class Vehicle extends BaseModel {
    private VehicleType vehicleType;
    private String number;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
