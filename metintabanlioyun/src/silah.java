public class silah {
    private String silahName;
    private int id;
    private int damage;
    private  int money;

    public silah(String silahName, int id, int damage, int money) {
        this.silahName = silahName;
        this.id = id;
        this.damage = damage;
        this.money = money;
    }


    public static silah[] weapons(){
        silah[] weaponList = {new silah("Tabanca",1,2,25),
                new silah("Kılıç",2,3,35),
                new silah("Tüfek",3,7,45)};
        return weaponList;
    }
    public String getSilahName() {
        return silahName;
    }

    public void setSilahName(String silahName) {
        this.silahName = silahName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
