package Assignment_3;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class InfoDisplay extends Selecter{
    public static void display(){
        ArrayList<String> lis = new ArrayList<>();
        try{
            System.out.println("\nHere are the currently stored records : ");
            for(int i =0;i<GiveCount.counter();i++){
                lis = selecter(i);
                System.out.println(lis);
            }
        }catch(Exception e){
            System.out.println("An error occured!!");
            e.printStackTrace();
        }
    }
}