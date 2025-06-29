package ex_16_WrapperClass;

import java.util.Scanner;

public class Lab063_program2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        try {
            // String to primitive
            int in = Integer.parseInt(input);
            System.out.println(in*in);
        } catch(NumberFormatException e){
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally{
            sc.close();
        }
    }
}
