import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kg: ");
        double Armut = input.nextDouble();
        double ArmutT = Armut * 2.14;
        System.out.print("Elma kg: ");
        double Elma = input.nextDouble();
        double ElmaT = Elma * 3.67;
        System.out.print("Domates kg: ");
        double Domates = input.nextDouble();
        double DomatesT = Domates * 1.11;
        System.out.print("Muz kg: ");
        double Muz = input.nextDouble();
        double MuzT = Muz * 0.95;
        System.out.print("Patlıcan kg: ");
        double Patlican = input.nextDouble();
        double PatlicanT = Patlican * 5;
        System.out.print("Toplam Tutar: " + (ArmutT + ElmaT + DomatesT + MuzT + PatlicanT) + " TL");
    }
}
