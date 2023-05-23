package com.rent_car.vehicle_service.Model;


import com.rent_car.vehicle_service.Enum.BasePriceEnum;
import com.rent_car.vehicle_service.Enum.TypeEnum;

import javax.persistence.*;

@Entity
public class Type  {
    @Id
    @GeneratedValue
    private int id;
    private String vehicleType;
    private int basePrice;
    private float kilometerPrice;
    public Type() {}
}
