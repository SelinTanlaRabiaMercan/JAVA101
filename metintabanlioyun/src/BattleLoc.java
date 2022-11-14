public abstract class BattleLoc extends Location {
    protected String Award;
    protected Obstacle obstacle;

    @Override
    public boolean onLocation() {
        this.obstacle.randomobstacle();
        System.out.println(this.obstacle.getMaxObstacle());
        System.out.println("şuan şu konumdasın : " + getName());
        System.out.println("Dikkatli ol şuan burada " +
                this.obstacle.getMaxObstacle() + " adet " + this.obstacle.getName() + " bulunuyor");
        System.out.println("Ne yapmak istersin \n<S>avaş yada <K>aç");
        String savaskac = scann.nextLine().toUpperCase();
        if (savaskac.equals("S")) {
            obstacle.ozellikler();
            getPlayer().ozellikler();
            for (int i = 1; i <= this.obstacle.getMaxObstacle(); i++) {
                while (getPlayer().getHealth() > 0 && obstacle.getHealth() > 0) {

                    System.out.println(i + "." + obstacle.getName() + " canavarına " + getPlayer().getDamage() + " ile vurdun");
                    System.out.println(obstacle.getName() + " sana " + obstacle.getDamage() + " ile vurdu");
                    System.out.println();
                    System.out.println(i + "." + obstacle.getName() + " can : " + (obstacle.getHealth() - getPlayer().getDamage()));
                    this.obstacle.setHealth(obstacle.getHealth() - getPlayer().getDamage());
                    System.out.println(getPlayer().getName().trim() + " can : " + (getPlayer().getHealth() - obstacle.getDamage()));
                    this.getPlayer().setHealth(getPlayer().getHealth() - obstacle.getDamage());
                    System.out.println();
                    if (getPlayer().getHealth() < obstacle.getHealth() && getPlayer().getHealth() <= 0) {
                        System.out.println("kaybettiniz");
                        return false;
                    }
                    if (getPlayer().getHealth() > obstacle.getHealth() && obstacle.getHealth() <= 0) {
                        System.out.println(obstacle.getName() + " canavarını yendiniz."+obstacle.getAward()+" ödül kazandınız");
                        this.getPlayer().setMoney(getPlayer().getMoney()+obstacle.getAward());
                        System.out.println("güncel para : "+getPlayer().getMoney());
                        System.out.println();
                        break;
                    }
                }
                this.obstacle.setHealth(obstacle.getRealHealth());
                obstacle.ozellikler();
                getPlayer().ozellikler();
                if (i+1<=this.obstacle.getMaxObstacle()) {
                    System.out.println((i + 1) + "." + obstacle.getName() + " ile savaşmak istermisiniz");
                    System.out.print("E - H  :  ");
                    String EH = scann.nextLine().toUpperCase();
                    if (EH.equals("E")) {

                    }
                    if (EH.equals("H")) {
                        i = (obstacle.getMaxObstacle() + 1);
                    }
                }

            }

        }

        if (savaskac.equals("K")) {
            System.out.println("k");
        }
        return true;
    }

    public BattleLoc(Player player, String name, String award, Obstacle obstacle) {
        super(player, name);
        Award = award;
        this.obstacle = obstacle;
    }

    Envanter envanter = new Envanter();

    public void ilkvuranoyuncu() {

    }


}
