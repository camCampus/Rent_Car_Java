package com.rent_car.vehicle_service.Service;

import com.rent_car.vehicle_service.Model.Vehicle;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface VehicleService {
    Iterable<Vehicle> getAllVehicles();
    Optional<Vehicle> getVehicle(String registration);
    ResponseEntity<String> addVehicle(Vehicle vehicle);
    ResponseEntity<String> updateVehicle(Vehicle vehicle);
    ResponseEntity<String> deleteVehicle(String registration);
    List<Vehicle>vehicleNotInResa(List<String> vehicleList);

}
