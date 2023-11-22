package sec.week8.footballgame;

public class Team {
    private String name;
    private GoalKeeper Gk;
    private OutfieldPlayer Player[];
    private int numOfWins;
    private int numOfLosses;
    public Team(String name) {
        this.name = name;
        this.Gk = new GoalKeeper();
        this.Player = new OutfieldPlayer[10];
        this.numOfWins = 0;
        this.numOfLosses = 0;
    }




    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public GoalKeeper getGk() {
        return Gk;
    }
    public void setGk(GoalKeeper gk) {
        Gk = gk;
    }
    public OutfieldPlayer[] getPlayer() {
        return Player;
    }
    public void setPlayer(OutfieldPlayer[] player) {
        Player = player;
    }
    public int getNumOfWins() {
        return numOfWins;
    }
    public void setNumOfWins(int numOfWins) {
        this.numOfWins = numOfWins;
    }
    public int getNumOfLosses() {
        return numOfLosses;
    }
    public void setNumOfLosses(int numOfLosses) {
        this.numOfLosses = numOfLosses;
    }
    
    
}
