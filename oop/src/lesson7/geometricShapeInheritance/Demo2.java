package lesson7.geometricShapeInheritance;

public class Demo2 {

    public static void main(String[] args){

        GeometricObject triangle = new Triangle(4, 2);
        GeometricObject rectangle = new Rectangle(2, 6);

        System.out.println("Area of triangle: " + triangle.calculcateArea());
        System.out.println("Area of rectangle: " + rectangle.calculcateArea());


    }
}
