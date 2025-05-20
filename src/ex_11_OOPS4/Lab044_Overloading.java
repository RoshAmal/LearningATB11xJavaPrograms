package ex_11_OOPS4;

public class Lab044_Overloading {
    public static void main(String[] args){
        Lab044_Overloading obj = new Lab044_Overloading();
        obj.getDelivery("shoes");
        obj.getDelivery("watch", "shoes");
        obj.getDelivery("shirt", "watch", "shoes");
    }
    public void getDelivery(String order1){
        System.out.printf("Order is %s\n", order1);
    }
    public void getDelivery(String order1, String order2){
        System.out.printf("Orders are %s and %s\n", order1, order2);
    }
    public void getDelivery(String order1, String order2, String order3){
        System.out.printf("Orders are %s, %s and %s\n", order1, order2, order3);
    }
}

