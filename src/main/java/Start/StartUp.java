package Start;

import Algorytmy2.*;

import java.util.Arrays;

public class StartUp {
    public static void main(String[] args) {

        try {
            long start = System.nanoTime();
            String[] array = {"Bartosz","Ania","Tomek"};
            Arrays.stream(array).forEach(System.out::println);
            Zadanie13.Reverse(array);
            Arrays.stream(array).forEach(System.out::println);
            long stop = System.nanoTime();
            System.out.println(stop - start);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}


