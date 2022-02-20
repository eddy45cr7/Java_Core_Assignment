package Assignment_3;

import java.util.ArrayList;
import java.util.List;

class Searcher {
    public static int search(String s,int cind){
        int index = -1;
        ArrayList<String> inf = new ArrayList<String>();
        List<ArrayList<String>> filelist = new ArrayList<>();
        filelist = FileListCreator.lister();
        int count = GiveCount.counter();
        for(int i=0;i<count;i++){
            inf = filelist.get(i);
            if(inf.contains(s)){
                index = i;
            }
        }

        return index;
    }
}