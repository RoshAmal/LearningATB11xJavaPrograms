package ex_11_OOPS4;

public class Lab043_Inheritance3 {
    public static void main(String[] args){
        swift car1 = new swift();
        ritz car2 = new ritz();
        ignis car3 = new ignis();
        System.out.printf("Name of the car is %s\n", car1.getName());
        System.out.print("Number of passengers allowed is ");
        System.out.println(car1.getNumPassengers());
        System.out.printf("Name of the car is %s\n", car2.getName());
        System.out.print("Number of passengers allowed is ");
        System.out.println(car2.getNumPassengers());
        System.out.printf("Name of the car is %s\n", car3.getName());
        System.out.print("Number of passengers allowed is ");
        System.out.println(car3.getNumPassengers());
    }
}
class swift{
    private String name = "Swift";
    private int numPassengers = 4;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumPassengers() {
        return numPassengers;
    }
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
}
class ritz extends swift{
    private String name = "Ritz";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class ignis extends swift{
    private String name = "ignis";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
}