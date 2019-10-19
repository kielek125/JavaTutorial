package Algorytmy;

import java.util.ArrayList;
import java.util.List;

public class Zadanie8 {

    public static int[] GetPrimeNumbers(int quantity) {
        List<Integer> list = new ArrayList<>();
        int index = 2;

        while (list.size() < quantity) {
            if (CheckPrime(index)) {
                list.add(index);
            }
            index++;
        }

        return list.stream()
                .mapToInt(x -> x)
                .toArray();
    }

    public static boolean CheckPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        return false;
            }
        }

        return true;
    }
}
