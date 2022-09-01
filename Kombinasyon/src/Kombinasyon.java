import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("C(n,r) için\nn'i giriniz: ");
        int n = input.nextInt();
        System.out.print("r'yi giriniz: ");
        int r = input.nextInt();
        int nT = n;
        int nF = 1;
        int rF = 1;
        if (r>=n || r<0 || n<0) {
            System.out.print("r girdisi n'den küçük olmalı ve ikiside negatif olamaz");
        }else {
            for (int i=1; i<=(n-(n-r)); i++) {
                nF *= n;
                n--;
            }
            for (int t=1; t<=r; t++) {
                rF *= t;
            }
        }System.out.print("C(" + nT + "," + r + ") = " + (nF/rF));
    }
}
