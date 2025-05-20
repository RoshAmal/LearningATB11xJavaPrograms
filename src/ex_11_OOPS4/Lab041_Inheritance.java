package ex_11_OOPS4;

public class Lab041_Inheritance {
    public static void main(String[] args){
        String address = "";
        father m1 = new father();
        son m2 = new son();
        System.out.println("Getting address for fatheer");
        m1.setAddress("Kottayam");
        System.out.println("Address of father:");
        System.out.println(m1.getAddress());


        address = m1.getAddress();
        System.out.println("Setting address for son");
        m2.setAddress(address);
        System.out.println("Address of son:");
        System.out.println(m2.getAddress());
    }
}
class father{
    String address;
    String myFather;
    String facebook;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMyFather() {
        return myFather;
    }
    public void setMyFather(String myFather) {
        this.myFather = myFather;
    }
    public String getFacebook() {
        return facebook;
    }
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
}
class son extends father{
    String instagram;
    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
}