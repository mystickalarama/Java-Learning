import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Başlangıç değeri giriniz: ");
        int n = input.nextInt();
        System.out.print("Bitiş değeri giriniz: ");
        int t = input.nextInt();
        int toplam = 0;

        if(t<=n) {
            System.out.print("Bitiş değeri başlangıç değerinden büyük olmalıdır");
        }else {
            for (int i=n; i<t; i++) {
                for (int k=2; k<=i; k++) {
                    if (i % k == 0) {
                        toplam += i;
                    }
                }
                if (toplam == i) {
                    System.out.print(i + " ");
                }
                toplam = 0;
            }
        }
    }
}
