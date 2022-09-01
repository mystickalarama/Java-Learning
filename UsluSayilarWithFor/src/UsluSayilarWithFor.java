import java.util.Scanner;

public class UsluSayilarWithFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        int x = input.nextInt();
        System.out.print("Sayının üssü: ");
        int y = input.nextInt();
        int xT = 1;

        if (y > 0) {
            for (int i = 1; i <= y; i++) {
                xT *= x;
            }
            System.out.print("Sonuç: " + xT);
        } else if (y < 0) {
            for (int i = 1; i <= (-y); i++) {
                xT *= x;
            }
            System.out.print("Sonuç: 1/" + xT);
        } else if (y == 0) {
            System.out.print("Sonuç: 1");
        }
    }
}
