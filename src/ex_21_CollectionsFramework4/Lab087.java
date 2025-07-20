package ex_21_CollectionsFramework4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Scenario where TreeSet is sorted using Comparator, with tie-breaker logic
 */

public class Lab087 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(List.of("apple", "bat", "banana", "dog"));
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                int comp = Integer.compare(a.length(), b.length());
                if (comp != 0)
                    return comp;
                return a.compareTo(b);
            }
        });
        set.addAll(list);
        System.out.println(set);
    }
}
