package task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Double[] array = new Double[2];
        array[0] = 5.5;
        array[1] = 1.0;
        swap(array, 0, 1);
        for (Double number : array) {
            System.out.println(number);
        }

    }

    private static <T> void swap(T[] array, int firstIndex, int secondIndex) {
        T element = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = element;
    }
}
