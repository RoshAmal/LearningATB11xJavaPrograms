package ex_17_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Lab069_program5 {
    public static void main(String[] args){
        try{
            readFile("/Users/amalrosh/Downloads/archived.txt");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }   
    }
    static void readFile(String fileName) throws IOException{
            FileInputStream file = new FileInputStream(fileName);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            System.out.println("Error reading file");
            sc.close();
    }
}
