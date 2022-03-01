package Assignment_2;

public class Cuboid implements Shapes {
    double length,breadth,height,vol,sur;

    public Cuboid(int l,int b,int h){
        length = l;
        breadth = b;
        height = h;
    }

    public double perimeter(){
        throw new ArithmeticException("Perimeter cannot be calculated for a cuboid!");
    }

    public double area(){
        throw new ArithmeticException("area cannot be calculated for a cuboid!");
    }

    public double volume(){
        vol = length * breadth * height;
        return vol;
    }

    public double surfaceArea(){
        sur = 2 * ((length * breadth ) + (breadth * height) + (length * height));
        return sur;
    }
}