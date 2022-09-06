import java.util.Scanner;

public class AsalRecursive {

    static boolean prime(int n, int nT) {
        if (nT == 1) {
            return true;
        } else {
            if (n % nT != 0) {
                return prime(n, nT-1);
            }else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz: ");
        int number = input.nextInt(), numberTemp = number-1;

        if (number > 1) {
            if (prime(number, numberTemp)) {
                System.out.print("Asal sayıdır");
            }else {
                System.out.print("Asal sayı değildir");
            }
        }else {
            System.out.print("Lütfen 1'den büyük bir değer giriniz");
        }
    }
}
