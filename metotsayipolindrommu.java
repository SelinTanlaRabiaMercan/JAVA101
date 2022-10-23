import java.util.Scanner;
    /*
     *Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
     *Palindrom Sayı Nedir ?
     *Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
     *Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     **/
public class Main {
    static boolean polindrommu(int sayi) {
        int gecicisayi = sayi, terssayi = 0, sonrakam;
        while (gecicisayi != 0) {
            sonrakam = gecicisayi % 10;
            terssayi = (terssayi * 10) + sonrakam;
            gecicisayi /= 10;
        }
        System.out.println("ters sayı : " + terssayi);

        if (sayi!=terssayi){
            System.out.println("sayı polindrom sayı değil");
        }
        if (sayi==terssayi){
            System.out.println("sayı polindrom sayı");
        }
        return true;
    }
    public static void main(String[] args) {
        String metin="Java ile bir sayının Palindrom Sayı olup olmadığını bulan bir program yapıyoruz.";
        System.out.println(metin.toUpperCase());

        Scanner scann=new Scanner(System.in);
        System.out.print("sayı : ");
        int sayi= scann.nextInt();

        polindrommu(sayi);
    }
