import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        double tutar = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz (km): ");
        int mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        System.out.println("Yolculuk tipini seçiniz:\nTek yön için 1\nGidiş-Dönüş için 2");
        int ytip = input.nextInt();
        boolean isError = false;

        if (mesafe<=0 || yas<=0 || ytip<1 || ytip>2) {
            isError = true;
        }else {
            tutar = 0.1 * mesafe;
        }
        if (yas<12) {
            tutar = tutar - (tutar * 0.5);
        }else if (yas>=12 && yas<=24) {
            tutar = tutar - (tutar * 0.1);
        }else if (yas>=65) {
            tutar = tutar - (tutar * 0.3);
        }else {
            tutar = tutar;
        }
        if (ytip == 1) {
            tutar = tutar;
        }else if (ytip == 2) {
            tutar = 2 * (tutar - (tutar * 0.2));
        }
        if (isError) {
            System.out.print("Hatalı veri girdiniz!");
        }else {
            System.out.print("Toplam tutar: " + tutar);
        }
    }
}
