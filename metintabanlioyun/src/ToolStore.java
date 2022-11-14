public class ToolStore extends normalLoc {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    Game game = new Game();
    GameSilahlar[] gameSilahlar = {new GameSilahlarTabanca(), new GameSilahlarKilic(), new GameSilahlarTufek()};

    //GameSilahlar gameSilahlar={new GameSilahlarTabanca(), new GameSilahlarKilic(), new GameSilahlarTufek()};
    // GameCharacter gameCharacter;
    @Override
    public boolean onLocation() {
        getPlayer().silahsec();

        return true;
    }

    public void silahmenu() {
        GameSilahlar[] secsecsilah = {new GameSilahlarTabanca(), new GameSilahlarKilic(), new GameSilahlarTufek()};
        System.out.println("Silahlar\n-----");
        for (GameSilahlar gc : secsecsilah) {
            System.out.println(
                    "Id : " + gc.getId() + "\t\tSilah : " + gc.getSilahName()
                            + "\t\tHasar : " + gc.getDamage()
                            + "\t\tPara : " + gc.getMoney()
            );
        }
    }
    public void silahisatinal(int silahim){
        silah silah=new silah("tabanca",1,4,20);
        silah silah1=new silah("kılıç",2,5,30);
        silah silah2=new silah("tüfek",3,7,40);
    }

    public void silahbuy(int satinal) {
        //System.out.println(getPlayer().getName());

        GameSilahlar gameSilahlar1 = new GameSilahlarTufek();
        GameSilahlar gameSilahlar2 = new GameSilahlarTabanca();
        GameSilahlar gameSilahlar3 = new GameSilahlarKilic();

        System.out.println(getPlayer().getMoney() + " liranız bulunmaktadır.");
        if (satinal == gameSilahlar1.getId()) {
            System.out.println(gameSilahlar1.getSilahName() + " " + gameSilahlar1.getMoney() + " liradır.");
            if (getPlayer().getMoney() < gameSilahlar1.getMoney()) {
                System.out.println("yeterli paranız bulunmamaktadır");
            }
            if (getPlayer().getMoney() > gameSilahlar1.getMoney()) {
                getPlayer().setMoney((getPlayer().getMoney()) - (gameSilahlar1.getMoney()));
                System.out.println(getPlayer().getMoney() + " liranız kaldı");
            }
        }
        if (satinal == gameSilahlar2.getId()) {
            System.out.println(gameSilahlar2.getSilahName() + " " + gameSilahlar2.getMoney() + " liradır");
            if (getPlayer().getMoney() < gameSilahlar2.getMoney()) {
                System.out.println("yeterli paranız bulunmamaktadır");
            }
            if (getPlayer().getMoney() > gameSilahlar2.getMoney()) {
                getPlayer().setMoney((getPlayer().getMoney()) - (gameSilahlar2.getMoney()));
                System.out.println(getPlayer().getMoney() + " liranız kaldı");
            }
        }

        if (satinal == gameSilahlar3.getId()) {
            System.out.println(gameSilahlar3.getSilahName() + " " + gameSilahlar3.getMoney() + " liradır");
            if (getPlayer().getMoney() < gameSilahlar3.getMoney()) {
                System.out.println("yeterli paranız bulunmamaktadır");
            }
            if (getPlayer().getMoney() > gameSilahlar3.getMoney()) {
                getPlayer().setMoney((getPlayer().getMoney()) - (gameSilahlar3.getMoney()));
                System.out.println(getPlayer().getMoney() + " liranız kaldı");
            }
        }

    }

    public void zirhmenu() {
        GameZirhlar[] secseczirh = {new GameZirhlarHafif(), new GameZirhlarOrta(), new GameZirhlarAgir()};
        System.out.println("Zırhlar\n-----");
        for (GameZirhlar gc : secseczirh) {
            System.out.println(
                    "Id : " + gc.getId() + "\t\tSilah : " + gc.getZirhName()
                            + "\t\tEngelleme : " + gc.getEngelleme()
                            + "\t\tPara : " + gc.getMoney()
            );
        }
    }

    public void zirhbuy(int zirhal) {
        GameZirhlar gameZirhlar1 = new GameZirhlarHafif();
        GameZirhlar gameZirhlar2 = new GameZirhlarOrta();
        GameZirhlar gameZirhlar3 = new GameZirhlarAgir();

        System.out.println(getPlayer().getMoney() + " liranız bulunmaktadır.");
        if (zirhal == gameZirhlar1.getId()) {
            System.out.println(gameZirhlar1.getZirhName() + " zırh " + gameZirhlar1.getMoney() + " liradır");
            if (getPlayer().getMoney() < gameZirhlar1.getMoney()) {
                System.out.println("Bakiyeniz yetersiz işlem gerçekleştirilemedii");
            }
            if (getPlayer().getMoney() > gameZirhlar1.getMoney()) {
                System.out.println((getPlayer().getMoney()) - (gameZirhlar1.getMoney()) + " liranız kaldı.");
            }
        }
        if (zirhal == gameZirhlar2.getId()) {
            System.out.println(gameZirhlar2.getZirhName() + " zırh " + gameZirhlar2.getMoney() + " liradır");
            if (getPlayer().getMoney() < gameZirhlar2.getMoney()) {
                System.out.println("Bakiyeniz yetersiz işlem gerçekleştirilemedii");
            }
            if (getPlayer().getMoney() > gameZirhlar2.getMoney()) {
                System.out.println((getPlayer().getMoney()) - (gameZirhlar2.getMoney()) + " liranız kaldı.");
            }
        }
        if (zirhal == gameZirhlar3.getId()) {
            System.out.println(gameZirhlar3.getZirhName() + " zırh " + gameZirhlar3.getMoney() + " liradır");
            if (getPlayer().getMoney() < gameZirhlar3.getMoney()) {
                System.out.println("Bakiyeniz yetersiz işlem gerçekleştirilemedii");
            }
            if (getPlayer().getMoney() > gameZirhlar3.getMoney()) {
                System.out.println((getPlayer().getMoney()) - (gameZirhlar3.getMoney()) + " liranız kaldı.");
            }
        }
    }


}
