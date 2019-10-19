package Sortowanie;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingSort {
    public static int[] countingSort(int[] array){

        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[array.length];

        //Zliczamy liczby z tablicy
        for(int i = 0; i <array.length; i++){
            count[array[i] - min]++;
        }
        //wypełniamy tablice
        for(int i = 1; i <count.length; i++){
            count[i] = count[i] + count[i - 1];
        }
        // uzupełniamy tablice
        for(int i = array.length - 1; i >= 0; i--){
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }
        return output;
    }
}
