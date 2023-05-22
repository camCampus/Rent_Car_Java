package com.rent_car.vehicle_service.Model;

import com.rent_car.vehicle_service.Enum.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {

    @Id
    private String registration;
    private Enum<TypeEnum> type;
    private Enum<BrandEnum> brand;
    private Enum<VehicleModelEnum> model;
    private Enum<StatusEnum> status;
    private int kilometer;
    private int taxHorses;
    private Enum<ColorEnum> color;


    public Vehicle(String registration) {
        this.registration = registration;
    }

    public Vehicle() {

    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Enum<TypeEnum> getType() {
        return type;
    }

    public void setType(Enum<TypeEnum> type) {
        this.type = type;
    }

    public Enum<BrandEnum> getBrand() {
        return brand;
    }

    public void setBrand(Enum<BrandEnum> brand) {
        this.brand = brand;
    }

    public Enum<VehicleModelEnum> getModel() {
        return model;
    }

    public void setModel(Enum<VehicleModelEnum> model) {
        this.model = model;
    }

    public Enum<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(Enum<StatusEnum> status) {
        this.status = status;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public int getTaxHorses() {
        return taxHorses;
    }

    public void setTaxHorses(int taxHorses) {
        this.taxHorses = taxHorses;
    }

    public Enum<ColorEnum> getColor() {
        return color;
    }

    public void setColor(Enum<ColorEnum> color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id" + registration +
                ", type=" + type + '\'' +
                ", brand=" + brand +
                ", model=" + model +
                ", status=" + status +
                ", kilometer=" + kilometer +
                ", taxHorses" + taxHorses +
                ", color=" + color +
                '}';
    }
}
