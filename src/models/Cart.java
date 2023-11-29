
package models;

import models.implementations.AirlineImp;
import java.util.ArrayList;

public class Cart {
    private ArrayList<AirlineImp> listCart = new ArrayList<>();
    private Booking booking = new Booking();
    
    public boolean checkout(int index) {
        try {
            AirlineImp airline = listCart.get(index);
            booking.addBooking(airline);
            listCart.remove(index);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
    
    
    public boolean addCart (AirlineImp airline) {
        try {
            listCart.add(airline);
            return true;
        }
        catch (Exception e) {
            return false;
        }
        
    }
    
    public ArrayList<AirlineImp> getListcart() {
        return this.listCart;
    }
    
    public boolean removeCart(int index) {
        try {
            listCart.remove(index);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
    
    public AirlineImp getOnecart(int index) {
        return listCart.get(index);
    }
    
    public int getObject(AirlineImp airline) throws Exception{
        int index = 0;
        for(AirlineImp airlin : listCart) {
            if(airlin.getDescription().equals(airline.getDescription())) {
                return index;
            }
            index++;
        }
        throw new Exception("cart not found");
    }
    
}
