package Algorytmy2;

import java.util.Collections;
import java.util.stream.Collectors;

public class Zadanie2 {

    public static Integer nonBinarySearch(long[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return null;
    }

    public static Integer binarySearch(long[] array, int number) {
        int left = 0, right = array.length - 1, middle = 0;

        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] == number) {
                return middle;
            } else if (array[middle] < number) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return null;
    }

    public static Integer binarySearchGetFirst(long[] array, int number) {

        int left = 0, right = array.length - 1, middle = 0;
        boolean found = false;

        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] == number) {
                found = true;
                if (middle == 0) {
                    break;
                }
                if (array[middle - 1] == number) {
                    right = middle - 1;
                } else {
                    break;
                }

            } else if (array[middle] < number)
                left = middle + 1;
            else
                right = middle - 1;
        }

        if (found) {
            return middle;
        }
        return null;
    }

    public static Integer binarySearchGetLast(long[] array, int number) {

        int left = 0, right = array.length - 1, middle = 0;
        boolean found = false;

        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] == number) {
                found = true;
                if (middle == array.length - 1) {
                    break;
                }
                if (array[middle + 1] == number) {
                    left = middle + 1;
                } else {
                    break;
                }

            } else if (array[middle] < number)
                left = middle + 1;
            else
                right = middle - 1;
        }

        if (found) {
            return middle;
        }
        return null;
    }
}
