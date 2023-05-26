package com.rent_car.vehicle_service.Controller;

import com.rent_car.vehicle_service.Model.Vehicle;
import com.rent_car.vehicle_service.Service.VehicleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api("Api pour les opérations sur les véhicules")
@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("")
    public Iterable<Vehicle> getAll() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/{id}")
    public Optional<Vehicle> getOneVehicle(@PathVariable String id)
    {
        return vehicleService.getVehicle(id);
    }

    @PostMapping("")
    public ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle)
    {
        return vehicleService.addVehicle(vehicle);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateVehicle(@PathVariable String id, @RequestBody Vehicle vehicle)
    {
        return vehicleService.updateVehicle(id, vehicle);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVehicle(@PathVariable String id)
    {
        return vehicleService.deleteVehicle(id);
    }

    @PostMapping ("/out/resa")
    public List<Vehicle> getVehicleNotInResa(@RequestBody List<String> vehicleList)
    {
        return vehicleService.vehicleNotInResa(vehicleList);
    }

}
