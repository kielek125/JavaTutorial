package Algorytmy2.Zadanie6;

public class MyDeque<T> implements IQueue<T> {
    private int maxElement = 1;
    private int size;
    private T[] elements;

    public MyDeque() throws Exception {
        this(-1);
    }
    public MyDeque(int maxElement) throws Exception {
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
            T[] tempArray = (T[]) new Object[elements.length - 1];
            for (int i = 0; i < tempArray.length; i++) {
                tempArray[i] = elements[i];
            }
            elements = tempArray;
            size--;
            return element;
        }
        return null;
    }

    public void Remove() {
        if (size > 0) {
            T[] tempArray = (T[]) new Object[elements.length - 1];
            for (int i = tempArray.length - 1; i >= 0; i--) {
                tempArray[i] = elements[i];
            }
            elements = tempArray;
            size--;
        }
    }

    public int Size() {
        return size;
    }

    private T[] insert(T key) {
        T[] result = (T[]) new Object[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            result[i] = elements[i];
        }
        result[result.length - 1] = key;

        return result;
    }
}
