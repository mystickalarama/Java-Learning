import java.util.Scanner;

public class BasSayToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        int numberV, total = 0;
        while (number != 0) {
            numberV = number % 10;
            total += numberV;
            number /= 10;
        }
        System.out.print("Toplam: " + total);
    }
}
