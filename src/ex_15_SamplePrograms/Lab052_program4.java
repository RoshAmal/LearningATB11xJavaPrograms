package ex_15_SamplePrograms;

public class Lab052_program4 {
    public static void main(String[] args){
        int n = 10;
        int sum = 0;
        for (int i=1; i <= n; i++){
            sum += n;
        }
        System.out.printf("\nThe sum of first %d natural numbers is %d\n\n", n, sum);
    }
    
}
