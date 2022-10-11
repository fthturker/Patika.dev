import java.util.Scanner;

public class havaSicakliginaGore {
    public static void main(String[] args) {
        /*
        Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
         */

        int sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.println("Hava sıcaklığını giriniz:");
        sicaklik= input.nextInt();

        if (sicaklik <= 5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if (sicaklik <= 10){
            System.out.println("Sinemeya gidebilirsiniz.");
        }else if (sicaklik <= 15){
            System.out.println("Sinemaya veya pikniğe gidebilirsiniz.");
        }else if (sicaklik <= 25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
