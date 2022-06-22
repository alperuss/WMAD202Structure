package ca.ciccc.wmad202.assignment4.question5;

import java.util.*;

public class Question5 {
    public void test() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers 3D coordination (X , Y , Z)");

        System.out.println("X1 : ");
        int x1 = input.nextInt();
        System.out.println("Y1 : ");
        int y1 = input.nextInt();
        System.out.println("Z1 : ");
        int z1 = input.nextInt();

        System.out.println("X2 : ");
        int x2 = input.nextInt();
        System.out.println("Y2 : ");
        int y2 = input.nextInt();
        System.out.println("Z2 : ");
        int z2 = input.nextInt();

        HashMap<String,Integer> point1= new HashMap<>();
        HashMap<String,Integer> point2= new HashMap<>();
        ArrayList<Map<String,Integer>> points = new ArrayList<>();
        point1.put("x",x1);
        point1.put("y",y1);
        point1.put("z",z1);

        point2.put("x",x2);
        point2.put("y",y2);
        point2.put("z",z2);
        points.add(point1);
        points.add(point2);

       double result = distancePoint(points);
       System.out.println("Distance of points is "+ result);

    }

    public double distancePoint(ArrayList<Map<String, Integer>> points) {
        int x1= 0; int x2 = 0;
        int y1= 0; int y2 = 0;
        int z1= 0; int z2 = 0;

        for (int i = 0; i< points.size(); i++) {
            if (i == 0) {
                x1 = points.get(i).get("x");
                y1 = points.get(i).get("y");
                z1 = points.get(i).get("z");
            }else if (i == 1){
                x2 = points.get(i).get("x");
                y2 = points.get(i).get("y");
                z2 = points.get(i).get("z");
            }
        }

        double distanceOfPoints = (double) Math.round(Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2) + Math.pow((z1-z2),2)));

        return distanceOfPoints;
    }
}
