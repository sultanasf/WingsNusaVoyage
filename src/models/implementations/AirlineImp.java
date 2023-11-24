
package models.implementations;

import models.interfaces.Route;
import models.interfaces.TypeAirline;

public class AirlineImp implements Route, TypeAirline{

    private String destination;
    private String origin;
    private String type;
    private int seats;
    private String classAirline;
    private int availableSeats;
    
    public AirlineImp(String type, String destination, String origin ) {
        this.destination = destination;
        this.origin = origin;
        this.type = type;
        this.seats = 0;
        this.classAirline = "economy";
        this.availableSeats = seats;
    }
    
    @Override
    public String getDestination() {
        return this.destination;
    }

    @Override
    public String getOrigin() {
        return this.origin;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getSeats() {
        return this.seats;
    }
    
    @Override
    public String getClassAirline() { 
        return this.classAirline;
        
    }
    
    public boolean reserveSeats() {
        if(availableSeats >= seats) {
            return false;
        }
        availableSeats += 1;
        return true;
    }
    
    public int availableSeats () {
        if(availableSeats >= seats) {
            return 0;
        }
        return this.seats - this.availableSeats;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTotalSeats(int seats) {
        this.seats = seats;
    }

    public void setClassAirline(String classAirline) {
        this.classAirline = classAirline;
    }
    
}
