package Assignment_2;

public class NameDisplay {
    String[] names = {"Square","Rectangle","Triangle","Circle","Cube","Cuboid","Cone","Cylinder","Sphere","Exit"};

    public void display(){    
        System.out.println("Select a Shape : ");
        for(int i=0 ; i<names.length ; i++){
            System.out.println((i+1)+") "+ names[i]);
        }
    }
}