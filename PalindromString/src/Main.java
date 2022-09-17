import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kotrol etmek istediğiniz kelimeyi giriniz: ");
        String str = input.nextLine();
        int j = str.length() - 1;
        boolean isEquel = true;
        for (int i = 0; i < j; i++) {
            if (str.charAt(i) == str.charAt(j)) {
                j -= 1;
            } else if (str.charAt(i) != str.charAt(j)) {
                isEquel = false;
                break;
            }
        }
        if (isEquel) {
            System.out.println(str + " palindromdur.");
        }else {
            System.out.println(str + " palindrom değildir.");
        }
    }
}
