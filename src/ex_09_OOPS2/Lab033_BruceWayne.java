package ex_09_OOPS2;

public class Lab033_BruceWayne extends Lab032_ThomasWayne{
    String name = "Bruce Wayne";
    void printName(){
        System.out.printf("The name's %s\n", name);
    }
    void secret(){
        System.out.println("I'm Batman");
    }
    void printCar(){
        System.out.println("My car is called Batmobile");
    }
}
