package fiveLeason;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        ArrayList<String> locations = new ArrayList<String>();
        locations.add("2");
        locations.add("3");
        locations.add("4");
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "Неудача";
        if (result.equals("попал")) {
            testResult = "Пройден";
        }

        System.out.println(testResult);
    }
}
