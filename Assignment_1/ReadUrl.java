package Assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadUrl {
    public static List<String> reader(){
        List<String> star = new ArrayList<>();
        try {
            var url = new URL("http://webcode.me");
            var br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;

            var sb = new StringBuilder();

            while ((line = br.readLine()) != null) {

                sb.append(line);
                sb.append(System.lineSeparator());
            }
            String s=sb.toString();
            String[] str = s.split(">");
            star = Arrays.stream(str).toList();
        }catch(Exception e){
            System.out.println("error");
        }
        return star;
    }
}