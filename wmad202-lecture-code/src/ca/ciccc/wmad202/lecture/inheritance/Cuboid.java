package ca.ciccc.wmad202.lecture.inheritance;

public class Cuboid extends Shape {

    private int width;
    private int length;

    public Cuboid(String color, int height, int width, int length) {
        super(color, height);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getVolume() {
        return height*width*length;
    }
}
