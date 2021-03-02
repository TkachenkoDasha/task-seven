package task4;


import task5.Pair;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 12, 15, 22, 10);
        list.sort(Integer::compareTo);

        binarySearch(list, 12, Integer::compareTo);
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> comparator) {
        int index = 0;
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = comparator.compare(key, list.get(mid));
            if (cmp == 0) {
                index = mid;
                return index;
            } else if (cmp < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }
}
