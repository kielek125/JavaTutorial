package Algorytmy;

import java.util.List;

public class Zadanie1 {

    public static int returnEven(List<Integer> list){
        return (int)list.stream()
                .filter(x -> Math.abs(x) % 2 == 0)
                .count();
    }

    public static int returnOdd(List<Integer> list){
        return (int) list.stream()
                .filter(x -> Math.abs(x) % 2 == 1)
                .count();
    }
}
