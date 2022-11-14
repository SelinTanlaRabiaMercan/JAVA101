import java.util.Random;

public class Obstacle {
    private String name;
    private int damage;
    private int health;
    private int award;
    private int maxObstacle;
    private int realHealth;

    Game game=new Game();
    public Obstacle(String name, int damage, int health, int award, int maxObstacle) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.realHealth = health;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    public void randomobstacle() {
        Random random = new Random();
        this.setMaxObstacle(random.nextInt(this.maxObstacle) + 1);
    }

    public void ozellikler() {
        System.out.println(this.getName()+" özellikleri");
        game.duzcizgi();
        System.out.println("Can   : "+this.getHealth());
        System.out.println("Hasar : "+this.getDamage());
        System.out.println("Ödül  : "+this.getAward());
        game.duzcizgi();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public int getRealHealth() {
        return realHealth;
    }

    public void setRealHealth(int realHealth) {
        this.realHealth = realHealth;
    }
}
