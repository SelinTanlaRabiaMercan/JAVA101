import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        Formül
        Kilo (kg) / Boy(m) * Boy(m)
        */
        double boy=0,kilo=0,formul=0;
        Scanner scann=new Scanner(System.in);
        System.out.print("boy : ");
        boy= scann.nextDouble();
        System.out.print("kilo : ");
        kilo= scann.nextDouble();

        formul=kilo/(boy*boy);
        System.out.println("Vucut kitle endeksiniz : "+formul);
    }
}
