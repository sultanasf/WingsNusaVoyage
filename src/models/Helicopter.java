package models;

import models.implementations.AirlineImp;

public class Helicopter extends AirlineImp {

    private String pilot;

    public Helicopter(String type, String destination, String origin, String description) {
        super(type, destination, origin, description);
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }
}
