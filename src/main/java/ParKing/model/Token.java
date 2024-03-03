package ParKing.model;

import java.util.Date;

public class Token {
    String tokenNumber;
    Date entryTime;
    Gate generatedAtGate;
    Vehicle vehicle;
    Operator operator;
    ParkingSlot parkingSlot;

    public String getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getGeneratedAtGate() {
        return generatedAtGate;
    }

    public void setGeneratedAtGate(Gate generatedAtGate) {
        this.generatedAtGate = generatedAtGate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
}
