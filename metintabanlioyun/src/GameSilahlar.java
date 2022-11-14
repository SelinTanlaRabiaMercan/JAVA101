public abstract class GameSilahlar {
    private String silahName;
    private int Id;
    private int damage;
    private int money;

    public GameSilahlar(String silahName, int id, int damage, int money) {
        this.silahName = silahName;
        Id = id;
        this.damage = damage;
        this.money = money;
    }

    public String getSilahName() {
        return silahName;
    }

    public void setSilahName(String silahName) {
        this.silahName = silahName;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
