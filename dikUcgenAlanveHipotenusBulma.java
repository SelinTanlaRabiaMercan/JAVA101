import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */
        System.out.println("Dik üçgende hipotenüs bulma programı");
        double kisakenar=0,uzunkenar=0,hipotenus=0,alan=0;
        Scanner scann=new Scanner(System.in);

        System.out.print("Kısa kenar :");
        kisakenar=scann.nextDouble();
        System.out.print("Uzun kenar :");
        uzunkenar=scann.nextDouble();

        hipotenus=Math.pow(kisakenar,2)+Math.pow(uzunkenar,2);
        hipotenus=Math.sqrt(hipotenus);
        System.out.println("Hipotenüs : "+hipotenus);

        alan=(uzunkenar*kisakenar)/2;
        System.out.print("Alan : "+alan);
    }
}
