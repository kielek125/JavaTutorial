package Algorytmy2;

public class Zadanie8 {

    public static long Factorial1(int number){
        if(number == 0){
            return 1;
        }
        return number*Factorial1(--number);
    }
    public static long Factorial2(int number){
        int result = 1;
        while(number != 0){
            result = result*number;
            number--;
        }
        return result;
    }
}
