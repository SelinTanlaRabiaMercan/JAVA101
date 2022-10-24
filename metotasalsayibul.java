import java.util.Scanner;
    /*
     *Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
     **/
public class Main {
        static void asalsayi(int a) {
            int adet = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    adet++;
                }
            }
            if (adet == 2) {
                System.out.println(a + " asal");
            }
            if (adet != 2) {
                System.out.println(a + " asal değil");
            }
            adet = 0;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ASAL SAYI BULMA\n0 -> programı bitir");

            while (true) {
                System.out.print("sayı : ");
                int sayi = scanner.nextInt();

                if (sayi == 0) {
                    System.out.println("programdan çıkılıyor");
                    break;
                }
                asalsayi(sayi);
            }
        }
    }
