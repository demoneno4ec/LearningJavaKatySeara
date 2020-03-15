package sixLeason;

import java.util.ArrayList;

public class GameTest {
    public static void main(String[] args) {
        ArrayList<DotCom> sites = new ArrayList<>();

        DotCom site_first = new DotCom();
        site_first.setName("Первый");
        ArrayList<String> first_locations = new ArrayList<>();
        first_locations.add("a2");
        first_locations.add("a3");
        first_locations.add("a4");
        site_first.setLocationCells(first_locations);

        DotCom site_second = new DotCom();
        site_second.setName("Второй");
        ArrayList<String> second_locations = new ArrayList<>();
        second_locations.add("a0");
        second_locations.add("b0");
        second_locations.add("c0");
        site_second.setLocationCells(second_locations);

        DotCom site_third = new DotCom();
        site_third.setName("Третий");
        ArrayList<String> third_locations = new ArrayList<>();
        third_locations.add("g4");
        third_locations.add("g5");
        third_locations.add("g6");
        site_third.setLocationCells(third_locations);

        sites.add(site_first);
        sites.add(site_second);
        sites.add(site_third);

        String userAtempt = "a2";

        String status = "Неудача";
        for (DotCom site : sites){
            if (site.checkYourself(userAtempt).equals("попал")) {
                status = "Успех";
                break;
            }
        }

        System.out.println(status);
    }
}
