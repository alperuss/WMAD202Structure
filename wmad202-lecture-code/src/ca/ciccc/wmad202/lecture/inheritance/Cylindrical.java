package ca.ciccc.wmad202.lecture.inheritance;

public class Cylindrical extends Shape {

//    public final static double PI = 3.14;

    private int radius;


    public Cylindrical(String color, int height, int radius) {
        super(color, height);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return radius*radius*Math.PI*height;
    }
}
