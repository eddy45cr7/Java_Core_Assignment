package Assignment_3;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class InfoDisplay extends Selecter{
    public static void display(){
        ArrayList<String> lis = new ArrayList<String>();
        int ind = 0;
        try{
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt");
            Scanner read = new Scanner(fil);
            System.out.println("\nHere are the currently stored records : ");
            for(int i =0;i<GiveCount.counter();i++){
                lis = selecter(i);
                System.out.println(lis);
            }
        }catch(Exception e){
            System.out.println("An error occured!!");
            e.printStackTrace();
        }
    }
}