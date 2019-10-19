package Generycznosc;

public class Orange implements IFruit {
    @Override
    public String getName() {
        return "Pomarańcza";
    }

    @Override
    public void showName() {
        System.out.println(getName());
    }

    @Override
    public String toString() {
        return "Pomarańcza";
    }
}
