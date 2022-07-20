package ca.ciccc.wmad202.assignment8.question2;

public class ApplicationDriver {
    public enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }

    public static void run() {
        int[] s1Sides = {10, 20};
        Shape s1 = new Shape(ShapeType.Rectangle, s1Sides) {

            @Override
            public float perimeter() {
                return 2 * (s1Sides[0] + s1Sides[1]);
            }

            @Override
            public float area() {
                return s1Sides[0] * s1Sides[1];
            }

        };
        System.out.println("S1's perimeter is: " + s1.perimeter());
        System.out.println("S1's area is: " + s1.area());


        int[] s2Sides = {10};
        Shape s2 = new Shape(ShapeType.Square, s2Sides) {
            @Override
            public float perimeter() {
                return s2Sides[0]*4;
            }

            @Override
            public float area() {
                return s2Sides[0]*s2Sides[0];
            }
        };

        System.out.println("S2's perimeter is: " + s2.perimeter());
        System.out.println("S2s area is: " + s2.area());


        int[] s3Sides = {12};
        Shape s3 = new Shape(ShapeType.Circle, s3Sides) {
            @Override
            public float perimeter() {
                return (float) (2 * s3Sides[0] * Math.PI);
            }

            @Override
            public float area() {
                return (float) (s3Sides[0] * s3Sides[0] * Math.PI);
            }
        };

        System.out.println("S3's perimeter is: " + s3.perimeter());
        System.out.println("S3s area is: " + s3.area());


        int[] s4Sides = {8, 12, 12};
        Shape s4 = new Shape(ShapeType.Triangle, s4Sides) {
            @Override
            public float perimeter() {
                return s4Sides[0] + s4Sides[1] +s4Sides[2];
            }

            @Override
            public float area() {
                float height= (float) Math.sqrt(Math.pow(s4Sides[1], 2) - Math.pow(s4Sides[0] / 2f, 2));
                return s4Sides[0] * height / 2;
            }
        };

        System.out.println("S4's perimeter is: " + s4.perimeter());
        System.out.println("S4s area is: " + s4.area());
    }
}

