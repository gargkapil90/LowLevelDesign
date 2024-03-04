package ParKing.service;

import ParKing.model.*;
import ParKing.repositories.GateRepository;
import ParKing.repositories.ParkingLotRepository;
import ParKing.repositories.TokenRepository;
import ParKing.repositories.VehicleRepository;
import ParKing.strategies.SlotAssignmentStrategyFactory;

import java.util.Optional;

public class TokenService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TokenRepository tokenRepository;
    public TokenService(GateRepository gateRepository,
                        VehicleRepository vehicleRepository,
                        ParkingLotRepository parkingLotRepository,
                        TokenRepository tokenRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.tokenRepository = tokenRepository;
    }

    public Token IssueToken(
            String vehicleNumber,
            String ownerName,
            long gateId,
            VehicleType vehicleType
    ){
        Token tokenObj = new Token();
        Optional<Gate> gateOptional = gateRepository.getGateByGateId(gateId);
        if(gateOptional.isEmpty()){
            throw new IllegalArgumentException();
        }
        Gate gate = gateOptional.get();
        tokenObj.setGeneratedAtGate(gate);
        tokenObj.setOperator(gate.getCurrentOperator());

        Optional<Vehicle> vehicleOptional = vehicleRepository.getVehicleByVehicleNumber(vehicleNumber);
        Vehicle vehicle;
        if(vehicleOptional.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);
            vehicleRepository.saveVehicle(vehicle);

        }else{
            vehicle = vehicleOptional.get();
        }
        tokenObj.setVehicle(vehicle);
        SlotAssignmentStrategyType slotAssignmentStrategyType = parkingLotRepository
                .getParkingLotByGateId(gateId)
                .getSlotAssignmentStrategyType();

        ParkingSlot parkingSlot = SlotAssignmentStrategyFactory
                .getparkingSlot(slotAssignmentStrategyType)
                .getParkingSlot(gate, vehicleType);
        tokenObj.setParkingSlot(parkingSlot);
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FILLED);
        tokenObj = tokenRepository.saveToken(tokenObj);
        parkingLotRepository.saveParkingSlot(parkingSlot);
        return tokenObj;
    }
}
