import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
        */
        Scanner scann=new Scanner(System.in);
        System.out.println("TAKSİMETRE PROGRAMI\nTaksimetre açılış ücreti 10 TL dir");
        System.out.print("Gidilen mesafe(KM) : ");
        double mesafe =scann.nextDouble();
        int tAcilisUcreti=10;

        double tutar=mesafe*2.20;
        System.out.println("Tutar : "+tutar+" TL");

        tutar=(tutar<20)?(tutar=20):(tutar);
        //boolean ucret=(tutar<20);
        System.out.println("Ödenecek tutar : "+(tutar+10));
    }
}
