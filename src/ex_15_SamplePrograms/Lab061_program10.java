package ex_15_SamplePrograms;

public class Lab061_program10 {
    public static void main(String[] args){
        int i=1;
        int ten = 10;
        int num = 7;
        System.out.printf("\nPrinting the multiplication table of %d", num);
        while (i <= ten){
            System.out.printf("\n%d x %d = %d", i, num, i*num);
            i++;
        }
        System.out.println("");
    }
}
