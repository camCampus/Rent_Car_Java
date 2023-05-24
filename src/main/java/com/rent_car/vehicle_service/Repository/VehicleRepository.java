package com.rent_car.vehicle_service.Repository;

import com.rent_car.vehicle_service.Model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

    @Query(value = "FROM Vehicle v WHERE v.registration NOT IN :vehicleList")
    public List<Vehicle> getVehicleNotInResa(@Param("vehicleList") List<String> vehicles);

}
