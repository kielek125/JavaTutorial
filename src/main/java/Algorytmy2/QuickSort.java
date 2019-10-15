package Algorytmy2;

public class QuickSort {
    public static void quickSort(long[] array, int first, int last) {
        int i, j;
        long key;
        long temp;
        i = first;
        j = last;
        key = array[(first + last) / 2];
        while (i <= j) {
            //left
            while (array[i] < key) {
                i++;
            }
            //right
            while (key < array[j]) {
                j--;
            }
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (first < j) {
            quickSort(array, first, j);
        }
        if(i < last){
            quickSort(array, i, last);
        }
    }
}
