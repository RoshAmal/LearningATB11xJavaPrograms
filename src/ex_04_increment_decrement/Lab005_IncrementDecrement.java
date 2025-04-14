package ex_04_increment_decrement;

public class Lab005_IncrementDecrement {
    public static void main(String[] args){
        int a = 10;
        System.out.printf("Value of a is %d\n", a);
        System.out.println("Out by computer: ");
        System.out.println(++a + a++ + a++);
        System.out.println("Need to evaluate \"++a + a++ + a++\"");
        System.out.print("++a + a++ + a++ = 11 + 11 + 12");
        System.out.println(" = 34");
        System.out.printf("Value of a is %d\n", a);
    }
}
