package ParKing.strategies;

import ParKing.model.Gate;
import ParKing.model.ParkingSlot;
import ParKing.model.SlotAssignmentStrategyType;
import ParKing.model.VehicleType;

public interface SlotAssignmentStrategy {
    ParkingSlot getParkingSlot(Gate gate, VehicleType vehicleType);
}
