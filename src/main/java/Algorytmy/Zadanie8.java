package Algorytmy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zadanie8 {

    public static Integer[] GetPrimeNumbers(int quantity){

        List<Integer> primeSet = new ArrayList<>();

        for(int i = 1; i <= quantity; i++){
            boolean isPrime = CheckPrime(i);
            if(isPrime){
                primeSet.add(i);
            }
        }
        return primeSet.stream().map(x -> x.intValue()).toArray(Integer[]::new);
    }

    public static boolean CheckPrime(int number){

        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
