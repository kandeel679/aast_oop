package sec.week8.footballgame;

public class OutfieldPlayer {
    private int number;
    private String name;
    private int numOfGoals;


    public OutfieldPlayer(int number, String name) {
        this.number = number;
        this.name = name;
        this.numOfGoals = 0;
    }
    public OutfieldPlayer() {
    }
    public void IncNumOfGoals(){
        this.numOfGoals ++;
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
    public int getnumOfGoals() {
        return numOfGoals;
    }

}

