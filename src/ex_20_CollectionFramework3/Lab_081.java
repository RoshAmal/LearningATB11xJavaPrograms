package ex_20_CollectionFramework3;

import java.util.*;

public class Lab_081 {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("grapes");
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("grapes");
        fruits.add("papaya");
        System.out.println(fruits);

        Collections.sort(fruits);
        System.out.println(fruits);

        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String a1, String a2){
                return a2.compareTo(a1);
            }
        }
        );
        System.out.println(fruits);
    }
    
}
