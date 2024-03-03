package ParKing.model;

import java.util.List;

public class ParkingLot extends BaseModel{
    String parkingNumber;
    List<ParkingFloor> parkingParkingFloors;
    List<Gate> parkingGates;
    String Address;
    List<VehicleType> allowedVehicleTypes;
    ParkingLotStatus parkingLotStatus;
    // fee calculating strategy
    //slot assignment strategy
}
