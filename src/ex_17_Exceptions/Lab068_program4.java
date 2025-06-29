package ex_17_Exceptions;

public class Lab068_program4 {
    public static void main(String[] args){
        try{
            int input = Integer.parseInt(args[0]);
            String a = args[1];
            int i = Integer.parseInt(a);
            int b = input/0;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error due to invalid array index, " + e.getMessage());
        } catch(NumberFormatException e1){
            System.out.println("Error due to String input, " + e1.getMessage());
        } catch(ArithmeticException e2){
            System.out.println("Error due to divide by zero, " + e2.getMessage());
        }
        finally{
            System.out.println("End of program");
        }
    }
}
