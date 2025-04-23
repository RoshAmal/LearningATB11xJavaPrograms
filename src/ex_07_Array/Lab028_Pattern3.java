package ex_07_Array;

public class Lab028_Pattern3 {
    public static void main(String[] args){
        int no = 5;
        for (int i=0; i<no; i++){
            for(int j=0; j<no; j++){
                if (i>j)
                    continue;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
