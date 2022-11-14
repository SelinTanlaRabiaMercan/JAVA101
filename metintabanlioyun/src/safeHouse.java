public class safeHouse extends normalLoc{
    public safeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz\nCanınız fulleniyor");
        System.out.println("can : "+getPlayer().getHealth());
        getPlayer().setHealth(getPlayer().getRealhealth());
        System.out.println("can : "+getPlayer().getHealth());

        return true;
    }


}
