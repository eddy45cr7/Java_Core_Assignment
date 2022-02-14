package Assignment_3;

import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Sorter {
    public void sorter(){
        ArrayList<String> info1 = new ArrayList<String>();
        ArrayList<String> info2 = new ArrayList<String>();
        try{
            FileWriter fw = new FileWriter("emp_info.txt");

        }catch(Exception e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}