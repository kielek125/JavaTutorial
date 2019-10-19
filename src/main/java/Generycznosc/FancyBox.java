package Generycznosc;

public class FancyBox<T> extends StandardBox<T> {
    public FancyBox(T object) {
        super(object);
    }

    public void saySomething(){
        System.out.println("Nasz " + object + " jest fajny");
    }
}
