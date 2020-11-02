package demo;

public class Demo {
    private double x, y;

    public Demo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Demo [x=" + x + ", y=" + y + "]";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
