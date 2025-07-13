package ex_19_CollectionFramework2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lab077 {
    public static void main(String[] args){
        ListIterator<String> itr;
        List<String> list = new LinkedList<String>();
        List<String> copy;
        System.out.println("-----");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        copy = list;
        itr = list.listIterator();
        System.out.println("Forward:");
        while (itr.hasNext())
            System.out.println(itr.next());
        System.out.println("Backward:");
        while (itr.hasPrevious())
            System.out.println(itr.previous());
    }
}
