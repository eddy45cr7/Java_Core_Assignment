package Assignment_2;

public class Circle implements Shapes{
    private double radius,perimeter,area;

    public Circle(int rad){
        radius = rad;
    }

    public double perimeter(){
        perimeter = radius * Math.PI * 2;
        return perimeter;
    }

    public double area(){
        area = Math.PI * radius * radius;
        return area;
    }

    public double volume(){
        throw new ArithmeticException("Volume cannot be calculated for a Circle.");
    }

    public double surfaceArea(){
        throw new ArithmeticException("Sruface Area cannot be colculated for a Circle.");
    }
}