package ex_15_SamplePrograms;

public class Lab052_program7 {
    public static void main(String[] args){
        int i = 1;
        int num = 20;
        System.out.println("\nPrinting even numbers from 1 to 20");
        while (i <= num){
            if (i%2 != 0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}