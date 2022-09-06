import java.util.Scanner;

public class PowerRecursive {

    static int power(int a, int b) {
        if (b > 0) {
            return power(a, b-1)*a;
        }
        if (b < 0) {
            return power(a, b+1)*a;
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        int b = input.nextInt();

        if(b < 0)
            System.out.print("1/" + power(a, b));
        else
            System.out.print(power(a, b));
    }
}
