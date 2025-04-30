package ex_04_increment_decrement;

import java.util.Scanner;

public class Lab009_EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        String result = no%2==0 ? "Even" : "Odd";
        System.out.printf("%d is %s", no, result);
        sc.close();
    }
}
