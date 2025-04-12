package ex_02_java_Basic;

public class Lab003_Math {
    public static void main(String[] args){
        double x = 10;
        double y = x;
        double z = x;
        double power = 2;
        double x2 = Math.pow(x,power);
        double y2 = Math.pow(y,power);
        double absz = Math.abs(z);
        double result = Math.cbrt(x2 + y2 + absz);
        System.out.println("Result is "+result);
    }
}
