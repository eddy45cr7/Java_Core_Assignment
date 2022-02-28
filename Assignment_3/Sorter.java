package Assignment_3;

import java.util.*;
import java.io.File;

public class Sorter extends Selecter {

    public static List<ArrayList<String>> indexChange(List<ArrayList<String>> filist){
        ArrayList<String> lis = new ArrayList<String>();
        int count = filist.size();
        for(int i=0;i<count;i++){
            lis = filist.get(i);
            String s = Integer.toString(i);
            lis.remove(0);
            lis.add(0,s);
        }
        return filist;
    }

    public static List<ArrayList<String>> sortAsc(int ind) {
        ArrayList<String> info = new ArrayList<>();
        ArrayList<String> elem = new ArrayList<>();
        List<ArrayList<String>> filelist = new ArrayList<>();
        List<ArrayList<String>> sorted = new ArrayList<>();
        int count = GiveCount.counter();

        try {
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt");
            Scanner read = new Scanner(fil);
            filelist = FileListCreator.lister();

            for (int i = 0; i < count; i++) {
                info = filelist.get(i);
                elem.add(info.get(ind));
            }

            Collections.sort(elem);
            ArrayList<String> sorte = new ArrayList<>();

            for(String s : elem) {
                for(int i=0;i<count;i++){
                    sorte = filelist.get(i);
                    if(sorte.contains(s)){
                        sorted.add(sorte);
                    }
                }
            }
            read.close();

        } catch (Exception e) {
            System.out.println("an error occured");
            e.printStackTrace();
        }
        sorted = indexChange(sorted);
        return sorted;
    }

    public static List<ArrayList<String>> sortDsc(int ind) {
        ArrayList<String> info = new ArrayList<>();
        ArrayList<String> elem = new ArrayList<>();
        List<ArrayList<String>> filelist = new ArrayList<>();
        List<ArrayList<String>> sorted = new ArrayList<>();
        int count = GiveCount.counter();

        try {
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt");
            Scanner read = new Scanner(fil);
            filelist = FileListCreator.lister();

            for (int i = 0; i < count; i++) {
                info = filelist.get(i);
                elem.add(info.get(ind));
            }

            Collections.sort(elem);
            Collections.reverse(elem);
            ArrayList<String> sorte = new ArrayList<>();

            for(String s : elem) {
                for(int i=0;i<count;i++){
                    sorte = filelist.get(i);
                    if(sorte.contains(s)){
                        sorted.add(sorte);
                    }
                }
            }
            read.close();

        } catch (Exception e) {
            System.out.println("an error occured");
            e.printStackTrace();
        }
        sorted = indexChange(sorted);
        return sorted;
    }
}