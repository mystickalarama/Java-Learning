import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        int t = n, y = 1, g = n;

        for (int i=1; i<=n; i++) {
            t -= 1;
            for (int a=1; a<=t; a++) {
                System.out.print(" ");
            }
            for (int b=1; b<=y; b++) {
                System.out.print("*");
            }
            y += 2;
            System.out.print("\n");
        }
        y -= 4;
        for (int i=1; i<=n; i++) {
            g -= 1;
            for (int a=(n-1); a>=g; a--) {
                System.out.print(" ");
            }
            for (int b=1; b<=y; b++) {
                System.out.print("*");
            }
            y -= 2;
            System.out.print("\n");
        }
    }
}
