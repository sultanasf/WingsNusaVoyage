package models.implementations;

import models.interfaces.Route;
import models.interfaces.TypeAirline;

public class AirlineImp implements Route, TypeAirline {

    private String destination;
    private String origin;
    private String type;
    private int seats;
    private int harga;
    private String classAirline;
    private int bookedSeats;
    private String description;

    public AirlineImp(String type, String destination, String origin, String description) {
        this.destination = destination;
        this.origin = origin;
        this.type = type;
        this.seats = 0;
        this.harga = 0;
        this.classAirline = "economy";
        this.bookedSeats = seats;
        this.description = description;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (bookedSeats >= seats) {
            return false;
        }
        bookedSeats += 1;
        return true;
    }

    public int availableSeats() {
        return this.seats - this.bookedSeats;
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
