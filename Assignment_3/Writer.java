package Assignment_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Writer {
    public static void append(ArrayList<String> values) {
        Iterator<String> it = values.iterator();
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt",true));
            for(int i =0;i<values.size();i++){
                if(i==(values.size()-1)){
                    writer.write(it.next()+"\n");
                }else{
                    writer.write(it.next()+" | ");
                }
            }
            writer.close();
        }catch(Exception e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

    public static void wri(ArrayList<String> values) {
        Iterator<String> it = values.iterator();
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt",false));
            for(int i =0;i<values.size();i++){
                if(i==(values.size()-1)){
                    writer.write(it.next()+"\n");
                }else{
                    writer.write(it.next()+" | ");
                }
            }
            writer.close();
        }catch(Exception e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}