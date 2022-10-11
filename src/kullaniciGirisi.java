import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        /*
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
        unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana "Şifre oluşturulamadı,
        lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */
        String kullaniciAdi, sifre, secim, yeniSifre;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        sifre = input.nextLine();

        if (kullaniciAdi.equals("patika") && sifre.equals("java123"))
            System.out.print("Sisteme giriş yaptınız!");
        else if (!(sifre.equals("java123"))) {
            System.out.println("Şifre hatalı! Şifreyi değiştirmek ister misiniz? E/H");
            System.out.print("Seçiminiz: ");
            secim = input.nextLine();
            if (secim.equals("E")) {
                System.out.print("Yeni şifreniz:");
                yeniSifre = input.nextLine();
                if (yeniSifre.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else
                    System.out.print("Şifre oluşturuldu.");
            }
        }
        else
            System.out.print("Böyle bir kullanıcı bulunamadı.");
    }
}
