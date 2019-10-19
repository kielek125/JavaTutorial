package Generycznosc;

public class Lemon implements IFruit {
    public String getName() {
        return "Cytryna";
    }
    public void showName() {
        System.out.println(getName());
    }
    public String toString() {
        return "Cytryna";
    }
}
