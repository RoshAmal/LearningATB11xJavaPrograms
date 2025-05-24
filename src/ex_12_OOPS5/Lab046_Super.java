package ex_12_OOPS5;

public class Lab046_Super{
    public static void main(String[] args){
        
    }
}

class furniture{
    private int mrp;
    private String name;
    private String material;
    private String color;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getMrp(){
        return mrp;
    }
    public void setMrp(int mrp){
        this.mrp = mrp;
    }
}

class sofa extends furniture{
    private int capacity;
    private int cushions;
    public int getCushions() {
        return cushions;
    }
    public void setCushions(int cushions) {
        this.cushions = cushions;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

class shelf extends furniture{
    private float length;
    private float breadth;
    private int rows;
    public int getRows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getBreadth() {
        return breadth;
    }
    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
}