import java.util.Scanner;

public class GirSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        int toplam = 0;
        int toplamsayi = 0;
        double sonuc = 0;

        for (int i=1; i<=sayi; i++) {
            if (i%3==0 && i%4==0) {
                toplam += i;
                toplamsayi++;
            }else {
                continue;
            }
        }
        if (toplamsayi == 0) {
            System.out.print("3 ve 4'e bölünebilen bir sayı yoktur.");
        }else {
            System.out.print(toplam/toplamsayi);
        }
    }
}
