package Algorytmy;

import java.util.stream.LongStream;

public class Zadanie11 {
    public static boolean checkIfNumberIsPerfect(long number){
        long sum = 0;
        for (long i = 1; i <= (number/2); i++) {
            if (number % i == 0){
                sum += i;
            }

        }
        if(sum == number){
            return true;
        }
        return false;
    }

    public static boolean checkIfNumberIsPerfectStream(long number){
        long sum = LongStream.range(1, number/2 + 1)
                .filter(x -> (number % x) == 0)
                .sum();

        if(sum == number){
            return true;
        }
        return false;
    }
}
