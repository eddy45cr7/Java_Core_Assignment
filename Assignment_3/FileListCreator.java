package Assignment_3;

import java.util.*;
import java.io.File;
import java.io.FileWriter;

class FileListCreator {
    public static List<ArrayList<String>> lister() {
        ArrayList<String> ele = new ArrayList<String>();
        List<ArrayList<String>> lis = new ArrayList<>();
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