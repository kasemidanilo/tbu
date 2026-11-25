package lesson7.geometricShapeInheritance;

public class Rectangle implements GeometricObject{
    private int a;
    private int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public float calculcateArea() {
        return a*b;
    }
}
