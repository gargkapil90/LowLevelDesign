package ParKing.strategies;

import ParKing.model.ParkingSlot;
import ParKing.model.SlotAssignmentStrategyType;

public class SlotAssignmentStrategyFactory {
    public  static SlotAssignmentStrategy getparkingSlot(SlotAssignmentStrategyType slotAssignmentStrategyType){
        return new RandonSlotAssignmentStrategy();
    }
}
