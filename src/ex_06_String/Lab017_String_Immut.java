package ex_06_String;

public class Lab017_String_Immut {
    public static void main(String[] args){
        String s1 = "hello ";
        s1 = s1.concat("world");
        System.out.println(s1);
    }
}
