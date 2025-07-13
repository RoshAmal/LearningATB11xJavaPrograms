package ex_19_CollectionFramework2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lab076 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>(List.of("Java", "C", "Python", "Java"));
        ListIterator<String> itr = list.listIterator();
        System.out.println("List before modification");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        while (itr.hasNext()){
            if (itr.next() == "Java")
                itr.remove();
        }
        itr = list.listIterator();
        System.out.println("List after modification");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
