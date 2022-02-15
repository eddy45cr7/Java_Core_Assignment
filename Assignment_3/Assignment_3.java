package Assignment_3;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

class Assignment_3{
    static void addToFile(){
        ArrayList<String> values = new ArrayList<String>();
        values = ListFormatter.inputListMaker();
        Writer.wri(values);
    }

    public static void main(String[] args) {
        addToFile();
        InfoDisplay.display();
    }
}