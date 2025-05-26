package ex_12_OOPS5;

public class Lab047_Super2 {
    public static void main(String[] args){
        Employee e = new Employee("Amal Rosh", 164, "male", 25, "IBM Kochi", "IBM003");
        System.out.printf("Employee with name %s is of age %s and works at %s", e.getName(), e.getAge(), e.getOfficeAddress());
    }
}
class Person{
    protected String name;
    @SuppressWarnings("unused")
    private int height;
    @SuppressWarnings("unused")
    private String sex;
    protected int age;
    public Person(String name, int height, String sex, int age){
        this.name = name;
        this.height = height;
        this.sex = sex;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class Employee extends Person{
    private String officeAddress;
    public String getOfficeAddress() {
        return officeAddress;
    }
    @SuppressWarnings("unused")
    private String employeeID;
    public Employee(String name, int height, String sex, int age, String officeAddress, String employeeID){
        super(name, height, sex, age);
        this.officeAddress = officeAddress;
        this.employeeID = employeeID;
    }
    @Override
    public String getName() {
        return super.name;
    }
    @Override
    public int getAge(){
        return super.age;
    }
}