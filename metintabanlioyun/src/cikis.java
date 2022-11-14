public class cikis extends normalLoc{
    public cikis(Player player) {
        super(player,"çıkış");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Çıkış Yapılıyor");
        return false;
    }
}
