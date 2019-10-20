package Start;

import Algorytmy2.Zadanie17;

public class StartUp {
    public static void main(String[] args) {
       long start = System.nanoTime();
       Zadanie17.permutation("12345");
       long stop = System.nanoTime();
       System.out.println((stop-start)/1000000000);
    }
}