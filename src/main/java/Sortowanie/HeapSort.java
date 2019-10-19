package Sortowanie;

public class HeapSort {

    private static void buildHeap(int[] array){
        for(int i = (array.length - 1) / 2; i >= 0; i--){
            heapify(array, i, array.length - 1);
        }
    }
    private static void heapify(int[] array, int i, int size){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max;
        if(left <= size && array[left] > array[i]){
            max = left;
        } else {
            max = i;
        }
        if(right <= size && array[right] > array[max]){
            max = right;
        }
        if(max != i){
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
            heapify(array, max, size);
        }
    }
    public static int[] heapSort(int[] array){
        buildHeap(array);
        int sizeOfHeap = array.length - 1;
        for(int i = sizeOfHeap; i > 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            sizeOfHeap--;
            heapify(array,0,sizeOfHeap);
        }
        return array;
    }
}
