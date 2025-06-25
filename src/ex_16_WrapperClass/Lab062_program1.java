package ex_16_WrapperClass;

import java.util.Scanner;

public class Lab062_program1 {
    public static void main(String[] args){
        int small = 3;
        // auto-boxing
        Integer big = small;
        // unboxing
        int small2 = big.intValue();
        System.out.println(small2);


        double value = 3.14159;
        // auto-boxing
        Double boxedValue = value;
        // wrapper to String
        String strDouble = boxedValue.toString();
        System.out.println(strDouble.length());

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // String to primitive
        int in = Integer.parseInt(input);
        System.out.println(in*in);
        sc.close();

        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        System.out.println(a==b);
        System.out.println(c==d);

        int strSum = 0;
        String strInput = args[0];
        for (int i=0; i < strInput.length(); i++){
            char charA = strInput.charAt(i);
            strSum += Character.getNumericValue(charA);
        }
        System.out.println(strSum);

    }
    
}
