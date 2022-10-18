import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*
      Dairenin Alanını ve Çevresini Hesaplayan Program
      Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
      Alan Formülü : π * r * r;
      Çevre Formülü : 2 * π * r;
      Ödev
      Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
      𝜋 sayısını = 3.14 alınız.
      Formül : (𝜋 * (r*r) * 𝛼) / 360
      */
        double pi=3.14;
        Scanner scann=new Scanner(System.in);
        System.out.println("Dairenin Alanını  ve Çevresini Hesaplayan Program\nYarıçap : ");
        double yaricap=scann.nextDouble();

        double alan=0,cevre=0,formul=0;

        alan=(pi*yaricap*yaricap);
        cevre=(2*pi*yaricap);

        System.out.println("Çevre : "+cevre);
        System.out.println("Alan : "+alan);

        System.out.println("daire diliminin alanı bulan program\nMerkez Açının Ölçüsünü Girin : ");
        double MAolcusu=scann.nextDouble();

        double rr=yaricap*yaricap;
        formul=(pi*rr*MAolcusu)/360;

        System.out.println("Daire diliminin alanı : "+formul);




    }
}
