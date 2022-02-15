package Assignment_3;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import Assignment_3.Selecter;

public class InfoDisplay extends Selecter{
    public static void display(){
        ArrayList<String> lis = new ArrayList<String>();
        int ind = 0;
        try{
            File fil = new File("emp_info.txt");
            Scanner read = new Scanner(fil);
            while(read.hasNextLine()){
                System.out.println(selecter(ind));
                ind++;
            }
        }catch(Exception e){
            System.out.println("An error occured!!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        display();
    }
}