import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int x = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int y = input.nextInt();
        int ebob = 1;

        if (x<y) {
            int t = x;
            while (t>=1) {
                t--;
                if (x % t == 0 && y % t ==0) {
                    ebob = t;
                    break;
                }
            }
        }else {
            int t = y;
            while (t>=1) {
                t--;
                if (x % t == 0 && y % t ==0) {
                    ebob = t;
                    break;
                }
            }
        }
        System.out.println("EBOB = " + ebob);
        System.out.print("EKOK = " + ((x*y)/ebob));
    }
}
