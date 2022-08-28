import java.util.Scanner;

public class HavaEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        int heat = input.nextInt();

        if (heat<5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        if (5<=heat && heat<=15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (10<=heat && heat<=25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        if (25<heat) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
