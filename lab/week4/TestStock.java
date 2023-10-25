package lab.week4;

public class TestStock {
    public static void main(String[] args) {
    Stock s1 = new Stock("w","ali");       
    Stock s2= new Stock("q","hazem");       
    Stock s3 = new Stock("r","youssef");       
    Stock s4 = new Stock();       
    s4.setNmae("nour");
    System.out.println(s4.getName() );
    System.out.println(s3.getName() );
    System.out.println(s2.getName() );
    System.out.println(s1.getName() );

    }
}


