package ex_21_CollectionsFramework4;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Lab093 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>(List.of("report.docx", "image.png", "data.csv", "notes.txt"));
        Collections.sort(list, new DocComparator());
        System.out.println(list);
    }
}
class DocComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        String[] str1 = s1.split("\\.");
        String[] str2 = s2.split("\\.");
        int comp = str1[1].compareTo(str2[1]);
        if (comp != 0) return comp;
        return str1[0].compareTo(str2[0]);
    }
}
