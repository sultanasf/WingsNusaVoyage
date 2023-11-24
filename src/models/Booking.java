package models;

import models.implementations.AirlineImp;
import java.util.ArrayList;

public class Booking {
    private ArrayList<AirlineImp> listBooking = new ArrayList<>();
    
    public ArrayList<AirlineImp> getListBooking() {
        return listBooking;
    }
    
    public boolean addBooking(AirlineImp airline) {
        try {
            listBooking.add(airline);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
    
    public boolean removeBooking(int index) {
        try {
            listBooking.remove(index);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
