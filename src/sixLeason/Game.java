package sixLeason;

import java.util.ArrayList;

public class Game {
    private ArrayList<DotCom> sites;
    private int countSites = 3;
    private int numOfAttempts = 0;
    private GameHelper helper = new GameHelper();

    protected void setSites(ArrayList<DotCom> sites){
        this.sites = sites;
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.upGame();
        game.startPlaying();
        game.finishGame();
    }

    private void upGame() {
        this.initSites();

        ArrayList<String> siteLocation = new ArrayList<>();
        for (DotCom site : this.sites) {
//            siteLocation = helper.placeDotCom();
            site.setLocationCells(siteLocation);
        }

        System.out.println("Вша цель потопить " + this.countSites + "сайта");
    }

    protected void startPlaying() {
        String userInput;
        while (!sites.isEmpty()) {
            userInput = helper.getUserInput("Сделайте ход");
            checkUserAttempt(userInput);
        }
    }

    private void checkUserAttempt(String atempt) {
        ++this.numOfAttempts;
        String status = "мимо";

        for (DotCom site : this.sites){
            status = site.checkYourself(atempt);

            if (status.equals("попал")) {
                break;
            }

            if (status.equals("потопил")){
                sites.remove(site);
                break;
            }
        }

        System.out.println(status);
    }

    protected void finishGame() {
        System.out.println("Вы потопили все сайты за " + this.numOfAttempts + " - попыток");

        String result = "Капитальный красавчик, есть жы";

        if (this.numOfAttempts > 19) {
            result = "Ты кто такой?? Давай, до свидания!";
        }

        System.out.println(result);
    }

    private void initSites() {
        DotCom site;
        for (int index = 0; index < this.countSites; ++index) {
            site = new DotCom();
            sites.add(site);
            this.setNameSite(index, site);
        }
    }

    private void setNameSite(int index, DotCom site) {
        String name = "site.com";

        switch (index) {
            case (0):
                name = "vk.com";
                break;
            case (1):
                name = "dot.com";
                break;
            case (2):
                name = "ya.ru";
                break;
            default:
                name += index;
                break;
        }

        site.setName(name);
    }
}
