package Assignment_3;

import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Sorter extends Selecter {
    public static int counter(){
        int count =0;
        try{
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt");
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

    public static String stringCompAsc(String str,String s){
        int iter=0,c1 = 0,c2=0;
        if(str.length()>s.length()){
            iter = s.length();
        }else{
            iter = str.length();
        }
        char[] aar = str.toCharArray(),bar = s.toCharArray();
        String ret="";
        for(int i=0;i<iter;i++){
            if(aar[i]==bar[i]){
                continue;
            } else if (aar[i] > bar[i]){
                ret = s;
                break;
            } else {
                ret = str;
                break;
            }
        }
        return ret;
    }

    public static ArrayList<String> elemsorterasc(ArrayList<String> elems){
        int siz = elems.size();
        ArrayList<String> sortl = new ArrayList<String>();
        for(int i=0;i<siz-1;i++){
            String ele1 = elems.get(i);

        }
        return elems;
    }

    public static void sorterasc(int ind){
        ArrayList<String> info = new ArrayList<String>();
        ArrayList<String> elem = new ArrayList<String>();
        ArrayList<String> sorted = new ArrayList<String>();
        ArrayList<ArrayList<String>> filelist = new ArrayList<ArrayList<String>>();
        int count = counter(),infoselect = 0;
        try{
            FileWriter fw = new FileWriter("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt");
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt");
            Scanner read = new Scanner(fil);
            filelist = FileListCreator.lister();
            for(int i=0;i<count;i++){
                info = filelist.get(i);
                elem.add(info.get(ind));
            }

        }catch(Exception e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}