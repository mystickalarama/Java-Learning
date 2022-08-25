import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu girinizi: ");
        double boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        double kilo = input.nextDouble();
        double BMI = kilo / (boy * boy);
        System.out.print("Vucut Kitle İndeksiniz: " + BMI);
    }
}
