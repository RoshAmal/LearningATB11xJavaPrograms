package ex_04_increment_decrement;

import java.util.Scanner;

public class Lab010_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        String result = "";
        if (x == y && x == z)
            result = "equilateral";
        else if ((x == y) || (x == z) || (y == z))
            result = "isosceles";
        else
            result = "scalene";
        System.out.printf("The sides of the triangle are %d, %d and %d\n", x, y, z);
        System.out.println("It is an " + result + " triangle.");
        sc.close();
    }
}
