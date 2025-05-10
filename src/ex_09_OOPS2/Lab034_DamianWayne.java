package ex_09_OOPS2;

public class Lab034_DamianWayne extends Lab033_BruceWayne{
    String name = "Damian Wayne";
    void printName(){
        System.out.printf("The name's %s\n", name);
    }
    void secret(){
        System.out.println("I'm Robin");
    }
    void printFathersName(){
        System.out.printf("My Father's name is %s", super.name);
    }
}