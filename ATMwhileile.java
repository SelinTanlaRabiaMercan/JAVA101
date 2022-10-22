import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *ATM projesi
         * 1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap"
         */
        Scanner scann = new Scanner(System.in);
        String metin = "ATM projesi";
        System.out.println(metin.toUpperCase());
        System.out.println("Kullanıcı adı : Selin Tanla \nParola : 1234\nBaşlangıç bakiyesi : 1000Tl\n-----");

        String Kadi="Selin Tanla";
        String parola1="1234";
        double bakiye=1000;
        int adet=3,islem=0;

        while (adet>0) {
            System.out.print("Giriş\nKullanıcı adı : ");
            String kAdi = scann.nextLine();
            System.out.print("Parola : ");
            String parola = scann.nextLine();
            
            if (!kAdi.equals(Kadi) || !parola.equals(parola1)) {
                System.out.println("Kullanıcı adı yada parola yanlış");
                adet--;
            }
            if (kAdi.equals(Kadi) && parola.equals(parola1)) {
                do {
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
                    if (islem == 1) {
                        System.out.print("yatırmak istediğiniz miktar : ");
                        int ybakiye = scann.nextInt();
                        bakiye += ybakiye;
                        System.out.println("yeni bakiye : " + bakiye);
                    }
                    if (islem == 2) {
                        System.out.print("çekmek istediğiniz miktar : ");
                        int ybakiye = scann.nextInt();
                        bakiye -= ybakiye;
                        System.out.println("yeni bakiye : " + bakiye);
                    }
                    if (islem == 3) {
                        System.out.println("mevcut bakiye : " + bakiye);
                    }
                    if (islem < 0 || islem > 4) {
                        System.out.println("geçersiz işlem seçtiniz");
                    }
            } while (islem != 4) ;
            System.out.println("Çıkış yapıldı");
            }
        if (adet==0) {
            System.out.println("3 kere yanlış girdiniz hesaba giriş yapamazsınız");
            }
        }
    }
}
