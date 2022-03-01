import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class SerialisationTest {
    public static void main(String[] args) {
        Student one = new Student("Atharv","27/10/2002","Indore","MP",452018,"India");
        Student two = new Student("Aditya","30/07/2002","Indore","MP",452018,"India");
        Student three = new Student("Akhil","17/08/2002","Indore","MP",452018,"India");
        Student four = new Student("Gautam","07/12/2002","Indore","MP",452018,"India");

        ArrayList<Student> lis = new ArrayList<>();
        lis.add(one);
        lis.add(two);
        lis.add(three);
        lis.add(four);

        try {
            FileOutputStream file = new FileOutputStream("E:\\Java_Core_Assignments\\Assignment_5\\output2.ser");
            ObjectOutputStream ob = new ObjectOutputStream(file);

            for(int i=0;i<4;i++){
                ob.writeObject(lis.get(i));
            }

        }catch(IOException e){
            System.out.println("Error!!");
            e.printStackTrace();
        }
    }
}