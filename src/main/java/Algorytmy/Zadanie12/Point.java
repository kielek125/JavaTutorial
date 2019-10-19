package Algorytmy.Zadanie12;

public class Point {

    //region Fields
    private double x;
    private double y;
    //endregion

    //region Constructors
    public Point() {
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //endregion

    //region Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //endregion
}
