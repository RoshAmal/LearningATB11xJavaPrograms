package ex_05_Loops;

public class Lab011_fibonacci {
    public static void main(String[] args){
        int number = Integer.parseInt(args[0]);
        int a = 0;
        int b = 1;
        int fib = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i=0; i<number; i++) {
            fib = a + b;
            System.out.println(fib);
            a = b;
            b = fib;
        }
    }
}
