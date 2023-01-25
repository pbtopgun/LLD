package CaseStudy.ParkingLot.src.models;

import CaseStudy.ParkingLot.src.BaseModel;

public class ElectricParkingSpot extends BaseModel {
    private ParkingSpot parkingSpot;
    private ElectricCharger electricCharger;

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public ElectricCharger getElectricCharger() {
        return electricCharger;
    }

    public void setElectricCharger(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }
}
