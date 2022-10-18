import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ödev
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı
        olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
         lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
        */
        System.out.println("KULLANICI GİRİŞİ");
        Scanner scan=new Scanner(System.in);
        String kullaniciAdi="Selin Tanla Rabia Mercan";
        String parola="12345678";

        System.out.print("Kullanıcı Adı : ");
        String kAdi= scan.nextLine();
        System.out.print("Parola : ");
        String sifre= scan.nextLine();

        if (kullaniciAdi.equals(kAdi)&&parola.equals(sifre)){
            System.out.println("Giriş Başarılı.");
        } else if (!kullaniciAdi.equals(kAdi)&&parola.equals(sifre)) {
            System.out.println("Kullanıcı Adı Yanlış");
        }
            else if (kullaniciAdi.equals(kAdi)&&!parola.equals(sifre)) {
                System.out.println("Parola Yanlış");
                if (!parola.equals(sifre)){
                    System.out.println("Parola sıfırlamak istermisiniz\nevet   -   hayır");
                    String secim=scan.nextLine();
                    String parola1;
                    parola1=parola;
                    switch (secim){
                        case "evet":
                            System.out.println("Yeni şifre : ");
                            parola=scan.nextLine();
                            if (parola.equals(parola1)){
                                System.out.println("Eski parola ile aynı parola koyamazsınız");
                            }
                            if (parola.equals(sifre)){
                                System.out.println("Hatalı parola ile yeni parola aynı olamaz");
                            }
                            System.out.println("Parola : "+parola);
                            break;
                        case "hayır":
                            System.out.println("Parola değiştirilmedi.");
                            break;
                    }

                }
        }


    }
}
