/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.logica;

public class Auto {
    
    private int id_auto;
    private String brand;
    private String model;
    private String engine;
    private String color;
    private String license_plate;
    private String car_door;

    public Auto(int id_auto, String brand, String model, String engine, String color, String license_plate, String car_door) {
        this.id_auto = id_auto;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.license_plate = license_plate;
        this.car_door = car_door;
    }

    public Auto(String brand, String model, String engine, String color, String license_plate, String car_door) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.license_plate = license_plate;
        this.car_door = car_door;
    }
  
    public Auto() {
    }
    
    public int getId_auto() {
        return id_auto;
    }

    public void setId_auto(int id_auto) {
        this.id_auto = id_auto;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public String getCar_door() {
        return car_door;
    }

    public void setCar_door(String car_door) {
        this.car_door = car_door;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
 
}
