public abstract class GameZirhlar {
    private String zirhName;
    private int Id;
    private int engelleme;
    private int money;

    public GameZirhlar(String zirhName, int Id, int engelleme, int money) {
        this.zirhName = zirhName;
        this.Id = Id;
        this.engelleme = engelleme;
        this.money = money;
    }

    public String getZirhName() {
        return zirhName;
    }

    public void setZirhName(String zirhName) {
        this.zirhName = zirhName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getEngelleme() {
        return engelleme;
    }

    public void setEngelleme(int engelleme) {
        this.engelleme = engelleme;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
