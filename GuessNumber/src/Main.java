import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

    static void printArr(int [] arr) {
        for (int i: arr) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isThere(int[] arr, int guess) {
        for(int i: arr) {
            if (i == guess) {
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);
        int right = 5, guess, wAIndex = 0;
        boolean isFalse = true;
        int[] wrongAnswers = new int[5];

        for (int i = 1; i <= right; i++) {
            System.out.print("Tahmininiz: ");
            guess = input.nextInt();
            if (guess <= 0 || guess >= 100) {
                System.out.println("Lütfen 0 ile 100 arasında bir tahminde bulununuz");
                System.out.println("---------------------------");
                right += 1;
            } else if (guess == number) {
                System.out.println("Tebrikler, doğru tahmin!");
                System.out.println("---------------------------");
                isFalse = false;
                break;
            }else if (!isThere(wrongAnswers, guess)) {
                wrongAnswers[wAIndex] = guess;
                wAIndex += 1;
                if (guess < number) {
                    System.out.println("Tahmininiz sayıdan küçük");
                    System.out.println("---------------------------");
                }else if (guess > number) {
                    System.out.println("Tahmininiz sayıdan büyük");
                    System.out.println("---------------------------");
                }
            } else if (isThere(wrongAnswers, guess)) {
                System.out.println("Lütfen farklı bir sayı giriniz");
                System.out.println("---------------------------");
                right += 1;
            }
        }
        if (isFalse) {
            System.out.println("Doğru cevap " + number);
        }
        System.out.print("Yanlış cevaplarınız: ");
        printArr(wrongAnswers);
    }
}
