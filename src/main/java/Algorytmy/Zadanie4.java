package Algorytmy;

import static java.lang.Math.*;

public class Zadanie4 {
    public static void equation1(int n) {
        for (int x = 1; x <= n; x++) {
            System.out.println(5 * x * cos(pow(x, 2) * sin(pow(x, -1))) / 2 * x * (x * (pow(1, x))));
        }
    }

    public static void equation2(int n) {
        for (int x = 1; x <= n; x++) {
            double sum = 0;
            for (int i = 1; i <= 5; i++) {
                sum = sum + (x * (2 * x / (x - (x / (4 * x))))) / (2 * (pow(x, (x * pow((x - 4), (x / 5)))) / 2));
            }
            System.out.println(sum);
        }
    }
}
