package Algorytmy2.Zadanie6;

import java.util.Arrays;
import java.util.Objects;

public class MyQueue<T> implements IQueue<T> {
    private int maxElement;
    private int size;
    private T[] elements;

    public MyQueue() throws Exception {
        this(-1);
    }

    public MyQueue(int maxElement) throws Exception {
        if (maxElement == 0) {
            throw new Exception("Nie można podać zera jako wartość");
        }
        this.maxElement = maxElement;
        elements = (T[]) new Object[0];
    }

    public boolean Add(T element) {
        if (size == maxElement) {
            return false;
        }
        elements = insert(element);
        size++;

        return true;
    }

    public T Peek() {
        if (size > 0) {
            return elements[elements.length - 1];
        }
        return null;
    }

    public T Pool() {
        if (size > 0) {
            T element = Peek();
            T[] tempArray = (T[])new Objects[elements.length - 1];
           /* for (int i = 0; i < tempArray.length; i++) {
                tempArray[i] = elements[i];
            }*/
            tempArray = Arrays.copyOf(elements, elements.length - 1);
            elements = tempArray;
            size--;
            return element;
        }
        return null;
    }

    public void Remove() {
        if (size > 0) {
            T[] tempArray = (T[])new Objects[elements.length - 1];
            /*for (int i = 0; i < tempArray.length; i++) {
                tempArray[i] = elements[i];
            }*/
            tempArray = Arrays.copyOf(elements, elements.length - 1);
            elements = tempArray;
            size--;
        }
    }

    public int Size() {
        return size;
    }

    private T[] insert(T key) {
        T[] result = (T[]) new Object[elements.length + 1];
        for (int i = 1; i <= elements.length; i++) {
            result[i] = elements[i - 1];
        }
        result[0] = key;

        return result;
    }
}
