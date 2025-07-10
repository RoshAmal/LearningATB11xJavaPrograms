package ex_18_CollectionFramework1;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Lab070_program {
    public static void main(String[] args){
        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        Iterator<Integer> itr = list.iterator();
        System.out.println("The elements of the ArrayList are:");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
