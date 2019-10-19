package Algorytmy.Zadanie12;

import static java.lang.Math.*;

public class Zadanie12 {
    public static double distance(Point point1, Point point2){
        return sqrt(
                pow((point2.getX() - point1.getX()), 2) +
                pow((point2.getY() - point1.getY()), 2)
        );
    }
    public static double field(Point point1, Point point2, Point point3){
        double a = distance(point1, point2);
        double b = distance(point1, point3);
        double c = distance(point2, point3);

        return sqrt((a + b+ c)*(a + b - c)*(a - b + c)*(-a + b + c))/4;
    }
}

