package ex_09_OOPS2;

public class Lab035_BatFamily {
    public static void main(String[] args){
        Lab032_ThomasWayne grandFather = new Lab032_ThomasWayne();
        grandFather.printName();

        Lab033_BruceWayne father = new Lab033_BruceWayne();
        father.printName();
        father.secret();
        father.printCar();
        Lab034_DamianWayne son = new Lab034_DamianWayne();
        son.printName();
        son.secret();
        son.printCar();
        son.printFathersName();
    }
}
