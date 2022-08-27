import java.util.Scanner;

public class HesapMakinesiSC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayı: ");
        int x = input.nextInt();
        System.out.print("İkinci sayı: ");
        int y = input.nextInt();
        System.out.println("İşlem seçiniz\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        int islem = input.nextInt();
        ;

        switch (islem) {
            case 1:
                System.out.print("Toplam: " + (x + y));
                break;
            case 2:
                System.out.print("Çıkarma: " + (x - y));
                break;
            case 3:
                System.out.print("Çarpma: " + (x * y));
                break;
            case 4:
                switch (y) {
                    case 0:
                        System.out.print("Bir sayı 0'a bölünemez");
                        break;
                    default:
                        System.out.print("Bölüm: " + (x / y));
                        break;
                }
                break;
            default:
                System.out.print("Geçersiz giriş yaptınız");
                break;
        }
    }
}
