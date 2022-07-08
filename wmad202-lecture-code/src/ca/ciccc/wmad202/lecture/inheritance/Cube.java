package ca.ciccc.wmad202.lecture.inheritance;

public class Cube extends Shape {

    public Cube(String color, int height) {
        // Shape(color, height)
        super(color, height);
    }


    @Override
    public double getVolume() {
        return height*height*height;
    }
}
