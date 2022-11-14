import java.util.Scanner;

public class Game {
    public Scanner scann = new Scanner(System.in);

    public void start() {

        ciftcizgi();
        String mesaj = "metin tabanlı macera oyununa hoş geldiniz.";
        System.out.println(mesaj.toUpperCase());

        System.out.println("GOOD LUCK !!!");
        duzcizgi();
        Player player = new Player();
        player.karaktersec();

        Location location = null;
        while (true) {
            duzcizgi();
            System.out.print("Bölgeler\n" +
                    "1- Güvenli Ev         --> Canınız yenilenir.\n" +
                    "2- Mağara             --> Karşınıza zombi çıkabilir.\n" +
                    "3- Orman              --> Karşınıza vampir çıkabilir.\n" +
                    "4- Nehir              --> Karşınıza ayı çıkabilir.\n"+
                    "5- Maden              --> Karşınıza yılan çıkabilir\n"+
                    "6- Eşya Dükkanı       --> Silah ve zırh alabilirsiniz.\n"+
                    "7- Oyuncu Özellikleri --> Mevcut oyuncu özelliklerini gösterir.\n"+
                    "0- Çıkış Yap          --> Bu macerayı sonlandır.\n"+
                    "Lokasyon seçin : ");

            int lokasyonsecim = scann.nextInt();
            duzcizgi();
            switch (lokasyonsecim) {
                case 1:
                    location = new safeHouse(player);
                    break;
                case 2:
                    location=new Magara(player);
                    break;
                case 3:
                    location=new orman(player);
                    break;
                case 4:
                    location=new nehir(player);
                    break;
                case 5:
                    location=new maden(player);
                    break;
                case 6:
                    location = new ToolStore(player);
                    break;
                case 0:
                    location=new cikis(player);
                    break;
                default:
                    location = new safeHouse(player);

            }
            if (!location.onLocation()) {
                System.out.println("Game Over!!!");
                break;
            }

        }


    }

    public void ciftcizgi() {
        System.out.println("===============================================================================");
    }

    public void duzcizgi() {
        System.out.println("-------------------------------------------------------------------------------");
    }

}
