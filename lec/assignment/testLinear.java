package lec.assignment;

public class testLinear {
    public static void main(String[] args) {
        LinearEquation linear = new LinearEquation(2,1,1,1,5,7);
        System.out.println("The solution is "+linear.getY());
        System.out.println("The solution is "+linear.getX());

    }
}
