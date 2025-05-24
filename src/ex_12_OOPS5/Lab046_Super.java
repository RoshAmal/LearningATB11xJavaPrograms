package ex_12_OOPS5;
public class Lab046_Super {
    public static void main(String[] args) {
        Sofa s1 = new Sofa("green", 3, 2);
        Shelf s2 = new Shelf("wood", 4, 5000);
        // Accessing superclass methods and fields initialized via super()
        System.out.printf("Color of the %s is %s with %d cushions\n", 
            s1.getName(), s1.getColor(), s1.getCushions());
        System.out.printf("The %s made of %s with %d rows costs Rs %d\n", 
            s2.getName(), s2.getMaterial(), s2.getRows(), s2.getMrp());
    }
}
class Furniture {
    // Common fields shared by all furniture
    private String name;
    private String color;
    protected String material;
    private int mrp;
    // Constructor to initialize all shared fields
    public Furniture(String name, String color, String material, int mrp) {
        this.name = name;
        this.color = color;
        this.material = material;
        this.mrp = mrp;
    }
    // Getter methods to access private members
    public String getName() { return name; }
    public String getColor() { return color; }
    public String getMaterial() { return material; }
    public int getMrp() { return mrp; }
}
class Sofa extends Furniture {
    private int capacity;
    private int cushions;
    // Constructor uses super() to avoid field shadowing and redundant initialization
    public Sofa(String color, int capacity, int cushions) {
        super("Sofa", color, "leather", 8000); // Initializes name, color, material, mrp
        this.capacity = capacity;
        this.cushions = cushions;
    }
    public int getCapacity() { return capacity; }
    public int getCushions() { return cushions; }
}
class Shelf extends Furniture {
    private int rows;
    // Constructor also uses super() to set common fields without repeating them here
    public Shelf(String material, int rows, int mrp) {
        super("Shelf", "brown", material, mrp);
        this.rows = rows;
    }
    public int getRows() { return rows; }
}
