import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *ATM projesi switch ile
         * 1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap"
         */
        Scanner scann = new Scanner(System.in);
        String metin = "ATM projesi switch ile";
        System.out.println(metin.toUpperCase());
        System.out.println("Kullanıcı adı : Selin Tanla \nParola : 1234\nBaşlangıç bakiyesi : 1000Tl\n-----");

        String Kadi = "Selin Tanla";
        String parola1 = "1234";
        double bakiye = 1000;
        int adet = 3, islem = 0;


        if (adet > 0) {
            System.out.print("Giriş\nKullanıcı adı : ");
            String kAdi = scann.nextLine();
            System.out.print("Parola : ");
            String parola = scann.nextLine();

            while (!kAdi.equals(Kadi) || !parola.equals(parola1)) {
                System.out.println("Kullanıcı adı yada parola yanlış");
                
                System.out.print("Giriş\nKullanıcı adı : ");
                kAdi = scann.nextLine();
                System.out.print("Parola : ");
                parola = scann.nextLine();
                
                adet--;

                if (adet == 0) {
                    System.out.println("3 kere yanlış girdiniz hesaba giriş yapamazsınız");
                    break;
                }
            }
            if (kAdi.equals(Kadi) && parola.equals(parola1)) {

                System.out.println("işlem başarılı");
                System.out.println("-----\n" +
                        "işlem seçin " +
                        "\n1-Para yatırma" +
                        "\n2-Para Çekme " +
                        "\n3-Bakiye Sorgula " +
                        "\n4-Çıkış Yap" +
                        "\n-----");
                System.out.print("işlem : ");
                islem = scann.nextInt();
                int ybakiye = 0;
                switch (islem) {
                    case 1:
                        System.out.print("yatırmak istediğiniz miktar : ");
                        ybakiye = scann.nextInt();
                        bakiye += ybakiye;
                        System.out.println("yeni bakiye : " + bakiye);
                        System.out.print("-----\nişlem : ");
                        islem = scann.nextInt();
                    case 2:
                        System.out.print("çekmek istediğiniz miktar : ");
                        ybakiye = scann.nextInt();
                        bakiye -= ybakiye;
                        System.out.println("yeni bakiye : " + bakiye);
                        System.out.print("-----\nişlem : ");
                        islem = scann.nextInt();
                    case 3:
                        System.out.println("mevcut bakiye : " + bakiye);
                        System.out.print("-----\nişlem : ");
                        islem = scann.nextInt();
                    case 4:
                        System.out.println("Çıkış yapıldı");
                        break;
                    default:
                        System.out.println("geçersiz işlem seçtiniz");
                        System.out.print("-----\nişlem : ");
                        islem = scann.nextInt();
                }

            }
        }
    }
}
