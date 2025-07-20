package ex_21_CollectionsFramework4;

import java.util.*;

public class Lab081 {
    public static void main(String[] args){
        String input = "Java is easy and Java is powerful";
        String[] words = input.split(" ");
        System.out.println("=================");
        for (String s : words)
            System.out.println(s);
        System.out.println("=================");
        Set<String> wordList = new LinkedHashSet<>();
        for (String word : words)
            wordList.add(word);
        System.out.println("=================");
        for (String s : wordList)
            System.out.println(s);
        System.out.println("=================");
    }
}