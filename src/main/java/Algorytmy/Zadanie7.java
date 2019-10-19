package Algorytmy;

public class Zadanie7 {

    public static long NWW1(long a, long b){

        return Math.abs(a*b/Zadanie5.NWD1(a,b));
    }
    public static long NWW2(long a, long b) {
        long multi = a;
        while (multi % b != 0) {
            multi += a;
        }
        return multi;
    }
}
