import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ödev
        Videodaki hesap makinesini switch-case kullanarak yapınız.
        */
        System.out.println("HESAP MAKİNESİ");
        Scanner scan=new Scanner(System.in);
        System.out.print("1.sayı : ");
        int sayi1= scan.nextInt();
        System.out.print("2.sayı : ");
        int sayi2= scan.nextInt();

        System.out.println("-----\nİŞLEM SEÇİN\n" +
                "1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n-----");
        int secim=scan.nextInt();

        switch (secim){
            case 1:
                System.out.println(sayi1+"+"+sayi2+" : "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println(sayi1+"-"+sayi2+" : "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println(sayi1+"x"+sayi2+" : "+(sayi1*sayi2));
                break;
            case 4:
                if(sayi1==0||sayi2==0){
                    System.out.println("sayı sıfıra bölünemez");
                }
                else if (sayi2>sayi1){
                    System.out.println(sayi2+"/"+sayi1+" : "+(sayi2/sayi1));
                }
                else System.out.println(sayi1+"/"+sayi2+" : "+(sayi1/sayi2));
                break;
            default:
                System.out.println("geçersiz işlem girdiniz");
                break;
        }


    }
}
