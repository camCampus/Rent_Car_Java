package com.rent_car.vehicle_service.Repository;

import com.rent_car.vehicle_service.Model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TypeRepository extends JpaRepository<Type, Integer> {

	@Query("SELECT t FROM Type t WHERE t.vehicleType = ?1")
	Optional<Type> findByVehicleType(String vehicleType);

}
