package com.rent_car.vehicle_service.Service;

import com.rent_car.vehicle_service.Enum.StatusEnum;
import com.rent_car.vehicle_service.Model.Vehicle;
import com.rent_car.vehicle_service.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Iterable<Vehicle> getAllVehicles()
    {
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<Vehicle> getVehicle(String registration)
    {
        return vehicleRepository.findById(registration);
    }

    @Override
    public ResponseEntity<String> addVehicle(Vehicle vehicle)
    {
        Vehicle existingVehicle = vehicleRepository.findById(
                vehicle.getRegistration()).orElse(null);
        if (existingVehicle == null) {
            vehicleRepository.save(vehicle);
            return ResponseEntity.status(HttpStatus.OK).body("Vehicle add successfully");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error");
    }

    @Override
    public ResponseEntity<String> updateVehicle(Vehicle vehicle)
    {
        Vehicle existingVehicle = vehicleRepository.findById(vehicle.getRegistration()).orElse(null);
        if (existingVehicle == null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vehicle not found");
        }
        vehicleRepository.save(vehicle);
        return ResponseEntity.status(HttpStatus.OK).body("Record updated Successfully");
    }

    @Override
    public ResponseEntity<String> deleteVehicle(String registration)
    {
        Vehicle existingVehicle = vehicleRepository.findById(registration).orElse(null);
        if (existingVehicle == null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vehicle not found");
        }
        vehicleRepository.delete(existingVehicle);
        return ResponseEntity.status(HttpStatus.OK).body("Record delete Successfully");
    }

    @Override
    public ResponseEntity<String> userVehicleSelection(String id)
    {
        Vehicle vehicle = vehicleRepository.findById(id).orElse(null);
        if (vehicle != null)
        {
            vehicle.setStatus(String.valueOf(StatusEnum.PENDING));
            vehicleRepository.save(vehicle);
            return ResponseEntity.status(HttpStatus.OK).body("Vehicle is now pending");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ooops vehicle not found");
    }

}
