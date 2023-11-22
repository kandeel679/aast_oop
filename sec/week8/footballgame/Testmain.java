package sec.week8.footballgame;

import java.util.Scanner;

public class Testmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GoalKeeper gk1 = new GoalKeeper("7adary",1);
        GoalKeeper gk2 = new GoalKeeper("shenawy",1);
        OutfieldPlayer p1[] = new OutfieldPlayer[10];
        OutfieldPlayer p2[] = new OutfieldPlayer[10];
        System.out.println("please enter team 1 players");
        for (int i = 0; i < p1.length; i++) {
            System.out.println("enter player" + (i+1)+"name and num");
            String name = input.nextLine();
            int n = input.nextInt();
            p1[i] = new OutfieldPlayer(n,name);
        }
        System.out.println("please enter team 2 players");
        for (int i = 0; i < p2.length; i++) {
            System.out.println("enter player " + (i+1)+" name and num");
            String name = input.nextLine();
            int n = input.nextInt();
            p2[i] = new OutfieldPlayer(n,name);

        }

        Team t1 = new Team("ahly");
        t1.setGk(gk1);
        t1.setPlayer(p1);
        Team t2 = new Team("zamalk");
        t2.setGk(gk2);
        t2.setPlayer(p2);

        Game game = new Game(t1, t2);
        game.team1Goal(t1.getPlayer()[5]);
        game.team1Goal(t1.getPlayer()[4]);
        game.team2Goal(t2.getPlayer()[7]);
        System.out.println(game.GetWinner());
        
    }
}
