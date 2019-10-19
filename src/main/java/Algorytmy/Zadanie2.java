package Algorytmy;

import java.util.List;

public class Zadanie2 {
    public static int[] divide(List<Integer> list, int divider) {
        return list.stream()
                .filter(x -> x % divider == 0)
                .mapToInt(x -> x)
                .toArray();
    }
}
