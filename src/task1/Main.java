package task1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, -5, 0, -2);

        System.out.println(counter(list));
    }

    private static <T extends Number> int counter(List<T> list) {
        int counter = 0;
        for (T numbers : list) {
            if (numbers.doubleValue() < 0) {
                counter++;
            }
        }
        return counter;
    }
}
