import java.util.Scanner;

public class burcBulanProgram {
    public static void main(String[] args) {
        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart

        Ödev
        Aynı örneği switch-case kullanmadan yapınız.
         */
        int month, day;
        String burc= "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün : ");
        day = input.nextInt();

        if (month == 1) {
            if (day > 0 && day <= 21) {
                burc= "Oğlak";
            } else if (day > 0 && day <= 31) {
                burc= "Kova";
            } else
                isError = true;

        } else if (month == 2) {
            if (day > 0 && day <= 19) {
                burc= "Kova";
            } else if (day > 0 && day <= 29) {
                burc= "Balık";
            } else
                isError = true;

        } else if (month == 3) {
            if (day > 0 && day <= 20) {
                burc= "Balık";
            } else if (day > 0 && day <= 31) {
                burc= "Koç";
            } else
                isError = true;

        } else if (month == 4) {
            if (day > 0 && day <= 20) {
                burc= "Koç";
            } else if (day > 0 && day <= 30) {
                burc= "Boğa";
            } else
                isError = true;

        } else if (month == 5) {
            if (day > 0 && day <= 21) {
                burc= "Boğa";
            } else if (day > 0 && day <= 31) {
                burc= "İkizler";
            } else
                isError = true;

        } else if (month == 6) {
            if (day > 0 && day <= 22) {
                burc= "İkizler";
            } else if (day > 0 && day <= 30) {
                burc= "Yengeç";
            } else
                isError = true;

        } else if (month == 7) {
            if (day > 0 && day <= 22) {
                burc= "Yengeç";
            } else if (day > 0 && day <= 31) {
                burc= "Aslan";
            } else
                isError = true;

        } else if (month == 8) {
            if (day > 0 && day <= 22) {
                burc= "Aslan";
            } else if (day > 0 && day <= 31) {
                burc= "Başak";
            } else
                isError = true;

        } else if (month == 9) {
            if (day > 0 && day <= 22) {
                burc= "Başak";
            } else if (day > 0 && day <= 30) {
                burc= "Terazi";
            } else
                isError = true;

        } else if (month == 10) {
            if (day > 0 && day <= 22) {
                burc= "Terazi";
            } else if (day > 0 && day <= 31) {
                burc= "Akrep";
            } else
                isError = true;

        } else if (month == 11) {
            if (day > 0 && day <= 21) {
                burc= "Akrep";
            } else if (day > 0 && day <= 30) {
                burc= "Yay";
            } else
                isError = true;

        } else if (month == 12) {
            if (day > 0 && day <= 21) {
                burc= "Yay";
            } else if (day > 0 && day <= 31) {
                burc= "Oğlak";
            } else
                isError = true;
        }
        if ((month > 12) || (month < 1)) {
            System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
        } else {
            System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
        }
    }
}
