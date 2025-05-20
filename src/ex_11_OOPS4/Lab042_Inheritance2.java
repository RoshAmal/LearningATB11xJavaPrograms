package ex_11_OOPS4;

public class Lab042_Inheritance2 {
    public static void main(String[] args){

        qualis c1 = new qualis();
        crysta c2 = new crysta();
        vellfire c3 = new vellfire();
        innova c4 = new innova();

        System.out.println("Car made in year ");
        System.out.println(c1.getMakeYear());
        System.out.println("Car made in year ");
        System.out.println(c2.getMakeYear());
        System.out.println("Car made in year ");
        System.out.println(c3.getMakeYear());
        System.out.println("Car made in year ");
        System.out.println(c4.getMakeYear());
    }
}
class qualis{
    private int makeYear = 1999;
    private int numPassengers;
    public int getPassengers(){
        return numPassengers;
    }
    public void setPassengers(int number){
        this.numPassengers = number;
    }
    public int getMakeYear(){
        return makeYear;
    }
}
class innova extends qualis{
    private int makeYear = 2005;
    private int numPassengers;
    public int getMakeYear() {
        return makeYear;
    }
    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }
    public int getNumPassengers() {
        return numPassengers;
    }
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
}
class crysta extends innova{
    private int makeYear = 2014;
    private int numPassengers;
    public int getMakeYear() {
        return makeYear;
    }
    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }
    public int getNumPassengers() {
        return numPassengers;
    }
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    
}
class vellfire extends innova{
    private int makeYear = 2023;
    private int numPassengers;
    public int getMakeYear() {
        return makeYear;
    }
    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }
    public int getNumPassengers() {
        return numPassengers;
    }
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    
}