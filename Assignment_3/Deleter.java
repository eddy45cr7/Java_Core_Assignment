package Assignment_3;

import java.util.ArrayList;
import java.util.List;

import static Assignment_3.FileListCreator.lister;

public class Deleter {
    public static List<ArrayList<String>> del(int ind){
        List<ArrayList<String>> lis = FileListCreator.lister();
        ArrayList<String> l = lis.get(ind);
        lis.remove(l);
        lis = Sorter.indexChange(lis);
        return lis;
    }
}