package Assignment_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Master {
    public static void countDisplay(){
        int i;
        ArrayList<String> wordlist = Words.wordArray();
        HashMap<String,Integer> wordmap = WordCounter.counted(wordlist);
        System.out.println("Number of appearances : ");
        for(String s : wordlist){
            i = wordmap.get(s);
            System.out.println(s+" : "+i);
        }
    }

    public static void main(String[] args) {
        int ref,res,noofnew;
        String str;
        ArrayList<String> arra = new ArrayList<>();
        while(true){
            try{
                OptDisplay.show();
                ref = OptSel.select();
                if(ref==1){
                    countDisplay();
                }else if(ref==2){
                    System.out.println("\n1) Add to existing");
                    System.out.println("2) Create new file");
                    res = OptSel.select();
                    switch(res){
                        case 1:
                            System.out.print("Enter the word you want to add ; ");
                            str = StringInput.StrInput();
                            Words.wordAdd(str);
                            break;
                        case 2:
                            System.out.print("How many word do you want to add : ");
                            noofnew = OptSel.select();
                            for(int i=0;i<noofnew;i++){
                                System.out.print("Enter a word : ");
                                str = StringInput.StrInput();
                                arra.add(str);
                            }
                            Words.writeNew(arra);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                }else if(ref==3){
                    System.out.println("Here are the currently stored words : ");
                    arra = Words.wordArray();
                    for(String s : arra){
                        System.out.println(s);
                    }
                }else if(ref==4){
                    System.out.println("\n1) Add to existing");
                    System.out.println("2) Create new file");
                    res = OptSel.select();
                    switch(res){
                        case 1:
                            System.out.print("Enter the URL you want to add ; ");
                            str = StringInput.StrInput();
                            Urls.wordAdd(str);
                            break;
                        case 2:
                            System.out.print("How many URLs do you want to add : ");
                            noofnew = OptSel.select();
                            for(int i=0;i<noofnew;i++){
                                System.out.print("Enter a URL : ");
                                str = StringInput.StrInput();
                                arra.add(str);
                            }
                            Urls.writeNew(arra);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                }else if(ref==5){
                    System.out.println("Here are the currently stored URLs : ");
                    arra = Urls.urlReader();
                    for(String s : arra){
                        System.out.println(s);
                    }
                }else if(ref==6){
                    System.out.println("Thanks for using the program!!");
                    System.out.println("Exiting.......");
                    System.exit(0);
                }
            }catch(Exception e){
                System.out.println("An error occured!!");
            }
        }
    }
}