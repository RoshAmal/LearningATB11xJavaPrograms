package ex_13_OOPS6;

public class Lab048_Abstract {
    public static void main(String[] args){
        int input = 5;
        Circle c = new Circle(input);
        Rectangle r = new Rectangle(input, input);

        c.calculateArea();
        r.calculateArea();
    }
    
}
abstract class Shape{
    public abstract void calculateArea();
}
class Circle extends Shape{
    private int radius;
    private static final double pi = Math.PI;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void calculateArea(){
        double area = pi * radius * radius;
        System.out.printf("Area calculated using the radius: %.2f\n", area);
    }
}
class Rectangle extends Shape{
    private int length;
    private int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void calculateArea(){
        int area = length * breadth;
        System.out.printf("Rectangle with length %d and breadth %d has an area of: %d\n", length, breadth, area);
    }
}