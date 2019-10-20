package Algorytmy2;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class Zadanie17{
    public static AtomicInteger counter;
    private static HashSet<String> set;

    public static void permutation(String input){
        set = new HashSet<>();
        counter = new AtomicInteger(1);
        permutation("", input);
        set.forEach(x -> {
            System.out.println(counter.getAndIncrement() + ": " + x);
        });
    }
    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            set.add(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                char first = word.charAt(i);
                String firstHalf = word.substring(0, i);
                String secondHalf = word.substring(i + 1);
                String permFist = perm + first;
                String allWord = firstHalf + secondHalf;
                permutation(permFist, allWord);
            }
        }
    }
}
