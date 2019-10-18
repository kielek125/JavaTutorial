package Algorytmy2;

public class Zadanie13{
    public static <T> T[] Reverse(T[] array){
        if (array == null || array.length < 2) {
            return null;
        }

        for (int i = 0; i < array.length / 2; i++) {
            T temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
