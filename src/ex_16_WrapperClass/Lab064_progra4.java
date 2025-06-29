package ex_16_WrapperClass;

public class Lab064_progra4 {
    public static void main(String[] args){
        int strSum = 0;
        try {
            String strInput = args[0];
            for (int i=0; i < strInput.length(); i++){
                char charA = strInput.charAt(i);
                strSum += Character.getNumericValue(charA);
            }
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
        } catch(Exception e){
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
        
        System.out.println(strSum);
    }
}
