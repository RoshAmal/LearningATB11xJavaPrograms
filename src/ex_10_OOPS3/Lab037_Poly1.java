package ex_10_OOPS3;

public class Lab037_Poly1 {
    public static void main(String[] args){
        poly p = new poly();
        p.printInput(12);
        p.printInput("Amal");
        p.printInput(3.14);
    }
}
class poly{
    void printInput(int input){
        System.out.printf("Input is %d\n", input);
    }
    void printInput(String input){
        System.out.printf("Input is %s\n", input);
    }
    void printInput(float input){
        System.out.printf("Input is %f\n", input);
    }
    void printInput(double input){
        System.out.printf("Input is %.2f\n", input);
    }
}