package Algorytmy2;

public class Zadanie3 {
    public static long fibonacciRecursive(long number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }

    public static long fibonacciIteration(long number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        long fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (long i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci;
    }
}
