import java.util.Scanner;

public class LoopSum4Mult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        int total = 0;

        do {
            System.out.print("Sayı giriniz: ");
            t = input.nextInt();
            if (t%4 == 0) {
                total += t;
            }
        } while (t%2 == 0);
        System.out.print("Toplam: " + total);
    }
}
