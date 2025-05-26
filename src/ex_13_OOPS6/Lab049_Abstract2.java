package ex_13_OOPS6;

public class Lab049_Abstract2{
    public static void main(String[] args){
        Game g = new Cricket();
        g.play();
    }
}
abstract class Game{
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();
    public void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
class Cricket extends Game{
    public void initialize(){
        System.out.println("Initialize");
    }
    public void startPlay(){
        System.out.println("Start of play");
    }
    public void endPlay(){
        System.out.println("End of play");
    }
}