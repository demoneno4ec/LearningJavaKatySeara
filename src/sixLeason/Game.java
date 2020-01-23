package sixLeason;

public class Game {
    private DotCom[] sites;
    int countSites = 3;

    public static void main(String[] args) {
        Game game = new Game();
        game.setSites();
    }

    private void setSites(){

        this.sites = new DotCom[this.countSites];

        for (int index = 0 ; index < this.countSites; ++index) {
            this.sites[index] = new DotCom();
            this.setNameSite(index);
        }
    }

    private void setNameSite(int index) {
        String name = "site.com";
        DotCom site;

        switch (index){
            case (0):
                name = "vk.com";
                break;
            case (1) :
                name = "dot.com";
                break;
            case (2) :
                name = "ya.ru";
                break;
            default:
                name += index;
                break;
        }

        site = this.sites[index];
        site.setName(name);
    }
}
