package lec.week2;

public class Circle {

    private double R;


    double PI = Math.PI;

    //constractor 
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
