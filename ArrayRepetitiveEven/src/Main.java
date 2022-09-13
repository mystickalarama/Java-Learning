import java.lang.reflect.Array;

public class Main {

    static boolean isRepeat(int[] list, int number) {
        for (int i: list) {
            if (number == i) {
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 8, 4, 6, 2, 5, 7, 6, 9};
        int[] dub = new int[list.length];
        int dubIndex = 0;

        for (int i = 0 ; i < list.length; i++) {
            for (int j = 0 ; j < list.length; j++) {
                if (i != j && list[i] == list[j] && list[i]%2 == 0 && !isRepeat(dub, list[i])) {
                    dub[dubIndex++] = list[i];
                }
            }
        }
        for (int i: dub) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
