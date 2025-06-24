package ex_15_SamplePrograms;

public class Lab056_program5 {
    public static void main(String[] args){
        int ten = 10;
        int num = 5;
        System.out.printf("\nPrinting the multiplication table of %d", num);
        for (int i=1; i <= ten; i++){
            System.out.printf("\n%d x %d = %d", i, num, i*num);
        }
        System.out.println("");
    }
}
