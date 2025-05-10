package ex_09_OOPS2;

public class Lab036_BatFamily2 {
    public static void main(String[] args){
        Lab032_ThomasWayne grandFather = new Lab033_BruceWayne();
        grandFather.printName();
        
        Lab033_BruceWayne father = new Lab034_DamianWayne();
        father.printName();
        father.printCar();
        father.secret();
    }
}
