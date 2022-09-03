import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sorgulamak istediğiniz sayıyı giriniz: ");
        int number = input.nextInt();
        int toplam = 0;

        for (int i=1; i<number; i++) {
            if(number%i == 0) {
                toplam += i;
            }
        }
        if (toplam == number) {
            System.out.print("Mükemmel sayıdır.");
        }else {
            System.out.print("Mükemmel sayı değildir.");
        }
    }
}
