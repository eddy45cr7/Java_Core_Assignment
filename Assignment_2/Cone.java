package Assignment_2;

public class Cone implements Shapes {
    double radius,height,vol,sur;

    public Cone(int r,int h){
        radius = r;
        height = h;
    }

    public double perimeter(){
        throw new ArithmeticException("Perimeter cannot be calculated for a cone!");
    }

    public double area(){
        throw new ArithmeticException("area cannot be calculated for a cone!");
    }

    public double volume(){
        vol = Math.PI * radius * (height/3);
        return vol;
    }

    public double surfaceArea(){
        sur = Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
        return sur;
    }
}