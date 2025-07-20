package ex_21_CollectionsFramework4;

import java.util.*;

/*
 * Scenario where TreeSet uses the natural ordering of elements
 */

public class Lab085 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(List.of("apple", "bat", "banana", "dog"));
        Set<String> set = new TreeSet<>(list);
        for (String s : set)
            System.out.println(s);
    }
}
