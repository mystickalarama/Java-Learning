import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void search(int[] list, int number) {
        Arrays.sort(list);
        int greater, less, i=0;
        if (number < list[0]) {
            System.out.println("Girdiğiniz sayıdan küçük başka sayı yoktur");
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + list[0]);
            } else if (number == list[0]) {
            System.out.println("Girdiğiniz sayıdan küçük başka sayı yoktur");
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + list[1]);
        } else if (number > list[list.length-1]) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[list.length-1]);
            System.out.println("Girdiğiniz sayıdan büyük başka sayı yoktur");
        } else if (number == list[list.length-1]) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[list.length-2]);
            System.out.println("Girdiğiniz sayıdan büyük başka sayı yoktur");
        }else {
            while (number > list[i]) {
                i++;
            }
            if (number == list[i]) {
                System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[i-1]);
                System.out.println("Girilen sayıdan büyük en yakın sayı: " + list[i+1]);
            }else {
                System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[i-1]);
                System.out.println("Girilen sayıdan büyük en yakın sayı: " + list[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        System.out.print("Bakmak istediğiniz sayıyı giriniz: ");
        int number = input.nextInt();
        search(list, number);
    }
}
