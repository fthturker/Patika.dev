import java.util.Scanner;

public class usluSayiAlmaProgrami {
    /*
    Recursive Metotlar ile Üslü Sayı Hesaplama
    Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
     "Recursive" metot kullanarak yapan programı yazınız.

    Senaryo

    Taban değeri giriniz :2
    Üs değerini giriniz : 0
    Sonuç : 1
    Taban değeri giriniz : 2
    Üs değerini giriniz : 3
    Sonuç : 8
    Taban değeri giriniz : 5
    Üs değerini giriniz : 3
    Sonuç : 125
     */
    static int pow(int base, int exponent) {
        if (base == 1 | exponent == 0) {
            return 1;
        }
        return pow(base, exponent - 1) * base;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r;

        System.out.println("taban sayısını giriniz: ");
        n = scanner.nextInt();
        System.out.println("üs sayısını giriniz: ");
        r = scanner.nextInt();

        System.out.println("Sonuc : " + pow(n, r));
    }
}