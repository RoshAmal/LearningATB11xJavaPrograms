package ex_20_CollectionFramework3;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lab079 {
    public static void main(String[] args){
        List<Integer> input = new LinkedList<Integer>(List.of(1,2,4,8));
        List<Integer> output;
        output = reverseList(input);
        System.out.println(output);
    }
    static List<Integer> reverseList(List<Integer> a){
        ListIterator<Integer> itr = a.listIterator(a.size());
        List<Integer> reversed = new LinkedList<Integer>();;
        while (itr.hasPrevious()){
            reversed.add(itr.previous());
        }
        return reversed;
    }
}
