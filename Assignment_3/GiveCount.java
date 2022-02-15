package Assignment_3;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class GiveCount {
    public static int counter() {
        int count = 0,ind = 0;
        ArrayList<String> lis = new ArrayList<String>();
        try {
            File fil = new File("E:\\Java_Core_Assignments\\Assignment_3\\emp_info.txt");
            Scanner read = new Scanner(fil);
            while(read.hasNextLine()){
                lis = Selecter.selecter(ind);
                if(lis.isEmpty()) {
                    break;
                }else{
                    count++;
                    ind++;
                }
            }
        } catch (Exception e) {
            System.out.println("An error occured!!");
            e.printStackTrace();
        }
        return count++;
    }
}