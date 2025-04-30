package ex_08_OOPS;

public class Lab031_Program2 {
    public static void main(String[] args){
        Person p = new Person();
        Person p2 = new Person("Amal", (short)25, 9074595748L);
        p.eat();
        p2.sleep();
        System.out.println(p.printDetails());
        System.out.println(p2.printDetails());
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
        System.out.println("Initializing.......\n");
    }
    Person(String name, short age, long phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    void eat(){
        System.out.printf("%s is eating\n", this.name);
    }
    void sleep(){
        System.out.printf("%s is sleeping\n", this.name);

    }
    String printDetails(){
        String details = "\nName of the person is " + this.name;
        details = details +"\nAge is " + this.age;
        details = details + "\nPhone number is " + this.phone;
        return details;
    }
}
