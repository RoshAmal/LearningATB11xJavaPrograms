package ex_15_SamplePrograms;

public class Lab060_program9 {
    public static void main(String[] args){
        int i=1;
        int n = 10;
        int sum = 0;
        while (i <= n){
            sum += n;
            i++;
        }
        System.out.printf("\nThe sum of first %d natural numbers is %d\n\n", n, sum);
    }
    
}
