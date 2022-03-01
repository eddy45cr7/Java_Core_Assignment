package Assignment_2;

public class Sphere implements Shapes {
    double radius,vol,sur;

    public Sphere(int r){
        radius = r;
    }

    public double perimeter(){
        throw new ArithmeticException("Perimeter cannot be calculated for a Sphere!");
    }

    public double area(){
        throw new ArithmeticException("Area cannot be calculated for a Sphere!");
    }

    public double volume(){
        vol = (4/3) * Math.PI * radius * radius * radius;
        return vol;
    }

    public double surfaceArea(){
        sur = 4 * Math.PI * radius * radius;
        return sur;
    }
}