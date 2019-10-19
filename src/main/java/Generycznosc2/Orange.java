package Generycznosc2;

public class Orange implements IFruit{
    protected String name;

    public Orange(String name) {

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
