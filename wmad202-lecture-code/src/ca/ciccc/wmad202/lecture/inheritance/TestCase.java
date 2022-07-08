package ca.ciccc.wmad202.lecture.inheritance;

import java.util.ArrayList;

public class TestCase {

    public static void runAllTestScenario() {

        Cube cube1 = new Cube(Colors.GRAY, 12);

        Cuboid cuboid1 = new Cuboid(Colors.GREEN, 3, 10, 4);
        Cuboid cuboid2 = new Cuboid(Colors.YELLOW, 2, 13, 5);

        Cylindrical cylindrical1 = new Cylindrical(Colors.YELLOW, 10, 5);
        Cylindrical cylindrical2 = new Cylindrical(Colors.GREEN, 7, 2);
        Cylindrical cylindrical3 = new Cylindrical(Colors.GRAY, 6, 2);

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(cube1);

        shapes.add(cuboid1);
        shapes.add(cuboid2);

        shapes.add(cylindrical1);
        shapes.add(cylindrical2);
        shapes.add(cylindrical3);

        Table table = new Table(shapes);

        double totalVolume = table.getTotalVolume();
        double totalVolumeForCuboid = table.getTotalVolumeOfCuboids();
        double totalVolumeForYellowItem = table.getTotalVolumeOfYellowItems();

        System.out.println("The total volume for all items is: " + totalVolume);
        System.out.println("The total volume for all cuboids is: " + totalVolumeForCuboid);
        System.out.println("The total volume for all yellow items is: " + totalVolumeForYellowItem);


    }
}
