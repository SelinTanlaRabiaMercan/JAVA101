import java.util.Scanner;
    /*
     *1- Toplama İşlemi
     *2- Çıkarma İşlemi
     *3- Çarpma İşlemi
     *4- Bölme işlemi
     *5- Üslü Sayı Hesaplama
     *6- Faktoriyel Hesaplama
     *7- Mod Alma
     *8- Dikdörtgen Alan ve Çevre Hesabı
     **/
public class Main {
        static int topla(int a, int b) {
            int sonuc = a + b;
            System.out.println(a + " + " + b + " : " + sonuc);
            return sonuc;
        }

        static int cikar(int a, int b) {
            int sonuc = a - b;
            System.out.println(a + " - " + b + " : " + sonuc);
            return sonuc;
        }

        static int carp(int a, int b) {
            int sonuc = a * b;
            System.out.println(a + " * " + b + " : " + sonuc);
            return sonuc;
        }

        static int bol(int a, int b) {
            int sonuc = a / b;
            System.out.println(a + " / " + b + " : " + sonuc);
            return sonuc;
        }

        static double uslusayi(double a, double b) {
            double sonuc = Math.pow(a, b);
            System.out.println(a + " ^ " + b + " : " + sonuc);
            return sonuc;
        }

        static int faktoriyel(int a) {
            int fkt = 1;
            for (int i = 1; i <= a; i++) {
                fkt *= i;
            }
            System.out.println(a + "! : " + fkt);
            return fkt;
        }
        static int modalma(int a, int b) {
            int sonuc = a % b;
            System.out.println(a + " % " + b + " : " + sonuc);
            return sonuc;
        }
        static int dikdortgenalanhesabi(int a, int b) {
            int alan = a * b;
            System.out.println("dikdörtgenin alanı : " + alan);
            return alan;
        }
        static int dikdortgencevrehesabi(int a, int b) {
            int cevre = 2 * (a + b);
            System.out.println("dikdörtgenin çevresi : " + cevre);
            return cevre;
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("GELİŞMİŞ HESAP MAKİNESİ\n" +
                    "0- programı bitir\n" +
                    "1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3- Çarpma İşlemi\n" +
                    "4- Bölme işlemi\n" +
                    "5- Üslü Sayı Hesaplama\n" +
                    "6- Faktoriyel Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdörtgen Alan\n" +
                    "9- Dikdörtgen Çevre\n" +
                    "-----\n");


            while (true) {
                System.out.print("seçim : ");
                int secim = scanner.nextInt();
                System.out.println("-----");
                // if (secim > 0 || secim < 10) {
                if (secim==0||secim == 1 || secim == 2 || secim == 3 || secim == 4 || secim == 5 || secim == 6 || secim == 7 || secim == 8 || secim == 9) {
                    if(secim==0){
                        System.out.println("sistemden çıkılıyor");
                        break;
                    }
                    switch (secim) {
                        case 1:
                            System.out.print("1.sayı : ");
                            int a = scanner.nextInt();
                            System.out.print("2.sayı : ");
                            int b = scanner.nextInt();
                            topla(a, b);
                            System.out.println("-----");
                            break;
                        case 2:
                            System.out.print("1.sayı : ");
                            int a2 = scanner.nextInt();
                            System.out.print("2.sayı : ");
                            int b2 = scanner.nextInt();
                            cikar(a2, b2);
                            System.out.println("-----");
                            break;
                        case 3:
                            System.out.print("1.sayı : ");
                            int a3 = scanner.nextInt();
                            System.out.print("2.sayı : ");
                            int b3 = scanner.nextInt();
                            carp(a3, b3);
                            System.out.println("-----");
                            break;
                        case 4:
                            System.out.print("1.sayı : ");
                            int a4 = scanner.nextInt();
                            System.out.print("2.sayı : ");
                            int b4 = scanner.nextInt();
                            bol(a4, b4);
                            System.out.println("-----");
                            break;
                        case 5:
                            System.out.print("alt sayı : ");
                            double as = scanner.nextDouble();
                            System.out.print("üs sayı : ");
                            double us = scanner.nextDouble();
                            uslusayi(as, us);
                            System.out.println("-----");
                            break;
                        case 6:
                            System.out.print("faktoriyelini almak istediğiniz sayı : ");
                            int fa = scanner.nextInt();
                            faktoriyel(fa);
                            System.out.println("-----");
                            break;
                        case 7:
                            System.out.print("1.sayı : ");
                            int a5 = scanner.nextInt();
                            System.out.print("2.sayı : ");
                            int b5 = scanner.nextInt();
                            modalma(a5, b5);
                            System.out.println("-----");
                            break;
                        case 8:
                            System.out.print("kısa kenar : ");
                            int x = scanner.nextInt();
                            System.out.print("uzun kenar : ");
                            int y = scanner.nextInt();
                            dikdortgenalanhesabi(x, y);
                            System.out.println("-----");
                            break;
                        case 9:
                            System.out.print("kısa kenar : ");
                            int x1 = scanner.nextInt();
                            System.out.print("uzun kenar : ");
                            int y1 = scanner.nextInt();
                            dikdortgencevrehesabi(x1, y1);
                            System.out.println("-----");
                            break;
                    }
                }
                if (secim < 0 || secim > 9) {
                    System.out.println("gecersiz işlem");
                    System.out.println("-----");
                }
            }

        }
    }
