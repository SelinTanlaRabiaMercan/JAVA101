import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        Geçme Notu : 55

        Ödev
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        */
        System.out.println("SINIF GEÇME DURUMU");
        Scanner scan=new Scanner(System.in);

        int ders=0,toplam=0,adet=0;
        System.out.println("DERSLER :Matematik, Fizik, Turkce, Kimya, Muzik");
        System.out.println("Ders notları");

        for (int i=1;i<=5;i++) {
            System.out.print(i+".ders notu : ");
            ders=scan.nextInt();
            adet++;
            if (ders<0||ders>100){
                System.out.println("Geçersiz not ortalamaya katılmayacak");
                ders=0;
                adet--;
            }
            toplam+=ders;
        }
        int ortalama=toplam/adet;
        System.out.println("Ortalama : "+ortalama);
        if (ortalama>=55){
            System.out.println("Geçti");
        }
        if (ortalama<55){
            System.out.println("Kaldı");
        }
    }
}
