public class Envanter {
    private silah silahName;
    private zirh zirhadi;
    private int zirhsavunma;
    private int silahhasari;
    private boolean yemek;
    private boolean su;
    private boolean odun;
    private int award;

    public Envanter() {
        this.silahName = new silah("yumruk", 4, 1, 1);
        this.zirhadi = new zirh("paçavra", 4, 2, 1);
        this.award = award;
        this.yemek = false;
        this.su = false;
        this.odun = false;
    }
public void awardtop(){

}
    public int getAward() {

        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public silah getSilahName() {
        return silahName;
    }

    public void setSilahName(silah silahName) {
        this.silahName = silahName;
    }

    public zirh getZirhadi() {
        return zirhadi;
    }

    public void setZirhadi(zirh zirhadi) {
        this.zirhadi = zirhadi;
    }

    public int getZirhsavunma() {
        return zirhsavunma;
    }

    public void setZirhsavunma(int zirhsavunma) {
        this.zirhsavunma = zirhsavunma;
    }

    public int getSilahhasari() {
        return silahhasari;
    }

    public void setSilahhasari(int silahhasari) {
        this.silahhasari = silahhasari;
    }

    public boolean isYemek() {
        return yemek;
    }

    public void setYemek(boolean yemek) {
        this.yemek = yemek;
    }

    public boolean isSu() {
        return su;
    }

    public void setSu(boolean su) {
        this.su = su;
    }

    public boolean isOdun() {
        return odun;
    }

    public void setOdun(boolean odun) {
        this.odun = odun;
    }
}
