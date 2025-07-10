package ex_18_CollectionFramework1;

import java.util.List;
import java.util.ArrayList;

public class Lab073_program {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        for (int i=1; i <= 10; i++){
            list.add(i);
        }
        for (Integer itr: list){
            System.out.println(itr);
        }
    }
    
}
