package Assignment_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Writer {
    static void wri(ArrayList<String> values) {
        Iterator it = values.iterator();
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("csvtrial.txt",true));
            for(int i =0;i<values.size();i++){
                if(i==(values.size()-1)){
                    writer.write(it.next()+"\n");
                }else{
                    writer.write(it.next()+" | ");
                }
            }
            writer.close();
            System.out.println("written succesfuly!!");
        }catch(Exception e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}