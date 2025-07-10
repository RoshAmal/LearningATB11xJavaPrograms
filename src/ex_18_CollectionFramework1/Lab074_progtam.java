package ex_18_CollectionFramework1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lab074_progtam {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<String>(List.of("a","b","c"));
        System.out.println("The original list is:");
        for (String name : names){
            System.out.println(name);
        }
        ListIterator<String> itr = names.listIterator(names.size());
        System.out.println("The reversed list is:");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
