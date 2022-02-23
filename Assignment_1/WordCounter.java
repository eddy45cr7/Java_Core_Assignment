package Assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class WordCounter {
    public static int counting(String str) {
        ArrayList<String> arra = Urls.urlReader();
        int count = 0;
        for (String i : arra) {
            try {
                var url = new URL(i);
                var br = new BufferedReader(new InputStreamReader(url.openStream()));
                String line;
                var sb = new StringBuilder();
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                }
                String s = sb.toString();
                String[] st = s.split(">");
                for (String j : st) {
                    if (j.contains("day")) {
                        count++;
                    }
                }
                System.out.println(count);
            } catch (Exception e) {
                System.out.println("error");
            }
        }
        return count;
    }

    public static HashMap<String,Integer> counted(ArrayList<String> worlis){
        HashMap wordcount = Words.wordReader();
        Iterator it = worlis.iterator();
        String s;
        int count=0;
        while(it.hasNext()){
            s = it.next().toString();
            count = counting(s);
            wordcount.replace(s,0,count);
        }
        return wordcount;
    }
}