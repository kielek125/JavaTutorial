package Start;

import Algorytmy2.*;
import Algorytmy2.Zadanie11.Zadanie11;
import Algorytmy2.Zadanie16.Zadanie16;

import java.util.Arrays;

public class StartUp {
    public static void main(String[] args) throws Exception {

        //https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html
        Zadanie17.permutation("abcdef");
        String[] table = {"ania","zosia"};
        Arrays.stream(Zadanie13.Reverse(table)).forEach(System.out::println);
    }

}


