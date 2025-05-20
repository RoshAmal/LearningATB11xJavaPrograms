package ex_11_OOPS4;

public class Lab039_Encap{
    public static void main(String[] args){
        
        ATB atb = new ATB();
        
        System.out.println("Printing task:");
        System.out.println(atb.getTasks());
        System.out.println("Setting task");
        atb.setTasks("task 1: oops");
        System.out.println(atb.getTasks());

        System.out.printf("Video is of %d minutes\n", atb.getVideo());
        System.out.println("Setting video");
        atb.setVideo(66);
        System.out.printf("Video is of %d minutes\n", atb.getVideo());
    }
}

class ATB{
    private String task = "default";
    private int video = 60;
    public String getTasks(){
        return task;
    }
    public void setTasks(String task){
        this.task = task;
    }
    public int getVideo(){
        return video;
    }
    public void setVideo(int video){
        this.video = video;
    }
}