import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {1, 7, 3, 6, 5};

        for (int pass = 0; pass < data.length - 1; pass++) {
            boolean swapped = false;

            for (int i = 0; i < data.length - 1 - pass; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (pass + 1) + ": " + Arrays.toString(data));

            if (!swapped) { // no swaps → sorted
                System.out.println("Array sorted early at pass " + (pass + 1));
                break;
            }
        }
    }
}
