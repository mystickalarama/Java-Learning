import java.util.Scanner;

public class DaireDilimiAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        int r = input.nextInt();
        System.out.print("Daire diliminin açısını giriniz: ");
        int a = input.nextInt();
        double pi = 3.14;
        double alan = (pi * (r * r) * a) / 360;
        System.out.println("Daire diliminin alanı: " + alan);
    }
}