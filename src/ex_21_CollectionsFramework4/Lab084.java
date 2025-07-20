package ex_21_CollectionsFramework4;

import java.util.*;

public class Lab084 {
    public static void main(String[] args){
        Employees e1 = new Employees(12, "Simon");
        Employees e2 = new Employees(13, "Devon");
        Employees e3 = new Employees(14, "Helio");
        Employees e4 = new Employees(15, "Naveen");
        Set<Employees> employeesByName = new TreeSet<>(new NameComparator());
        employeesByName.add(e1);
        employeesByName.add(e2);
        employeesByName.add(e3);
        employeesByName.add(e4);
        for (Employees e : employeesByName)
            System.out.println(e);
    }
}
class Employees{
    int id;
    String name;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employees{id=" + id + ", name='" + name + "'}";
    }
}
class NameComparator implements Comparator<Employees>{
    @Override
    public int compare(Employees o1, Employees o2) {
        int nameCmp = o1.getName().compareTo(o2.getName());
        if (nameCmp != 0) return nameCmp;
        return Integer.compare(o1.getId(), o2.getId()); 
    }
}