package Algorytmy;

import java.util.ArrayList;
import java.util.List;

public class Zadanie10 {

    public static void PrimeFactors(long n){
        List<Long> primes = new ArrayList<>();

        for(long i = 2; i <= n / i; i++){
            while(n % i == 0){
                primes.add(i);
                n = n / i;
            }
        }
        if(n > 1){
            primes.add(n);
        }
        primes.stream().forEach(System.out::println);
    }
}
