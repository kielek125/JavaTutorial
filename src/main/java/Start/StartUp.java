package Start;



import Algorytmy2.QuickSort;
import Algorytmy2.Zadanie1;
import Algorytmy2.Zadanie2;

import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.lang.reflect.Array;
import java.util.*;

public class StartUp {
    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(1, 5, 8, 3, 45, 72, 4, 5, 32, 7, 16, 5, 3, 54, 6, 71);
        List<Integer> array2 = Arrays.asList(2,4,8);

        long[] array3 = {1,5,55,6,6,6,6,3,4,5,2,9,3,7,3,5,1,2,6,3,45,2,45,2,543,9,9,9,9,9,5,34,4,4,9,9,9,3,3,4,455,45};
        QuickSort.quickSort(array3, 0, array3.length - 1);
        System.out.println(Zadanie2.binarySearchGetFirst(array3, 9));
        System.out.println(Zadanie2.binarySearchGetLast(array3, 9));
        System.out.println(Zadanie2.binarySearch(array3, 9));
        //System.out.println("Parzyste: " + Zadanie1.returnEven(array));
        //System.out.println("Nieparzyste: " + Zadanie1.returnOdd(array));

        //Arrays.stream(Zadanie2.divide(array, 1)).forEach(x -> System.out.println(x));

        //Arrays.stream(Zadanie3.divide(array, array2)).forEach(System.out::println);

        //Zadanie4.equation1(15);
        //Zadanie4.equation1(15);

        //System.out.println(Zadanie5.NWD1(16,7));
        //System.out.println(Zadanie5.NWD2(16,6));*/

        //Arrays.stream(Zadanie6.primeNumbers(array)).forEach(System.out::println);
        //System.out.println(Zadanie7.NWW(187,773));

        //Arrays.stream(Zadanie8.GetPrimeNumbers(25)).forEach(System.out::println);
        //System.out.println(Zadanie9.LiczbaSlownie(5648789374890234L));

        //Zadanie10.PrimeFactors(79);

    }

}


