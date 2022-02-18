package Assignment_3;

import java.util.*;

class FileListCreator {
    public static List<ArrayList<String>> lister() {
        ArrayList<String> ele = new ArrayList<>();
        List<ArrayList<String>> lis = new ArrayList<>();
        try{
            int c = GiveCount.counter();
            for(int i =0;i<c;i++){
                ele = Selecter.selecter(i);
                lis.add(ele);
            }
        }catch(Exception e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        return lis;
    }
}