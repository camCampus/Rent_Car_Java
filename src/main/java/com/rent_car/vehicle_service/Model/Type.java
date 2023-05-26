package com.rent_car.vehicle_service.Model;


import javax.persistence.*;

@Entity
public class Type  {
    @Id
    @GeneratedValue
    private int id;
    private String vehicleType;
    private int basePrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public float getKilometerPrice() {
        return kilometerPrice;
    }

    public void setKilometerPrice(float kilometerPrice) {
        this.kilometerPrice = kilometerPrice;
    }

    private float kilometerPrice;
    public Type() {}
}
