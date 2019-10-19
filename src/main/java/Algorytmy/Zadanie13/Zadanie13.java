package Algorytmy.Zadanie13;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Zadanie13 {
    public static double distance(Point point1, Point point2) {
        return sqrt(
                pow((point2.getX() - point1.getX()), 2) +
                pow((point2.getY() - point1.getY()), 2) +
                pow((point2.getZ() - point1.getZ()), 2));
    }

    public static double triangleField(Point point1, Point point2, Point point3) {
        double a = distance(point1, point2);
        double b = distance(point2, point3);
        double c = distance(point1, point3);

        return sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c)) / 4;
    }

    public static double field(Point point1, Point point2, Point point3, Point point4) {
        return triangleField(point1, point2, point3) +
                triangleField(point1, point2, point4) +
                triangleField(point1, point3, point4) +
                triangleField(point2, point3, point4);
    }
}
