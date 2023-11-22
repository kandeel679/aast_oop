package sec.week8.footballgame;

public class GoalKeeper {
    private int number;
    private String name;
    private int numOfBlocks;


    public GoalKeeper() {
    }
    public GoalKeeper( String name,int number) {
        this.number = number;
        this.name = name;
        this.numOfBlocks = 0;
    }
    public void Blocked(){
        this.numOfBlocks ++;
    }

    


    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumOfBlocks() {
        return numOfBlocks;
    }
    public void setNumOfBlocks(int numOfBlocks) {
        this.numOfBlocks = numOfBlocks;
    }
    
}
