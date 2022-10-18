import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam
        tutarını ekrana yazdıran programı yazın.
        Meyveler ve KG Fiyatları
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        */

        System.out.println("MANAV KASA PROGRAMI");
        Scanner scan=new Scanner(System.in);

        System.out.print("Armut kaç kilo : ");
        double armut= scan.nextDouble();
        System.out.print("Elma kaç kilo : ");
        double elma= scan.nextDouble();
        System.out.print("Domates kaç kilo : ");
        double domates= scan.nextDouble();
        System.out.print("Muz kaç kilo : ");
        double muz= scan.nextDouble();
        System.out.print("Patlıcan kaç kilo : ");
        double patlican= scan.nextDouble();

        System.out.println("Toplam Tutar : "+
                ((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5)));

    }
}
