package Assignment_2;

import java.util.*;

public class ShapeSelect {
    Scanner read = new Scanner(System.in);
    String sel;
    int sh;
    String[] charr;
    public int select(){
        Integer[] c = {48,49,50,51,52,53,54,55,56,57};
        List num = Arrays.asList(c);
        System.out.print("\nEnter the number corresponding to the shape : ");
        sel = read.nextLine();
        charr = sel.split("");
        int asc = Integer.parseInt(charr[0]);
        if(num.contains(asc)){
            sh=num.indexOf(asc)+1;
        }else{
            throw new ArithmeticException("Invalid digit entered.");
        }
        System.out.println(sh);
        return sh;
    }
}