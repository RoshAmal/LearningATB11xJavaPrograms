package ex_05_Loops;

import java.util.Scanner;
public class Lab014_Palindrome {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int inLength = input.length();
        char[] output = new char[inLength];
        int offset = inLength-1;
        for (int i=0; i<inLength; i++){
            output[i] = input.charAt(offset);
            offset--;
        }
        System.out.printf("The palindrome of the input %s is ", input);
        System.out.println(output);
        sc.close();
    }
}
