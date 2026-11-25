package lesson7.geometricShapeInheritance;

import java.io.IOException;
import java.util.Scanner;

public class Demo {


    public static float calculateTriangleArea(int base, int height){
        return (base * height)/2;
    }

    public static float calculateRectangleArea(int a, int b){
        return a*b;
    }

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base value: ");
        int base = scanner.nextInt();

        System.out.println("Enter height value: ");
        int height = scanner.nextInt();

        float triangleArea = (base * height)/2;

        System.out.println("Triangle Area : " + triangleArea);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        float rectangleArea = a*b;

        System.out.println("Rectangle Area: "+ rectangleArea);

    }
}
