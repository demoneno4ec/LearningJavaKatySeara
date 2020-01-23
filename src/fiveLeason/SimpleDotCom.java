package fiveLeason;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells;

    public String checkYourself(String userGuess) {

        String status = "мимо";
        int index = locationCells.indexOf(userGuess);

        if (index >= 0) {
            locationCells.remove(index);
            status = "попал";

        }

        if (locationCells.isEmpty()){
            status = "потопил";
        }

        return status;
    }

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
}
