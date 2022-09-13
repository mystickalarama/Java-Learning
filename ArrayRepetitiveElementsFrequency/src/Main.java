import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static boolean isRepeat(int[] list, int number) {
        for (int i: list) {
            if (number == i) {
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] dub = new int[list.length];
        int dubIndex = 0;
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");

        for (int i = 0 ; i < list.length; i++) {
            int t = 0;
            for (int j = 0 ; j < list.length; j++) {
                if (list[i] == list[j]) {
                    t++;
                }
            }
            if (!isRepeat(dub, list[i])) {
                System.out.println(list[i] + " sayısı " + t + " kere tekrar edildi");
                dub[dubIndex++] = list[i];
            }
        }
    }
}
