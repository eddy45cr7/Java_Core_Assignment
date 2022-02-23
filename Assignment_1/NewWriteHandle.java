package Assignment_1;

import java.util.ArrayList;
import java.util.Scanner;

public class NewWriteHandle {
    public static ArrayList<String> wordl(){
        ArrayList<String> arra = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter how many words do you wish to add :");
        int n = scn.nextInt();
        String str;
        for(int i=0;i<n;i++){
            System.out.print("Enter a word : ");
            str = scn.nextLine();
            arra.add(str);
        }
        return arra;
    }
}