import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
        Ödev
        Aynı örneği switch-case kullanmadan yapınız.
        */
        System.out.println("BURÇ BULMA");
        Scanner scan=new Scanner(System.in);

        int gun=0,ay=0;
        System.out.print("Doğum gününüzü girin - gün olarak : ");
        gun= scan.nextInt();
        System.out.print("1-Ocak\n2-Şubat\n3-Mart" +
                "\n4-Nisan\n5-Mayıs\n6-Haziran\n7-Temmuz\n8-Ağustos\n9-Eylül" +
                "\n10-Ekim\n11-Kasım\n12-Aralık\nDoğum Ayınızı Girin : ");
        ay= scan.nextInt();

        if(ay==1){
            if(gun<=21){
                System.out.println("Oğlak Burcu");
            }
            if(gun>21){
                System.out.println("Kova Burcu");
            }
        }
        if(ay==2){
            if(gun>19){
                System.out.println("Balık Burcu");
            }
            if(gun<=19){
                System.out.println("Kova Burcu");
            }
        }
        if(ay==3){
            if(gun<=20){
                System.out.println("Balık Burcu");
            }
            if(gun>20){
                System.out.println("Koç Burcu");
            }
        }
        if(ay==4){
            if(gun<=20){
                System.out.println("Koç Burcu");
            }
            if(gun>20){
                System.out.println("Boğa Burcu");
            }
        }
        if(ay==5){
            if(gun<=21){
                System.out.println("Boğa Burcu");
            }
            if(gun>21){
                System.out.println("İkizler Burcu");
            }
        }
        if(ay==6){
            if(gun<=22){
                System.out.println("İkizler Burcu");
            }
            if(gun>22){
                System.out.println("Yengeç Burcu");
            }
        }
        if(ay==7){
            if(gun<=22){
                System.out.println("Yengeç Burcu");
            }
            if(gun>22){
                System.out.println("Aslan Burcu");
            }
        }
        if(ay==8){
            if(gun<=22){
                System.out.println("Aslan Burcu");
            }
            if(gun>22){
                System.out.println("Başak Burcu");
            }
        }
        if(ay==9){
            if(gun<=22){
                System.out.println("Başak Burcu");
            }
            if(gun>22){
                System.out.println("Terazi Burcu");
            }
        }
        if(ay==10){
            if(gun<=22){
                System.out.println("Terazi Burcu");
            }
            if(gun>22){
                System.out.println("Akrep Burcu");
            }
        }
        if(ay==11){
            if(gun<=21){
                System.out.println("Akrep Burcu");
            }
            if(gun>21){
                System.out.println("Yay Burcu");
            }
        }
        if(ay==12){
            if(gun<=21){
                System.out.println("Yay Burcu");
            }
            if(gun>21){
                System.out.println("Oğlak Burcu");
            }
        }

    }
}
