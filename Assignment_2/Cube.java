package Assignment_2;

public class Cube implements Shapes {
    double side,vol,sur;

    public Cube(int r){
        side = r;
    }

    public double perimeter(){
        throw new ArithmeticException("Perimeter cannot be calculated for a cube!");
    }

    public double area(){
        throw new ArithmeticException("area cannot be calculated for a cube!");
    }

    public double volume(){
        vol = side * side * side;
        return vol;
    }

    public double surfaceArea(){
        sur = 6 * side * side;
        return sur;
    }
}