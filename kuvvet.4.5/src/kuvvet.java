import java.util.Scanner;

public class kuvvet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int t = input.nextInt();
        int kuvvet1 = 0;
        int kuvvet2 = 0;
        for (int i=1; i<=t; i*=4) {
            System.out.println("4'ün " + kuvvet1 + ". katı: " + i);
            kuvvet1++;
        }
        System.out.println("--------------------");
        for (int n=1; n<=t; n*=5) {
            System.out.println("5'in " + kuvvet2 + ". katı: " + n);
            kuvvet2++;
        }
    }
}
