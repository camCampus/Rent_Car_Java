package com.rent_car.vehicle_service.Service;

import com.rent_car.vehicle_service.Model.Vehicle;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface VehicleService {
    Iterable<Vehicle> getAllVehicles();
    Optional<Vehicle> getVehicle(String registration);
    ResponseEntity<Vehicle> addVehicle(Vehicle vehicle);
    ResponseEntity<Vehicle> updateVehicle(Vehicle vehicle);
    ResponseEntity<Vehicle> deleteVehicle(Vehicle vehicle);


}
