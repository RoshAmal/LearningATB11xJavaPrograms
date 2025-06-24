package ex_15_SamplePrograms;

public class Lab059_program8 {
    public static void main(String[] args){
        String hello = "Java";
        int i=0;
        int n = 5;
        System.out.printf("\nPrinting %s %d times\n", hello, n);
        while (i < n){
            System.out.println(hello);
            i++;
        }
    }
}
