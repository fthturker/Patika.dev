import java.util.Scanner;

public class GirilenSayidanKucuk2inKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        /*
        Java döngüler ile girilen sayıya kadar olan
        4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int sayi=scanner.nextInt();

        System.out.print( sayi+ " \nsayısından küçük dördün kuvvetleri: ");
        for (int i=1; i<=sayi; i*=4){
            System.out.print(i + "   ");
        }

        System.out.print( sayi+ " \nsayısından küçük beşin kuvvetleri: ");
        for (int i=1; i<=sayi; i*=5){
            System.out.print(i + "   ");
        }

    }
}