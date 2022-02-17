package Assignment_3;

import java.io.FileWriter;
import java.util.*;
import java.io.File;

public class Sorter extends Selecter {
    public static int counter() {
        int count = 0;

        try {
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt");
            Scanner scn = new Scanner(fil);

            while (scn.hasNextLine()) {
                String str = scn.nextLine();
                System.out.println(str);
                count++;
            }

            scn.close();

        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        return count;
    }

    public static List<ArrayList<String>> sorterAsc(int ind) {
        ArrayList<String> info = new ArrayList<String>();
        ArrayList<String> elem = new ArrayList<String>();
        ArrayList<String> sorted = new ArrayList<String>();
        List<ArrayList<String>> filelist = new ArrayList<>();
        int count = counter(), infoselect = 0;

        try {
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt");
            Scanner read = new Scanner(fil);
            filelist = FileListCreator.lister();
            for (int i = 0; i < count; i++) {
                info = filelist.get(i);
                elem.add(info.get(ind));
            }

            Collections.sort(elem);
            System.out.println(elem);
            ArrayList<String> sorte = new ArrayList<String>();
            Iterator itlist = filelist.iterator();
            int it =0;
            for(int i=0;i<count;i++) {
                String s = elem.get(it);
                for(int j=0;j<count;j++){
                    sorted = filelist.get(j);
                    if (sorted.contains(s)) {
                        int z = elem.indexOf(s);
                        sorte = filelist.get(z);
                        int y = filelist.indexOf(sorted);
                        System.out.println(y);
                        filelist.add(z, sorted);
                        filelist.add(y, sorte);
                    }
                }
                it++;
            }
            read.close();

        } catch (Exception e) {
            System.out.println("an error occured");
            e.printStackTrace();
        }

        return filelist;

    }
}