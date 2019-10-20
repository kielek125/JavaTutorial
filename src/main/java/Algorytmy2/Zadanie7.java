package Algorytmy2;

public class Zadanie7 {
    public static boolean IsArmstrongNumber(long number) {
        long result = 0, a, temp;
        int power = String.valueOf(number).length();

        temp = number;
        while (number > 0) {
            a = number % 10;
            number = number / 10;
            result = result + (int)Math.pow(a, power);
        }
        if (temp == result) {
            return true;
        } else {
            return false;
        }

    }
}

