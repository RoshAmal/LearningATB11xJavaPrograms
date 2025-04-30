package ex_04_increment_decrement;

import java.util.Scanner;

public class Lab007_input2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a > b ? a : b;
        System.out.printf("Maximum among %d and %d is %d", a, b, result);
        sc.close();
    }
}
