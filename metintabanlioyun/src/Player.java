import java.util.Scanner;

public class Player {
    private int Id;
    private int damage;
    private int health;
    private int money;
    private String name;
    protected Envanter envanter;
    private int realhealth;

    public Player(int id, int damage, int health, int money, String name, Envanter envanter, int realhealth) {
        Id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name = name;
        this.envanter = envanter;
        this.realhealth = health;
    }

    public int getRealhealth() {
        return realhealth;
    }

    public void setRealhealth(int realhealth) {
        this.realhealth = health;
    }

    public Scanner scann = new Scanner(System.in);
    Game game = new Game();

    public Player() {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
silah silah=new silah("yumruk",4,2,2);
    public void karaktersec() {
        System.out.print("Kullanıcı adı : ");
        String playerName = scann.nextLine();
        game.duzcizgi();
        GameCharacter[] secsec = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        game.duzcizgi();
        for (GameCharacter gc : secsec) {
            System.out.println(
                    "Id : " + gc.getId() + "\t\tKarakter adı : " + gc.getName()
                            + "\t\tSağlık : " + gc.getHealth() + "\t\tHasar : " + gc.getDamage()
                            + "\t\tPara : " + gc.getMoney()
            );
        }
        System.out.println("---\nHatalı seçim yapılırsa default karakter olarak samuray seçilecektir");
        System.out.print("Seçmek istediğiniz karakterin ID numarası : ");
        int karaktersecimi = scann.nextInt();

        switch (karaktersecimi) {
            case 1:
                secilenkarakter(new Samurai());
                break;
            case 2:
                secilenkarakter(new Archer());
                break;
            case 3:
                secilenkarakter(new Knight());
                break;
            default:
                secilenkarakter(new Samurai());
                break;
        }

        System.out.println("Karakter oluşturuldu\n" +
                "isim   : "+getName().trim()+" "+playerName+"\n" +
                "sağlık : "+getHealth()+"\n" +
                "Hasar  : "+getDamage()+"\n" +
                "Para   : "+getMoney()+"\n" +
                "Zırh   : "+"\n" +
                "Silah  : "+ silah.getSilahName() +"\n");
    }

    public void secilenkarakter(GameCharacter gameCharacter) {
        this.setName(gameCharacter.getName());
        this.setId(gameCharacter.getId());
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setRealhealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        //silah.setSilahName(silah.getSilahName());
        //this.setMoney(gameCharacter.getMoney()+obstacle.getAward()+this.getMoney());

        game.duzcizgi();
    }
    Obstacle obstacle;
    public void moneyhesap(){
        this.setMoney(obstacle.getAward()+this.getMoney());
    }



    public void silahsec() {
        ToolStore toolStore=new ToolStore(this);
        System.out.print("Mağazaya Hoşgeldiniz\n" +
                "1-Silahlar\n" +
                "2-Zırhlar\n" +
                "3-Çıkış Yap\n" +
                "Seçiminiz : ");
        int magazasecim = scann.nextInt();
        while (magazasecim < 1 || magazasecim > 3) {
            System.out.println("Hatalı seçim. Tekrar deneyiniz.");
        }


        if (magazasecim == 1) {
           /* GameSilahlar[] secsecsilah = {new GameSilahlarTabanca(), new GameSilahlarKilic(), new GameSilahlarTufek()};
            System.out.println("Silahlar\n-----");
            for (GameSilahlar gc : secsecsilah) {
                System.out.println(
                        "Id : " + gc.getId() + "\t\tSilah : " + gc.getSilahName()
                                + "\t\tHasar : " + gc.getDamage()
                                + "\t\tPara : " + gc.getMoney()
                );
            }*/
            toolStore.silahmenu();

            System.out.print("seçiminiz : ");
            int silahsecim = scann.nextInt();

            while (silahsecim < 1 || silahsecim > 3) {
                System.out.println("Hatalı seçim Tekrar deneyiniz");
            }
            switch (silahsecim) {
                case 1:
                    silahsecti(new GameSilahlarTabanca());
                    toolStore.silahbuy(silahsecim);
                    break;
                case 2:
                    silahsecti(new GameSilahlarKilic());
                    toolStore.silahbuy(silahsecim);
                    break;
                case 3:
                    silahsecti(new GameSilahlarTufek());
                    toolStore.silahbuy(silahsecim);
                    break;
                default:
                    System.out.println("hatalı giriş");
                    break;
            }

        }

        if (magazasecim == 2) {

       toolStore.zirhmenu();
            System.out.print("seçiminiz : ");
            int zirhsecim = scann.nextInt();

            while (zirhsecim < 1 || zirhsecim > 3) {
                System.out.println("Hatalı seçim Tekrar deneyiniz");
            }
            switch (zirhsecim) {
                case 1:
                    zirhsecti(new GameZirhlarHafif());
                    toolStore.zirhbuy(zirhsecim);
                    break;
                case 2:
                    zirhsecti(new GameZirhlarOrta());
                    toolStore.zirhbuy(zirhsecim);
                    break;
                case 3:
                    zirhsecti(new GameZirhlarAgir());
                    toolStore.zirhbuy(zirhsecim);
                    break;
                default:
                    System.out.println("hatalı giriş");
                    break;
            }

        }


        if (magazasecim == 3) {
            System.out.println("mağazadan çıkılıyor");
        }
    }
public void silahim(silah silah1){
        silah1.setSilahName(silah1.getSilahName());
        silah1.setId(silah1.getId());
        silah1.setDamage(silah1.getDamage());
        silah1.setMoney(silah1.getMoney());

    System.out.println(silah1.getSilahName().trim()+" silahını seçtiniz."+silah1.getMoney()+" lira");
}

    public void silahsecti(GameSilahlar gameSilahlar) {
        gameSilahlar.setSilahName(gameSilahlar.getSilahName());
        gameSilahlar.setId(gameSilahlar.getId());
        gameSilahlar.setDamage(gameSilahlar.getDamage());
        gameSilahlar.setMoney(gameSilahlar.getMoney());


        System.out.println(gameSilahlar.getSilahName().trim() + " silahını seçtiniz " + gameSilahlar.getMoney());

        game.duzcizgi();
    }

    public void zirhsecti(GameZirhlar gameZirhlar) {
        gameZirhlar.setId(gameZirhlar.getId());
        gameZirhlar.setZirhName(gameZirhlar.getZirhName());
        gameZirhlar.setEngelleme(gameZirhlar.getEngelleme());
        gameZirhlar.setMoney(gameZirhlar.getMoney());

        System.out.println(gameZirhlar.getZirhName().trim() + " zırhını seçtiniz seçtiniz " + gameZirhlar.getMoney());

        game.duzcizgi();
    }

    public Envanter getEnvanter() {
        return envanter;
    }

    public void setEnvanter(Envanter envanter) {
        this.envanter = envanter;
    }

    public int toplamhasra(){
        return (this.getDamage()+this.getEnvanter().getSilahName().getDamage());
    }
GameSilahlar gameSilahlar;
    public void ozellikler() {
        System.out.println(this.getName().trim()+" özellikleri");
        game.duzcizgi();
        System.out.println("Can   : "+this.getHealth());
        System.out.println("Hasar : "+this.getDamage());
        System.out.println("para  : "+this.getMoney());
       // gameSilahlar.setSilahName(gameSilahlar.getSilahName());
        System.out.println("silah : ");
        game.duzcizgi();
    }
}
