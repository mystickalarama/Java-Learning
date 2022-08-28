import java.util.Scanner;

public class KBSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        int a = input.nextInt();
        System.out.print("b sayısını giriniz: ");
        int b = input.nextInt();
        System.out.print("c sayısını giriniz: ");
        int c = input.nextInt();

        if (a == b || a == c || b == c) {
            System.out.print("Lütfen her sayıyı farklı giriniz");
        }
        if (a<b && a<c){
            if (b<c) {
                System.out.print("a<b<c");
            }else {
                System.out.print("a<c<b");
            }
        }
        if (b<a && b<c) {
            if (a < c) {
                System.out.print("b<a<c");
            } else {
                System.out.print("b<c<a");
            }
        }
        if (c<a && c<b) {
            if (a < b) {
                System.out.print("c<a<b");
            } else {
                System.out.print("c<b<a");
            }
        }
    }
}
