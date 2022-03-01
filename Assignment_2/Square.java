package Assignment_2;

public class Square implements Shapes {
    private double side,peri,area;

    public Square(int s){
        side = s;
    }

    public double perimeter(){
        peri = side * 4;
        return peri;
    }

    public double area(){
        area = side * side;
        return area;
    }

    public double volume(){
        throw new ArithmeticException("Volume cannot be calculated for a square!");
    }

    public double surfaceArea(){
        throw new ArithmeticException("Surface Area cannot be calculated for a square!");
    }
}