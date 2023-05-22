package com.rent_car.vehicle_service.Service;

import com.rent_car.vehicle_service.Model.Vehicle;
import com.rent_car.vehicle_service.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Iterable<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<Vehicle> getVehicle(String registration) {
        return vehicleRepository.findById(registration);
    }

    @Override
    public ResponseEntity<Vehicle> addVehicle(Vehicle vehicle) {
        return null;
    }

    @Override
    public ResponseEntity<Vehicle> updateVehicle(Vehicle vehicle) {
        return null;
    }

    @Override
    public ResponseEntity<Vehicle> deleteVehicle(Vehicle vehicle) {
        return null;
    }

}
