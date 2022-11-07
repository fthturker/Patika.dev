import java.util.Scanner;

public class Tek_Sayilarin_Toplamini_Bulan_Program {
    public static void main(String[] args) {
        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp
        ekrana basan programı yazıyoruz.
         */
        Scanner scan = new Scanner(System.in);
        int f, sum = 0;

        do {
            System.out.print("SAYI GİRİNİZ: ");
            f = scan.nextInt();
            if (f % 2 == 1){
                break;
            }else if(f % 4 == 0){
                sum += f;
            }
        } while (f > 0);

        System.out.print("4'ün katları olan sayıların toplamı = " + sum);
    }
}

