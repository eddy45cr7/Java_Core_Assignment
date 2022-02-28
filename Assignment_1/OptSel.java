package Assignment_1;

import java.util.Scanner;

public class OptSel{
    public static int select(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the corresponding number : ");
        String i = scn.nextLine();
        int j = Integer.parseInt(i);
        return j;
    }
}