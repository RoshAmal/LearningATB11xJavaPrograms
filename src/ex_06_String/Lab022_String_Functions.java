package ex_06_String;

public class Lab022_String_Functions {
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1.equals(str3));
    }
}
