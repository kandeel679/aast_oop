package lec.week2;

public class Circle {

    private double R;

    
   final private double PI = Math.PI;

    //(constractor) lsa mkhdnhosh
            public Circle(double r){
                this.R = r;
            } 
            public Circle(){
                this.R = 5;
            }
    

    public double getArea(){
        return (PI*R*R);

    }
    public double c(){
        return 2*PI*R;
    }
}
