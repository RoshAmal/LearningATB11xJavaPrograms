package ex_21_CollectionsFramework4;

import java.util.*;

public class Lab083 {
    public static void main(String[] args){
        Employee e1 = new Employee(1, "Naveen");
        Employee e2 = new Employee(2, "Sivan");
        Employee e3 = new Employee(3, "Devan");
        Employee e4 = new Employee(4, "Kumar");
        List<Employee> list = new ArrayList<>(List.of(e1, e2, e3, e4));
        Collections.sort(list);
        for (Employee e : list)
            System.out.println(e);
    }
}
class Employee implements Comparable<Employee>{
    int id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id, o.id);
    }
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}
