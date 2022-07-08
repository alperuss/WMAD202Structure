package ca.ciccc.wmad202.lecture.inheritance;

public class Shape {

    protected String color;
    protected int height;

    public Shape(String color, int height) {
        this.color = color;
        this.height = height;
    }

    public double getVolume() {
        return 0;
    }

    public String getColor() {
        return this.color;
    }

    public int getHeight() {
        return this.height;
    }


}
