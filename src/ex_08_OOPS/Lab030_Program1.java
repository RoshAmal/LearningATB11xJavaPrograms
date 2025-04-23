package ex_08_OOPS;

public class Lab030_Program1 {
    public static void main(String[] args){
        person param = new person();
        param.isMarried = 'y';
        param.printIsMarried();
        System.out.println(param.giveAge());
        param.setAge(29);
        System.out.println(param.giveAge());
        System.out.println(param.getGender(true));
    }
}
class person{
    int age = 30;
    String name;
    String profession;
    Boolean male;
    char isMarried;
    void printIsMarried(){
        System.out.println(isMarried);
    }
    int giveAge(){
        return age;
    }
    void setAge(int x){
        age = x;
    }
    String getGender(Boolean gender){
        male = gender;
        String out = "Person is a ";
        if (male)
            out = out + "male";
        else
            out = out + "female";
        return out;
    }

}