import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
        yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
        İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
        aşağıdaki indirimleri uygulayın ;

        +Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)
         olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        +Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        +Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        +Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        +Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        */
        System.out.println("UÇAK BİLETİ HESAPLAMA\nMesafe başına ücret 0,10 TL");
        Scanner scan=new Scanner(System.in);

        System.out.print("Gidilece mesafe : ");
        Double mesafe= scan.nextDouble();
        System.out.print("Müşterinin yaşı : ");
        int yas= scan.nextInt();
        System.out.println("Yolculuk tipi giriniz\n1-Tek Yön\n2-Gidiş-Dönüş");
        int yolculukTipi= scan.nextInt();

        if(mesafe>0){
            if(yas>0){
                double toplamfiyat=mesafe*0.10;
                if (yolculukTipi==1||yolculukTipi==2){
                    System.out.println("Toplam Fİyat : "+toplamfiyat);
                    if (yas<12){
                        toplamfiyat-=toplamfiyat*0.50;
                        System.out.println("Yaş indirimi : "+toplamfiyat);
                    }
                    if(yas>=12&&yas<=24){
                        toplamfiyat-=toplamfiyat*0.10;
                        System.out.println("Yaş indirimi : "+toplamfiyat);
                    }
                    if(yas>=65){
                        toplamfiyat-=toplamfiyat*0.30;
                        System.out.println("Yaş indirimi : "+toplamfiyat);
                    }
                    if(yolculukTipi==2){
                        toplamfiyat-=toplamfiyat*0.20;
                        System.out.println("Yolculuk tipi indirimi : "+toplamfiyat);
                    }
                }
            }
        }
        else System.out.println("Hatalı veri girdiniz.");



    }
}
