package ex_07_Array;

public class Lab024_Array {
    public static void main(String[] args){
        int[] arr = { 11, 2, 73, 29, 18, 3, 144, 5, 10, 20, 23 };
        int biga = arr[0];
        int bigb = arr[0];
        for (int a: arr){
            biga = bigger(a, biga);
        }
        for (int b: arr){
            if (b==biga)
                continue;
            else
                bigb = bigger(b, bigb);
        }
        System.out.printf("Second largest number is %d", bigb);
    }

    static int bigger(int i, int j){
        if (i>j)
            return i;
        else return j;
    }
}
