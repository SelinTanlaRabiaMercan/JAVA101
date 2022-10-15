import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana
        bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;
        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
        KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        */
        System.out.println("Kullanıcıdan alınan para değerinin kdvli fiyatı ve kdv tutarını hesaplama");
        Scanner scann=new Scanner(System.in);
        double kdvOrani=0.18,kdvLi=0.0,kdvOrani2=0.08;

        System.out.print("Para miktarını giriniz : ");
        double paraMiktari=scann.nextDouble();


        kdvLi=(paraMiktari>1000)? paraMiktari+(paraMiktari*kdvOrani2): paraMiktari+(paraMiktari*kdvOrani);
        System.out.println(kdvLi);

    }
}
