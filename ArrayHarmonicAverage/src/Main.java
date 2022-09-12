public class Main {
    public static void main(String[] args) {
        double[] array = {2, 4, 7, 9, 12};
        double total = 0.0;

        for (int i = 0; i < array.length; i++) {
            total += 1/array[i];
        }
        System.out.println(array.length/total);
    }
}
