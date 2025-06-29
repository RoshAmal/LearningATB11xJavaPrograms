package ex_17_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab065_program1 {
    public static void main(String[] args){
        try{
            File fileObj = new File("/Users/amalrosh/Downloads/archived.txt");
            Scanner scannerObj = new Scanner(fileObj);
            String fileContent = "";
            while (scannerObj.hasNextLine()){
                fileContent = scannerObj.nextLine();
                System.out.println(fileContent);
                
            }
            scannerObj.close();
        } catch(FileNotFoundException e){
            System.out.println("Unexpected error occured: " + e.getMessage());
        }
        
    }
}
