package Assignment_3;

public class MainDisplay {
    public static int disel(){
        System.out.println("\nSelect what you want to do : ");
        System.out.println("\n1) Display all info ");
        System.out.println("2) Search  ");
        System.out.println("3) Sort ");
        System.out.println("4) Add ");
        System.out.println("5) Delete");
        System.out.println("6) Exit\n");
        int sel =0;
        try {
            System.out.print("Enter the corresponding number : ");
            sel = proSelect.sel();
        }catch(Exception e){
            System.out.println("Enter something valid!!");
        }
        return sel;
    }
}