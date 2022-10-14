import java.util.Scanner;

public class asalSayiBulanProgram {
    /*
    Asal Sayı Bulan Program
    Java dilinde "Recursive" metot kullanarak,
    kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

    Senaryo
    Sayı Giriniz : 22
    22 sayısı ASAL değildir !

    Sayı Giriniz : 2
    2 sayısı ASALDIR !

    Sayı Giriniz : 39
    39 sayısı ASAL değildir !

    Sayı Giriniz : 17
    17 sayısı ASALDIR !
     */

    static void asal(int sayi, int x){
        if (x == sayi){
            System.out.println(sayi + " sayisi asal sayidir.");
            return;
        }else if (sayi % x == 0){
            System.out.println(sayi + "  sayisi asal sayi degildir.");
            return ;
        }
        asal(sayi,x + 1);

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi;
        System.out.print("Sayi giriniz :");
        sayi=inp.nextInt();
        asal(sayi,2);
    }
}
