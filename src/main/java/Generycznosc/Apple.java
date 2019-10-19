package Generycznosc;

public class Apple implements IFruit {
    public String text = "Każde jabłko jest zjadliwe";
    @Override
    public String getName() {

        return "Jabłko";
    }

    @Override
    public void showName() {

        System.out.println(getName());
    }

    @Override
    public String toString() {
        return "Jabłko";
    }
}
