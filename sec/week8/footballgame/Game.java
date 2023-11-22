package sec.week8.footballgame;

public class Game {
    private String name;
    private Team Team1;
    private Team Team2;
    private int team1Goals = 0;
    private int team2Goals = 0;
    Game(Team t1,Team t2){
        name = t1.getName() +" VS " + t2.getName();
        Team1 = t1;
        Team2 = t2;
    }
    public void team1Goal(OutfieldPlayer p){
        team1Goals ++;
        p.IncNumOfGoals();
    }
    public void team2Goal(OutfieldPlayer p){
        team1Goals ++;
        p.IncNumOfGoals();
    }
    public void team1Block(){
        Team1.getGk().Blocked();
    }
    public void team2Block(){
        Team2.getGk().Blocked();
    }
    public String GetWinner(){
        if(team1Goals >team2Goals)
            return Team1.getName();
        else if(team1Goals<team2Goals)
            return Team2.getName();
        else
        return "it's a tie";
    }

    
    @Override
    public String toString() {
        return "Game [name=" + name + ", Team1=" + Team1 + ", Team2=" + Team2 + ", team1Goals=" + team1Goals
                + ", team2Goals=" + team2Goals + "]";
    }
}
