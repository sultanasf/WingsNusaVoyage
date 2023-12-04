
package models;

import models.implementations.AirlineImp;

import java.util.ArrayList;

public class History {
    private ArrayList<AirlineImp> historyList;

    public History(ArrayList<AirlineImp> historyList) {
        this.historyList = historyList;
    }
    
    public boolean addHistory (AirlineImp airline) {
        try {
            historyList.add(airline);
            return true;
        }
        catch (Exception e) {
            return false;
        }
        
    }
    
    public ArrayList<AirlineImp> getListcart() {
        return this.historyList;
    }
}
