package Assignment_3;

import java.util.ArrayList;

public class SingleInfoDisplay {
    public static void show(int index){
        ArrayList<String> info = Selecter.selecter(index);
        System.out.println("Name : "+ info.get(1));
        System.out.println("E-Mail : "+ info.get(2));
        System.out.println("Age : "+ info.get(3));
        System.out.println("DOB : "+ info.get(4));
    }
}