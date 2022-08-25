import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Sırayla üçgenin kenar uzunluklarını giriniz");
        System.out.print("a kenarı: ");
        a = input.nextInt();
        System.out.print("b kenarı: ");
        b = input.nextInt();
        System.out.print("c kenarı: ");
        c = input.nextInt();
        double u = (a + b + c)/2;
        double cevre = 2 * u;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
