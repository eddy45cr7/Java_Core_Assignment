package Assignment_1;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Urls {
    public static ArrayList<String> urlReader(){
        ArrayList<String> arrlis = new ArrayList<>();
        String s;
        try {
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_1\\urls.txt");
            Scanner read = new Scanner(fil);
            while(read.hasNextLine()){
                s = read.nextLine();
                arrlis.add(s);
            }
        }catch(Exception e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        return arrlis;
    }

    public static void wordAdd(String word){
        try{
            FileWriter filwrite = new FileWriter("E:\\Java_Core_Assignments\\Assignment_1\\urls.txt",true);

            filwrite.write("\n"+word);

            filwrite.close();
        }catch(Exception e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    public static void writeNew(ArrayList<String> arrl){
        Iterator it = arrl.iterator();
        String s;
        int ind;
        try{
            FileWriter wri = new FileWriter("E:\\Java_Core_Assignments\\Assignment_1\\urls.txt");
            FileWriter writ = new FileWriter("E:\\Java_Core_Assignments\\Assignment_1\\urls.txt",true);
            while(it.hasNext()){
                s = it.next().toString();
                ind = arrl.indexOf(s);
                if(ind==0){
                    wri.write(s);
                }else{
                    wordAdd(s);
                }
            }
        }catch(Exception e){
            System.out.println("An error occured!");
            e.printStackTrace();
        }
    }
}