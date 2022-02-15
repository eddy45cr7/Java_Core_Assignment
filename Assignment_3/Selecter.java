package Assignment_3;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Selecter {
    public static ArrayList<String> selecter(int i){
        ArrayList<String> info = new ArrayList<String>();
        try{
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt");
            Scanner read = new Scanner(fil);
            
            while(read.hasNextLine()){
                String line = read.nextLine();
                String[] arr = line.split(" | ");
                String conv = arr[0];
                if(Integer.parseInt(conv)==i){
                    for(String s: arr){
                        info.add(s);
                    }
                }
            }
            while(info.contains("|")){
                info.remove("|");
            }
            
            read.close();
        }catch(Exception e){
            System.out.println("an error occured!");
            e.printStackTrace();
        }
        return info;
    }
}