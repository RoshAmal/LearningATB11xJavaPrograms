package ex_20_CollectionFramework3;

import java.util.*;

public class Lab080 {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 20; i++){
            list.add(i);
        }
        ListIterator<Integer> itr = list.listIterator();
        while (itr.hasNext()){
            int a = itr.next();
            if (a%2 == 0)
                itr.remove();
        }
        System.out.println(list);
    }
}
