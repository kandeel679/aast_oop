package lec.week2;

public class Circle {

    public double R;

    
   private double PI = Math.PI;

    //(constractor) lsa mkhdnhosh
            public Circle(double r){
                this.R = r;
            } 
    

    public double getArea(){
        return (PI*R*R);

    }
    public double c(){
        return 2*PI*R;
    }
}
