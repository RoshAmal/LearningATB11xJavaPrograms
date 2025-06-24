package ex_16_WrapperClass;

import java.util.Scanner;

public class Lab062_program1 {
    public static void main(String[] args){
        int small = 3;
        Integer big = small;
        int small2 = big.intValue();
        System.out.println(small2);


        double value = 3.14159;
        Double boxedValue = value;
        String strDouble = boxedValue.toString();
        System.out.println(strDouble.length());

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Integer in = Integer.parseInt(input);
        System.out.println(in*in);
        sc.close();

        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        System.out.println(a==b);
        System.out.println(c==d);

    }
    
}
