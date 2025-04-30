package ex_04_increment_decrement;

import java.util.Scanner;

public class Lab006_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        double salary = sc.nextDouble();
        System.out.printf("Name is %s\n", name);
        System.out.printf("Age is %d\n", age);
        System.out.printf("Salary is %.2f", salary);
        sc.close();
    }
}
