import java.util.Scanner;

public class KDVcalculate {
    public static void main(String[] args) {
        double kdvsiz, kdvli, kdvli2;
        kdvli = 1.18;
        kdvli2 = 1.08;
        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz fiyatı giriniz: ");
        kdvsiz = input.nextDouble();
        double kdvtutarı = kdvsiz<=1000 ? kdvsiz * kdvli : kdvsiz * kdvli2;
        double kdvtutar = kdvtutarı - kdvsiz;
        System.out.println("KDV tutarı: " + kdvtutar);
        double son = kdvsiz<=1000 ? kdvli * kdvsiz : kdvli2 * kdvsiz;
        System.out.println("Toplam Tutar: " + son );
        int kdv = kdvsiz<=1000 ? 18 : 8 ;
        System .out.println("KDV oranı: %" + kdv);
    }
}
