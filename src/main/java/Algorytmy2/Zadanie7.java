package Algorytmy2;

public class Zadanie7 {
    public static boolean IsArmstrongNumber(long number) {
        long c = 0, a, temp;

        temp = number;
        while (number > 0) {
            a = number % 10;
            number = number / 10;
            c = c + (a * a * a);
        }
        if (temp == c) {
            return true;
        } else {
            return false;
        }

    }
}

