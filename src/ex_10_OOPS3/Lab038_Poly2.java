package ex_10_OOPS3;

public class Lab038_Poly2 {
    public static void main(String[] args){
        thunderbolts team1 = new thunderbolts();
        newavengers team2 = new newavengers();
        team1.printTeamName();
        team2.printTeamName();
    }
}
class thunderbolts{
    void printTeamName(){
        System.out.println("The team's name is Thunderbolts");
    }
}
class newavengers extends thunderbolts{
    @Override
    void printTeamName(){
        System.out.println("The team's name is New Avengers");
    }
}