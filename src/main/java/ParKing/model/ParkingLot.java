package ParKing.model;

import java.util.List;

public class ParkingLot extends BaseModel{
    String parkingNumber;
    List<ParkingFloor> parkingParkingFloors;
    List<Gate> parkingGates;
    String Address;
    List<VehicleType> allowedVehicleTypes;
    ParkingLotStatus parkingLotStatus;
    SlotAssignmentStrategyType slotAssignmentStrategyType;

    public String getParkingNumber() {
        return parkingNumber;
    }

    public void setParkingNumber(String parkingNumber) {
        this.parkingNumber = parkingNumber;
    }

    public List<ParkingFloor> getParkingParkingFloors() {
        return parkingParkingFloors;
    }

    public void setParkingParkingFloors(List<ParkingFloor> parkingParkingFloors) {
        this.parkingParkingFloors = parkingParkingFloors;
    }

    public List<Gate> getParkingGates() {
        return parkingGates;
    }

    public void setParkingGates(List<Gate> parkingGates) {
        this.parkingGates = parkingGates;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public List<VehicleType> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(List<VehicleType> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public SlotAssignmentStrategyType getSlotAssignmentStrategyType() {
        return slotAssignmentStrategyType;
    }

    public void setSlotAssignmentStrategyType(SlotAssignmentStrategyType slotAssignmentStrategyType) {
        this.slotAssignmentStrategyType = slotAssignmentStrategyType;
    }
    // fee calculating strategy
    //slot assignment strategy
}
