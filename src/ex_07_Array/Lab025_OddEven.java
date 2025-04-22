package ex_07_Array;

public class Lab025_OddEven {
    public static void main(String[] args){
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        for (int a: array){
            System.out.printf("Number %d is ", a);
            if (a%2==0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }
}
