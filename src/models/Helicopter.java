/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import models.implementations.AirlineImp;

/**
 *
 * @author HP
 */
public class Helicopter extends AirlineImp{
    
    private String function;
    private String pilot;

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }
    
    public Helicopter(String type, String destination, String origin) {
        super(type, destination, origin);
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
