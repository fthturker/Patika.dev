import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        /*
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

        Ödev
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
         "For Döngüsü" kullanarak yapınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("ussu alinacak sayi : ");
        int n = scan.nextInt();

        System.out.println("us olacak sayi : ");
        int k = scan.nextInt();

        int total = 1;
        //3^4=3*3*3*3
/*
        int i = 1;
        while (i <= k) {
            total *= n;
            i++;
        }
        System.out.println("cevap : " + total);
*/
        //for Dongüsü ile
        for (int j = 1; j <=k ; j++) {
            total *= n;
        }
        System.out.println("cevap : " + total);
    }
}
