package Algorytmy;

public class Zadanie5 {

    public static int NWD1(int a, int b){
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
    public static int NWD2(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return NWD2(b, a % b);
        }
    }
}
