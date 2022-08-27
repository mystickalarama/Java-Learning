import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adı: ");
        String userName = input.nextLine();
        System.out.print("Şifre: ");
        String password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız!");
        } else if (userName.equals("patika") && password.intern() != "java123") {
            System.out.println("Hatalı şifre girdiniz!\nŞifre sıfırlamak istermisiniz?\n1-evet / 2-hayır");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.print("yeni şifre giriniz: ");
                    input.nextLine();
                    String newPassword = input.nextLine();
                    if (newPassword.equals("java123")) {
                        System.out.print("Yeni şifreniz eski şifreniz ile aynı olamaz");
                    } else {
                        System.out.print("Şifreniz başarıyla oluşturuldu");
                    }
                    break;
                case 2:
                    System.out.print("Tekrar giriş yapınız");
                    break;
                default:
                    System.out.print("Geçersiz giriş!");
                    break;
            }
        } else {
            System.out.print("Hatalı giriş yaptınız!");
        }
    }
}