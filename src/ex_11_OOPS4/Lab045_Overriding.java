package ex_11_OOPS4;

public class Lab045_Overriding {
    public static void main(String[] args){
        king man = new king();
        prince boy = new prince();

        man.getRole();
        boy.getRole();
    }
}
class king{
    public void getRole(){
        System.out.println("Role is that of King");
    }
}
class prince extends king{
    @Override
    public void getRole(){
        System.out.println("Role is that of Prince");
    }
}
