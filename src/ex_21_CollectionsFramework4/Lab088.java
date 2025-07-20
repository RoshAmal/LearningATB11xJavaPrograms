package ex_21_CollectionsFramework4;

import java.util.*;

public class Lab088 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(List.of(
            new Student("John", 90), 
            new Student("Alice", 95), 
            new Student("Bob", 90))
        );
        Set<Student> set = new TreeSet<Student>(new CustomComparator());
        set.addAll(list);
        System.out.println(list);
        System.out.println(set);
    }
}
class Student {
    String name;
    int grade;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String toString(){
        return "(\"" + name + "\", " + grade + ")";
    }
}
class CustomComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        int comp = Integer.compare(s1.getGrade(), s2.getGrade());
        if (comp != 0)
            return comp;
        return s1.getName().compareTo(s2.getName());
    }
}