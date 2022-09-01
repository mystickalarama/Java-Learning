import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaça kadar harmonik almak istersiniz: ");
        int n = input.nextInt();
        double total = 0;

        for (double i=1; i<=n; i++) {
            total += (1/i);
        }
        System.out.print("toplam: " + total);
    }
}
