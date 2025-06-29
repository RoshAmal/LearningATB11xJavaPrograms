package ex_17_Exceptions;

public class Lab066_program2 {
    public static void main(String[] args){
        try{
            int a = 2;
            int b = 0;
            int c = a/b;
            int d = a%b;
            System.out.println("Quotient: " + String.valueOf(c));
            System.out.println("Remainder: " + String.valueOf(d));
        } catch(ArithmeticException e){
            System.out.println("Divide by zero is not allowed, the error reads: " + e.getMessage());
        }
        
    }
    
}
