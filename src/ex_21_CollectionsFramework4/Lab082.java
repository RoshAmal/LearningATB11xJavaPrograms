package ex_21_CollectionsFramework4;

import java.util.*;

public class Lab082 {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(List.of(1,5,8,3,8,4,2,56,7,2,1,10));
        Set<Integer> newNumbers = new TreeSet<>();
        for (Integer number : numbers)
            newNumbers.add(number);
        System.out.println(newNumbers);
    }
}