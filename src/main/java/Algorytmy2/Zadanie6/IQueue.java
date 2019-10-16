package Algorytmy2.Zadanie6;

public interface IQueue<T>
{
    boolean Add(T element);
    T Peek();
    T Pool();
    void Remove();
    int Size();
}
