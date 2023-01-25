package CaseStudy.ParkingLot.src.strategies;

import CaseStudy.ParkingLot.src.models.Gate;
import CaseStudy.ParkingLot.src.models.ParkingSpot;
import CaseStudy.ParkingLot.src.models.VehicleType;

public interface SpotAllocationStrategy {
    ParkingSpot allocate(VehicleType vehicleType,Gate gate);  //
}
