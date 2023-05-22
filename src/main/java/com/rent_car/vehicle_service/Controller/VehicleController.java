package com.rent_car.vehicle_service.Controller;

import com.rent_car.vehicle_service.Model.Vehicle;
import com.rent_car.vehicle_service.Service.VehicleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("Api pour les opérations sur les véhicules")
@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/all")
    public Iterable<Vehicle> getAll() {
        return vehicleService.getAllVehicles();
    }

}
