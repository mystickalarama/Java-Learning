import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı seri istersiniz: ");
        int n = input.nextInt(), a=0, b=1, c;
        //System.out.print(a + " " + b + " ");

        for (int i=1; i<=n-1; i++) {
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
            a = b;
            b = c;
        }
    }
}
