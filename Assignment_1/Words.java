package Assignment_1;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Words {
    public static ArrayList<String> wordArray(){
        ArrayList<String> arrlis = new ArrayList<>();
        String s,se;
        try {
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_1\\words.txt");
            Scanner read = new Scanner(fil);
            while(read.hasNextLine()){
                se = read.nextLine();
                s = se.toUpperCase();
                arrlis.add(s);
            }
        }catch(Exception e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        return arrlis;
    }

    public static HashMap<String,Integer> wordReader(){
        HashMap<String,Integer> arrlis = new HashMap<>();
        String s,se;
        try {
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_1\\words.txt");
            Scanner read = new Scanner(fil);
            while(read.hasNextLine()){
                se = read.nextLine();
                s = se.toUpperCase();
                arrlis.put(s,0);
            }
        }catch(Exception e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        return arrlis;
    }

    public static void wordAdd(String word){
        try{
            FileWriter filwrite = new FileWriter("E:\\Java_Core_Assignments\\Assignment_1\\words.txt",true);

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
            FileWriter wri = new FileWriter("E:\\Java_Core_Assignments\\Assignment_1\\words.txt");
            FileWriter writ = new FileWriter("E:\\Java_Core_Assignments\\Assignment_1\\words.txt",true);
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