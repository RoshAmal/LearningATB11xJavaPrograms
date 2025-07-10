package ex_18_CollectionFramework1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Lab072_program {
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
        int numApples = Collections.frequency(fruits, "apples");
        System.out.printf("Number of apples is %d", numApples);
    }
    
}
