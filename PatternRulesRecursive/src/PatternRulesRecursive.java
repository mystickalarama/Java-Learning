import java.util.Scanner;

public class PatternRulesRecursive {
    static void pattern(int a, int i, int aT) {
        if (i == 1) {
            a -= 5;
            System.out.print(a + " ");
            if (a>0) {
                pattern(a, i, aT);
            }else {
                i++;
                pattern(a, i, aT);
            }
        } else if (i == 2) {
            a += 5;
            System.out.print(a + " ");
            if (a != aT) {
                pattern(a, i, aT);
            }else {

            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Başlangıç sayısnı giriniz: ");
        int n = input.nextInt(), i = 1, nT = n;
        
        if (n>0) {
            System.out.print(n + " ");
            pattern(n, i, nT);
        }else {
            System.out.print("lütfen 0'dan büyük bir değer giriniz");
        }
    }
}
