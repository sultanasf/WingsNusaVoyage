
package models;
import java.util.ArrayList;
import models.implementations.AirlineImp;
import models.implementations.UserImp;

public class Platform {
    private ArrayList<UserImp> users = new ArrayList<>();
    private ArrayList<AirlineImp> airlines = new ArrayList<>();
    
    public void addUser (UserImp user) {
        this.users.add(user);
    }
    
    public void deleteFromIndexUser(int index) {
        this.users.remove(index);
    }
    
    public void deleteFromObjectUser (UserImp user) {
        this.users.remove(user);
    }
    
    public void addAirlines(AirlineImp airline) {
        this.airlines.add(airline);
    }
    
    public void deleteFromIndexAirline (int index) {
        this.airlines.remove(index);
    }
    
    public void deleteFromObjectAirline(AirlineImp airline) {
        this.airlines.remove(airline);
    }
    
}
