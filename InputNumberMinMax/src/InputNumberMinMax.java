import java.util.Scanner;

public class InputNumberMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı girmek istersiniz: ");
        int numberCount = input.nextInt();
        int nC = numberCount - 2, a, b, bigOne, littleOne, c = 3;
        if (numberCount < 2) {
            System.out.print("En az iki sayı girmelisiniz");
        } else {
            System.out.print("1.Sayıyı giriniz: ");
            a = input.nextInt();
            System.out.print("2.Sayıyı giriniz: ");
            b = input.nextInt();
            if (a > b) {
                bigOne = a;
                littleOne = b;
            } else {
                bigOne = b;
                littleOne = a;
            }

            while (nC > 0) {
                System.out.print(c + ".Sayıyı giriniz: ");
                int number = input.nextInt();
                a = number;
                c++;

                if (a > bigOne) {
                    bigOne = a;
                } else if (a < littleOne) {
                    littleOne = a;
                }
                nC--;
            }
            System.out.println("En büyük sayı: " + bigOne);
            System.out.println("En küçük sayı: " + littleOne);
        }
    }
}
