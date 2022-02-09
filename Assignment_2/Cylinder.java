package Assignment_2;

public class Cylinder implements Shapes {
    private double radius,height,vol,sur;

    public Cylinder(int r,int h){
        radius = r;
        height = h;
    }

    public double perimeter(){
        throw new ArithmeticException("Perimeter cannot be calculated for a cylinder!");
    }

    public double area(){
        throw new ArithmeticException("Area cannot be calculated for a cylinder!");
    }

    public double volume(){
        vol = Math.PI * radius * radius * height;
        return vol;
    }

    public double surfaceArea(){
        sur = 2 * Math.PI * radius * radius * height;
        return sur;
    }
}