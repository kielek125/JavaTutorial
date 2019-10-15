package Algorytmy2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zadanie1 {

    //max value from collections
    public static void getMax(){
        long[] list = new long[200000];
        Random random = new Random();

        for(int i = 0; i < 200000; i++){
            list[i] = ((long)random.nextInt(1000000) - 500000);
        }

        long maxValue = getMaxValueFromCollection2(list);
        System.out.println(maxValue);
    }
    public static long getMaxValueFromCollection1(long[] list){
        long maxValue = Long.MIN_VALUE+1;
        for(int i = 0; i < list.length; i++){
            long temp = list[i];
            if(maxValue < temp){
                maxValue = temp;
            }
        }
        return maxValue;
    }

    public static long getMaxValueFromCollection2(long[] list)
    {
        QuickSort.quickSort(list, 0, list.length-1);
        return list[list.length - 1];
    }

}
