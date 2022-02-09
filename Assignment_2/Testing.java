package Assignment_2;
import java.util.*;

public class Testing{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String sel;
        int sh;
        ArrayList<Integer> num = new ArrayList<Integer>();
        char[] charr;

        System.out.print("\nEnter the number corresponding to the shape : ");
        sel = read.nextLine();
        charr = sel.toCharArray();
        int asc = (int)charr[0];
        if(num.contains(asc)){
            sh=num.indexOf(asc)+1;
        }else{
            throw new ArithmeticException("Invalid digit entered.");
        }
        //return sh;
        System.out.println(sh);
    }
}