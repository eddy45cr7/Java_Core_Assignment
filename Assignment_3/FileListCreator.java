package Assignment_3;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

class FileListCreator {
    public static ArrayList<ArrayList<String>> lister() {
        ArrayList<String> ele = new ArrayList<String>();
        ArrayList<ArrayList<String>> lis = new ArrayList<ArrayList<String>>();
        try{
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt");
            Scanner read = new Scanner(fil);
            int c = Sorter.counter();
            for(int i =0;i<c;i++){
                ele = Selecter.selecter(i);
                lis.add(ele);
            }
        }catch(Exception e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        return lis;
    }
}