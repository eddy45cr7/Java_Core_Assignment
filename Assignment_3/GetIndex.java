package Assignment_3;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

class GetIndex {
    public static int indexer(ArrayList<String> lis){
        int index;

        String ind = lis.get(0);
        index = Integer.parseInt(ind);

        return index;
    }
}