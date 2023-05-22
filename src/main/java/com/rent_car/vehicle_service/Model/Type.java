package com.rent_car.vehicle_service.Model;


import com.rent_car.vehicle_service.Enum.BasePriceEnum;
import com.rent_car.vehicle_service.Enum.TypeEnum;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Type  {
    @Id
    private Enum<TypeEnum> vehicleType;
    private Enum<BasePriceEnum> basePrice;
    private float kilometerPrice;

    public Type() {}
}
