package ParKing.repositories;

import ParKing.model.Vehicle;

import java.util.Optional;

public class VehicleRepository {
    public Optional<Vehicle> getVehicleByVehicleNumber(String vehicleNumber){
        return Optional.empty();
    }
    public Vehicle saveVehicle(Vehicle vehicle){
        return vehicle;
    }
}
