package ParKing.model;

import java.util.List;

public class ParkingFloor extends BaseModel{
    List<ParkingSlot> parkingSlots;
    String ParkingFloorNumber;
    ParkingFloorStatus parkingFloorStatus;
    List<VehicleType> allowedVehicleType;

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public String getParkingFloorNumber() {
        return ParkingFloorNumber;
    }

    public void setParkingFloorNumber(String parkingFloorNumber) {
        ParkingFloorNumber = parkingFloorNumber;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<VehicleType> getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(List<VehicleType> allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }
}
