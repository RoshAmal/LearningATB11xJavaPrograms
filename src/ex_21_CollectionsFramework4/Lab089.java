package ex_21_CollectionsFramework4;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab089 {
    public static void main(String[] args) {
        LinkedHashSet<String> s1 = new LinkedHashSet<String>(Set.of("apple", "banana", "cherry","fig", "guava"));
        LinkedHashSet<String> s2 = new LinkedHashSet<String>(Set.of("cherry", "dragon fruit", "egg plant", "fig", "guava", "jackfruit"));
        LinkedHashSet<String> s3 = new LinkedHashSet<String>();
        for (String string1 : s1){
            for (String string2: s2){
                if (string1.equals(string2))
                    s3.add(string1);
            }
        }  
        System.out.println(s3);     
    }
}
