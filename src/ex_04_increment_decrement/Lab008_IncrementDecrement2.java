package ex_04_increment_decrement;

public class Lab008_IncrementDecrement2 {
    public static void main(String[] args){
        int a = 20;
        System.out.printf("Value of a is %d\n", a);
        System.out.println("Out by computer: ");
        System.out.println(--a + a++ + a--);
        System.out.println("Need to evaluate --a + a++ + a--");
        System.out.print("--a + a++ + a-- = 19 + 19 + 20");
        System.out.println(" = 58");
        System.out.printf("Value of a is %d", a);
    }
}
