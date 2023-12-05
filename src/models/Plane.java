package models;

import models.implementations.AirlineImp;

public class Plane extends AirlineImp {

    private String maskapai;

    public Plane(String type, String destination, String origin, String description) {
        super(type, destination, origin, description);
    }

    public String getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }
}
