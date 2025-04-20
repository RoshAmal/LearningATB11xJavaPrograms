package ex_06_String;

public class Lab021_String_Interview_P2 {
    public static void main(String[] args){
        String s1 = "Hello";
        String s4 = "Hello";
        // SCP -> 1
        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("Hello");
        // OA -> 3
        System.out.println(s1==s4);
        System.out.println(s3==s5);
        System.out.println(s2==s4);
        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equals(s4));

    }
}
