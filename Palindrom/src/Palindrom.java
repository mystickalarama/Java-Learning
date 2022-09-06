import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sorgulamak istediğiniz sayıyı giriniz: ");
        int number = input.nextInt(), numberTemp = number, numberR, numberL = 0;

        while (numberTemp != 0) {
            numberR = numberTemp % 10;
            numberL = (numberL * 10) + numberR;
            numberTemp /= 10;
        }
        if (numberL == number) {
            System.out.print(number + " bir palindrom sayıdır.");
        }else {
            System.out.print(number + " bir palindrom sayı değildir");
        }
    }
}
