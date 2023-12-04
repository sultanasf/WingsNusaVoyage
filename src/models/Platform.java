package models;

import java.util.ArrayList;
import models.implementations.AirlineImp;
import models.implementations.UserImp;

public class Platform {

    private ArrayList<UserImp> users;
    private ArrayList<AirlineImp> airlines;

    public Platform() {
        this.users = new ArrayList<>();
        this.airlines = new ArrayList<>();
    }

    public void addUser(UserImp user) {
        this.users.add(user);
    }

    public UserImp getUserIndex(int index) {
        return this.users.get(index);
    }

    public int getUserObject(String username, String password) throws Exception {
        int index = 0;
        for (UserImp user : users) {
            if (user.auth(username, password)) {
                return index;
            }
            index++;
        }
        throw new Exception("not found");
    }

    public void deleteFromIndexUser(int index) {
        this.users.remove(index);
    }

    public void deleteFromObjectUser(UserImp user) {
        this.users.remove(user);
    }

    public ArrayList<AirlineImp> getAirline() {
        return airlines;
    }

    public AirlineImp getAirLinesIndex(int index) {
        return airlines.get(index);
    }

    public void addAirlines(AirlineImp airline) {
        this.airlines.add(airline);
    }

    public void deleteFromIndexAirline(int index) {
        this.airlines.remove(index);
    }

    public void deleteFromObjectAirline(AirlineImp airline) {
        this.airlines.remove(airline);
    }

}
