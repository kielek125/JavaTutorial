package Algorytmy2.Zadanie16;

import java.util.Scanner;

public class Zadanie16 {

    public static void start(int row, int column){

        Matrix first = new Matrix(row, column);

        first.read(new Scanner(System.in));

        System.out.println("Przed: ");
        first.print();

        first.transpose();

        System.out.println("Po");

        first.print();
    }
}
