import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, müzik;
        int n= 0;
        int toplam= 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik: ");
        mat = inp.nextInt();
        if (0<=mat && mat<=100) {
            toplam += mat;
            n++;
        }

        System.out.print("Fizik: ");
        fizik = inp.nextInt();
        if (0<=fizik && fizik<=100) {
            toplam += fizik;
            n++;
        }

        System.out.print("Kimya: ");
        kimya = inp.nextInt();
        if (0<=kimya && kimya<=100) {
            toplam += kimya;
            n++;
        }

        System.out.print("Türkçe: ");
        turkce = inp.nextInt();
        if (0<=turkce && turkce<=100) {
            toplam += turkce;
            n++;
        }

        System.out.print("Tarih: ");
        tarih = inp.nextInt();
        if (0<=tarih && tarih<=100) {
            toplam += tarih;
            n++;
        }

        System.out.print("Müzik: ");
        müzik = inp.nextInt();
        if (0<=mat && mat<=100) {
            toplam += müzik;
            n++;
        }
        if (n == 0) {
            System.out.print("Geçersiz giriş yaptınız!");
        }else {
            double ortalama = toplam/n;
            System.out.println("Ortalama: " + ortalama);

            String son = ortalama>=55 ? "Geçti" : "Kaldı";
            System.out.println(son);
        }
    }
}
