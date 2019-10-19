package Generycznosc;

public class GenericFruitBox<T extends IFruit> {
    T fruit;

    public GenericFruitBox(T fruit) {
        this.fruit = fruit;
    }
    public void showName(){
        fruit.showName();
    }
}
