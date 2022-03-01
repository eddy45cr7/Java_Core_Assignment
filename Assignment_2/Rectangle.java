package Assignment_2;

public class Rectangle implements Shapes {
    private double length,breadth,peri,area;

    public Rectangle(int len,int bre){
        length = len;
        breadth = bre;
    }

    public double perimeter(){
        peri = 2 * (length + breadth);
        return peri;
    }

    public double area(){
        area = length * breadth;
        return area;
    }
    public double volume(){
        throw new ArithmeticException("Volume cannot be calculated for a rectangle.");
    }

    public double surfaceArea(){
        throw new ArithmeticException("Surface Area cannot be calculated for a rectangle.");
    }
}