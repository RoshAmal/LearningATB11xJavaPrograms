package ex_21_CollectionsFramework4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Scenario where TreeSet is sorted using Comparator, no tie-breaker logic
 */

public class Lab086 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(List.of("apple", "bat", "banana", "dog"));
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                return Integer.compare(a.length(), b.length());
            }
        });
        set.addAll(list);
        System.out.println(set);
    }
}
