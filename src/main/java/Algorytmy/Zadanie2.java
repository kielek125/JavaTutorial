package Algorytmy;

import java.util.List;

public class Zadanie2 {
    public static Integer[] divide(List<Integer> list, int divider) {
        return list.stream()
                .filter(x -> x % divider == 0)
                .map(x -> x.intValue())
                .toArray(Integer[]::new);
    }
}
