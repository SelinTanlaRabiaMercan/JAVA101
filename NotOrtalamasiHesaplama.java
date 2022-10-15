import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
         * kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
         * */

        System.out.println("Not Ortalamasını Hesaplayan Program");
        Scanner scann=new Scanner(System.in);

        System.out.println("Matematik ders notunuz : ");
        double notmat=scann.nextDouble();
        System.out.println("Fizik ders notunuz : ");
        double notfizik=scann.nextDouble();
        System.out.println("Kimya ders notunuz : ");
        double notkimya= scann.nextDouble();
        System.out.println("Türkçe ders notunuz : ");
        double notturkce= scann.nextDouble();
        System.out.println("Tarih ders notunuz : ");
        double nottarih= scann.nextDouble();
        System.out.println("Müzik ders notunuz : ");
        double notmuzik= scann.nextDouble();

        double notortalama=0;
        notortalama=(notmat+notfizik+notkimya+notturkce+nottarih+notmuzik)/6;

        System.out.println("Ders ortalaması : "+notortalama);

        /*
        Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması
        60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        */

        boolean kosul = notortalama >= 60;
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectiMi);
    }
}
