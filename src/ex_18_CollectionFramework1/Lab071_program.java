package ex_18_CollectionFramework1;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lab071_program {
    public static void main(String[] args){
        ListIterator<String> itr;
        List<String> list = new LinkedList<String>();
        List<String> reversed;
        System.out.println("-----");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        reversed = list.reversed();
        itr = list.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-----");
        itr = reversed.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-----");
    }
}
