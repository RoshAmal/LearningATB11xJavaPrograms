package ex_17_Exceptions;

public class Lab067_program3 {
    public static void main(String[] args){
        try {
            int age = Integer.parseInt(args[0]);
            validateAge(age);
        } catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    static void validateAge(int age) throws AgeVerificationException{
        if (age < 18){
            throw new AgeVerificationException("Age must be 18 or older to proceed.");
        }
        System.out.println("Age verified: Access granted.");
    }
}
class AgeVerificationException extends IllegalArgumentException{
    public AgeVerificationException(String errorMessage){
        super(errorMessage);
    }
}