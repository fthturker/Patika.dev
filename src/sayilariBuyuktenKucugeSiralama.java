import java.util.Scanner;

public class sayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {
        /*
        Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
         */
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayi ( a ) giriniz");
        a = scan.nextInt();
        System.out.print("2. sayi ( b ) giriniz");
        b = scan.nextInt();
        System.out.print("3. sayi ( c ) giriniz");
        c = scan.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a>b>c");
            }else{
                System.out.println("a>c>b");
            }
        }else if ((b>a) && (b>c)){
            if (a>c){
                System.out.println("b>a>c");
            }else {
                System.out.println("b>c>a");
            }
        }else if ((c>b) && (c>a)){
            if (a>b){
                System.out.println("c>a>b");
            }else{
                System.out.println("c>b>a");
            }
        }

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a<b<c");
            }else{
                System.out.println("a<c<b");
            }
        }else if ((b<a) && (b<c)){
            if (a<c){
                System.out.println("b<a<c");
            }else {
                System.out.println("b<c<a");
            }
        }else if ((c<b) && (c<a)){
            if (a<b){
                System.out.println("c<a<b");
            }else{
                System.out.println("c<b<a");
            }
        }
    }
}
