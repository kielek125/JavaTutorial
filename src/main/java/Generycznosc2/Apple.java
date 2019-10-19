package Generycznosc2;

public class Apple implements IFruit{
    protected String name;

    public Apple(String name) {

        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showName() {
        System.out.println(getName());
    }
}
