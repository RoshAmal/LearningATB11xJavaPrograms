package ex_20_CollectionFramework3;

import java.util.*;

public class lab_082 {
    public static void main(String[] args){
        List<String> source = new ArrayList<>(List.of("Apple", "Banana", "Peaches"));
        List<String> destination = new ArrayList<>(
            Collections.nCopies(source.size(), "")
        );
        Collections.copy(destination, source);
        System.out.println(source);
        System.out.println(destination);
    }
    
}
