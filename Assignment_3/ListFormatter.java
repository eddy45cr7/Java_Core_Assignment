package Assignment_3;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class ListFormatter {
    public static ArrayList<String> inputListMaker() {
        Scanner scn = new Scanner(System.in);
        String val;
        ArrayList<String> cont = new ArrayList<String>();
        int sno = GiveCount.counter();

        cont.add(String.valueOf(sno));

        System.out.print("Enter name : ");
        val = scn.nextLine();
        cont.add(val);

        System.out.print("Enter email : ");
        val = scn.nextLine();
        cont.add(val);

        System.out.print("Enter age : ");
        val = scn.nextLine();
        cont.add(val);

        System.out.print("Enter DOB : ");
        val = scn.nextLine();
        cont.add(val);

        return cont;
    }
}