package ca.ciccc.wmad202.assignment8.question3;

import ca.ciccc.wmad202.assignment8.question3.ApplicationDriver;

public abstract class Shape {
    public ApplicationDriver.ShapeType shapes;
    int[] sides;

    public Shape(ApplicationDriver.ShapeType shapes, int[] sides) {
        this.shapes = shapes;
        this.sides = sides;

    }

    public abstract float perimeter();

    public abstract float area();


}
