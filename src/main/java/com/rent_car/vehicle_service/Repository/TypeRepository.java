package com.rent_car.vehicle_service.Repository;

import com.rent_car.vehicle_service.Model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Enum> {
}
