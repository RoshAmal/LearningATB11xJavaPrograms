package ex_06_String;

public class Lab023_String_Functions {
    public static void main(String[] args){
        String name = "Maximus";
        String fullName = "Maximus Decimus Meridius";
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Decimus"));
        System.out.println(name.contains("Meridius"));
        System.out.println(name.equals("Lucius"));
        System.out.println(name.equals("maximus"));
        System.out.println(name.equalsIgnoreCase("maximus"));
        System.out.println(name.indexOf("M"));
        System.out.println(name.indexOf("m"));
        System.out.println(name.replace("M","m"));

        String[] split = fullName.split(" ");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
        System.out.println(fullName.trim());
    }
}
