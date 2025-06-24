package ex_15_SamplePrograms;

public class Lab053_program2 {
    public static void main(String[] args){
        int num = 20;
        System.out.println("\nPrinting even numbers from 1 to 20");
        for (int i=1; i <= num; i++){
            if (i%2 != 0)
                continue;
            System.out.println(i);
        }
    }
}