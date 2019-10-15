package Algorytmy;

import com.google.common.collect.Sets;

import java.util.*;
import java.util.stream.Collectors;

public class Zadanie6 {

    public static Integer[] primeNumbers(List<Integer> list) {

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
                .filter(set::contains)
                .map(x -> x.intValue())
                .toArray(Integer[]::new);
    }
}
