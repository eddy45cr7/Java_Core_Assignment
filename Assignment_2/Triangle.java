package Assignment_2;

public class Triangle implements Shapes {
    double height,base,peri,area;

    public Triangle(int h,int b){
        height = h;
        base = b;
    }

    public double perimeter(){
        peri = base * 3;
        return peri;
    }

    public double area(){
        area = 0.5 * base * height;
        return area;
    }

    public double volume(){
        throw new ArithmeticException("Volume cannot be calculated for a triangle.");
    }

    public double surfaceArea(){
        throw new ArithmeticException("Surface Area cannot be calculated for a triangle.");
    }
}