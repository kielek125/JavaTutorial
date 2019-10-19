package Algorytmy;

import java.util.*;

public class Zadanie6 {

    public static int[] primeNumbers(List<Integer> list) {

        int n = Collections.max(list);

        List<Integer> set = new ArrayList<>();

        boolean prime[] = new boolean[n+1];

        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == false)
            {
                for(int i = p*2; i <= n; i += p){
                    prime[i] = true;
                }
            }
        }
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == false) {
                set.add(i);
            }
        }
        return list.stream()
                .distinct()
                .filter(x -> set.contains(x))
                .mapToInt(x -> x)
                .toArray();
    }

    public static boolean primeNumbers(long a){
        if(a <= 1){
            return false;
        }
        for (long i = 2; i*i<=a; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
