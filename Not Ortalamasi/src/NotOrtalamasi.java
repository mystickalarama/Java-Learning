import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, müzik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik: ");
        mat = inp.nextInt();

        System.out.print("Fizik: ");
        fizik = inp.nextInt();

        System.out.print("Kimya: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe: ");
        turkce = inp.nextInt();

        System.out.print("Tarih: ");
        tarih = inp.nextInt();

        System.out.print("Müzik: ");
        müzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + müzik);
        double sonuc = toplam/6;
        System.out.println("Ortalama: " + sonuc);

        String son = sonuc>=60 ? "Geçti" : "Kaldı";
        System.out.println(son);
    }
}
