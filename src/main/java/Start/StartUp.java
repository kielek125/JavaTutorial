package Start;

import Algorytmy2.*;
import Algorytmy2.Zadanie11.Zadanie11;
import Generycznosc.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class StartUp {
    public static void main(String[] args) {


        FruitDisplayer fruitDisplayer = new FruitDisplayer();

        FancyBox<Apple> fancyAppleBox = new FancyBox<>(new Apple());
        FancyBox<Orange> fancyOrangeBox = new FancyBox<>(new Orange());
        FancyBox<Lemon> fancyLemonBox = new FancyBox<>(new Lemon());

        fruitDisplayer.displayGenericFruitName(fancyAppleBox);
        fruitDisplayer.displayGenericFruitName(fancyOrangeBox);
        fruitDisplayer.displayGenericFruitName(fancyLemonBox);

    }

}


