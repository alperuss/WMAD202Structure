package ca.ciccc.wmad202.lecture.inheritance;

import java.util.ArrayList;

public class Table {

    private ArrayList<Shape> shapes;


    public Table(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public double getTotalVolume() {
        double total = 0;

        for(Shape shape: this.shapes) {
            total = total + shape.getVolume();
        }

        return total;
    }

    public double getTotalVolumeOfCuboids() {
        double total = 0;

        for(Shape shape: this.shapes) {
            if (shape instanceof Cuboid) {
                total = total + shape.getVolume();
            }
        }

        return total;
    }

    public double getTotalVolumeOfYellowItems() {
        double total = 0;

        for (Shape shape: this.shapes) {
            if ( shape.getColor().equals(Colors.YELLOW)) {
                total = total + shape.getVolume();
            }
        }

        return total;
    }


}
