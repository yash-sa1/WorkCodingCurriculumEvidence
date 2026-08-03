package weeklyminiproject;

import java.util.Random;

public class SortedArrayGenerator {

    public static int[] generate(int size) {
        Random random = new Random(42);
        int[] array = new int[size];

        int value = 0;
        for (int i = 0; i < size; i++) {
            value += random.nextInt(1, 10);
            array[i] = value;
        }

        return array;
    }

}
