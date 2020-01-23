package sixLeason;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

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
        this.locationCells = loc;
    }

    public void setName(String name) {
        this.name = name;
    }
}
