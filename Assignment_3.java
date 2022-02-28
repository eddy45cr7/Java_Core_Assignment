import Assignment_3.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Assignment_3{
    static void addToFile(){
        ArrayList<String> values = new ArrayList<>();
        values = ListFormatter.inputListMaker();
        Writer.append(values);
    }

    static void sortAsc(int ind){
        List<ArrayList<String>> sortedList = Sorter.sortAsc(ind);
        int count = GiveCount.counter();
        for(int i=0;i<count;i++){
            ArrayList<String> lis = sortedList.get(i);
            if(i==0){
                Writer.wri(lis);
            }else{
                Writer.append(lis);
            }
        }
    }

    static void sortDsc(int ind){
        List<ArrayList<String>> sortedList = Sorter.sortAsc(ind);
        int count = GiveCount.counter();
        for(int i=0;i<count;i++){
            ArrayList<String> lis = sortedList.get(i);
            if(i==0){
                Writer.wri(lis);
            }else{
                Writer.append(lis);
            }
        }
    }

    static void deleter(int ind){
        List<ArrayList<String>> sortedList = Deleter.del(ind);
        int count = sortedList.size();
        for(int i=0;i<count;i++){
            ArrayList<String> lis = sortedList.get(i);
            if(i==0){
                Writer.wri(lis);
            }else{
                Writer.append(lis);
            }
        }
    }

    static void search(String str){
        int i = Searcher.search(str);
        SingleInfoDisplay.show(i);
    }

    public static void main(String[] args) {
        int sel,par,ind,so;
        String str,sor;
        Scanner scn = new Scanner(System.in);
        while(true){
            try {
                sel = MainDisplay.disel();
                if(sel==1){
                    InfoDisplay.display();
                }else if(sel==2){
                    System.out.println("Please enter everything exact!!");
                    System.out.println("Enter anything to search by : ");
                    str = scn.nextLine();
                    search(str);
                }else if(sel==3){
                    System.out.println("\nEnter the order : ");
                    System.out.println("1) Ascending");
                    System.out.println("2) Descending");
                    System.out.print("Enter the corresponding number : ");
                    sor = scn.nextLine();
                    so = Integer.parseInt(sor);
                    switch(so){
                        case 1:
                            System.out.println("Enter the index of the parameter : ");
                            par = proSelect.sel();
                            sortAsc(par);
                            break;
                        case 2:
                            System.out.println("Enter the index of the parameter : ");
                            par = proSelect.sel();
                            sortDsc(par);
                            break;
                        default:
                            System.out.println("\nEnter something valid!!");
                    }
                }else if(sel==4){
                    addToFile();
                }else if(sel==5){
                    System.out.print("Enter index of the data you want to delete : ");
                    ind = proSelect.sel();
                    deleter(ind);
                }else if(sel==6){
                    System.out.println("\nThanks for using the program!!");
                    System.out.println("Hope to see you again!!");
                    System.out.println("Exiting........");
                    scn.close();
                    System.exit(0);
                }else{
                    System.out.println("Please enter something valid!!");
                }
            }catch(Exception e){
                System.out.println("\nAn error Occured!!");
            }
        }
    }
}