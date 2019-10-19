package Algorytmy;

public class Zadanie5 {

    public static long NWD1(long a, long b){
        if(a == 0 || b == 0){
            return 0;
        }
        while(a != b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }
    public static long NWD2(long a, long b){
        if(b == 0){
            return a;
        }
        else{
            return NWD2(b, a % b);
        }
    }
}
