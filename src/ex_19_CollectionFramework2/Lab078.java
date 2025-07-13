package ex_19_CollectionFramework2;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Lab078 {
    public static void main(String[] args){
        int lastIndex;
        LinkedList<Character> list = new LinkedList<Character>(List.of('A', 'B', 'C', 'D'));
        lastIndex = list.size() - 1;
        Collections.swap(list, 0, lastIndex);
        System.out.println(list);
    }
}
