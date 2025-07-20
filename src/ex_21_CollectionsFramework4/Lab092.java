package ex_21_CollectionsFramework4;

import java.util.*;

public class Lab092{
    public static void main(String[] args){
        LinkedList<Player> list = new LinkedList<Player>(List.of(
            new Player("Alice", 95),
            new Player("Bob", 90),
            new Player("Charlie", 95),
            new Player("David", 89),
            new Player("Eva", 85),
            new Player("Frank", 98),
            new Player("Grace", 92)
        ));
        Set<Player> set = new TreeSet<Player>(new LeaderComparator());
        for (Player p : list){
            set.add(p);
            if (set.size() > 5)
                ((TreeSet<Player>)set).pollLast();
        }
        for (Player p : set)
            System.out.println(p);
    }
}
class Player{
    String name;
    int score;
    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString(){
        return "(" + name + "," + score + ")";
    }
}
class LeaderComparator implements Comparator<Player>{
    @Override
    public int compare(Player p1, Player p2){
        int c = Integer.compare(p2.score, p1.score);
        if (c != 0) return c;
        return p1.name.compareTo(p2.name);
    }
}