import java.util.Scanner;

public class Girilen_Sayiya_Kadar_Olan_Cift_Sayilari_Bulan_Program {
    /*
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
    3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();

        int sum=0,counter=0;

        for(int i=1; i<=number; i++){
            if(i%3==0 && i%4==0){
                sum += i;
                counter++;
            }
        }

        double average = sum / counter;
        if(sum != 0){
            System.out.println("Ortalama : "+average);
        }else System.out.println(number + " sayisina kadar 3 ve 4'e bölünebilen sayı yoktur!");
    }
    }

