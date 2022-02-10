import Assignment_2.*;
import java.util.Scanner;

class ShapeName{
    String[] shapes;
    ShapeName(){

    }
}

public class Assignment_2{
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        NameDisplay nd = new NameDisplay();
        ShapeSelect ss = new ShapeSelect();
        int shape = 10;

        while(true){

            nd.display();
            try{
                shape = ss.select();
            }catch(ArithmeticException e){
                System.out.println("\nPlease Enter a valid value.");
            }
            switch(shape){
                case 1:
                    System.out.print("Enter side of the Square : ");
                    int s = read.nextInt();
                    Square sq = new Square(s);
                    System.out.println("\nPerimeter of the square with side " + s + " is " + sq.perimeter());
                    System.out.println("Area of the square with side " + s + " is " + sq.area() + "\n");
                    break;

                case 2:
                    System.out.print("Enter length of the Rectangle : ");
                    int l = read.nextInt();
                    System.out.print("Enter breadth of the Rectangle : ");
                    int b = read.nextInt();
                    Rectangle rec = new Rectangle(l,b);
                    System.out.println("\nPerimeter of the rectangle with length " + l + " and breadth " + b + " is " + rec.perimeter());
                    System.out.println("Area of the rectangle with length " + l + " and breadth " + b + " is " + rec.area() + "\n");
                    break;

                case 3:
                    System.out.print("Enter base of the Triangle : ");
                    int ba = read.nextInt();
                    System.out.print("Enter height of the Triangle : ");
                    int hi = read.nextInt();
                    Triangle tri = new Triangle(hi,ba);
                    System.out.println("\nPerimeter of the triangle with base " + ba + " and height " + hi + " is " + tri.perimeter());
                    System.out.println("Area of the triangle with base " + ba + " and height " + hi + " is " + tri.area() + "\n");
                    break;

                case 4:
                    System.out.print("Enter Raduis of the circle : ");
                    int r = read.nextInt();
                    Circle cir = new Circle(r);
                    System.out.println("\nPerimeter of the circle with radius "+ r + " is : " + cir.perimeter());
                    System.out.println("Area of the circle with radius "+ r + " is : " + cir.area() + "\n");
                    break;

                case 5:
                    System.out.print("Enter side of the cube : ");
                    int si = read.nextInt();
                    Cube cub = new Cube(si);
                    System.out.println("\nVolume of the cube with side "+ si + " is : " + cub.volume());
                    System.out.println("Surface Area of the cube with side "+ si + " is : " + cub.surfaceArea() + "\n");
                    break;

                case 6:
                    System.out.print("Enter Length of the cuboid : ");
                    int len = read.nextInt();
                    System.out.print("Enter Breadth of the cuboid : ");
                    int bre = read.nextInt();
                    System.out.print("Enter Height of the cuboid : ");
                    int hei = read.nextInt();
                    Cuboid cu = new Cuboid(len,bre,hei);
                    System.out.println("\nVolume of the cuboid with length " + len + ", breadth " + bre + " and height " + hei + " is : " + cu.volume());
                    System.out.println("Surface Area of the cuboid with length " + len + ", breadth " + bre + " and height " + hei + " is : " + cu.surfaceArea() + "\n");
                    break;

                case 7:
                    System.out.print("Enter Raduis of the cone : ");
                    int ra = read.nextInt();
                    System.out.print("Enter Height of the cone : ");
                    int h = read.nextInt();
                    Cone co = new Cone(ra,h);
                    System.out.println("\nVolume of the cone with radius "+ ra + " and height " + h + " is : " + co.volume());
                    System.out.println("Surface Area of the cone with radius "+ ra + " and height " + h + " is : " + co.surfaceArea() + "\n");
                    break;

                case 8:
                    System.out.print("Enter Raduis of the cylinder : ");
                    int rad = read.nextInt();
                    System.out.print("Enter Height of the cylinder : ");
                    int hig = read.nextInt();
                    Cylinder cyl = new Cylinder(rad,hig);
                    System.out.println("\nVolume of the cylinder with radius "+ rad + " and height " + hig + " is : " + cyl.volume());
                    System.out.println("Surface Area of the cylinder with radius "+ rad + " and height " + hig + " is : " + cyl.surfaceArea() + "\n");
                    break;

                case 9:
                    System.out.print("Enter Radius of the Sphere : ");
                    int radi = read.nextInt();
                    Sphere sph = new Sphere(radi);
                    System.out.println("\nVolume of sphere with radius " + radi + " is " + sph.volume());
                    System.out.println("Surface Area of sphere with radius " + radi + " is " + sph.surfaceArea() + "\n");
                    break;

                case 10:
                    System.out.println("\nAre you sure you want to exit??");
                    System.out.println("1) Yes\n2) No");
                    System.out.print("\nEnter the corresponding number : ");
                    int conf = read.nextInt();
                    if(conf==1){
                        System.out.println("\nThank you for using the program!\n");
                        read.close();
                        System.exit(0);
                    }else{
                        break;
                    }
            }
        }
    }
}