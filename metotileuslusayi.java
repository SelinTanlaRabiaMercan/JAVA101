import java.util.Scanner;
    /*
     *Recursive Metotlar ile Üslü Sayı Hesaplama
     *Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

     *Senaryo

     *Taban değeri giriniz :2
     *Üs değerini giriniz : 0
     *Sonuç : 1
     *Taban değeri giriniz : 2
     *Üs değerini giriniz : 3
     *Sonuç : 8
     *Taban değeri giriniz : 5
     *Üs değerini giriniz : 3
     *Sonuç : 125
     **/
public class Main {
        static double uslusayi(double a, double b) {
            double sonuc = Math.pow(a, b);
            System.out.println(a + " ^ " + b + " : " + sonuc);
            return sonuc;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ÜSLÜ SAYI HESAPLAMA");
            while (true) {
                System.out.print("alt sayı : ");
                double as = scanner.nextDouble();
                System.out.print("üs sayı : ");
                double us = scanner.nextDouble();
                uslusayi(as, us);
                System.out.println("-----");
            }
        }
    }
