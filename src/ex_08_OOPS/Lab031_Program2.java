package ex_08_OOPS;

public class Lab031_Program2 {
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p.name);
        Person p2 = new Person("Amal", (short)25, 9074595748L);
        System.out.println(p2.name);
    }
}
class Person{
    String name = " ";
    short age = 11;
    String address = " ";
    long phone = 1234567890L;
    boolean isMale = true;
    Person(){
        this.name = "Sumi";
        this.age = 50;
        this.address = " ";
        this.phone = 9447794669L;
        this.isMale = false;
        System.out.println("init");
    }
    Person(String name, short age, long phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
}
