package lesson7.geometricShapeInheritance;

public class Triangle implements GeometricObject{

    private int base;
    private int height;

    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public float calculcateArea() {
        return (base*height)/2;
    }
}
