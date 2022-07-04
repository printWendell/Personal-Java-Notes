package com.company.OOP.Classes;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

//    setter method
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
        this.model = model;
    }

//    getter method
    public String getModel(){
        return this.model;
    }
}
