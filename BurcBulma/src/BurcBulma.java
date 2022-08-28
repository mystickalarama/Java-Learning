import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        String burc = " ";
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        int month = input.nextInt();
        System.out.print("Doğduğunuz gün: ");
        int day = input.nextInt();

        if (month == 1) {
            if (1<=day && day<=21) {
                burc = "Oğlak";
            } else if (22<=day && day<=31) {
                burc = "Kova";
            }else {
                isError = true;
            }
        }
        if (month == 2) {
            if (1<=day && day<=19) {
                burc = "Kova";
            } else if (20<=day && day<=29) {
                burc = "Balık";
            }else {
                isError = true;
            }
        }
        if (month == 3) {
            if (1<=day && day<=20) {
                burc = "Balık";
            } else if (21<=day && day<=31) {
                burc = "Koç";
            }else {
                isError = true;
            }
        }
        if (month == 4) {
            if (1<=day && day<=20) {
                burc = "Koç";
            } else if (21<=day && day<=30) {
                burc = "Boğa";
            }else {
                isError = true;
            }
        }
        if (month == 5) {
            if (1<=day && day<=21) {
                burc = "Boğa";
            } else if (22<=day && day<=31) {
                burc = "İkizler";
            }else {
                isError = true;
            }
        }
        if (month == 6) {
            if (1<=day && day<=22) {
                burc = "İkizler";
            } else if (23<=day && day<=30) {
                burc = "Yengeç";
            }else {
                isError = true;
            }
        }
        if (month == 7) {
            if (1<=day && day<=22) {
                burc = "Yengeç";
            } else if (23<=day && day<=31) {
                burc = "Aslan";
            }else {
                isError = true;
            }
        }
        if (month == 8) {
            if (1<=day && day<=22) {
                burc = "Aslan";
            } else if (23<=day && day<=31) {
                burc = "Başak";
            }else {
                isError = true;
            }
        }
        if (month == 9) {
            if (1<=day && day<=22) {
                burc = "Başak";
            } else if (23<=day && day<=30) {
                burc = "Terazi";
            }else {
                isError = true;
            }
        }
        if (month == 10) {
            if (1<=day && day<=22) {
                burc = "Terazi";
            } else if (23<=day && day<=31) {
                burc = "Akrep";
            }else {
                isError = true;
            }
        }
        if (month == 11) {
            if (1<=day && day<=21) {
                burc = "Akrep";
            } else if (22<=day && day<=30) {
                burc = "Yay";
            }else {
                isError = true;
            }
        }
        if (month == 12) {
            if (1<=day && day<=21) {
                burc = "Yay";
            } else if (22<=day && day<=31) {
                burc = "Oğlak";
            }else {
                isError = true;
            }
        }
        if (month<1 || month>12) {
            isError = true;
        }
        if (isError) {
            System.out.print("Geçersiz değerler girdiniz!");
        }else {
            System.out.print("Burcunuz: " + burc);
        }

    }
}
