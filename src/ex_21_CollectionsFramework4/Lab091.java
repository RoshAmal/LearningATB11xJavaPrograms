package ex_21_CollectionsFramework4;

import java.util.LinkedHashSet;

/*
 * Getting elements with no duplicates with the use of Map
 */

public class Lab091 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "c", "d", "b"};
        LinkedHashSet<String> s = new LinkedHashSet<String>();
        for (String str1 : arr){
            int count = 0;
            for (String str2 : arr){       
                if (str1.equals(str2))
                    count++;
            }
            if (count == 1)
                s.add(str1);    
        }
        System.out.println(s);
    }
}
