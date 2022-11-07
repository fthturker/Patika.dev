import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        /*
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
        n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
         */
        Scanner input = new Scanner(System.in);

        int n,r,combination,nTotal=1,rTotal=1,nMinusR=1;

        System.out.print("Eleman Sayısı (n) : ");
        n = input.nextInt();

        System.out.print("Seçim Sayısı (r) : ");
        r = input.nextInt();

        for(int i=1; i<=n; i++){
            nTotal *= i;
        }

        for(int j=1; j<=r; j++){
            rTotal *= j;
        }

        for(int k=1; k<=(n-r); k++){
            nMinusR *= k;
        }

        combination = nTotal / (rTotal * nMinusR);
        System.out.println("C("+n+","+r+") kombinasyonu = "+combination);
    }
}
