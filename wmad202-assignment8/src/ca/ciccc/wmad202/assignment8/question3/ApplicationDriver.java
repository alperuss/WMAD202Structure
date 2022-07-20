package ca.ciccc.wmad202.assignment8.question3;

import ca.ciccc.wmad202.assignment8.question3.Shape;

public class ApplicationDriver {
    static class MyGeometry
 {
     public void calculateAreaAndPerimeter(Shape shape) {
         if(!shape.shapes.equals(ShapeType.Custom)) {
             shape.perimeter();
             shape.area();
         }
         else
         {
             shape.perimeter();}}

 }
    enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }

    public static void main(String args[]){
        MyGeometry mg = new  MyGeometry();
        int[] s1Sides = {10,20};   //10 is width and 20 is length
        ShapeType s1Type = ShapeType.Rectangle;
        mg.calculateAreaAndPerimeter(new Shape(s1Type, s1Sides) {

            @Override
            public float perimeter() {
                return (s1Sides[0]+s1Sides[1]) *2;
            }

            @Override
            public float area() {
                return s1Sides[0] * s1Sides[1];
            }
        });




        int[] s2Sides = {10};
        ShapeType s2Type = ShapeType.Square;
        mg.calculateAreaAndPerimeter(new Shape(s2Type, s2Sides) {

            @Override
            public float perimeter() {
                return (s2Sides[0]) *4;
            }

            @Override
            public float area() {
                return s2Sides[0]*s2Sides[0];
            }
        });


        int[] s3Sides = {12};  //12 is the radius
        ShapeType s3Type = ShapeType.Circle;
        mg.calculateAreaAndPerimeter(new Shape(s3Type, s3Sides) {

            @Override
            public float perimeter() {
                return (float) (2 * (s3Sides[0]) *Math.PI);
            }

            @Override
            public float area() {
                return (float) (s3Sides[0] * s3Sides[0] * Math.PI);
            }
        });


        int[] s4Sides = {8, 12, 12};
        ShapeType s4Type = ShapeType.Custom;
        mg.calculateAreaAndPerimeter(new Shape(s4Type, s4Sides) {

            @Override
            public float perimeter() {
                return (float) (s4Sides[0]+s4Sides[1] + s4Sides[2]);
            }

            @Override
            public float area() {
                float height= (float) Math.sqrt(Math.pow(s4Sides[1], 2) - Math.pow(s4Sides[0] / 2f, 2));
                return s4Sides[0] * height / 2;
            }
        });

    }
}
