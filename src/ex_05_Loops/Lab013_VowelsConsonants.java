package ex_05_Loops;

import java.util.Scanner;

public class Lab013_VowelsConsonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int vowels = 0;
        int consonants = 0;
        for (int i=0; i<input.length(); i++){
            if(input.charAt(i) == 'a')
                vowels++;
            else if(input.charAt(i) == 'e')
                vowels++;
            else if(input.charAt(i) == 'i')
                vowels++;
            else if(input.charAt(i) == 'o')
                vowels++;
            else if(input.charAt(i) == 'u')
                vowels++;
            else
                consonants++;
        }
        System.out.printf("The input string %s has %d vowels and %d consonants",
                input, vowels, consonants);
                sc.close();
    }
}
