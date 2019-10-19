package Generycznosc;

public class FruitDisplayer {

    public void displayGenericFruitName(FancyBox<? extends IFruit> box) {
        box.saySomething();
        box.object.showName();
    }
}
