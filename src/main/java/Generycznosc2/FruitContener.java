package Generycznosc2;

public class FruitContener<T extends IFruit> {
    public T fruit;

    public FruitContener(T fruit) {
        this.fruit = fruit;
    }
    public void printFruitName(){
        fruit.showName();
    }
}
