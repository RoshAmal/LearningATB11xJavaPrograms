package ex_14_OOPS7;

public class Lab050_Interface {
    public static void main(String[] args){
        PrinterScanner obj = new PrinterScanner();
        obj.print("Java Interface Example");
        obj.scan("Resume.docx");
    }
}
interface Printable {
    public void print(String content);
}
interface Scannable {
    public void scan(String documentName);
}
class PrinterScanner implements Printable, Scannable {
    public void print(String content){
        System.out.println("Printing:");
        System.out.println(content);
    }
    public void scan(String documentName){
        System.out.print("Scanning document: ");
        System.out.println(documentName);
    }
}