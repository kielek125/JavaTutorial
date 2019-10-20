package Algorytmy2;

public class Zadanie8 {

    public static long FactorialRecursive(int number){
        if(number == 0){
            return 1;
        }
        return number*FactorialRecursive(--number);
    }
    public static long FactorialIteration(int number){
        int result = 1;
        while(number != 0){
            result = result*number;
            number--;
        }
        return result;
    }
}
