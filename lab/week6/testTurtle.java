package lab.week6;

public class testTurtle {
    public static void main(String[] args) {
        Turtle turtle1 = new Turtle();
        Turtle turtle2 = new Turtle("Ginger","East",50,50);

        turtle1.moveForward();
        turtle2.turnLeft();

        turtle1.setName("adam");
        System.out.println( turtle1.getName());
        System.out.println("Turtle 1 ");
        System.out.println(turtle1.toString());
        System.out.println("Turtle 2 ");
        System.out.println(turtle2.toString());
    }
}
