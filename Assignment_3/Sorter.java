package Assignment_3;

import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Sorter extends Selecter {
    public static int counter(){
        int count =0;
        try{
            File fil = new File("emp_info.txt");
            Scanner scn = new Scanner(fil);
            while(scn.hasNextLine()){
                String str = scn.nextLine();
                System.out.println(str);
                count++;
            }
            scn.close();
        }catch(Exception e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        return count;
    }
    public static void sorterasc(int ind){
        ArrayList<String> info1 = new ArrayList<String>();
        ArrayList<String> info2 = new ArrayList<String>();
        ArrayList<String> sorted = new ArrayList<String>();
        int count = counter(),infoselect = 0;
        try{
            FileWriter fw = new FileWriter("emp_infob.txt");
            File fil = new File("emp_info.txt");
            Scanner read = new Scanner(fil);
            while(read.hasNextLine()){
                info1 = selecter(infoselect);
                infoselect++;
                System.out.println(info1);
            }
        }catch(Exception e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}