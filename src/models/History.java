
package models;

import models.implementations.AirlineImp;

import java.util.ArrayList;

public class History {
    private ArrayList<AirlineImp> historyList = new ArrayList();

    public History(ArrayList<AirlineImp> historyList) {
        this.historyList = historyList;
    }

    public void getHistory() {
        for (AirlineImp booking : historyList) {
            System.out.println(booking);
        }
    }
}
