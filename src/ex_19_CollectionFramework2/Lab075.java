package ex_19_CollectionFramework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lab075 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(31,83,34,73,65,16));
        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        System.out.println("The original list is ");
        for (Integer itr : list){
            System.out.println(itr);
        }
        Collections.sort(list);
        sortedList = list;
        System.out.println("The sorted list is ");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        int found = Collections.binarySearch(list, 73);
        System.out.printf("Index of 73 is %d", found);
    }
}
